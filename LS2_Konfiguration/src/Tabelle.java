
public class Tabelle {

	public static void main(String[] args) {
		String f = "Fahrenheit";
		int f1 = -20;
		int f2 = -10;
		int f3 = +0;
		int f4 = +20;
		int f5 = +30;
		String c = "Celsius";
		double c1 = -28.8889;
		double c2 = -23.3333;
		double c3 = -17.7778;
		double c4 = -6.6667;
		double c5 = -1.1111;
		String t = "|";
		String b = "------------------------";
		System.out.printf( "%s%3s%10s\n", f,t,c );
		System.out.printf( "%s\n", b );
		System.out.printf( "%+-1d%10s%10.2f\n", f1,t,c1 );
		System.out.printf( "%+-1d%10s%10.2f\n", f2,t,c2 );
		System.out.printf( "%+-3d%10s%10.2f\n", f3,t,c3 );
		System.out.printf( "%+-1d%10s%10.2f\n", f4,t,c4 );
		System.out.printf( "%+-1d%10s%10.2f\n", f5,t,c5 );
	}

}
