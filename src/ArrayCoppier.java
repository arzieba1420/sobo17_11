public class ArrayCoppier {
    public static void main(String[] args) {

        int [] arrayIn = {7, 4, 8, 1, 4, 1, 4};
        double [] arrayOut = new double[arrayIn.length];

        System.out.print("arrayIn: [");
        for (int i=0;i<arrayIn.length;i++){
            System.out.print(arrayIn[i]+ " ");
        }
        System.out.print("]");
        System.out.println();

        System.out.print("arrayOut: [");


        int i = 0;
        while (i<arrayIn.length && arrayIn[i]!=1){
            arrayOut[i] = (double)arrayIn[i]; //jawna konwersja typów
            System.out.print(arrayOut[i++]+ " ");
        }

        System.out.print("]");
    }
}
