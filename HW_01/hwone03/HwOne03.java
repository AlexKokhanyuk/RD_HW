package hwone03;

import java.util.Scanner;
import java.math.*;

public class HwOne03 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("HW 1: Task 3 ");
        System.out.println("Calculating the value of a function\nwith given initial data:");
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the beginning of the range:");
        String st1 = in.nextLine();
        System.out.println();
        System.out.println("Enter the end of range:");
        String st2 = in.nextLine();
        System.out.println();
        System.out.println("Enter step:");
        String st3 = in.nextLine();
        System.out.println();
        in.close();
        try {
            double a = Double.parseDouble(st1);
            double b = Double.parseDouble(st2);
            double h = Double.parseDouble(st3);
            int j = 0;
            double x = a;
            if (a < b && h > 0) {
                for (double i = a; i <= b; i = i + h) {
                    j++;
                }
                double[][] arg = new double[j][2];
                for (int i1 = 0; i1 < j; i1++) {
                    double f = Math.tan(2 * x) - 3;
                    arg[i1][0] = x;
                    arg[i1][1] = f;
                    x = x + h;
                }
                for (int i = 0; i < arg.length; i++) {
                    for (int j1 = 0; j1 < arg[i].length; j1++) {
                        System.out.printf("%8.3f", arg[i][j1]);
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid format entered data!");
            }
        } catch (NumberFormatException id1) {
            System.out.println("Invalid format entered data!");
        }
    }
}
