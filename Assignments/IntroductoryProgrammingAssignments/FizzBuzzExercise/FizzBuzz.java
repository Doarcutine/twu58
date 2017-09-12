package IntroductoryProgrammingAssignments.FizzBuzzExercise;

/**
 * Created by Doarcutine on 2017/9/8.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        final int N = 100;

        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.println();
        }
    }
}
