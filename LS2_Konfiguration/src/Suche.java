
public class Suche {

	public static void main(String[] args) {
		int wert = 2;
		int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
		int x=0;
		
		int letzteselement;
		 letzteselement=zahlenArray.length-1;
		
		for (int i=0;i<=letzteselement;i++) {
			if (zahlenArray[i] == wert) {
				System.out.println("Wert Gefunden bei index: "+i);
			}
			else {
				x=1;
			}
		}
		
		if (x==1) {
			System.out.println("Nicht Gefunden");
		}
	}

}
