package br.com.neomind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.neomind.dao.CommentDao;
import br.com.neomind.model.Comment;

@Component
public class CommentService {

	@Autowired
	private CommentDao commentDao;

	public boolean save(Comment comment) {
		commentDao.save(comment);
		return true;
	}

	public List<Comment> getComments() {
		return commentDao.getComments();
	}

	@Transactional(rollbackFor = Exception.class)
	public boolean delete(Long id) {
		return commentDao.delete(id);
	}
}
