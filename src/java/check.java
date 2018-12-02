/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
public class check extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String Fname = req.getParameter("FirstName");
        String Lname =req.getParameter("LastName");
        String Email=req.getParameter("E-Mail");
        int phone = Integer.parseInt(req.getParameter("PhoneNumber"));
        String password = req.getParameter("pass"); 
        String password1 = req.getParameter("pass1");
        int adhar = Integer.parseInt(req.getParameter("Aadhar"));
        
      RecordCheck rs = new RecordCheck();
        try {
            rs.insert(Fname,Lname,Email,phone,password,password1,adhar);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(check.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
