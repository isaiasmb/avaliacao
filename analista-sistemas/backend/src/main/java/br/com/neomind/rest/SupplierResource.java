package br.com.neomind.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.neomind.model.Supplier;
import br.com.neomind.service.SupplierService;
import br.com.neomind.util.rest.Response;

@Path("/suppliers")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Component
public class SupplierResource {
	
	@Autowired
	private SupplierService supplierService;
	
	@POST
	public Response post(Supplier supplier) {
		supplierService.save(supplier);
		return Response.Ok("Fornecedor cadastrado com sucesso.");
	}

	@GET
	public List<Supplier> get() {
		return supplierService.getSuppliers();
	}

}
