package hao.dao;

import java.util.Map;

import hao.DB.DB;
import hao.domain.Book;

public class DBDao {
	public Map<String,Book> getAll(){
		return DB.getAll();
	}
	public Book find(String id){
		return DB.getAll().get(id);
	}
}
