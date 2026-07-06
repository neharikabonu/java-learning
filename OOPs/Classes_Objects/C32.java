package OOPs.Classes_Objects;

public class C32 {
    public static void main(String[] args) {
        StudMarks[] studentMarks = {
                new StudMarks(69),
                new StudMarks(55),
                new StudMarks(90),
                new StudMarks(67)
        };
        int maxMarks = studentMarks[0].marks;


        for (StudMarks sm : studentMarks) {
            if (maxMarks< sm.marks){
                maxMarks = sm.marks;
            }
        }
        System.out.println("Max marks: "+maxMarks);
    }
}

class StudMarks {
    int marks;

    StudMarks(int marks){
        this.marks = marks;
    }
}