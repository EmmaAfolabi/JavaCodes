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

    // perform various operations on the data
    public void processGrades() {
        // output grades array
        outputGrades();

        // call methods getMinimum and getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());

        // output grade distribution chart of all grades on all tests
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        // assume first element of grades array is smallest
        int lowGrade = grades [0][0];

        // loop through rows of grades array
        for (int[] studentGrades : grades) {
            // loop through columns of current row
            for (int grade : studentGrades) {
                // if grade less than lowGrade, assign it to lowGrade
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }

        return lowGrade;
    }
}
