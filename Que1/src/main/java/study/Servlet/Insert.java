package study.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.JdbcConnection;

import study.jdbc.Jdbc;

@WebServlet("/insert")
public class Insert extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String date = request.getParameter("date");
		String task = request.getParameter("task");
		
		
		Jdbc obj = new Jdbc();
		
		obj.add(date, task);
	
	}

}
