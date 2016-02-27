package hwone05;

import java.util.Scanner;

public class HwOne05 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("HW 1: Task 5 ");
        System.out.println("Diagonal matrix:");
        System.out.println();
        System.out.println("Enter a positive number-\nthe size of a square matrix:");
        int n = 0;
        String st;
        Scanner in = new Scanner(System.in);
        st = in.nextLine();
        System.out.println();
        in.close();
        try {
            n = Integer.parseInt(st);
            if (n > 0) {
                int[][] bArr = new int[n][n];
                int j2 = 0, j3 = n - 1;
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i][j2] = 1;
                    j2++;
                    bArr[i][j3] = 1;
                    j3--;
                }
                for (int i = 0; i < bArr.length; i++) {
                    for (int j = 0; j < bArr[i].length; j++) {
                        System.out.print(bArr[i][j] + " ");
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
