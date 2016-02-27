package hwone02;

import java.util.Scanner;
import java.math.*;

public class HwOne02 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("HW 1: Task 2B ");
        System.out.println("The calculation of the perimeter and area\nright-angled triangle.");
        System.out.println();
        System.out.println("Enter the length of the first leg:");
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        System.out.println();
        System.out.println("Enter the length of the second leg:");
        String st2 = in.nextLine();
        in.close();
        try {
            double n1 = Double.parseDouble(st1);
            double n2 = Double.parseDouble(st2);
            if (n1 > 0 && n2 > 0) {
                double d1 = Math.sqrt((n1 * n1) + (n2 * n2));
                double d2 = n1 + n2 + d1;
                double d3 = (n1 * n2) / 2;
                System.out.println();
                System.out.println("The perimeter of the triangle is equal to:");
                System.out.printf("%8.3f", d2);
                System.out.println();
                System.out.println("The area of a triangle is equal to:");
                System.out.printf("%8.3f", d3);
            } else {
                System.out.println("Invalid number format.");
            }
        } catch (NumberFormatException id1) {
            System.out.println("You must enter a number!");
        }
    }
}
