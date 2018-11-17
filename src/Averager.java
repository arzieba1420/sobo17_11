public class Averager {
    public static void main(String[] args) {
        int sum = 0;


        for (int i=0; i<args.length; i++){
            sum+=Integer.parseInt(args[i]);
        }
        if (args.length>0){
            System.out.println("Suma wynosi "+sum);
            System.out.println("Średnia wynosi "+(double)sum/args.length);
        } else {
            System.out.println("Brak argumentów programu!");
        }
    }
}
