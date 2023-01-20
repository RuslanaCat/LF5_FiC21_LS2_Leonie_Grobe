import java.util.Scanner;

class Fahrkartenautomat {
	
	// methoden
	
	public static void begreussung() {
		System.out.print("Herzlich Willkommen!\n\n");
	}
	
	// durch die verwebung des gesammten codes mit der schleife ist mir leider keine andere möglichkeit eingefallen als dies so zu erledigen
	public static double farkartenbestellungErfassen(Scanner tastatur, int zuZahlenderBetrag,double zwischensumme) {
		int AnzahlDerTickets;
		double zuZahlenBetrag = 0;
		double zwischenergebenis;
		
		String[] TicketArray = { 
				"Einzelfahrschein AB",
				"Einzelfahrschein BC",
				"Einzelfahrschein ABC", 
				"Kurzstrecke AB", 
				"Tageskarte AB", 
				"Tageskarte BC", 
				"Tageskarte ABC", 
				"4-Fahrten-Karte AB", 
				"4-Fahrten-Karte BC", 
				"4-Fahrten-Karte ABC", 
				"Kleingruppen-Tageskarte AB", 
				"Kleingruppen-Tageskarte BC",
				"Kleingruppen-Tageskarte ABC"};
	    Double[] PreisArray  = { 
	    		3.00,
	    		3.50, 
	    		3.80, 
	    		2.00, 
	    		8.60, 
	    		9.20, 
	    		10.00, 
	    		9.40, 
	    		12.60, 
	    		13.80, 
	    		25.50, 
	    		26.00, 
	    		26.50 };
	    
	    System.out.print("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\n");
	    for (int i=0;i<PreisArray.length;i++) {
	    	int meep=i+1;
	    	System.out.print("	"+TicketArray[i]+"["+PreisArray[i]+" EUR] ("+meep+")\n");
	    }
	    int meep=PreisArray.length+3;
	    System.out.print("	Bezahlen ("+meep+")\n\n");
	    
	    System.out.print("Ihre Wahl: ");
		zuZahlenderBetrag = tastatur.nextInt();

		AnzahlDerTickets = 0;
		while (AnzahlDerTickets>10||AnzahlDerTickets<1) {
			System.out.print("Anzahl der Tickets: ");
			AnzahlDerTickets = tastatur.nextInt();
			if (AnzahlDerTickets>10||AnzahlDerTickets<1) {
				System.out.println(">> Wählen sie bite eine Anzahl von 1 bis 10 Tickets aus. \n");
			}
		}
		zwischenergebenis = zuZahlenBetrag*AnzahlDerTickets;
		zwischensumme = zwischensumme + zwischenergebenis;
		System.out.printf("Zwischensumme: %.2f€\n",zwischensumme);
		
		return zwischensumme;
	}
	
	public static double fahrkartenBezahlen(Scanner tastatur,double zwischensumme) {
		double eingeworfeneMuenze;
		double eingezahlterGesamtbetrag = 0.0;
		double nochZuZahlen = 0.0;
		
		while (eingezahlterGesamtbetrag < zwischensumme) {
			nochZuZahlen = zwischensumme - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f Euro\n",nochZuZahlen); 
			System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			if (!(eingeworfeneMuenze==0.05||eingeworfeneMuenze==0.1||eingeworfeneMuenze==0.2||eingeworfeneMuenze==0.5||eingeworfeneMuenze==1||eingeworfeneMuenze==2||eingeworfeneMuenze==5||eingeworfeneMuenze==10||eingeworfeneMuenze==20)) {
				System.out.println(">> Kein gültiges Zahlungsmittel");
			}
				else {
					eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			}
		}
		return eingezahlterGesamtbetrag;
	}
	
	public static void fahrkartenAusgeben() {
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}
	
	public static void rueckgeldAusgeben(double eingezahlterGesamtbetrag, double zwischensumme) {
		double rueckgabebetrag;
		rueckgabebetrag = eingezahlterGesamtbetrag - zwischensumme;
		muenzRueckgabe(rueckgabebetrag);
	}
	
	public static void muenzRueckgabe(double rueckgabebetrag) {
		if (rueckgabebetrag > 0.0) {
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f Euro\n",rueckgabebetrag); //hier wurde auch eine änderung durchgeführt
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.0;
			}
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro");
				rueckgabebetrag = rueckgabebetrag - 1.0;
			}
			while (rueckgabebetrag >= 0.49) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.19) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.09) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
			}
			while (rueckgabebetrag >= 0.04) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;	
			}
		}
		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");
	}
	
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		int zuZahlenderBetrag=0;
		double eingezahlterGesamtbetrag;
		double zwischensumme= 0;
		
		begreussung();
		
		while (zuZahlenderBetrag!=9) {
			// Geldbetrag eingeben
		
			zuZahlenderBetrag=0;
			while (zuZahlenderBetrag>4||zuZahlenderBetrag<1) {
				if (zuZahlenderBetrag!=9) {
					zwischensumme=farkartenbestellungErfassen(tastatur,zuZahlenderBetrag,zwischensumme);
				}
				else {
					eingezahlterGesamtbetrag=fahrkartenBezahlen(tastatur,zwischensumme);
					
					// Fahrscheinausgabe
					fahrkartenAusgeben();
					
					// Rückgeldberechnung und -ausgabe
					rueckgeldAusgeben(eingezahlterGesamtbetrag,zwischensumme);
					break;
				}
			
			}
		}

		tastatur.close();
	}
}