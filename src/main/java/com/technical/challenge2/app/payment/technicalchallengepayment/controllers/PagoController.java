package com.technical.challenge2.app.payment.technicalchallengepayment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Pago;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.service.PagoService;

@RestController
public class PagoController {
	
	@Autowired
	public PagoService pagoService;
	
	@PostMapping("/payment")
	public ResponseEntity<Void> registrarPago(@RequestBody Pago pago) {
		try {
			pagoService.guardarPago(pago);
			
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
