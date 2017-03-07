package hao.web.controller;

import hao.domain.Cart;
import hao.service.BussinessService;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//得到用户选择书籍的ID
		String id = request.getParameter("id");
//		System.out.println(id);
		//得到用户的购物车
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		//创建服务对象
		BussinessService service = new BussinessService();
//		System.out.println(cart.getMap());
		//调用删除方法，删除一个购物项
		service.deleteCartItem(id,cart);
//		System.out.println(cart.getMap());
		request.getSession().setAttribute("cart", cart);
		request.getRequestDispatcher("/WEB-INF/jsp/listcart.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
