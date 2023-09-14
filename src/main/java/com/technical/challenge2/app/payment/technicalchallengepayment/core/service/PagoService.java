package com.technical.challenge2.app.payment.technicalchallengepayment.core.service;

import java.util.List;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Pago;

public interface PagoService {
	
	public List<Pago> findAll();
	public Pago findByIdClient(String idCliente);
	public void guardarPago(Pago pago);	

}
