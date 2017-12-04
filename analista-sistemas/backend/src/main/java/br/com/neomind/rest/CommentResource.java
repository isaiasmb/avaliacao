package br.com.neomind.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.neomind.model.Comment;
import br.com.neomind.service.CommentService;
import br.com.neomind.util.rest.Response;

@Path("/comments")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Component
public class CommentResource {
	
	@Autowired
	private CommentService commentService;
	
	@POST
	public Response post(Comment comment) {
		commentService.save(comment);
		return Response.Ok("Comentário cadastrado com sucesso.");
	}

}
