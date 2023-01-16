
public class Schleife {

	public static void main(String[] args) {
		System.out.print("for Schleife \n");
		for(int i=10; i<=20; i=i+1) {
			System.out.printf("%d ", i*i);
		}
		System.out.print("\n\nWhile Schleife \n");
		int i = 9;
		while(i <= 20) {
		     i = i+1;
		     if (i == 18) break;
		     if (i == 11) continue;
		     System.out.printf("%d ", i*i);
		}
	}
}
