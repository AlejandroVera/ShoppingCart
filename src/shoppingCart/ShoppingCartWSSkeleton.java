
/**
 * ShoppingCartWSSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
package shoppingCart;

import es.upm.fi.sos.t3.shoppingcart.*;

import shoppingCart.NotEnoughBudgetError;
import shoppingCart.NotEnoughUnitsError;
import shoppingCart.NotValidSessionError;
import shoppingCart.ProductUnknownError;

/**
 * ShoppingCartWSSkeleton java skeleton for the axisService
 */
public class ShoppingCartWSSkeleton {
	
	private boolean logged = false;

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 */

	public ProductsAmountsList productsInCart(

	) throws NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#productsInCart");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param productName
	 * @throws ProductUnknownError:
	 * @throws NotValidSessionError:
	 */

	public ProductAvailableUnits getProductAvailableUnits(
			ProductName productName)
			throws ProductUnknownError, NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getProductAvailableUnits");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 */

	public Budget budget(

	) throws NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#budget");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param login
	 */

	public LoginResponse login(
			Login login) {
		
		//login.getUsername()
		LoginResponse resp = new LoginResponse();
		resp.setLoginResponse(false);
		return resp;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 */

	public CostOfCart costOfCart(

	) throws NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#costOfCart");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @throws NotValidSessionError:
	 */

	public ProductsList getProductsList(

	) throws NotValidSessionError {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement "
				+ this.getClass().getName() + "#getProductsList");
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

}
