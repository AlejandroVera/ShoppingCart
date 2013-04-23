package client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import client.ShoppingCartWSStub.*;


public class AutomaticTests {
	
	private static int testCase = 0;
	private static int testOk = 0;
	private static int testError = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShoppingCartWSStub stub = null;
		try {
			stub = new ShoppingCartWSStub();
		} catch (AxisFault e) {
			error("AxisFault", "OK");
			System.exit(1);
		}
		
		/**
		 * Prueba de login incorrecto
		 */
		Login l = new Login();
		l.setUsername("malo");
		l.setPassword("malo");
		try {
			
			LoginResponse res = stub.login(l);
			if(res.getLoginResponse())
				error("true", "false");
			else
				ok();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		/**
		 * Prueba de llamada sin estar logueado
		 */
		try {
			stub.getProductsList();
			error("ok", "NotValidSessionError");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			ok();
		}
		
		
		/**
		 * Prueba de login correcto
		 */
		l.setUsername("Jose");
		l.setPassword("Esoj");
		try {
			
			LoginResponse res = stub.login(l);
			if(res.getLoginResponse())
				ok();
			else
				error("false", "true");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		/**
		 * Prueba de lista de productos estando logueado
		 */
		ProductsList products = null;
		try {
			products = stub.getProductsList();
			if(products.getProduct().length > 0)
				ok();
			else
				error(""+products.getProduct().length, "longitud > 0");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			error("NotValidSessionError", "ok");
		}
		
		/**
		 * Prueba de presupuesto estando logueado
		 */
		double presupuesto = -1;
		double expectedBudget = 1000000.0;
		try {
			presupuesto = stub.budget().getBudget();
			if(presupuesto == expectedBudget)
				ok();
			else
				error(""+presupuesto, "1000000.0");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			error("NotValidSessionError", "ok");
		}
		
		/**
		 * Obtener precio de los tres primeros productos
		 */
		String[] productos = products.getProduct();
		double[] precios = new double[3];
		
		for(int i = 0; i < 3; i++){
			ProductName temp = new ProductName();
			temp.setProductName(productos[i]);
			try {
				precios[i] = stub.getProductPrice(temp).getProductPrice();
				ok();
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (ProductUnknownError e) {
				error("ProductUnknownError", "ok");
			} catch (NotValidSessionError e) {
				error("NotValidSessionError", "ok");
			}
		}
		
		/**
		 * Obtener la cantidad disponible de cada producto
		 */
		int[] disponible = new int[3];
		for(int i = 0; i < 3; i++){
			ProductName temp = new ProductName();
			temp.setProductName(productos[i]);
			try {
				disponible[i] = stub.getProductAvailableUnits(temp).getProductAvailableUnits();
				if(disponible[i] > 0)
					ok();
				else
					error(""+disponible[i], " cantidad > 0");
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (ProductUnknownError e) {
				error("ProductUnknownError", "ok");
			} catch (NotValidSessionError e) {
				error("NotValidSessionError", "ok");
			}
		}
		
		/**
		 * Añadir al carrito la mitad de los productos
		 */
		for(int i = 0; i < 3; i++){
			ProductAmount temp = new ProductAmount();
			ProductAmountType tem = new ProductAmountType();
			tem.setAmount(disponible[i]/2);
			tem.setProduct(productos[i]);
			temp.setProductAmount(tem);
			try {
				stub.addToCart(temp);
				ok();
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (ProductUnknownError e) {
				error("ProductUnknownError", "ok");
			} catch (NotValidSessionError e) {
				error("NotValidSessionError", "ok");
			} catch (NotEnoughUnitsError e) {
				error("NotEnoughUnitsError", "ok");
			}
		}
		
		/**
		 * Comprobar el coste del carro
		 */
		double costeEsperado = 0;
		for(int i = 0; i < 3; i++){
			costeEsperado += precios[i] * (disponible[i]/2);
		}
		try {
			if(stub.costOfCart().getCostOfCart() == costeEsperado)
				ok();
			else
				error("coste="+stub.costOfCart().getCostOfCart(), ""+costeEsperado);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			error("NotValidSessionError", "ok");
		}
		
		
		/**
		 * Probar buy
		 */
		try {
			presupuesto = stub.buy().getBudget();
			expectedBudget -= costeEsperado;
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			error("NotValidSessionError", "ok");
		} catch (NotEnoughBudgetError e) {
			error("NotEnoughBudgetError", "ok");
		}
		if(presupuesto == expectedBudget)
			ok();
		else
			error("presupuesto"+presupuesto, ""+expectedBudget);
		
		
		/**
		 * Probar budget despues de buy
		 */
		try {
			if(stub.budget().getBudget() == expectedBudget)
				ok();
			else
				error("presupuesto"+presupuesto, ""+expectedBudget);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			error("NotValidSessionError", "ok");
		}
		
		
		/**
		 * Prueba de logout
		 */
		try {
			stub.logout();
			ok();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		try {
			stub.budget();
			error("ok", "NotValidSessionError");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotValidSessionError e) {
			ok();
		}
		
		finalizeTest();
		

	}
	
	private static void finalizeTest() {
		System.out.println("\n\n TEST FINALIZADO ("+testOk+"/"+testCase+"). Errores:"+testError);	
	}

	private static void error(String obtenido, String esperado){
		System.out.println("[ERROR] Test "+testCase+": se esperaba '"+esperado+
				"' pero se ha obtenido '"+obtenido+"'");
		testError++;
		testCase++;
	}
	
	private static void ok(){
		System.out.println("[OK] Test "+testCase);
		testOk++;
		testCase++;
	}

}
