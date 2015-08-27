package be.vdab.converters;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;

// enkele imports ...
public class StringToDateConverter implements Converter<String, Date> { 	/*1*/
	private static final String DATUM_FORMAAT = "yyyy-MM-dd"; 				/*2*/
	
	@Override
	public Date convert(String string) { 									/*3*/
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATUM_FORMAAT); 	/*4*/
		try {
			return dateFormat.parse(string); 								/*5*/
		} catch (ParseException ex) { 										/*6*/
			throw new IllegalArgumentException();
		}
	}
}	

/*1. Je implementeert de interface Converter. Je vervangt S door het type vanwaar je
converteert: String. Je vervangt T door het  type naar waar je converteert: Date. */

/*2. Je definieert met dit patroon hoe je de onderdelen van een String
(die je naar een Date wil omzetten) interpreteert. yyyy betekent jaar, MM maand, dd dag. */

/*3. Dit is de method convert uit de interface Converter. Je krijgt een String parameter
binnen met de te converteren waarde. Je geeft als returnwaarde een Date terug. */

/*4. De class SimpleDateFormat kan een String omzetten naar een Date. 
	 Je geeft aan de constructor het patroon bij (2) mee. */

/*5. De parse method geeft een Date object terug, gebaseerd op de String parameter. */

/*6. De parse method werpt een ParseException als de conversie mislukt. Spring verwacht
	 echter dat je bij mislukte conversies een IllegalArgumentException werpt. */