package be.vdab;

import java.math.BigDecimal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import be.vdab.restclient.CreateRestClientBeans;
import be.vdab.services.CreateServiceBeans;
import be.vdab.services.EuroService;

public class Main {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(CreateRestClientBeans.class, CreateServiceBeans.class)) { /* 1 */
//			ClassA objectA = context.getBean(ClassA.class);
//			System.out.println(objectA.getKoersenURL());
//			System.out.println(objectA.getDefaultTaalEnLand().getDisplayName());
//			System.out.println("Bestand bestaat: "
//					+ objectA.getImportData().exists());
//			System.out.println(objectA.getDefaultBladRichting());
//			ClassB objectB = context.getBean(ClassB.class);
//			System.out.println(objectB.getTelefoonNrHelpDesk());
//			System.out.println(objectB.getAantalPogingenUpdateKlant());
//			System.out.println(context.getBean(HelpdeskMedewerkers.class));
//			System.out.println(objectA.getWebMasterEMailAdres());
//			System.out.println(context.getBean(ClassA.class)
//					.getWebsiteGestart());
//			context.getBean("teller1", Teller.class).verhoog(); /* 2 */
//			context.getBean("teller1", Teller.class).verhoog(); /* 3 */
//			Teller teller2 = context.getBean("teller2", Teller.class); /* 4 */
//			teller2.verhoog(); /* 5 */
//			context.getBean("teller2", Teller.class).verhoog(); /* 6 */
			System.out.println(context.getBean(EuroService.class).naarDollar(
					BigDecimal.valueOf(2)));

		}
	}
}

/*
 * 1. Spring maakt bij de initialisatie van de IOC container de bean met
 * singleton scope(bean1)
 */
/* 2. Je zoekt de bean teller1 en verhoogt zijn Teller */
/* 3. Je zoekt de bean teller1 opnieuw en verhoogt zijn teller */
/* 4. Je zoekt de bean teller2. Spring maakt die bean nu aan */
/* 5. Je verhoogt de teller in dit object */
/* 6. Je zoekt de bean teller2. Spring maakt die bean opnieuw aan */