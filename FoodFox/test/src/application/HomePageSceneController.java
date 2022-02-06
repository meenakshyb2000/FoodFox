package application;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;

public class HomePageSceneController {

	// Event Listener on Button.onAction
	@FXML
	public void helloClicked(ActionEvent event) {
		System.out.println("Hello World");
	}
}
