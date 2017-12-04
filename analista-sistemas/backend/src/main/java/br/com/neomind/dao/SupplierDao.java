package br.com.neomind.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

import br.com.neomind.model.Supplier;

@Component
public class SupplierDao extends HibernateDAO<Supplier> {

	public SupplierDao() {
		super(Supplier.class);
	}
	
	public void save(Supplier supplier) {
		super.save(supplier);
	}
	
	@SuppressWarnings("unchecked")
	public List<Supplier> getSuppliers() {
		Query query = getSession().createQuery("FROM Supplier");
		return query.list();
	}

}
