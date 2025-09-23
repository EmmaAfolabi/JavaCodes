package Chapter7;
// Grade book class using a two-dimensional array to store grades

public class Gradebook2D {
    private String courseName; // name of course this grade book represents
    private int[][] grades; // two-dimensional array of student grades

    // two-argument constructor initializes courseName and grades array
    public Gradebook2D(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // method to set the course name
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }
}
