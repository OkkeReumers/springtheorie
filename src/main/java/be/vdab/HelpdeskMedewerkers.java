package be.vdab;

import java.util.Properties;

public class HelpdeskMedewerkers {
	private Properties medewerkers;
	// key = naam medewerker, value= intern telefoonnummer

	public HelpdeskMedewerkers(Properties	 medewerkers) {	
		this.medewerkers = medewerkers;
	}

	@Override
	public String toString() {
		return medewerkers.toString();
	}

}	
