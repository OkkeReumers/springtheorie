package be.vdab.services;

import java.math.BigDecimal;
import java.math.RoundingMode;

import be.vdab.restclient.KoersenClient;

public class EuroService {
	private final KoersenClient koersenClient; /*1*/

	public EuroService(KoersenClient koersenClient) { /*2*/
		this.koersenClient = koersenClient;
	}

	public BigDecimal naarDollar(BigDecimal euro) {
		return euro.multiply(koersenClient.getDollarKoers()).setScale(2,
				RoundingMode.HALF_UP);
	}

}

/* 1. De variabele kan verwijzen naar elk object dat de interface KoersenClient implementeert*/
/* 2. De constructor krijg een object geïnjecteerd, dat de interface KoersenClient implementeert*/
