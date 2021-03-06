package hao.web.controller;

import hao.domain.Book;
import hao.service.BussinessService;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListBookServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BussinessService service = new BussinessService();
		Map<String,Book> map = service.getAllBook();
		request.setAttribute("map", map);
		
		request.getRequestDispatcher("/WEB-INF/jsp/listbook.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
