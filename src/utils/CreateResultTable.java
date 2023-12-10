package utils;

/**
 * @author Suleiman Habeeb Opeyemi
 * @apiNote This is a class with static method for creating a table.
 */

public class CreateResultTable {
        /**
        * 
        * @param valArr
        * @return void
        * @apiNote This method accepts a 2D array of and iterate through the array, while inserting the data in the array into a table and returns nothing.
        */
    
    public static void generateTable(String[][] valArr) {
        System.out.printf(
                "|" + "-".repeat(30) + "|" + "-".repeat(18) + "|" + "-".repeat(12) + "|" + "-".repeat(18) + "|" + "\n");
        System.out.printf("|" + " ".repeat(3) + "COURSE & CODE" + " ".repeat(14) + "|" + " ".repeat(3) + "COURSE UNIT"
                + " ".repeat(4) + "|" + " ".repeat(3) + "GRADE" + " ".repeat(4) + "|" + " ".repeat(3) + "GRADE UNIT"
                + " ".repeat(5) + "|" + "\n");
        System.out.printf(
                "|" + "-".repeat(30) + "|" + "-".repeat(18) + "|" + "-".repeat(12) + "|" + "-".repeat(18) + "|" + "\n");
        for (int i = 0; i < valArr.length; i++) {
            int courseCodeSpacing = CreateTableSpacing.createSpacing(valArr[i][0].length(), 0);
            int courseUnitSpacing = CreateTableSpacing.createSpacing(valArr[i][1].length(), 1);
            int gradeSpacing = CreateTableSpacing.createSpacing(valArr[i][2].length(), 2);
            int gradeUnitSpacing = CreateTableSpacing.createSpacing(valArr[i][3].length(), 3);
            System.out.printf("|" + " ".repeat(3) + valArr[i][0] + " ".repeat(courseCodeSpacing) + "|" + " ".repeat(3)
                    + valArr[i][1]
                    + " ".repeat(courseUnitSpacing) + "|" + " ".repeat(3) + valArr[i][2] + " ".repeat(gradeSpacing)
                    + "|" + " ".repeat(3) + valArr[i][3]
                    + " ".repeat(gradeUnitSpacing) + "|" + "\n");
        }
        System.out.printf(
                "|" + "-".repeat(30) + "|" + "-".repeat(18) + "|" + "-".repeat(12) + "|" + "-".repeat(18) + "|" + "\n");
    }
}