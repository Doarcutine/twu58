package IntroductoryProgrammingAssignments.PrimeFactorsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Doarcutine on 2017/9/8.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primeFactors.add(i);
                n /= i;
                i--;
            }
        }

        for (Integer factor : primeFactors) {
            System.out.print(factor + " ");
        }
    }
}
