package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;
public class MainController {
	@FXML //like a via, connects fxml to maincontroller
	private Button signup;
	@FXML
	private Pane change;
	//change.setVisible(false);
	public void signupPage(ActionEvent event) throws Exception{
		
		{
			Stage arg0=new Stage();
			Parent root=FXMLLoader.load(getClass().getResource("/application/signup.fxml"));
			Scene scene=new Scene(root,700,700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			arg0.setTitle("FoodFox"); //arg0 is the primary stage
			arg0.setScene(scene);
			//arg0.setResizable(false);
			arg0.show();
		}
		
	}
}

//fx.fxml is rendering MainController class
