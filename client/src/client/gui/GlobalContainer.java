package client.gui;

import java.io.IOException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import org.apache.axis2.AxisFault;

import client.NotEnoughBudgetError;
import client.NotEnoughUnitsError;
import client.NotValidSessionError;
import client.ProductUnknownError;
import client.ShoppingCartWSStub;
import client.ShoppingCartWSStub.Budget;
import client.ShoppingCartWSStub.Login;
import client.ShoppingCartWSStub.LoginResponse;
import client.ShoppingCartWSStub.ProductAmount;
import client.ShoppingCartWSStub.ProductAmountType;
import client.ShoppingCartWSStub.ProductAvailableUnits;
import client.ShoppingCartWSStub.ProductName;
import client.ShoppingCartWSStub.ProductsAmountsList;
import client.ShoppingCartWSStub.ProductsList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;


public class GlobalContainer {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private AnchorPane background;

	@FXML
	private Label budgetLabel;

	@FXML
	private Button carroButton;

	@FXML
	private AnchorPane cartContainer;

	@FXML
	private AnchorPane cartPopup;

	@FXML
	private AnchorPane errorContainer;

	@FXML
	private TextArea errorMes;
	
    @FXML
    private TitledPane errorTitle;

	@FXML
	private AnchorPane listContainer;

	@FXML
	private VBox listaAlmacen;

	@FXML
	private VBox listaCarro;

	@FXML
	private AnchorPane loginContainer;

	@FXML
	private Button logoutButton;

	@FXML
	private PasswordField passwordLoginField;

	@FXML
	private Button submitLogin;

	@FXML
	private GridPane tablaLogin;

	@FXML
	private Label totalNumLabel;

	@FXML
	private TextField userLoginField;


	private ShoppingCartWSStub shopCart;
	private HashMap<String, ListElement> itemList;
	private HashMap<String, ListElement> cartList;

	@FXML
	void cerrarError(MouseEvent event) {
		errorContainer.setVisible(false);
	}

	@FXML
	void closeCartPopup(MouseEvent event) {
		cartContainer.setVisible(false);
	}

	@FXML
	void login(MouseEvent event) {
		Login login = new Login();
		login.setUsername(userLoginField.getText());
		login.setPassword(passwordLoginField.getText());
		try {
			LoginResponse resp = this.shopCart.login(login);

			if(resp.getLoginResponse()){ //Autorizado

				//Rellenamos la lista de productos del almacen
				clear(listaAlmacen);

				ProductsList p = this.shopCart.getProductsList();

				String[] products = p.getProduct();
				if(products != null){
					for(int i = 0; i < products.length; ++i){
						addEntry(products[i], listaAlmacen, this.getProductUnits(products[i]));
					}
				}

				//Actrualizar el presupuesto
				Budget budget = this.shopCart.budget();
				budgetLabel.setText(budget.getBudget() + " €");

				//Finalmente mostramos el contenedor
				listContainer.setVisible(true);
				cartContainer.setVisible(false);
				loginContainer.setVisible(false);

			}else{ //No autorizado
				errorContainer.setVisible(true);
			}
				
		} catch (NotValidSessionError e) {
			System.err.println("Upss...esto es vergonzoso...Parece que no estabas logueado.");
		} catch (RemoteException e) {
			errorSesion();	}

	}

	@FXML
	void logout(MouseEvent event) {

		try {
			this.shopCart.logout();

			listContainer.setVisible(false);
			cartContainer.setVisible(false);
			loginContainer.setVisible(true);
		} catch (RemoteException e) {
			errorSesion();
		}

	}

	@FXML
	void realizarCompra(MouseEvent event) {
		try{
			Budget bu = this.shopCart.buy();
			this.budgetLabel.setText(bu.getBudget()+" €");
			this.costeTotal();
			clear(listaCarro);
			
		
		}catch (NotEnoughBudgetError e){
			showMes ("Error", "No tienes suficiente dinero para realizar la compra.");
			System.err.println("No tienes suficiente dinero para realizar la compra.");
		} catch (NotValidSessionError e) {
			System.err.println("Upss...esto es vergonzoso...Parece que no estabas logueado.");
		}catch (RemoteException e){
			errorSesion();
		}
	}

	@FXML
	void showCarro(MouseEvent event) {

		clear(listaCarro);

		try {
			ProductsAmountsList p = this.shopCart.productsInCart();

			ProductAmountType[] products = p.getProductAmountInfo();

			if(products != null){
				for(int i = 0; i < products.length; ++i){
					addEntry(products[i].getProduct(), listaCarro, products[i].getAmount());
				}
			}
			costeTotal();
			cartContainer.setVisible(true);


		} catch (NotValidSessionError e) {
			System.err.println("Upss...esto es vergonzoso...Parece que no estabas logueado.");
		} catch (RemoteException e) {
			errorSesion();
		}


	}

