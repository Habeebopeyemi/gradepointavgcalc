package services;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Suleiman Habeeb Opeyemi
 * @apiNote This is a class with static method for getting each course details such as course & code, score, and credit unit from user.
 */
public class GetCourseDetails {
    /**
     * 
     * @param scanner
     * @param index
     * @return courseDetails
     * @apiNote This function accept index and scanner, the index is for tagging the current course the user is inserting, while the scanner is an instance of Scanner class use to accept inputs from user.
     */
    public static String[] insertCourseDetails(int index, Scanner scanner) {
        String[] courseDetails = new String[3];
        String courseName = "";
        int courseCredit = 0;
        int score = 0;

        try {

            System.out.println("type in the name of course " + index + ": ");
            if (scanner.hasNextLine()) {
                courseName = scanner.nextLine();
            }

            System.out.println("type in the credit unit: ");
            while (!scanner.hasNextInt()) {
                System.err.println("kindly input a number not alphabet or symbol.");
                scanner.nextLine();
            }
            courseCredit = scanner.nextInt();
            scanner.nextLine();
            while (courseCredit <= 0 || courseCredit > 4) {
                System.err.println("enter credit unit greater than zero and less than 5");
                courseCredit = scanner.nextInt();
                scanner.nextLine();
            }

            System.out.println("type in the score attained: ");
            while (!scanner.hasNextInt()) {
                System.err.println("input a valid score");
                scanner.nextLine();
            }
            score = scanner.nextInt();
            scanner.nextLine();
            while (score < 0 || score > 100) {
                System.err.println("insert a score within 0 and 100");
                score = scanner.nextInt();
                scanner.nextLine();
            }

            courseDetails[0] = courseName;
            courseDetails[1] = String.valueOf(courseCredit);
            courseDetails[2] = String.valueOf(score);
        } catch (InputMismatchException e) {
            System.err.println("Kindly input correct details");
            insertCourseDetails(index, scanner);
        }

        return courseDetails;
    }
}