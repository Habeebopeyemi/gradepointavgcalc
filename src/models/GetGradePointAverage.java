package models;
/**
 * @author Suleiman Habeeb Opeyemi
 * @apiNote This is a class with static method for calculating the final grade point average (GPA).
 */
public class GetGradePointAverage{
    private static double gradePointAverage = 0;
    private static double totalQualityPoint = 0;
    private static double totalGradeUnit = 0;
    /**
     * 
     * @param gradedCourses
     * @return space
     * @apiNote This function accept the length and index of the text to be inserted into the table and return the space within the table.
     */
    public static double calculateGradePointAverage(String[][] gradedUnitCourses) {
        for (int i = 0; i < gradedUnitCourses.length; i++) {
            double courseUnit = Double.parseDouble(gradedUnitCourses[i][1]);
            double gradeUnit = Double.parseDouble(gradedUnitCourses[i][3]);
            totalQualityPoint += courseUnit * gradeUnit;
            totalGradeUnit += courseUnit;
        }

        gradePointAverage = totalQualityPoint / totalGradeUnit;
        return gradePointAverage;
    }
}