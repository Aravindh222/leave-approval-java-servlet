package invLogin;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  

import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Home extends HttpServlet
{
    protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
    {
        
    	HttpSession session=req.getSession(false);    
    	res.sendRedirect("home.html");
    }
}