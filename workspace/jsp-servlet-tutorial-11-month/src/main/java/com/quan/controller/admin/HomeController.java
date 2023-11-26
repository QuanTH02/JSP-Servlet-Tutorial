package com.quan.controller.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quan.model.UserModel;

@WebServlet(urlPatterns = { "/admin-home" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = -7395492729802896364L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserModel userModel = new UserModel();
		userModel.setFullName("My name is Admin");
		request.setAttribute("fullNameAdmin", userModel);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/home.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
