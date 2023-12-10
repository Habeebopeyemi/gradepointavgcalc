package models;
/**
 * @author Suleiman Habeeb Opeyemi
 * @apiNote This is a class with static method for getting grade gotten between the range A to F.
 */
public class GetCourseGrade {
     /**
     * 
     * @param courseProfile
     * @return gradedCourses
     * @apiNote This function accepts a 2D array and iterate over the array to get the grade of each courses based on the score attained in each course.
     */
    public static String[][] getCourseGrade(String[][] courseProfile) {
        String[][] gradedCourses = new String[courseProfile.length][3];
        for (int i = 0; i < courseProfile.length; i++) {
            String[] newProfile = new String[3];

            newProfile[0] = courseProfile[i][0];
            newProfile[1] = courseProfile[i][1];

            int score = Integer.parseInt(courseProfile[i][2]);
            if (score >= 70) {
                newProfile[2] = "A";
            } else if (score >= 60 && score <= 69) {
                newProfile[2] = "B";
            } else if (score >= 50 && score <= 59) {
                newProfile[2] = "C";
            } else if (score >= 45 && score <= 49) {
                newProfile[2] = "D";
            } else if (score >= 40 && score <= 45) {
                newProfile[2] = "E";
            } else {
                newProfile[2] = "F";
            }
            
            gradedCourses[i] = newProfile;

        }

        return gradedCourses;
    }
}