package com.cts.training.controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		    Connection conn;
		    String url="jdbc:mysql://localhost:3306/cts";
			String username="root";
			String password="root";
			String query="insert into user2 values(?,?,?)";
			int id = Integer.parseInt(request.getParameter("id"));
			String user=request.getParameter("user");
			String pass1=request.getParameter("password1");
			
			PreparedStatement ps;
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			ps =  conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, user);
			ps.setString(3, pass1);
			int result=ps.executeUpdate();
			if(result==1) {
				rd.forward(request, responce);
			System.out.println("success");
			}
			else {
				System.out.println("User not registered");
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