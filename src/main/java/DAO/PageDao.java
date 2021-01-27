package DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DTO.Board;



@Repository
public class PageDao {
	
	@Autowired
	private SqlSession session;
	
	//insert
	public int insert(Board board) {
		return session.insert("boardns.insert", board);
	}
	
	//list
	public ArrayList<Board> getBoardList(String id){
		return (ArrayList)session.selectList("boardns.list", id);
	}
	
	//getboard
	public Board getboard(int no) {
		return session.selectOne("boardns.content", no);
	}
	
	//update
	public int update(Board board) {
		return session.update("boardns.update", board);
	}
	
	//delete
	public int delete(int no) {
		return session.delete("boardns.delete", no);
	}
}
