package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Model;
import dao.Dao;

/**
 * Servlet implementation class RiServlet
 */
public class RiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			
			String sql="select * from install";
			String p="";
			Model m=new Model();
			ResultSet rs=Dao.getValues(m,sql);
			if(rs.next())
			{
				p="/ritruck.jsp?msg='"+rs.getString("tno")+"'";
			}
			else
			{
				p="/profile.jsp";
			}
			
			getServletContext().getRequestDispatcher(p).forward(request, response);
		}catch(Exception e){}

	}
		

		
		
	}


