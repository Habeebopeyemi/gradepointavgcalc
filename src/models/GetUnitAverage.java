package models;
/**
 * @author Suleiman Habeeb Opeyemi
 * @apiNote This is a class with static method for getting the grade unit attained from range of 0 - 5.
 */
public class GetUnitAverage {
     /**
     * 
     * @param gradedCourses
     * @return space
     * @apiNote This function accept the length and index of the text to be inserted into the table and return the space within the table.
     */
    public static String[][] getUnitPerCourse(String[][] gradedCourses) {
        String[][] unitGradedCourses = new String[gradedCourses.length][4];
        for (int i = 0; i < gradedCourses.length; i++) {
            String[] unitAttained = new String[4];

            unitAttained[0] = gradedCourses[i][0];
            unitAttained[1] = gradedCourses[i][1];
            unitAttained[2] = gradedCourses[i][2];

            String grade = gradedCourses[i][2];

            switch (grade) {
                case "A":
                    unitAttained[3] = "5";
                    break;
                case "B":
                    unitAttained[3] = "4";
                    break;
                case "C":
                    unitAttained[3] = "3";
                    break;
                case "D":
                    unitAttained[3] = "2";
                    break;
                case "E":
                    unitAttained[3] = "1";
                    break;
                default:
                    unitAttained[3] = "0";
                    break;
            }

            unitGradedCourses[i] = unitAttained;
        }

        return unitGradedCourses;
    }
}