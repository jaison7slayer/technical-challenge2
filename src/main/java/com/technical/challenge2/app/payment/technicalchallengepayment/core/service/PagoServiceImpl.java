package com.technical.challenge2.app.payment.technicalchallengepayment.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Pago;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.repository.PagoDao;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.repository.SaldoDao;

@Service
public class PagoServiceImpl implements PagoService {
	
	/*inyeccion bean*/
	@Autowired
	public PagoDao pagoDao;
	
	@Autowired
	public SaldoDao saldoDao;

	@Override
	public List<Pago> findAll() {
		// TODO Auto-generated method stub
		return pagoDao.findAll();
	}

	@Override
	public Pago findByIdClient(String idCliente) {
		// TODO Auto-generated method stub
		return pagoDao.findByIdCliente(idCliente);
	}

	@Override
	public void guardarPago(Pago pago) {
		// TODO Auto-generated method stub
		saldoDao.updateSaldo(pago.getIdCliente(), pago.getMonedaPago(), pago.getMontoPago());
		
		pagoDao.save(pago);
	}
	
}
