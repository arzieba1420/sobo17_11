import java.awt.*;

public class Arrays {
    public static void main(String[] args) {

        String[] requests;
        Point[] points;

        int[] temps = new int[99]; //preferowana notacja
        temps[0] = 6;
        temps[1] = 90;

        System.out.println(temps[10]); //wartosc domyslna to 0

        //temps[123] = 78; wyjątek

        Point[] markup = {new Point(1,2), new Point (1,5), new Point(4,3)}; //tablica 3-elementowa

        String[] titles = {"Pan", "Pani", "Państwo"};

        System.out.println(titles.length); //rozmiar tablicy
    }
}
