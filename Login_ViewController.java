/*
*Connor Reilly 
*Resume Builder 
*ITMD 510 Final Project
*December 2017
*Login_ViewController
*/

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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author executive
 */
public class Login_ViewController implements Initializable {
@FXML
private TextField userName;
@FXML
private TextField password;
@FXML
private Button loginButton;

//Method that changes scene from login to the main resume builder screen
@FXML
private void handleButtonAction(ActionEvent event) throws IOException {
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLResumeView.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
          //test if button is working as intended
                System.out.println("Button Working");
        
}

    @Override
     public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}




 
      
        
            
    
   


            
       
