/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwone04;

import java.util.Scanner;

public class HwOne04 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("HW 1: Task 4 ");
        System.out.println("Calculating the value of works:");
        System.out.println();
        System.out.println("Enter a positive an even number-\nthe size of a one-dimensional array:");
        int n = 0;
        String st;
        Scanner in = new Scanner(System.in);
        st = in.nextLine();
        System.out.println();
        in.close();
        try {
            n = Integer.parseInt(st);
        } catch (NumberFormatException id1) {
            System.out.println("Invalid format entered data!");
        }
        if (n > 0 && n % 2 == 0) {
            double[] dArr = new double[n];
            System.out.println("Source array:");
            for (int i = 0; i < dArr.length; i++) {
                dArr[i] = (double) (Math.random() * 100);
                System.out.printf("%8.3f", dArr[i]);
            }
            System.out.println();
            System.out.println("The result is the sum of an array of elements:");
            double[] dArrRes = new double[n / 2];
            int j = n - 1;
            double max;
            for (int i = 0; i < n / 2; i++) {
                dArrRes[i] = dArr[i] + dArr[j];
                j--;
                System.out.printf("%8.3f", dArrRes[i]);
            }
            max = dArrRes[0];
            for (int i = 1; i < dArrRes.length; i++) {

                if (dArrRes[i] > max) {
                    max = dArrRes[i];
                }
            }
            System.out.println();
            System.out.println("Maximum value:");
            System.out.printf("%8.3f", max);
        } else {
            System.out.println("You must enter a positive even number!");
        }
    }
}
