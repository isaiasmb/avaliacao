package br.com.neomind.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import br.com.neomind.model.Comment;

@Component
public class CommentDao extends HibernateDAO<Comment> {

	public CommentDao() {
		super(Comment.class);
	}
	
	public void save(Comment comment) {
		super.save(comment);
	}
	
	@SuppressWarnings("unchecked")
	public List<Comment> getComments() {
		Query query = getSession().createQuery("FROM Comment");
		return query.list();
	}
}
