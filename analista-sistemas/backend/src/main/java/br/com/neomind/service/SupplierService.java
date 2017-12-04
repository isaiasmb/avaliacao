package br.com.neomind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.neomind.dao.SupplierDao;
import br.com.neomind.model.Supplier;

@Component
public class SupplierService {
	
	@Autowired
	private SupplierDao supplierDao;
	
	@Transactional(rollbackFor = Exception.class)
	public boolean save(Supplier supplier) {
		supplierDao.save(supplier);
		return true;
	}
	
	public List<Supplier> getSuppliers() {
		return supplierDao.getSuppliers();
	}
	
	@Transactional(rollbackFor = Exception.class)
	public boolean delete(Long id) {
		return supplierDao.delete(id);
	}

}
