public class IfAndSwitch {
    public static void main(String[] args) {

        if (args.length < 3){
            System.out.println("Zbyt mało argumentów");
            System.exit(-1);  //zakończenie programu z kodem
        }
    }
}
