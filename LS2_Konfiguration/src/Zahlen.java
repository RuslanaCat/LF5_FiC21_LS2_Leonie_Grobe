import java.util.Arrays;

public class Zahlen {

	public static void main(String[] args) {
		int[] zahlen = {3,4,2,3,5,1,2,7,2,1,2,4};
		 
        int stelle = 0;
        int anzahl = 1;
        int anzahl_final = 0;
        Arrays.sort(zahlen);
 
        for (int i = 0; i < zahlen.length - 1; ++i) {
 
            if (zahlen[i] == zahlen[i + 1]) {
 
                ++anzahl;
            } 
            if (anzahl_final < anzahl) {
                anzahl_final = anzahl;
                stelle = i;
            }
            if (zahlen[i] != zahlen[i + 1]) {
                anzahl = 1;
            }
        }
        System.out.println("Häufigste Zahl: " + zahlen[stelle] + " (" + anzahl_final+" Vorkommen)");
    }

}
