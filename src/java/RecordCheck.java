/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class RecordCheck {
    
    public void insert(String Fname,String Lname,String Email,int phone,String password,String password1,int adhar) throws ClassNotFoundException, SQLException, IOException
    {
         
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carpool","root","");  
        PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
        ps.setString(1, Fname);
        ps.setString(2, Lname);
        ps.setString(3, Email);
        ps.setInt(4,phone);
        ps.setString(5,password);
        ps.setString(6,password1);
        ps.setInt(7,adhar);
        int rs=ps.executeUpdate();
    }  
    public void insert1(String Name,String Email,String From,String To,String Time,String Date,String Comfort,int Adults,int Children) throws ClassNotFoundException, SQLException, IOException{
         Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carpool","root","");  
        PreparedStatement ps = con.prepareStatement("insert into destination values(?,?,?,?,?,?,?,?,?)");
        ps.setString(1, Name);
        ps.setString(2, Email);
        ps.setString(3, From);
        ps.setString(4,To);
        ps.setString(5,Time);
        ps.setString(6,Date);
        ps.setString(7,Comfort);
        ps.setInt(8,Adults);
        ps.setInt(9,Children);
        int r=ps.executeUpdate();
    }
    public void insert11(String Name,String Pickup,String Date,String Dropoff,String Date1,String Car,String Time,String Comfort,int Adults,int Children) throws ClassNotFoundException, SQLException, IOException{
         Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carpool","root","");  
        PreparedStatement ps = con.prepareStatement("insert into destination values(?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, Name);
        ps.setString(2, Pickup);
        ps.setString(3, Date);
        ps.setString(4,Dropoff);
        ps.setString(5,Date1);
        ps.setString(6,Car);
        ps.setString(7,Time);
        ps.setString(8,Comfort);
        ps.setInt(9,Adults);
        ps.setInt(10,Children);
        int rr=ps.executeUpdate();
    }
}
