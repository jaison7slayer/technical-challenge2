package com.technical.challenge2.app.payment.technicalchallengepayment.core.service;

import java.util.List;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Moneda;

public interface MonedaService {
	
	public List<Moneda> findAll();
	public Moneda findById(String moneda);

}
