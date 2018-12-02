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
public class ride1 extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
    {
         res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("Name");
        String pickup =req.getParameter("Pickup");
        String date=req.getParameter("Date");
        String dropoff=req.getParameter("Dropoff");
        String date1 = req.getParameter("Date1"); 
        String car = req.getParameter("Car"); 
        String time = req.getParameter("Time");
        String comfort = req.getParameter("Comfort");
        int adults = Integer.parseInt(req.getParameter("Adults"));
        int children = Integer.parseInt(req.getParameter("Children"));
        out.println("Your car is Registered");
      RecordCheck rr = new RecordCheck();
        try {
            rr.insert11(name,pickup,date,dropoff,date1,car,time,comfort,adults,children);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(destination1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(destination1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
