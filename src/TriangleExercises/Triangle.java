package TriangleExercises;

import java.util.Scanner;

/**
 * Created by Doarcutine on 2017/9/8.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer n = s.nextInt();

        for(int i =0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
