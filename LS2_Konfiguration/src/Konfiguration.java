
public class Konfiguration {

	public static void main(String[] args) {
		
		//Angabe der Variablen----------------------------------------------------------------
		String name;
		int euro,cent,summe;
		double prozent;
		boolean status;
		String typ = "Automat AVR";
		String bezeichnung = "Q2021_FAB_A";
		char sprachModul = 'd';
		final byte PRUEFNR = 4;
		double maximum = 100.00;
		double patrone = 46.24;
		int muenzenCent = 1280;
		int muenzenEuro = 130;
		
		//Ausführung---------------------------------------------------------------------------
		name = typ + " " + bezeichnung;
		prozent = maximum - patrone;
		summe = muenzenCent + muenzenEuro * 100;
		euro = summe / 100;
		cent = summe % 100;
		status = (euro <= 150)&& (sprachModul == 'd')&& (cent != 0)&& (euro >= 50)&& (prozent >= 50.00)&&  (!(PRUEFNR == 5 || PRUEFNR == 6));
		
		//Ausgabe------------------------------------------------------------------------------
		System.out.println("Name: " + name);
		System.out.println("Sprache: " + sprachModul);
		System.out.println("Prüfnummer : " + PRUEFNR);
		System.out.println("Füllstand Patrone: " + prozent + " %");
		System.out.println("Summe Euro: " + euro +  " Euro");
		System.out.println("Summe Rest: " + cent +  " Cent");       
		System.out.println("Status: " + status);
		

	}

}
