/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2_passingparameter;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField sewa;
    String sew;
    @FXML
    private JFXButton proses;
    public String user="zahra";
    public String passw="123";
    @FXML
    private JFXPasswordField pass;
    String username, password;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) {
        username=nama.getText();
        password=pass.getText();
        sew=sewa.getText();
        
         if(username.equalsIgnoreCase(user) && password.equalsIgnoreCase(passw)){
        try {
            
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("barang.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 830, 450);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Zahra Camp");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
         
          try {
           
            FXMLLoader loader = new FXMLLoader(getClass().getResource("barang.fxml"));
            Parent root = (Parent) loader.load();
           
            BarangController fxml2Controller = loader.getController();
          
            fxml2Controller.myFunction(sewa.getText());
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();   
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
}

    }
    
}
