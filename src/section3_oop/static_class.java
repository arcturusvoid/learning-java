package section3_oop;

public class static_class {
    public static void main(String[] args) {
        Student.writeToBoard("Writing to board");
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setNote("Testing");
        s2.setNote("Testing 2");
        s1.print();
        s2.print();

    }
}

class ArrayUtils {
    public static int searchIndex(int[] arr, int element){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == element)
                return i;
        }
        return -1;
    }
}

class Student {
    //static members - they all belong to class
    private static String board;
    private String note;

    public static void writeToBoard(String note){
        board = note;
//        this.note = note; error: cannot access non-static members to static and vice-versa
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void print(){
        System.out.println("Board: " + board);
        System.out.println("My Notes: " + note);

    }
}
