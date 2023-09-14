package com.technical.challenge2.app.payment.technicalchallengepayment.core.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_cambio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCambio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4464267642080317247L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String monedaOrigen;
	private String monedaDestino;
	private String fechaTipoCambio;
	private Double tipoCambio;
	private String createUser;
	
}
