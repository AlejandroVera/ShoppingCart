package client.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
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


    @FXML
    void modificarCarro(MouseEvent event) {
    }

    @FXML
    void restarUnidad(MouseEvent event) {
    }

    @FXML
    void sumarUnidad(MouseEvent event) {
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

}
