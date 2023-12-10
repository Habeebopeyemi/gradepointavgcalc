package services;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Suleiman Habeeb Opeyemi
 * @apiNote This is a class with static method for getting the number of courses offered in a semester.
 */
public class GetTotalCourse {
    /**
     * 
     * @param scanner
     * @return numberOfCourses
     * @apiNote This function accept the java Scanner class instance scanner to receive the total number of courses offered from users.
     */
    public static int getTotalCourse(Scanner scanner) {
        int numberOfCourses = 0;
        try {
            numberOfCourses = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.err.println("type in a number not letters or alphabets");
            scanner.nextLine();
            numberOfCourses = getTotalCourse(scanner);
        }
        return numberOfCourses;
    }
}