package Chapter7;
// Gradebooktest creates a Gradebook object using an array of grades
// then invokes method processGrades to analyze them
public class GradeBookTest {
    public static void main(String[] args) {
        // array of student grades
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        Gradebook myGradeBook = new Gradebook(
                "CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("");
    }
}
