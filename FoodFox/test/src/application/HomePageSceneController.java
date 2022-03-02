package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomePageSceneController {

	@FXML
	private Button buttonRest1, buttonRest2, buttonRest3, buttonRest4, buttonRest5, buttonRest6,logout,cartbtn;
	
	// Event Listener on Button.onAction
	@FXML
	public void rest1Clicked(ActionEvent event) {
			System.out.println("Hello Restaurant 1");
	}
	
	@FXML
	public void rest2Clicked(ActionEvent event) {
			System.out.println("Hello Restaurant 2");
	}
	
	@FXML
	public void rest3Clicked(ActionEvent event) {
			System.out.println("Hello Restaurant 3");
	}
	
	@FXML
	public void rest4Clicked(ActionEvent event) {
			System.out.println("Hello Restaurant 4");
	}
	
	@FXML
	public void rest5Clicked(ActionEvent event) {
			System.out.println("Hello Restaurant 5");
	}
        @FXML
	public void rest6Clicked(ActionEvent event) {
			System.out.println("Hello Restaurant 1");
	}
	@FXML
	public void cartbtn(ActionEvent event) {
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
        public void accountbtn(ActionEvent event) {
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
	public void logout(ActionEvent event) {
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
