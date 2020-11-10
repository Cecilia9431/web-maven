package com.example.controller;

import com.example.model.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class VisualizzaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VisualizzaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LibroService service = new LibroService();
		request.setAttribute("libri", service.ottieni());
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/pagina-visualizza.jsp");
		rd.forward(request, response);

	}

}
