package com.technical.challenge2.app.payment.technicalchallengepayment.webDto;

public interface TipoCambioWebDto {
	
	Double getMonto();
	Double getMontoConTipoCambio();
	String getMonedaOrigen();
	String getMonedaDestino();
	String getFechaTipoCambio(); 
	Double getTipoCambio();

}
