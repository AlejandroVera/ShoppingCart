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
		
		
		finalizeTest();
		

	}
	
	private static void finalizeTest() {
		System.out.println("\n\n TEST FINALIZADO ("+testOk+"/"+testCase+")");	
	}

	private static void error(String obtenido, String esperado){
		System.out.println("[ERROR] Test "+testCase+": se esperaba '"+esperado+
				"' pero se ha obtenido '"+obtenido+"'");
		testCase++;
	}
	
	private static void ok(){
		System.out.println("[OK] Test "+testCase);
		testCase++;
	}

}
