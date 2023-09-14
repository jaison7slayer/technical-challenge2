package com.technical.challenge2.app.payment.technicalchallengepayment.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Saldo;

import jakarta.transaction.Transactional;

public interface SaldoDao extends JpaRepository<Saldo, String>{
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE SALDO "
			+ "SET SALDO_CUENTA = SALDO_CUENTA - :montoPago "
			+ "WHERE ID_CLIENTE = :idCliente "
			+ "AND MONEDA_CUENTA = :monedaPago ", nativeQuery = true)
	void updateSaldo(@Param(value = "idCliente") String idCliente,
					@Param(value = "monedaPago") String monedaPago,
					@Param(value = "montoPago") Double montoPago);

}
