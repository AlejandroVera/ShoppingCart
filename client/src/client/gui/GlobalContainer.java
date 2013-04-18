package client.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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


    @FXML
    void closeCartPopup(MouseEvent event) {
    }

    @FXML
    void login(MouseEvent event) {
    }

    @FXML
    void logout(MouseEvent event) {
    }

    @FXML
    void realizarCompra(MouseEvent event) {
    }

    @FXML
    void showCarro(MouseEvent event) {
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


    }

}
