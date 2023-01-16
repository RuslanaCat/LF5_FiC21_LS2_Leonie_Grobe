import java.util.Scanner;

public class Ohm {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		
		String EingebenB="";
		double OhmRech;
		double OhmR;
		double OhmU;
		double OhmI;

		System.out.println("Bitte geben sie ein was sie errechnen wollen: ");
		EingebenB = tastatur.next();	
		System.out.println("Sie haben "+EingebenB+" Eingegeben\n"); //Platzhalter
		
		switch(EingebenB)
		{
			case "R":
				System.out.println("Bitte geben sie U ein: ");
				OhmU = tastatur.nextDouble();	
				System.out.println("Bitte geben sie I ein: ");
				OhmI = tastatur.nextDouble();
				OhmRech=OhmU/OhmI;
				System.out.println("\nWird Berechnet");
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
				
				System.out.println("Die Lösung ist R="+OhmRech);
				break;
			case "U":
				System.out.println("Bitte geben sie R ein: ");
				OhmR = tastatur.nextDouble();	
				System.out.println("Bitte geben sie I ein: ");
				OhmI = tastatur.nextDouble();
				OhmRech=OhmR*OhmI;
				System.out.println("\nWird Berechnet");
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
				
				System.out.println("Die Lösung ist U="+OhmRech);
				break;
			case "I":
				System.out.println("Bitte geben sie U ein: ");
				OhmU = tastatur.nextDouble();	
				System.out.println("Bitte geben sie R ein: ");
				OhmR = tastatur.nextDouble();
				OhmRech=OhmU/OhmR;
				System.out.println("\nWird Berechnet");
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
				
				System.out.println("Die Lösung ist I="+OhmRech);
				break;
			default:
				System.out.println("Fehler!");
				break;
		}
	}
}
