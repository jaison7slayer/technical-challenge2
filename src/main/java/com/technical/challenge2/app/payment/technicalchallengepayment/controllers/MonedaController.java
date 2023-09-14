package com.technical.challenge2.app.payment.technicalchallengepayment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Moneda;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.service.MonedaService;


@RestController
public class MonedaController {
	
	@Autowired
	public MonedaService monedaService;
	
	@GetMapping("/listarMoneda")
	public List<Moneda> listar(){
		return monedaService.findAll();
	};
	
	@GetMapping("/listarMoneda/{moneda}")
	public Moneda listarPorCodigo(@PathVariable String moneda){
		return monedaService.findById(moneda);
	};

}
