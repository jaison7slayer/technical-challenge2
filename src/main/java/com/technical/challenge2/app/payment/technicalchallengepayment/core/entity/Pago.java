package com.technical.challenge2.app.payment.technicalchallengepayment.core.entity;

import java.io.Serializable;
import java.time.LocalDate;

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
@Table(name = "pago")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pago implements Serializable{
	
	/*SERIALIZABLE BUENA PRACTICA, CONVIERTE EL OBJETO EN BYTES, PARA GUARDAR EN SESION HTTP O ARCHIVO*/
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2748896119850253914L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPago;
	private String idCliente;
	private String idProveedor;
	private Double montoPago;
	private LocalDate fechaPago;
	private String monedaPago;
	
	private String createUser;
	
}
