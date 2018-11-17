public class IfAndSwitch2 {
    public static void main(String[] args) {

        char grade = 'B';

        if (grade == 'A') {
            System.out.println("Wspaniale");

        } else if (grade == 'B') {
            System.out.println("Dobrze");
        } else if (grade == 'C') {
            System.out.println("Mogło być lepiej");
        } else {
            System.out.println("Rozważ oszukiwanie");
        }


        //operator 3-argumentowy
        int myScore = 5;
        int yourScore = 7;
        int bestScore;

        bestScore = myScore > yourScore ? myScore : yourScore;
        System.out.println(bestScore);
    }
}

