package mz.co.truetech.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mz.co.truetech.dsmeta.entities.Sale;
import mz.co.truetech.dsmeta.repositores.SaleRepository;

public class SaleService {
	
	@Autowired
	private SaleRepository repository;

	public List<Sale> findSales() {
		return repository.findAll();
	}
}
