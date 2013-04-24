package client.gui;

import java.net.URL;
import java.util.ResourceBundle;

import client.ClientLauncher;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class ListElement {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button botonAccion;

    @FXML
    private AnchorPane element;

    @FXML
    private Label nombre;

    @FXML
    private Label precio;

    @FXML
    private ImageView restarIcon;

    @FXML
    private ImageView sumarIcon;

    @FXML
    private TextField udsToAdd;

    @FXML
    private Label unidades;
    
    private Parent root;
    private boolean enCarro = false;
    private String product = "";

	@FXML
    void modificarCarro(MouseEvent event) {
		Integer amount = Integer.parseInt(udsToAdd.getText());
		ClientLauncher.globalContainer.addToCart(this.product, amount, this.enCarro);
		ClientLauncher.globalContainer.costeTotal();
		this.udsToAdd.setText("0");
    }

    @FXML
    void restarUnidad(MouseEvent event) {
    	Integer amount = Integer.parseInt(udsToAdd.getText());
    	amount = amount+1;
    	udsToAdd.setText(amount.toString());
    	
    }

    @FXML
    void sumarUnidad(MouseEvent event) {
    	Integer amount = Integer.parseInt(udsToAdd.getText());
    	amount = amount+1;
    	udsToAdd.setText(amount.toString());
    }

    @FXML
    void initialize() {
        assert botonAccion != null : "fx:id=\"botonAccion\" was not injected: check your FXML file 'element.fxml'.";
        assert element != null : "fx:id=\"element\" was not injected: check your FXML file 'element.fxml'.";
        assert nombre != null : "fx:id=\"nombre\" was not injected: check your FXML file 'element.fxml'.";
        assert precio != null : "fx:id=\"precio\" was not injected: check your FXML file 'element.fxml'.";
        assert restarIcon != null : "fx:id=\"restarIcon\" was not injected: check your FXML file 'element.fxml'.";
        assert sumarIcon != null : "fx:id=\"sumarIcon\" was not injected: check your FXML file 'element.fxml'.";
        assert udsToAdd != null : "fx:id=\"udsToAdd\" was not injected: check your FXML file 'element.fxml'.";
        assert unidades != null : "fx:id=\"unidades\" was not injected: check your FXML file 'element.fxml'.";
        

    }

	public Parent getRoot() {
		return root;
	}

	public void setRoot(Parent root) {
		this.root = root;
	}
	
    public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		nombre.setText(product);
		this.product = product;
	}

	public boolean isEnCarro() {
		return enCarro;
	}

	/**
	 * Setter para indicar cómo se debe pintar esta entrada
	 * @param enCarro
	 */
	public void setEnCarro(boolean enCarro) {
		
		//TODO: rellenar la info de la entrada con llamadas al servicio
		this.precio.setText(String.valueOf(
				ClientLauncher.globalContainer.getProductPrice(this.getProduct())) +
				" €");
		if(enCarro){ //Es un elemento del carro
			this.sumarIcon.setVisible(false);
			this.restarIcon.setVisible(true);
			this.botonAccion.setText("Quitar del carro");			
			
		}else{ //Es un elemento de la lista de productos
			this.sumarIcon.setVisible(true);
			this.restarIcon.setVisible(false);
			this.botonAccion.setText("Añadir al carro");
		}
		this.enCarro = enCarro;
	}
    public void setAmount (int amount){
    	this.unidades.setText(String.valueOf(amount)+ " uds");    	
    }

}
