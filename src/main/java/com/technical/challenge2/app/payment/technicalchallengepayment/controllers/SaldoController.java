package com.technical.challenge2.app.payment.technicalchallengepayment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Saldo;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.service.SaldoService;

@RestController
public class SaldoController {
	
	@Autowired
	public SaldoService saldoService;
	
	@GetMapping("/listarSaldos")
	public List<Saldo> listarTipos(){
		return saldoService.findAll();
	};
	
	@GetMapping("/listarSaldo/{idCliente}")
	public Saldo listarPorId(@PathVariable String idCliente){
		return saldoService.findByIdClient(idCliente);
	};

}
