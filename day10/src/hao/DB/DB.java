package hao.DB;

import hao.domain.Book;

import java.util.LinkedHashMap;
import java.util.Map;

public class DB {
	
	private static Map<String, Book> map = new LinkedHashMap<String,Book>();
	
	static {
		map.put("1", new Book("1", "语文", 29.0, "老张"));
		
		map.put("2", new Book("2", "数学", 59.0, "老林"));
		
		map.put("3", new Book("3"," 英语", 39.0, "老朱"));
	}
	public static Map<String,Book> getAll(){
		return map;
	}
}
