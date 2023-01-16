public class Einmaleins {
        public static void main(String[] args) {
            int k = 10;

            for(int m = 1; m <= k; m++) {   
                for(int j = 1; j <= k; j++) {
                    System.out.printf("%4s", m*j);
                }
                System.out.println();
            }
        }

}