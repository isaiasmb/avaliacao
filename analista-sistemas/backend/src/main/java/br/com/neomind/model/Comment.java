package br.com.neomind.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private String body;
	private Supplier supplier;
	
	@Id
	@GeneratedValue(generator = "sequence_comment", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(initialValue = 1, allocationSize = 1, name = "sequence_comment", sequenceName = "sequence_comment")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	@ManyToOne
	@JoinColumn(name = "id_supplier")
	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}	
	
}
