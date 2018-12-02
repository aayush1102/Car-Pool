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
public class destination1 extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("Name");
        String email =req.getParameter("Email");
        String from=req.getParameter("From");
        String to=req.getParameter("To");
        String time = req.getParameter("Time"); 
        String date = req.getParameter("Date");
        String comfort = req.getParameter("Comfort");
        int adults = Integer.parseInt(req.getParameter("Adults"));
        int children = Integer.parseInt(req.getParameter("Children"));
        out.println("Your Data is Registered Successfully");
      RecordCheck r = new RecordCheck();
        try {
            r.insert1(name,email,from,to,time,date,comfort,adults,children);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(destination1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(destination1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
