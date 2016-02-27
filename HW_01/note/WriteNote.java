package note;

public class WriteNote {

    private String[] note;
    private int n;

    WriteNote(int row) {
        note = new String[row];
        n = 0;
    }

    public void addNote(String s) {
        note[n] = s;
        n++;
        System.out.println(n);
    }

    public void deleteNote(String st) {
        int m = 0;
        try {
            m = Integer.parseInt(st);
            if (m > 0 && m < n ) {
                if (note[m - 1] != null) {
                    note[m - 1] = null;
                    n--;
                    sortNote();
                }
            } else {
                System.out.println("Could not find a string");
            }
        } catch (NumberFormatException id1) {
            System.out.println("Invalid data format!");
        }
    }

    public void sortNote() {
        for (int i = 0; i < note.length; i++) {
            for (int j = 0; j < note.length - 1 - i; j++) {
                if (note[j] == null) {
                    note[j] = note[j + 1];
                    note[j + 1] = null;
                }
            }
        }
    }

    public void editNote(String st, String st1) {
        try {
            int m = Integer.parseInt(st);
            if (m > 0 && m <n) {
                note[m - 1] = st1;
            } else {
                System.out.println("Could not find a string");
            }
        } catch (NumberFormatException id1) {
            System.out.println("Invalid data format!");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nNote:-)\n\n");
        for (int i = 0; i < note.length; i++) {
            if (note[i] != null) {
                s.append((i + 1) + " " + note[i] + " ");
                s.append("\n");
            }
        }
        return s.toString();//
    }

}