	@FXML
	void initialize() {
		assert background != null : "fx:id=\"background\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert budgetLabel != null : "fx:id=\"budgetLabel\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert carroButton != null : "fx:id=\"carroButton\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert cartContainer != null : "fx:id=\"cartContainer\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert cartPopup != null : "fx:id=\"cartPopup\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert listContainer != null : "fx:id=\"listContainer\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert listaAlmacen != null : "fx:id=\"listaAlmacen\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert listaCarro != null : "fx:id=\"listaCarro\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert loginContainer != null : "fx:id=\"loginContainer\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert logoutButton != null : "fx:id=\"logoutButton\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert passwordLoginField != null : "fx:id=\"passwordLoginField\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert submitLogin != null : "fx:id=\"submitLogin\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert tablaLogin != null : "fx:id=\"tablaLogin\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert totalNumLabel != null : "fx:id=\"totalNumLabel\" was not injected: check your FXML file 'GlobalContainer.fxml'.";
		assert userLoginField != null : "fx:id=\"userLoginField\" was not injected: check your FXML file 'GlobalContainer.fxml'.";

		startStub();

		this.itemList = new HashMap<String, ListElement>();
		this.cartList = new HashMap<String, ListElement>();

		this.listContainer.setVisible(false);
		this.cartContainer.setVisible(false);
		this.loginContainer.setVisible(true);

	}


	private void startStub() {
		try {
			this.shopCart = new ShoppingCartWSStub();
			this.shopCart._getServiceClient().engageModule("addressing");
			this.shopCart._getServiceClient().getOptions().setManageSession(true);
		} catch (AxisFault e) {
			e.printStackTrace();
			System.exit(1);
		}

	}

	public void addToCart(String name, int amount, boolean remove){

		ListElement elemControl = cartList.get(name);
		ProductAmount prod = new ProductAmount();
		ProductAmountType pro = new ProductAmountType();
		pro.setProduct(name);
		pro.setAmount(amount);
		prod.setProductAmount(pro);

		ProductAvailableUnits units = new ProductAvailableUnits();
		int unidades;
		if(!remove){//Queremos añadirlo al carro
		
			try {
				units =shopCart.addToCart(prod);
				unidades= units.getProductAvailableUnits();
				if (elemControl == null)//No está en el carro
					addEntry(name, listaCarro, unidades);
				else
					elemControl.setAmount(unidades);
					
			} catch (ProductUnknownError e) {
				e.printStackTrace();
			} catch (NotEnoughUnitsError e) {
				this.showMes("Error", "No hay suficientes unidades en el almacén.");
			} catch (NotValidSessionError e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				errorSesion();
			}

		}else if (remove){ //Ya estaba en el carro y lo vamos a borrar
			try {
				units =shopCart.removeFromCart(prod);
			
			} catch (ProductUnknownError e) {
				e.printStackTrace();			
			} catch (NotValidSessionError e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				errorSesion();}
			unidades= units.getProductAvailableUnits();			
			
			if (unidades>0)
				elemControl.setAmount(unidades);
			else{
				
				removeEntry(name, this.listaCarro);}			
		}

	}

	private void addEntry(String name, VBox where, int amount) {
		try {


			FXMLLoader loader = new FXMLLoader();
			URL resource = getClass().getResource("element.fxml");
			loader.setLocation(resource);
			Parent root = (Parent) loader.load(resource.openStream());
			ListElement controller = (ListElement) loader.getController();

			controller.setRoot(root);
			controller.setProduct(name);

			//Lo añadimos a la tabla de asociacion
			if(where.equals(listaAlmacen)){
				this.itemList.put(name, controller);
				controller.setEnCarro(false);
				controller.setAmount(amount);
			}else{
				this.cartList.put(name, controller);
				controller.setEnCarro(true);
				controller.setAmount(amount);
			}

			where.getChildren().add(root);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void removeEntry(String name, VBox where){

		HashMap<String, ListElement> lista;

		if(where.equals(listaAlmacen)){
			lista = this.itemList;
		}else{
			lista = this.cartList;
		}

		ListElement element = lista.remove(name);
		if(element != null){
			where.getChildren().remove(element.getRoot());
		}

	}

	private void clear(VBox where){

		HashMap<String, ListElement> lista;

		if(where.equals(listaAlmacen)){
			lista = this.itemList;
		}else{
			lista = this.cartList;
		}

		for(Entry<String, ListElement> element : lista.entrySet()){
			where.getChildren().remove(element.getValue().getRoot());
		}

		lista.clear();
	}

	public double getProductPrice(String product){
		double a = -1;
		try{
			ProductName p = new ProductName();
			p.setProductName(product);
			a= this.shopCart.getProductPrice(p).getProductPrice();		
		} catch (ProductUnknownError e) {
			e.printStackTrace();		
		} catch (NotValidSessionError e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			errorSesion();}
		return a;
	}

	//Devuelve las unidades en el almacen
	public int getProductUnits (String product){
		int units=-1;
		try{
			ProductName p = new ProductName();
			p.setProductName(product);
			units= this.shopCart.getProductAvailableUnits(p).getProductAvailableUnits();

		} catch (ProductUnknownError e) {
			e.printStackTrace();		
		} catch (NotValidSessionError e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			errorSesion();}
		return units;
	}
	
	public void showMes (String title, String mes){
		this.errorMes.setText(mes);
		this.errorTitle.setText(title);
		errorContainer.setVisible(true);		
	}
	
	public void errorSesion(){
		showMes ("Error", "Se ha sobrepasado el límite de 30 seg, perdiendo la sesion SOAP.");
		listContainer.setVisible(false);
		cartContainer.setVisible(false);
		loginContainer.setVisible(true);
		startStub();
	}	
	
	public void costeTotal(){
		try {
			double coste = this.shopCart.costOfCart().getCostOfCart();
			this.totalNumLabel.setText(coste + " €");

		} catch (NotValidSessionError e) {
			e.printStackTrace();
		}catch (RemoteException e) {}
	
	}
}
