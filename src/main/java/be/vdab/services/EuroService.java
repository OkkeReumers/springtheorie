package be.vdab.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import be.vdab.restclient.KoersenClient;

@Service
public class EuroService {
	private final KoersenClient koersenClient; /*1*/

	@Autowired
	public EuroService(@Qualifier("ECB") KoersenClient koersenClient) { /*2*/
		this.koersenClient = koersenClient;
	}

	public BigDecimal naarDollar(BigDecimal euro) {
		return euro.multiply(koersenClient.getDollarKoers()).setScale(2,
				RoundingMode.HALF_UP);
	}
	

}

/* 1. De variabele kan verwijzen naar elk object dat de interface KoersenClient implementeert*/
/* 2. De constructor krijg een object ge�njecteerd, dat de interface KoersenClient implementeert*/
