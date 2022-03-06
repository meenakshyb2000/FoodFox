package application;
import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SelectionPageSceneController {

	
	@FXML
	private Label qty1, qty2, qty3, qty4, qty5, qty6, qty7, qty8, qty9, qty10;
	@FXML
	private Button homebtn;
	@FXML
	private Button cartbtn;
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
	@FXML
	private Button add1;
	@FXML
	private Button add2;
	@FXML
	private Button add3;
	@FXML
	private Button add4;
	@FXML
	private Button add5;
	@FXML
	private Button add6;
	@FXML
	private Button add7;
	@FXML
	private Button add8;
	@FXML
	private Button add9;
	@FXML
	private Button add10;
	
	
	
	int q1 = 0 ,q2 = 0 ,q3 = 0 ,q4 = 0 ,q5 = 0 ,q6 = 0 ,q7 = 0 ,q8 = 0 ,q9 = 0 ,q10 = 0 ;
	
	Connection con;
	PreparedStatement pst,ps;
	ResultSet rs,rst;

	
	
	
	@FXML
	public void cartbtn(ActionEvent event) {
	try
        {
        
		Stage arg0=(Stage) cartbtn.getScene().getWindow();
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
	public void homebtn(ActionEvent event) {
	try
        {
         
		Stage arg0=(Stage) homebtn.getScene().getWindow();
         Parent root=FXMLLoader.load(getClass().getResource("/application/HomePageScene.fxml"));
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
	@FXML
	public void add1(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			System.out.println(q1);
	        pst.setString(1,"F01");
	        pst.setInt(2,q1);
	        pst.setInt(3,400);
	        pst.setString(4,"Momo Mia Pizza");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@FXML
	public void add2(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F02");
	        pst.setInt(2,q2);
	        pst.setInt(3,350);
	        pst.setString(4,"Tandoori Paneer Pizza");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@FXML
	public void add3(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F03");
	        pst.setInt(2,q3);
	        pst.setInt(3,250);
	        pst.setString(4,"Veggie Supreme");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@FXML
	public void add4(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F04");
	        pst.setInt(2,q4);
	        pst.setInt(3,280);
	        pst.setString(4,"Veg Kebab");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@FXML
	public void add5(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F05");
	        pst.setInt(2,q5);
	        pst.setInt(3,350);
	        pst.setString(4,"Chicken Supreme");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@FXML
	public void add6(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F06");
	        pst.setInt(2,q6);
	        pst.setInt(3,340);
	        pst.setString(4,"Chicken Tikka");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@FXML
	public void add7(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F07");
	        pst.setInt(2,q7);
	        pst.setInt(3,450);
	        pst.setString(4,"Chicken Triple feast");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@FXML
	public void add8(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F08");
	        pst.setInt(2,q8);
	        pst.setInt(3,220);
	        pst.setString(4,"Veg Kebab Surprise");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	@FXML
	public void add9(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F09");
	        pst.setInt(2,q9);
	        pst.setInt(3,300);
	        pst.setString(4,"Double Sausage");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@FXML
	public void add10(ActionEvent event)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","root");
			String query1="insert into order1 values('','',?,?,?,?)";
			pst=con.prepareStatement(query1);
			
	        pst.setString(1,"F10");
	        pst.setInt(2,q10);
	        pst.setInt(3,245);
	        pst.setString(4,"Corn and Cheese");
			pst.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

