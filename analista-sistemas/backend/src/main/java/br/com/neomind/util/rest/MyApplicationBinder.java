package br.com.neomind.util.rest;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import br.com.neomind.dao.SupplierDao;
import br.com.neomind.service.SupplierService;

public class MyApplicationBinder extends AbstractBinder {
	@Override
	protected void configure() {
		bind(SupplierDao.class).to(SupplierDao.class);
		bind(SupplierService.class).to(SupplierService.class);
	}
}