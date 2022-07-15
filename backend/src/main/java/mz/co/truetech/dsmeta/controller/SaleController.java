package mz.co.truetech.dsmeta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mz.co.truetech.dsmeta.entities.Sale;
import mz.co.truetech.dsmeta.services.SaleService;
import mz.co.truetech.dsmeta.services.SmsService;

@RestController
@RequestMapping(value="/api/v1/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@Autowired
	private SmsService smsService;

	@GetMapping
	public Page<Sale> findAllSales(Pageable pageable, @RequestParam(value="minDate", defaultValue = "") String minDate, 
			@RequestParam(value="maxDate", defaultValue = "") String maxDate) {
		return saleService.findSales(pageable, minDate, maxDate);
	}
	
	@GetMapping("/{id}/notification")
	public void notifySMS(@PathVariable Long id) {
		smsService.sendSms(id);
	}
}
