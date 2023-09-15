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
@Table(name = "moneda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Moneda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 301716583780043150L;

	@Id
	private String codigo;
	
	private String pais;
	private String simbolo;
	
	private String createUser;

}
