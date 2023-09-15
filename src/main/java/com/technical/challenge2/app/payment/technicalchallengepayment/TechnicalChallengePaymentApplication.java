package com.technical.challenge2.app.payment.technicalchallengepayment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Moneda;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.Saldo;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.entity.TipoCambio;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.repository.MonedaDao;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.repository.SaldoDao;
import com.technical.challenge2.app.payment.technicalchallengepayment.core.repository.TipoCambioDao;

@SpringBootApplication
public class TechnicalChallengePaymentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(TechnicalChallengePaymentApplication.class, args);
		
		MonedaDao monedaRepository = configurableApplicationContext.getBean(MonedaDao.class);
		
		List<Moneda> monedaList = new ArrayList<>();
		monedaList.add(new Moneda("PEN", "Perú", "S/", "USER1"));
		monedaList.add(new Moneda("USD", "USA", "$", "USER1"));
		monedaList.add(new Moneda("EUR", "España", "€", "USER1"));
				
		monedaRepository.saveAll(monedaList);
		
		TipoCambioDao tipoCambioRepository = configurableApplicationContext.getBean(TipoCambioDao.class);
		
		List<TipoCambio> tipoCambioList = new ArrayList<>();
		tipoCambioList.add(new TipoCambio(1L,"USD", "PEN", "2023-09-14", 3.5, "USER2"));
		tipoCambioList.add(new TipoCambio(2L,"USD", "PEN", "2023-09-15", 3.3, "USER2"));
		tipoCambioList.add(new TipoCambio(3L,"EUR", "PEN", "2023-09-14", 4.5, "USER2"));
				
		tipoCambioRepository.saveAll(tipoCambioList);
		
		SaldoDao saldoRepository = configurableApplicationContext.getBean(SaldoDao.class);
		
		List<Saldo> saldoList = new ArrayList<>();
		saldoList.add(new Saldo("45636693", "PRINCIPAL", "PEN", 1000.00));
				
		saldoRepository.saveAll(saldoList);
	}

}
