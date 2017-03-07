package hao.web.controller;

import hao.domain.Book;
import hao.domain.Cart;
import hao.service.BussinessService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuyServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		BussinessService service = new BussinessService();
		Book book = service.findBook(id);
		
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		
		if(cart==null){
			cart = new Cart();
			request.getSession().setAttribute("cart", cart);
		}
		cart.add(book);
		
		request.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
