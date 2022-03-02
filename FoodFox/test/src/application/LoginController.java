package application;

import java.sql.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/////////////////////////////////////////

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
public class LoginController implements Initializable{
	
	ObservableList<String> locationList = FXCollections
			.observableArrayList("Karicode","Thangassery","Chinnakada","Town Limit","Polayathode","Kadappakada");
	
	@FXML //like a via, connects fxml to maincontroller
	private Button signup,login;
	@FXML
	private Pane change1,change2;
	@FXML
	private ChoiceBox locationBox;
        
        @FXML
        private Button submit1;
        @FXML
        private Button submit2;
	
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


 @FXML
 private TextField login_username;
 @FXML
 private TextField login_password;
 /**
 * Initializes the controller class.
 * @param url
 * @param rb
 */
 Connection con;
 PreparedStatement pst;
 ResultSet rs;
 @FXML
 private void SignInbtn(ActionEvent event) throws SQLException,
ClassNotFoundException {
 String username=login_username.getText();
 String password=login_password.getText();
 if(username.equals("")&&password.equals(""))
 JOptionPane.showMessageDialog(null,"Enter Username and password");
 else
 {
 try
 {
 Class.forName("com.mysql.cj.jdbc.Driver");

con=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfox","root","meemu2000");
 pst=con.prepareStatement("select * from Customer where CUser=? and CPswd=?");
 pst.setString(1, username);
 pst.setString(2, password);
 rs=pst.executeQuery();
 if(rs.next())
 {
     System.out.println("Login Success");
     try
     {
         Stage stage=(Stage) submit1.getScene().getWindow();
         stage.close();
         Stage arg0=new Stage();
         Parent root=FXMLLoader.load(getClass().getResource("/application/HomePageScene.fxml"));
	 arg0.setTitle("FoodFox"); //arg0 is the primary stage
	 Scene scene=new Scene(root,1300,700);
         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
         arg0.setScene(scene);
         arg0.setResizable(false);
	 arg0.show();
     }
     catch(Exception e) 
                {
			e.printStackTrace();
		}
 }
 else {
 JOptionPane.showMessageDialog(null,"Login Failed");
 login_username.setText("");
 login_password.setText("");
 login_username.requestFocus();
 login_password.requestFocus();
 }
 }catch(ClassNotFoundException | SQLException e)
 {
 System.out.println("Connection failed");
 System.out.println(e);
 }
 } }
 @Override
 public void initialize(URL url, ResourceBundle rb) {
 //throw new UnsupportedOperationException("Not supported yet.");// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 }
}
