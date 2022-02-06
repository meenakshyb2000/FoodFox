package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
public class LogInSceneController {
	
	ObservableList<String> locationList = FXCollections
			.observableArrayList("Karicode","Thangassery","Chinnakada","Town Limit");
	
	@FXML //like a via, connects fxml to maincontroller
	private Button signup,login;
	@FXML
	private Pane change1,change2;
	@FXML
	private ChoiceBox locationBox;
	
	
	@FXML
	private void initialize()
	{
		locationBox.setItems(locationList);
	}
	
	public void signupPage() throws IOException{
		//Stage stage1=(Stage)signup.getScene().getWindow();
		
		change1.setVisible(false);
		change2.setVisible(true);
	}
	public void loginPage() throws IOException{
		//Stage stage2=(Stage)login.getScene().getWindow();
		
		change2.setVisible(false);
		change1.setVisible(true);
	}
}

//fx.fxml is rendering MainController class
