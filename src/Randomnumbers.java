import java.util.Random;

public class Randomnumbers {

    public static void main(String[] args) {
        Random number = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("Printing the random numbers :");
            System.out.println(number.nextInt(10) + 1);
        }

    }
}


