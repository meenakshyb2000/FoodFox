package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class SelectionPageSceneController {

	@FXML
	private Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, qty10;
	@FXML
	private Button bpqty1;
	@FXML
	private Button bmqty1; 
	@FXML
	private Button bpqty2; 
	@FXML
	private Button bmqty2; 
	@FXML
	private Button bpqty3; 
	@FXML
	private Button bmqty3; 
	@FXML
	private Button bpqty4; 
	@FXML
	private Button bmqty4; 
	@FXML
	private Button bpqty5; 
	@FXML
	private Button bmqty5; 
	@FXML
	private Button bpqty6; 
	@FXML
	private Button bmqty6; 
	@FXML
	private Button bpqty7; 
	@FXML
	private Button bmqty7; 
	@FXML
	private Button bpqty8; 
	@FXML
	private Button bmqty8; 
	@FXML
	private Button bpqty9; 
	@FXML
	private Button bmqty9; 
	@FXML
	private Button bpqty10; 
	@FXML
	private Button bmqty10; 
	
	int q1 = 0 ,q2 = 0 ,q3 = 0 ,q4 = 0 ,q5 = 0 ,q6 = 0 ,q7 = 0 ,q8 = 0 ,q9 = 0 ,q10 = 0 ;
	
	@FXML
	public void incQty1(ActionEvent event) 
	{
		q1++;
		String st = " " + q1 + " ";
		qty1.setText(st);
	}
	
	@FXML
	public void incQty2(ActionEvent event) 
	{
		q2++;
		String st = " " + q2 + " ";
		qty2.setText(st);
	}
	
	@FXML
	public void incQty3(ActionEvent event) 
	{
		q3++;
		String st = " " + q3 + " ";
		qty3.setText(st);
	}
	
	@FXML
	public void incQty4(ActionEvent event) 
	{
		q4++;
		String st = " " + q4 + " ";
		qty4.setText(st);
	}
	
	@FXML
	public void incQty5(ActionEvent event) 
	{
		q5++;
		String st = " " + q5 + " ";
		qty5.setText(st);
	}
	
	@FXML
	public void incQty6(ActionEvent event) 
	{
		q6++;
		String st = " " + q6 + " ";
		qty6.setText(st);
	}
	
	@FXML
	public void incQty7(ActionEvent event) 
	{
		q7++;
		String st = " " + q7 + " ";
		qty7.setText(st);
	}
	
	@FXML
	public void incQty8(ActionEvent event) 
	{
		q8++;
		String st = " " + q8 + " ";
		qty8.setText(st);
	}
	
	@FXML
	public void incQty9(ActionEvent event) 
	{
		q9++;
		String st = " " + q9 + " ";
		qty9.setText(st);
	}
	
	@FXML
	public void incQty10(ActionEvent event) 
	{
		q10++;
		String st = " " + q10 + " ";
		qty10.setText(st);
	}
	
	
	@FXML
	public void decQty1(ActionEvent event) 
	{
		q1--;
		String st = " " + q1 + " ";
		qty1.setText(st);
	}
	
	@FXML
	public void decQty2(ActionEvent event) 
	{
		q2--;
		String st = " " + q2 + " ";
		qty2.setText(st);
	}
	
	@FXML
	public void decQty3(ActionEvent event) 
	{
		q3--;
		String st = " " + q3 + " ";
		qty3.setText(st);
	}
	
	@FXML
	public void decQty4(ActionEvent event) 
	{
		q4--;
		String st = " " + q4 + " ";
		qty4.setText(st);
	}
	
	@FXML
	public void decQty5(ActionEvent event) 
	{
		q5--;
		String st = " " + q5 + " ";
		qty5.setText(st);
	}
	
	@FXML
	public void decQty6(ActionEvent event) 
	{
		q6--;
		String st = " " + q6 + " ";
		qty6.setText(st);
	}
	
	@FXML
	public void decQty7(ActionEvent event) 
	{
		q7--;
		String st = " " + q7 + " ";
		qty7.setText(st);
	}
	
	@FXML
	public void decQty8(ActionEvent event) 
	{
		q8--;
		String st = " " + q8 + " ";
		qty8.setText(st);
	}
	
	@FXML
	public void decQty9(ActionEvent event) 
	{
		q9--;
		String st = " " + q9 + " ";
		qty9.setText(st);
	}
	
	@FXML
	public void decQty10(ActionEvent event) 
	{
		q10--;
		String st = " " + q10 + " ";
		qty10.setText(st);
	}
	
	
	
	
	
}

