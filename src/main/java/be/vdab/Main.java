package be.vdab;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.gaming.Spelletje;

public class Main {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("restclient.xml", "services.xml","container.xml")) { /* 1 */
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
			/*System.out.println(context.getBean(EuroService.class).naarDollar(
					BigDecimal.valueOf(2)));*/
			System.out.println(context.getBean(Spelletje.class).getAantalVijanden());

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