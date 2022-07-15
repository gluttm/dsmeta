package mz.co.truetech.dsmeta.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mz.co.truetech.dsmeta.entities.Sale;
import mz.co.truetech.dsmeta.services.SaleService;

@RestController
@RequestMapping(value="/api/v1/sales")
public class SaleController {
	
	private SaleService saleService;

	@GetMapping
	public List<Sale> findAllSales() {
		return saleService.findSales();
	}
}
