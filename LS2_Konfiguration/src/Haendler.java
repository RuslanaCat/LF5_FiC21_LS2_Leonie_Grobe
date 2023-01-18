import java.util.Scanner;
public class Haendler {
	
	public static String liesString(Scanner myScanner) {
		System.out.println("was möchten Sie bestellen?");
        String artikel = myScanner.next();
        return artikel;
	}
	
	public static int liesInt(Scanner myScanner) {
		System.out.println("Geben Sie die Anzahl ein:");
        int anzahl = myScanner.nextInt();
        return anzahl;
	}
	
	public static double liesDouble(Scanner myScanner, String Text) {
		System.out.println(Text);
        double mwst = myScanner.nextDouble();
		return mwst;
	}
	
	public static double berechneGesamtnettopreis(int anzahl, double nettopreis) {
		double nettogesamtpreis = anzahl * nettopreis;
		return nettogesamtpreis;
	}
	
	public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst) {
		double bruttogesamtpreis = nettogesamtpreis * (1 + mwst / 100);
		return bruttogesamtpreis;
	}
	
	public static void rechungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) {
		System.out.println("\tRechnung");
        System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
        System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
	}
	
	

    public static void main(String[] args) {
    	Scanner myScanner = new Scanner(System.in);

        // Benutzereingaben lesen
        String artikel = liesString(myScanner);
        int anzahl = liesInt(myScanner);
        double preis = liesDouble(myScanner,"Geben Sie den Nettopreis ein:");
        double mwst = liesDouble(myScanner,"Geben Sie den Mehrwertsteuersatz in Prozent ein:");
       
        // Verarbeiten
        double nettogesamtpreis = berechneGesamtnettopreis(anzahl,preis);
        double bruttogesamtpreis = berechneGesamtbruttopreis(nettogesamtpreis, mwst);

        // Ausgeben
        rechungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);
    }
}