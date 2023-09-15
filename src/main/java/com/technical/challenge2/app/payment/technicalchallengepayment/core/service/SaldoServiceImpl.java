package com.technical.challenge2.app.payment.technicalchallengepayment.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Saldo;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.repository.SaldoDao;

@Service
public class SaldoServiceImpl implements SaldoService {
	
	@Autowired
	public SaldoDao saldoDao;

	@Override
	public List<Saldo> findAll() {
		return saldoDao.findAll();
	}

	@Override
	public Saldo findByIdClient(String idCliente) {
		return saldoDao.findByIdCliente(idCliente);
	}

}
