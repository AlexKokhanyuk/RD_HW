package note;

import java.util.Scanner;

public class Note {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("HW 1: Task 6 ");
        System.out.println("Notepad v.0.0.1a");
        int n = 0;//

        String st,st1;
        WriteNote noteOne = new WriteNote(50);
        Scanner in = new Scanner(System.in);

        while (n != 5) {
            System.out.println("1-Add Note;\n2-Delete Note;\n3-Edit Note;\n4-Show All\n5-Exit");
            st = in.nextLine();

            try {
                n = Integer.parseInt(st);
                switch (n) {
                    case 1:
                        System.out.println("Entering Note");
                        st = in.nextLine();
                        noteOne.addNote(st);
                        break;
                    case 2:
                        System.out.println("Number of deleted rows");
                        st = in.nextLine();
                        noteOne.deleteNote(st);
                        break;
                    case 3:
                        System.out.println("Number of edit rows");
                        st = in.nextLine();
                        System.out.println("Entering the new value");
                        st1 = in.nextLine();
                        noteOne.editNote(st,st1);
                        break;
                    case 4:
                        System.out.println(noteOne);
                        break;
                    default:
                        n = 5;
                }
            } catch (NumberFormatException id1) {
                System.out.println("Invalid data format!");
            }

        }
        in.close();
    }

}
