package com.technical.challenge2.app.payment.technicalchallengepayment.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Pago;

public interface PagoDao extends JpaRepository<Pago, Long>{
	
	Pago findByIdCliente(String idCliente);

}
