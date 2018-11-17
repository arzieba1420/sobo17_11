public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_000}; //notacja underscore dla duzych liczb
        int[] philadelphia = {1_800_000,5_000_000,2_500_000};
        int[] total = new int[denver.length];
        int average;



        for (int i=0; i<denver.length;i++) {
            total[i] = denver[i] + philadelphia[i];
        }

        int sum = 0;
        for (int i=0; i<total.length; i++) {
            sum = sum + total[i];
        }

        average = sum/total.length;
        System.out.println("Średnia produkcja dwóch mennic: " + average);
        System.out.println();
        /*System.out.println("Produkcja w 2012 roku:");
        System.out.format("%,d%n", total[0]);   //tabulacje dla dużych liczb
        System.out.println();
        System.out.println("Produkcja w 2013 roku:");
        System.out.format("%,d%n", total[1]);
        System.out.println();
        System.out.println("Produkcja w 2014 roku:");
        System.out.format("%,d%n", total[2]);
        System.out.println();*/

        int y= 2012;
        for (int i=0; i<total.length; i++){

            System.out.println("Produkcja w "+ (y+i) + " roku");
            System.out.format("%,d%n", total[i]);

        }

    }
}
