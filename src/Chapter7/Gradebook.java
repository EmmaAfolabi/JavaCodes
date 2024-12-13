package Chapter7;
// Gradebook class using an array to store test grades

public class Gradebook {
    private String courseName;  // name of course this Gradebook represents
    private int[] grades;  // array of student grades

    // constructor
    public Gradebook(String courseName, int[] grades) {
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

        // call method getAverage to calculate the average grade
        System.out.printf("%nClass average is %.2f%n", getAverage());

        // call methods getMinimum and getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
                getMinimum(), getMaximum());

        // call outputBarChart to print grade distribution chart
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        int lowGrade = grades[0];  // assume grades[0] is smallest
    }
}
