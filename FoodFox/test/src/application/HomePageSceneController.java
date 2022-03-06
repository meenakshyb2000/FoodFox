package application;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class HomePageSceneController {

	@FXML
	private Button buttonRest1, buttonRest2, buttonRest3, buttonRest4, buttonRest5, buttonRest6,logout,cartbtn;
	@FXML
        private Label mb;
	// Event Listener on Button.onAction
	
String cid, fname, lname, phone, email, location, username;
int pts;
public void getID(String id, String a,String b,String c,String d,String e, String f, int g)
{

    cid = id;
	fname = a;
    lname = b;
    phone = c;
    email = d;
    location = e;
    username = f;
    pts = g;
    mb.setText("Hello, "+fname);
}
        @FXML
	public void rest1Clicked(ActionEvent event) {
	try
        {
          FXMLLoader loader=new FXMLLoader();
         loader.setLocation(getClass().getResource("/application/SelectionPageScene.fxml"));
         
         Parent root=loader.load();
	 Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
         
         arg0.setTitle("FoodFox");
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
			System.out.println("Hello Restaurant 6");
	}
	@FXML
	public void cartbtn(ActionEvent event) {
	try
        {
         FXMLLoader loader=new FXMLLoader();
         loader.setLocation(getClass().getResource("/application/cart.fxml"));
         
         Parent root=loader.load();
	     Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	 
	     CartController controller=loader.getController();
	     System.out.println("home page");
	     System.out.println(fname);
         controller.getID(cid, fname, lname, phone, email, location, username, 50);
         
         arg0.setTitle("FoodFox");
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
         FXMLLoader loader=new FXMLLoader();
         loader.setLocation(getClass().getResource("/application/ProfilePage.fxml"));
         
         Parent root=loader.load();
	 Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
	 
	    ProfilePageController controller=loader.getController();
        controller.getID(cid, fname, lname, phone, email, location, username, 50);
         
         arg0.setTitle("FoodFox");
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
         FXMLLoader loader=new FXMLLoader();
         loader.setLocation(getClass().getResource("/application/login.fxml"));
         
         Parent root=loader.load();
	 Stage arg0=(Stage) ((Node)event.getSource()).getScene().getWindow();
         
         arg0.setTitle("FoodFox");
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
