package hao.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cart {
	
	private Map<String,CartItem> map = new LinkedHashMap<String,CartItem>();
	
	private double price;
	
	public void add(Book book){
		
		CartItem item= map.get(book.getId());
		
		if(item==null){
			item = new CartItem();
			
			item.setBook(book);
			item.setQuantity(1);
			
			map.put(book.getId(), item);
		}else{
			map.put(book.getId(), item);
			item.setQuantity(item.getQuantity()+1);
		}
	}
//	public void deleteBook(String id){
//		CartItem item = map.get(id);
//		
//		try{
//			item.setQuantity(item.getQuantity()-1);
//			
//			map.remove(item);
//		}catch(NullPointerException e){
//			String message = "您所删除的购物项已不在购物车";
//		}
//	}

	public Map<String, CartItem> getMap() {
		return map;
	}

	public void setMap(Map<String, CartItem> map) {
		this.map = map;
	}

	public double getPrice() {
		double totalprice = 0;
		for(Map.Entry<String, CartItem> entry:map.entrySet()){
			CartItem item = entry.getValue();
			totalprice += item.getPrice();
		}
		return totalprice;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
