package com.technical.challenge2.app.payment.technicalchallengepayment.core.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "saldo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Saldo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5641287699724250259L;
	
	@Id
	private String idCliente;
	private String idCuenta;
	private String monedaCuenta;
	private Double saldoCuenta;

}
