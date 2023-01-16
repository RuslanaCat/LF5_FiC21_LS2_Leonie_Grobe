import java.util.Scanner;

public class Treppe {

	public static void main(String[] args) {
		
		int hoehe;
		int breite;
		int breiteLeer;
		int BreiteStufe;
		String space=" ";
		String stern="*";
		String Zusammenführung="";
	
		
		Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner

        System.out.print("hoehe: ");
        hoehe = tastatur.nextInt();
        System.out.print("breite: ");
        breite = tastatur.nextInt();
		for (int stufe=0;stufe<=hoehe;) {
			stufe=stufe+1;
			breite=hoehe*breite;
			breiteLeer=breite-hoehe;
			BreiteStufe=hoehe-breite;
			System.out.printf( "%"+breiteLeer+"."+BreiteStufe+"s\n", stern );
			
		}

	}

}
