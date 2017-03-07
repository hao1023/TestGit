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
		//�õ��û�ѡ���鼮��ID
		String id = request.getParameter("id");
//		System.out.println(id);
		//�õ��û��Ĺ��ﳵ
		Cart cart = (Cart) request.getSession().getAttribute("cart");
		//�����������
		BussinessService service = new BussinessService();
//		System.out.println(cart.getMap());
		//����ɾ��������ɾ��һ��������
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
