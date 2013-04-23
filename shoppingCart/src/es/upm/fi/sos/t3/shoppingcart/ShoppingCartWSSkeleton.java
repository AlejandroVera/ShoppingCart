
/**
 * ShoppingCartWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
package es.upm.fi.sos.t3.shoppingcart;

import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

import org.apache.axis2.AxisFault;

import es.upm.fi.sos.t3.shoppingcart.*;
import es.upm.fi.sos.t3.warehouseClient.WarehouseInformationWSStub;


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
		ProductAmountType[] array = new ProductAmountType[cart.size()];
		
		//Rellenamos la lista a devolver
		int i = 0;
		for(CartItem item : cart){
			ProductAmountType temp = new ProductAmountType();
			temp.setProduct(item.product);
			temp.setAmount(item.amount);
			array[i++] = temp;
		}
	
		resp.setProductAmountInfo(array);

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

		ProductAvailableUnits resp = new ProductAvailableUnits();
		resp.setProductAvailableUnits(0);

		//Solicitamos al warehouse el numero de unidades (con las pertinentes conversiones de clases)
		WarehouseInformationWSStub.ProductName product = new WarehouseInformationWSStub.ProductName();
		product.setProductName(productName.getProductName());

		try {
			WarehouseInformationWSStub.ProductAvailableUnits numberUnits = this.warehouse.getProductAvailableUnits(product);
			
			//Comprobamos que el producto exista
			if(numberUnits.getProductAvailableUnits() < 0)
				throw new ProductUnknownError();
			
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
		String[] lista = new String[0];
		try {
			//Obtenemos la lista de productos del warehouse
			lista = this.warehouse.getProductsList().getProduct();

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		resp.setProduct(lista);

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

		//Revisamos que seguimos logueados
		checkSession();

		//Buscamos si el producto existe
		String nombre = productAmount.getProductAmount().getProduct();
		if(!checkProductExistence(nombre))
			throw new ProductUnknownError();

		boolean enough = false;

		int amount = productAmount.getProductAmount().getAmount();

		int num= 0;

		int indice = buscaCarro (nombre);

		if (indice!=-1 && amount>0){
			CartItem item = cart.get(indice);
			num = item.amount;
		}

		//Si hay más o igual a la cantidad pedida devolvemos true
		if (num>=amount)
			enough=true;

		ProductAvailable available = new ProductAvailable();
		available.setProductAvailable(enough);
		return available;

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
		//Revisamos que seguimos logueados
		checkSession();


		String nombre = productAmount4.getProductAmount().getProduct();
		int cantidad = productAmount4.getProductAmount().getAmount();

		ProductName productName = new ProductName();
		productName.setProductName(nombre);
		if (getProductAvailableUnits(productName).getProductAvailableUnits()<cantidad)
			throw new NotEnoughUnitsError();

		CartItem item;
		int indice = buscaCarro (nombre);
		int num;

		//Si existe ya el item aumentamos su cantidad
		if (indice!=-1){
			item = cart.get(indice);
			num=item.amount+cantidad;
			item.amount=num;
			cart.set(indice, item);			
		}
		//Si no, lo añadimos a la lista
		else{
			item = new CartItem(nombre,cantidad);
			cart.add(item);
			num=cantidad;
		}

		ProductAvailableUnits units = new ProductAvailableUnits();
		units.setProductAvailableUnits(num);
		return units;
	}

	/**
	 * Auto generated method signature
	 * 
	 */

	public void logout() {
		if (this.logged){
			this.logged=false;
		}

	}

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 * @throws NotEnoughBudgetError:
	 */

	public Budget buy() throws NotValidSessionError, NotEnoughBudgetError {
		
		checkSession();		
		double coste = this.costOfCart().getCostOfCart();
		double presupuesto = this.budget().getBudget();		
		
		//Si no tenemos suficiente dinero lanzamos excepcion
		if (presupuesto < coste)
			throw new NotEnoughBudgetError();
		else{
			//Se realiza la compra vaciando el carro y haciendo el cobro
			this.budget=presupuesto-coste;
			this.cart = new LinkedList<CartItem>();
		}
		return budget();
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
		//Revisamos que seguimos logueados
		checkSession();

		String nombre = productAmount9.getProductAmount().getProduct();
		int cantidad = productAmount9.getProductAmount().getAmount();
		
		//Comprobamos que existe
		if(!checkProductExistence(nombre))
			throw new ProductUnknownError();
		
		CartItem item;
		int indice = buscaCarro (nombre);
		int num=0;

		//Si esta el item disminuimos su cantidad
		if (indice!=-1){
			item = cart.get(indice);
			if (item.amount-cantidad>0){
				num=item.amount-cantidad;
				item.amount=num;
				cart.set(indice, item);				
			}else{//Si se piden quitar mas unidades de las que hay
				cart.remove(indice);//Lo borramos del carro
			}
		}
		
		ProductAvailableUnits units = new ProductAvailableUnits();
		units.setProductAvailableUnits(num);
		return units;

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
		//Revisamos que estemos logueados
		checkSession();

		ProductPrice precio = new ProductPrice();

		//Obtenemos el precio del producto
		WarehouseInformationWSStub.ProductName product = new WarehouseInformationWSStub.ProductName();
		product.setProductName(productName11.getProductName());		

		try {
			WarehouseInformationWSStub.ProductPrice productPrecio = this.warehouse.getProductPrice(product);
			
			//Comprobamos que el producto exista
			if(productPrecio.getProductPrice() < 0)
				throw new ProductUnknownError();
			
			precio.setProductPrice(productPrecio.getProductPrice());
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return precio;

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

	/*Metodo auxiliar. Devuelve en donde se encuentra un producto en el carro en la lista.
	 * Si la lista esta vacia o no esta el producto en el carro devuelve -1.
	 */

	private int buscaCarro (String nombreProducto){
		boolean found = false;
		int num = -1;

		CartItem item;
		int i = 0;
		while (!found && i<cart.size()){
			item =  cart.get(i);
			if (item.product.equals(nombreProducto)){
				found=true;
				num=i ;
			}
			i++;				
		}

		return num;
	}
}
