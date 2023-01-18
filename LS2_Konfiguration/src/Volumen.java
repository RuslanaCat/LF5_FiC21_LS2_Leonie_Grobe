import java.util.Scanner;

public class Volumen {

	public static double volumen_rechnung(Scanner tastatur) {
		double volumen;
		System.out.print("bitte geben sie die seite des würfels ein: ");
		volumen = tastatur.nextDouble();
		volumen=volumen*volumen*volumen;		
		return volumen;
	}
	
	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		double Ergebniss;
		Ergebniss=volumen_rechnung(tastatur);
		System.out.println("das Volumen Beträgt: "+Ergebniss);
		Ergebniss=volumen_rechnung(tastatur);
		System.out.println("das Volumen Beträgt: "+Ergebniss);	
	}

}
