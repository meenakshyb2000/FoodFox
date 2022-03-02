package application;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProfilePageController {

    @FXML
    private Button homebtn;

    @FXML
    private Button searchbtn;

    @FXML
    private Button accountbtn;

    @FXML
    private Button cartbtn;

    @FXML
    private Button logout;

    @FXML
    void accountbtn(ActionEvent event) {
        try
     {
         Stage stage=(Stage) logout.getScene().getWindow();
         stage.close();
         Stage arg0=new Stage();
         Parent root=FXMLLoader.load(getClass().getResource("/application/ProfilePage.fxml"));
	 arg0.setTitle("FoodFox"); //arg0 is the primary stage
	 Scene scene=new Scene(root,1300,700);
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
         arg0.setScene(scene);
         arg0.setResizable(false);
	 arg0.show();
     }
     catch(IOException e) 
                {
			e.printStackTrace();
		}
    }

    @FXML
    void cartbtn(ActionEvent event) {
        try
        {
         Stage stage=(Stage) logout.getScene().getWindow();
         stage.close();
         Stage arg0=new Stage();
         Parent root=FXMLLoader.load(getClass().getResource("/application/cart.fxml"));
	 arg0.setTitle("FoodFox"); //arg0 is the primary stage
	 Scene scene=new Scene(root,1300,700);
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
         arg0.setScene(scene);
         arg0.setResizable(false);
	 arg0.show();
        }
        catch(IOException e) 
        {
			e.printStackTrace();
	}
    }

    @FXML
    void logout(ActionEvent event) {
        try
        {
         Stage stage=(Stage) logout.getScene().getWindow();
         stage.close();
         Stage arg0=new Stage();
         Parent root=FXMLLoader.load(getClass().getResource("/application/login.fxml"));
	 arg0.setTitle("FoodFox"); //arg0 is the primary stage
	 Scene scene=new Scene(root,1300,700);
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
         arg0.setScene(scene);
         arg0.setResizable(false);
	 arg0.show();
        }
        catch(IOException e) 
        {
			e.printStackTrace();
	}	
    }

}