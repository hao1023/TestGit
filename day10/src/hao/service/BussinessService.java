package hao.service;

import hao.dao.DBDao;
import hao.domain.Book;
import hao.domain.Cart;
import hao.domain.CartItem;

import java.util.Map;
//ҵ���� ͳһ��WEB���ṩ����
public class BussinessService {
	
	private DBDao dao = new DBDao();
	
	public Map<String,Book> getAllBook(){
		return dao.getAll();
	}
	
	public Book findBook(String id){
		return dao.find(id);
	}
	
	public void deleteCartItem(String id,Cart cart){
		cart.getMap().remove(id);
	}
}
