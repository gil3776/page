package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.PageDao;
import DTO.Board;

@Service
public class PageService {
	@Autowired
	private PageDao dao;
	
	//insert
	public int insert(Board board) {
		return dao.insert(board);
	}
	
	//list
	public ArrayList<Board> getBoardList(String id) {
		return dao.getBoardList(id);
	}
	
	//getboard
	public Board getboard(int no) {
		return dao.getboard(no);
	}
	
	//update
	public int update(Board board) {
		return dao.update(board);
	}
	
	//delete
	public int delete(int no) {
		return dao.delete(no);
	}
}
