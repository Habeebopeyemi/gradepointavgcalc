package main;

import java.util.Scanner;
import utils.CreateResultTable;
import models.GetCourseGrade;
import models.GetGradePointAverage;
import models.GetUnitAverage;
import services.GetTotalCourse;
import services.GetCourseDetails;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Insert total number of courses offered: ");
        int totalCoursesOffered = GetTotalCourse.getTotalCourse(scanner);

        String[][] courseDetails = new String[totalCoursesOffered][3];
        for (int i = 0; i < totalCoursesOffered; i++) {
            String[] newDetail = new String[1];
            newDetail = GetCourseDetails.insertCourseDetails(i + 1, scanner);
            courseDetails[i] = newDetail;
        }
        
        String[][] gradedCourseProfile = GetCourseGrade.getCourseGrade(courseDetails);
        String[][] gradedUnitCourseProfile = GetUnitAverage.getUnitPerCourse(gradedCourseProfile);
        double gradePointAverage = GetGradePointAverage.calculateGradePointAverage(gradedUnitCourseProfile);

        CreateResultTable.generateTable(gradedUnitCourseProfile);

        String formattedGPA = String.format("%.2f", gradePointAverage);
        System.out.printf("\n\nYour GPA is = %s to 2 decimal places.\n", formattedGPA);

        scanner.close();
    }
}