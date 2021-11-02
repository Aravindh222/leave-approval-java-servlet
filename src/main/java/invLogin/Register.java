package invLogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public static boolean validation(String username,String userid, String password, String confirmpassword, String registrationtype) throws Exception
	  {
		  
		  if(!confirmpassword.equals(password)) {
			  return false;
		  }
		  
	
	     
	  }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		 	PrintWriter pw=response.getWriter();
	        response.setContentType("text/html");
	        
	        
	        String username = request.getParameter("username");
	        String userid = request.getParameter("userid");
	        String password = request.getParameter("password");
	        String confirmpassword = request.getParameter("confirmpassword");
	        String registrationtype = request.getParameter("registration-type");
	        try {
		        if(validation(username,userid,password,confirmpassword,registrationtype))
		        {
		            pw.println("Data Entered Successfully!");
		        }
		        else
		        {
		            pw.println("Data Not Entered!");
		        }
	        }
	        catch(Exception e) 
	        {
	            System.out.println(e);
	        }
	        pw.close();
	    }
	}
