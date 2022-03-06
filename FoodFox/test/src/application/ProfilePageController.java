package application;

import java.io.IOException;
import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class ProfilePageController {

	String cid, fname, lname, phone, email, location, username, orderno, foodno;
	int pts;
	Connection con1;
	PreparedStatement ps1;
	ResultSet rs1;
	
	@FXML
    private Label mb1, mb2;
	
	public void getID(String id, String a,String b,String c,String d,String e,String f,int g)
	{
		cid = id;
	    fname = a;
	    lname = b;
	    phone = c;
	    email = d;
	    location = e;
	    username = f;
	    pts = g;
	    mb1.setText("  Hello, "+fname+" "+lname+"  ");
	    mb2.setText("  Hello, "+fname+" "+lname+"  ");
	    fnamelabel.setText(fname);
		 lnamelabel.setText(lname);
		 unamelabel.setText(username);
		 conlabel.setText(phone);
		 maillabel.setText(email);
		 loclabel.setText(location);
		 String spts = ""+pts;
		 ptslabel.setText(spts);
		 
		 try
	    	{
	    		 Class.forName("com.mysql.cj.jdbc.Driver");
	    		 con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodfoxdatabase","root","chimera");
	 
	    		 ps1=con1.prepareStatement("select * from OrderDetails where CID=? order by OrderID desc limit 1");
	    		 ps1.setString(1,cid);
	    		 rs1=ps1.executeQuery();
	    		 while(rs1.next())
	    		 {
	    			 rlabel.setText(rs1.getString(3));
	    			 falabel.setText(rs1.getString(4));
	    			 eptslabel.setText(rs1.getString(5));
	    			 dloclabel.setText(rs1.getString(6));
	    			 orderno = rs1.getString(2);
	    			 System.out.println(orderno);
	    		 }
	    		 
	    		 for(int i=1; i<=10; i++)
	    		 {
	    			 foodno = orderno + "F" + i;
	    			 //String query = "select * from Order1 where CID=? and OID=? and FoodID=?";
	    			 ps1=con1.prepareStatement("select * from Order1 where CID=? and OID=? and FoodID=?");
	    			 ps1.setString(1,cid);
	    			 ps1.setString(2,orderno);
	    			 ps1.setString(3,foodno);
	    			 rs1=ps1.executeQuery();
	    			 
	    			 if(i==1)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl1.setText(rs1.getString(4));
	        				 q1.setText(rs1.getString(5));
	        				 a1.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==2)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl2.setText(rs1.getString(4));
	        				 q2.setText(rs1.getString(5));
	        				 a2.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==3)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl3.setText(rs1.getString(4));
	        				 q3.setText(rs1.getString(5));
	        				 a3.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==4)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl4.setText(rs1.getString(4));
	        				 q4.setText(rs1.getString(5));
	        				 a4.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==5)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl5.setText(rs1.getString(4));
	        				 q5.setText(rs1.getString(5));
	        				 a5.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==6)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl6.setText(rs1.getString(4));
	        				 q6.setText(rs1.getString(5));
	        				 a6.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==7)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl7.setText(rs1.getString(4));
	        				 q7.setText(rs1.getString(5));
	        				 a7.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==8)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl8.setText(rs1.getString(4));
	        				 q8.setText(rs1.getString(5));
	        				 a8.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==9)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl9.setText(rs1.getString(4));
	        				 q9.setText(rs1.getString(5));
	        				 a9.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    			 else if(i==10)
	    			 {
	    				 while(rs1.next())
	        			 {
	        				 fl10.setText(rs1.getString(4));
	        				 q10.setText(rs1.getString(5));
	        				 a10.setText(rs1.getString(6));
	        			 } 
	    			 }
	    			 
	    		 }
	    		 
	    	}
	    	catch(ClassNotFoundException | SQLException ex)
	        {
	    		System.out.println("Connection failed");
	    		System.out.println(ex);
	        }
		 
	}	

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
    private Label fnamelabel;
    
    @FXML
    private Label lnamelabel, unamelabel, conlabel, maillabel, loclabel, ptslabel;
    
    @FXML
    private Label rlabel, falabel, eptslabel, dloclabel;
    
    @FXML
    private Label fl1, fl2, fl3, fl4, fl5, fl6, fl7, fl8, fl9, fl10;
    
    @FXML
    private Label q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;
    
    @FXML
    private Label a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;
    
    
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
