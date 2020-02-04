package com.cts.training.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		    Connection conn;
		    String url="jdbc:mysql://localhost:3306/cts";
			String username="root";
			String password="root";
			String query="select * from user2";
			String user=request.getParameter("user");
			String pass=request.getParameter("password");
			Statement stmt = null;
			
			RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);

			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				String a=rs.getString("username");
				String b=rs.getString("password");
				if(a==user && b==password) 
				{
					rd.forward(request, responce);
				}
				else
				{
					System.out.println("password wrong");
				}
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}