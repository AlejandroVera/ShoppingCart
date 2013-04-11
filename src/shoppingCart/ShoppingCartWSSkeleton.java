
/**
 * ShoppingCartWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
package shoppingCart;

import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.axis2.AxisFault;

import es.upm.fi.sos.t3.shoppingcart.*;

import shoppingCart.NotEnoughBudgetError;
import shoppingCart.NotEnoughUnitsError;
import shoppingCart.NotValidSessionError;
import shoppingCart.ProductUnknownError;
import shoppingCart.warehouseClient.WarehouseInformationWSStub;

/**
 * ShoppingCartWSSkeleton java skeleton for the axisService
 */
public class ShoppingCartWSSkeleton {
	
	class CartItem {
		
		String product;
		int amount;
		
		public CartItem(String product, int amount) {
			this.product = product;
			this.amount = amount;
		}
		
	}
	
	private static double DEFAULT_BUDGET = 1000000.0;
	
	private boolean logged = false;
	private WarehouseInformationWSStub warehouse;
	private double budget;
	private List<CartItem> cart;

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 */

	public ProductsAmountsList productsInCart( ) throws NotValidSessionError {
		
		//Revisamos que estemos logueados
		checkSession();
		
		ProductsAmountsList resp = new ProductsAmountsList();
		
		//Rellenamos la lista a devolver
		for(CartItem item : cart){
			ProductAmountType temp = new ProductAmountType();
			temp.setProduct(item.product);
			temp.setAmount(item.amount);
			resp.addProductAmountInfo(temp);
		}
		
		return resp;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param productName
	 * @throws ProductUnknownError:
	 * @throws NotValidSessionError:
	 */

	public ProductAvailableUnits getProductAvailableUnits(ProductName productName)
			throws ProductUnknownError, NotValidSessionError {
		
		//Revisamos que estemos logueados
		checkSession();
		
		//Comprobamos que el producto exista
		if(!checkProductExistence(productName.getProductName()))
			throw new ProductUnknownError();
		
		ProductAvailableUnits resp = new ProductAvailableUnits();
		
		//Solicitamos al warehouse el numero de unidades (con las pertinentes conversiones de clases)
		WarehouseInformationWSStub.ProductName product = new WarehouseInformationWSStub.ProductName();
		product.setProductName(productName.getProductName());
		
		try {
			WarehouseInformationWSStub.ProductAvailableUnits numberUnits = this.warehouse.getProductAvailableUnits(product);
			resp.setProductAvailableUnits(numberUnits.getProductAvailableUnits());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return resp;
		
		
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 */

	public Budget budget( ) throws NotValidSessionError {
		
		//Revisamos que estemos logueados
		checkSession();
		
		Budget resp = new Budget();
		resp.setBudget(this.budget);
		
		return resp;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 */

	public LoginResponse login(Login login) {
		
		if(!this.logged){
			String user = login.getUsername();
			String pass = login.getPassword();
			if((user.equals("Jose") && pass.equals("Esoj")) || (user.equals("Pepe") && pass.equals("Epep"))){
				try {
					this.warehouse = new WarehouseInformationWSStub();
					this.budget = DEFAULT_BUDGET;
					this.cart = new LinkedList<CartItem>();
					this.logged = true;
				} catch (AxisFault e) {	}
			}
		}
		
		LoginResponse resp = new LoginResponse();
		resp.setLoginResponse(this.logged);
		return resp;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 */

	public CostOfCart costOfCart( ) throws NotValidSessionError {
		
		//Revisamos que estemos logueados
		checkSession();
		
		CostOfCart resp = new CostOfCart();
		
		double total = 0.0;
		
		for(CartItem item : cart){
			ProductName temp = new ProductName();
			temp.setProductName(item.product);
			try {
				total += getProductPrice(temp).getProductPrice() * item.amount;
			} catch (ProductUnknownError e) {
				e.printStackTrace();
			}
		}
		
		resp.setCostOfCart(total);
		
		return resp;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 */

	public ProductsList getProductsList( ) throws NotValidSessionError {
		
		//Revisamos que estemos logueados
		checkSession();
		
		ProductsList resp = new ProductsList();
		try {
			//Obtenemos la lista de productos del warehouse
			String[] lista = this.warehouse.getProductsList().getProduct();
			
			//Añadimos los productos a la respuesta del metodo
			for(int x=0; x< lista.length; ++x)
				resp.addProduct(lista[x]);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return resp;
		
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param productAmount
	 * @throws ProductUnknownError:
	 * @throws NotValidSessionError:
	 */

	public ProductAvailable checkProductAvailability(
			ProductAmount productAmount)
			throws ProductUnknownError, NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#checkProductAvailability");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param productAmount4
	 * @throws ProductUnknownError:
	 * @throws NotEnoughUnitsError:
	 * @throws NotValidSessionError:
	 */

	public ProductAvailableUnits addToCart(
			ProductAmount productAmount4)
			throws ProductUnknownError, NotEnoughUnitsError,
			NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#addToCart");
	}

	/**
	 * Auto generated method signature
	 * 
	 */

	public void logout(

	) {
		// TODO : fill this with the necessary business logic

	}

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 * @throws NotEnoughBudgetError:
	 */

	public Budget buy(

	) throws NotValidSessionError, NotEnoughBudgetError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#buy");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param productAmount9
	 * @throws ProductUnknownError:
	 * @throws NotValidSessionError:
	 */

	public ProductAvailableUnits removeFromCart(
			ProductAmount productAmount9)
			throws ProductUnknownError, NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#removeFromCart");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param productName11
	 * @throws ProductUnknownError:
	 * @throws NotValidSessionError:
	 */

	public ProductPrice getProductPrice(
			ProductName productName11)
			throws ProductUnknownError, NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getProductPrice");
	}
	
	private void checkSession() throws NotValidSessionError{
		if(!this.logged)
			throw new NotValidSessionError();
	}
	
	private boolean checkProductExistence(String productName) throws NotValidSessionError{
		String[] productos = getProductsList().getProduct();
		
		for(int x=0; x < productos.length; ++x)
			if(productos[x].equals(productName))
				return true;
		
		return false;
	}

}
