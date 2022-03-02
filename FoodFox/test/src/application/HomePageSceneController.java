package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class HomePageSceneController {

	@FXML
	private Button buttonRest1, buttonRest2, buttonRest3, buttonRest4, buttonRest5, buttonRest6;
	
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
			System.out.println("Hello Restaurant 6");
	}
}
