package hao.DB;

import hao.domain.Book;

import java.util.LinkedHashMap;
import java.util.Map;

public class DB {
	
	private static Map<String, Book> map = new LinkedHashMap<String,Book>();
	
	static {
		map.put("1", new Book("1", "����", 29.0, "����"));
		
		map.put("2", new Book("2", "��ѧ", 59.0, "����"));
		
		map.put("3", new Book("3"," Ӣ��", 39.0, "����"));
	}
	public static Map<String,Book> getAll(){
		return map;
	}
}
