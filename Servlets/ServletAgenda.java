package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("unused")
@WebServlet("/ServletAgenda")
public class Servletagenda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servletagenda() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nome = request.getParameter("Nome");
		String nascimento = request.getParameter("Nascimento");
		String telefone = request.getParameter("Telefone");
		response.getWriter().append("O contato "+nome+", celular "+telefone+" e nascimento "+nascimento+" foi incluído");
	}
}