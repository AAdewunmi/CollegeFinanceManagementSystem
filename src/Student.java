
/**
 * Created by Adrian Adewunmi on 16/11/21.
 * Version 1.0
 * Student Class: This class keeps track of the student's name, ID and status of tuition fees.
 */

class Student {
    private final int id;
    private final String name;
    private final String courseName;
    private final String courseCode;
    private double tuitionFees;
    private double amountPaidTuitionFees;

    /**
     * Constructor for Student class
     * @param id: Student's ID
     * @param name: Student's name
     * @param courseName: Student's course name
     * @param courseCode: Student's course code
     * @param tuitionFees: Student's tuition fees
     */

    public Student(int id, String name, String courseName, String courseCode, double tuitionFees) {
        this.id = id;
        this.name = name;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.tuitionFees = tuitionFees;
    }

    /**
     * This method returns the student's ID
     * @return: Student's ID
     */
    public int getId() {
        return id;
    }
    /**
     * This method returns the student's name
     * @return: Student's name
     */
    public String getName() {
        return name;
    }
    /**
     * This method returns the student's course name
     * @return: Student's course name
     */
    public String getCourseName() {
        return courseName;
    }
    /**
     * This method returns the student's course code
     * @return: Student's course code
     */
    public String getCourseCode() {
        return courseCode;
    }
    /**
     * This method returns the student's tuition fees
     * @return: Student's tuition fees
     */
    public double getTuitionFees() {
        return tuitionFees;
    }
    /**
     * This method sets the tuition fees amount paid by student
     */
    public void setAmountPaidTuitionFees(double amountPaidTuitionFees) {
        this.amountPaidTuitionFees = amountPaidTuitionFees;
    }
    /**
     * This method the balance of tuition fees amount paid by student
     * @return: Student's amount paid tuition fees
     */
    public double getAmountPaidTuitionFees() {
        return amountPaidTuitionFees;
    }
    /**
     * This method returns the student's balance tuition fees
     * @return: Student's balance tuition fees
     */
    public void updateTuitionFees(){
        try {
            tuitionFees = getTuitionFees();
            amountPaidTuitionFees = getAmountPaidTuitionFees();
            tuitionFees = tuitionFees - amountPaidTuitionFees;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
