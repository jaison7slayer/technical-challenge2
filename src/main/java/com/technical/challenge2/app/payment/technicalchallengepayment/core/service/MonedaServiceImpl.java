package com.technical.challenge2.app.payment.technicalchallengepayment.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Moneda;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.repository.MonedaDao;

@Service
public class MonedaServiceImpl implements MonedaService{
	
	/*inyeccion bean*/
	@Autowired
	public MonedaDao monedaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Moneda> findAll() {
		// TODO Auto-generated method stub
		return (List<Moneda>) monedaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Moneda findById(String moneda) {
		// TODO Auto-generated method stub
		/*CON ORELESE SE ASEGURA QUE RETORNE NULL SI NO ENCUENTRA MONEDA*/
		return monedaDao.findById(moneda).orElse(null);
	}

}
