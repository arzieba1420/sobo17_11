import sun.misc.VM;

public class MemoryExc {
    public static void main(String[] args) {


            long[] arr = new long[100000000];

        for (int i=0; i<arr.length;i++){
            try{
                arr[i] = (long)i;
            }
            catch (OutOfMemoryError e){
                System.out.println(i);
            }
        }



    }
}
