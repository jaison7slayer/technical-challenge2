package com.technical.challenge2.app.payment.technicalchallengepayment.core.service;

import java.util.List;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.TipoCambio;
import com.technical.challenge2.app.payment.technicalchallengepayment.webDto.TipoCambioWebDto;

public interface TipoCambioService {
	
	public List<TipoCambio> findAll();
	public TipoCambio findById(Long id);
	//public Double obtenerTipoCambio(String monedaOrigen, String monedaDestino, String tipoFactor);
	public Double calcularTipoCambio(String monedaOrigen, String monedaDestino, String tipoFactor, Double monto);
	public TipoCambioWebDto calcularConversion(Double monto, String monedaOrigen, String monedaDestino, String fechaFactor);
	public void guardarTipoCambio(TipoCambio tipoCambio);	

}
