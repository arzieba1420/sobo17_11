

public class IfAndSwitch {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Zbyt mało argumentów");
            System.exit(-1);  //zakończenie programu z kodem
        }

        String server;

        if (args.length < 1) {
            server = "localhost";
        } else {
            server = args[0];   //lista argumentów w EDIT CONFIGURATION
        }

        System.out.println(server);


        //switch
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej");
                break;
            default:
                System.out.println("Rozważ oszukiwanie");
        }
    }


}
