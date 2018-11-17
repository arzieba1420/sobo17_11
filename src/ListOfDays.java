public class ListOfDays extends DayCounter {
    public static void main(String[] args) {

        int year = 2008;



        for (int i = 1; i <= 12; i++) {

           int count=countDays(i,year);
            for (int j = 1; j <= count; j++) {
                System.out.println(j + "/" + i+"/"+year);
            }
        }
    }
}




















