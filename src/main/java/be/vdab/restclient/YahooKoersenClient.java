package be.vdab.restclient;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;

/*@Qualifier("Yahoo")*/
/*@Component*/
class YahooKoersenClient implements KoersenClient {
	private final URL url;

	/*@Autowired*/
	public YahooKoersenClient(/*@Value("${yahooKoersenURL}")*/ URL url) { /* 1 */
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