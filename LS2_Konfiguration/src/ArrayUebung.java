public class ArrayUebung {

  public static void main(String args[]) {

	  int [ ] boop = new int[100];
	  int zahl=0;

	  for(int i=0;i<=99;i++) {
		  zahl=zahl+1;
		  boop[i]=zahl;
		  System.out.println(boop[i]);
	  }
	  
	  System.out.println(boop[89]);
	  boop[49]=1060;
	  
	  int letzteselement;
	  letzteselement=boop.length-1;
	  boop[0]=2020;
	  boop[letzteselement]=2020;

      for(int i=0;i<=99;i++) {
	  System.out.println("index: "+i+" - Inhalt: "+boop[i]);
      }
      
      zahl=0;
      
      for(int i=0;i<=99;i++) {
    	  zahl=zahl+boop[i];
      }
      letzteselement=boop.length;
      zahl=zahl/letzteselement;
      System.out.println("Durschnitt aller zahlen ist: "+zahl);
  }

}