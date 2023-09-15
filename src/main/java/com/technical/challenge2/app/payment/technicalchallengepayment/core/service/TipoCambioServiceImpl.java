package com.technical.challenge2.app.payment.technicalchallengepayment.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.TipoCambio;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.repository.TipoCambioDao;
import com.technical.challenge2.app.payment.technicalchallengepayment.webDto.TipoCambioWebDto;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {
	
	/*inyeccion bean*/
	@Autowired
	public TipoCambioDao tipoCambioDao;

	@Override
	public List<TipoCambio> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoCambio>) tipoCambioDao.findAll();
	}

	@Override
	public TipoCambio findById(Long id) {
		// TODO Auto-generated method stub
		return tipoCambioDao.findById(id).orElse(null);
	}
	
	@Override
	public Double calcularTipoCambio(String monedaOrigen, String monedaDestino, String tipoFactor, Double monto) {
		// TODO Auto-generated method stub
		return monto * tipoCambioDao.obtenerTipoCambio(monedaOrigen, monedaDestino, tipoFactor);
	}

	@Override
	public TipoCambioWebDto calcularConversion(Double monto, String monedaOrigen, String monedaDestino, String fechaFactor) {
		// TODO Auto-generated method stub
		return tipoCambioDao.obtenerTipoCambioFormato(monto, monedaOrigen, monedaDestino, fechaFactor);
	}

	@Override
	public void guardarTipoCambio(TipoCambio tipoCambio) {
		// TODO Auto-generated method stub
		tipoCambioDao.save(tipoCambio);
		
	}

}
