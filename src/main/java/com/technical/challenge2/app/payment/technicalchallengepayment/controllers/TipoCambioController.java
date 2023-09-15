package com.technical.challenge2.app.payment.technicalchallengepayment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.TipoCambio;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.service.TipoCambioService;
import com.technical.challenge2.app.payment.technicalchallengepayment.webDto.TipoCambioWebDto;


@RestController
public class TipoCambioController {
	
	@Autowired
	public TipoCambioService tipoCambioService;
	
	@GetMapping("/listarTipos")
	public List<TipoCambio> listarTipos(){
		return tipoCambioService.findAll();
	};
	
	@GetMapping("/listarTipos/{id}")
	public TipoCambio listarPorId(@PathVariable Long id){
		return tipoCambioService.findById(id);
	};
		
	/*REQUEST PARAM*/
	@GetMapping("/convertirFormatPayment")
	public TipoCambioWebDto procesarConversionPayment(@RequestParam(required = true) Double monto,
			@RequestParam(required = true) String monedaOrigen, 
			@RequestParam(required = true) String monedaDestino,
			@RequestParam(required = true) String fechaFactor){
		return tipoCambioService.calcularConversion(monto, monedaOrigen, monedaDestino, fechaFactor);
	};
	
	@PostMapping("/tiposCambio")
	public ResponseEntity<Void> actualizarTipoCambio(@RequestBody TipoCambio tipoCambio) {
		try {
			tipoCambioService.guardarTipoCambio(tipoCambio);
			
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
