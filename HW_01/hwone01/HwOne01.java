package hwone01;

import java.util.Scanner;

public class HwOne01 {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("HW 1: Task 2A ");
        System.out.println("Lucky number");
        System.out.println();
        System.out.println("Enter the four-digit number");
        Scanner in = new Scanner(System.in);
        String nums = in.nextLine();
        in.close();
        if (nums.length() == 4) {
            char[] ch = nums.toCharArray();
            String st1 = Character.toString(ch[0]);
            String st2 = Character.toString(ch[1]);
            String st3 = Character.toString(ch[2]);
            String st4 = Character.toString(ch[3]);
            try {
                int n1 = Integer.parseInt(st1);
                int n2 = Integer.parseInt(st2);
                int n3 = Integer.parseInt(st3);
                int n4 = Integer.parseInt(st4);
                if (n1 + n2 == n3 + n4) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } catch (NumberFormatException id1) {
                System.out.println("You must enter a number!");
            }
        } else {
            System.out.println("Invalid number format!");
        }
    }
}
