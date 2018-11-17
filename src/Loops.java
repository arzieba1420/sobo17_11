public class Loops {


    public static void main(String[] args) {

        final String FORBIDDEN = "cztery";
        //pętla for
        /*for(int i=1; i<=100; i++){
            System.out.println("i= " + i);
        }*/

        //pętla while
        /*int i = 0;
        while (i<100){
            System.out.println("i ="+i);
            i++;
        }*/

        //do-while
        /*int i=0;
        do {
            System.out.println("i= "+i);
            i++;

        } while (false);*/
        String[] strings = {"raz","dwa","trzy", "cztery","pięć","dwa"};
        int i =0;
        System.out.println("--------------------Start");
        while(i < strings.length){
            if (strings[i].equals(FORBIDDEN)){
                continue;
            }
            System.out.println(strings[i]);
            i++;
        }
        System.out.println("-----------------------Koniec");
    }
}
