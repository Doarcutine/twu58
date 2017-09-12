package IntroductoryProgrammingAssignments.DiamondExercises;

import java.util.Scanner;

/**
 * Created by Doarcutine on 2017/9/8.
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int totalCharacterCount = n * 2 - 1;
        for(int line = 1;line<=totalCharacterCount;line++) {
            int space = Math.abs(n - line);
            int count = totalCharacterCount - (space * 2);
            PrintSpace(space);
            PrintAsterisk(count);
            PrintSpace(space);
            System.out.println();
        }
    }

    private static void PrintSpace(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    private static void PrintAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
