package be.vdab.restclient;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;

public class YahooKoersenClient implements KoersenClient {
	private final URL url;

	public YahooKoersenClient(URL url) { /* 1 */
		this.url = url;
	}

	@Override
	public BigDecimal getDollarKoers() {
		try (Scanner scanner = new Scanner(url.openStream())) {
			return new BigDecimal(scanner.nextLine());
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
/*
 * 1. Een URL hard coderen is geen goed idee. We zullen de URL opnemen in het
 * Spring XML configuratiebestand en hier injecteren
 */