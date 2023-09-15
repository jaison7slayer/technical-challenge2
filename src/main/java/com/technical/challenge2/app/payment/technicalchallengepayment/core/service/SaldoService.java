package com.technical.challenge2.app.payment.technicalchallengepayment.core.service;

import java.util.List;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Pago;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Saldo;

public interface SaldoService {
	
	public List<Saldo> findAll();
	public Saldo findByIdClient(String idCliente);

}
