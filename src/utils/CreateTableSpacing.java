package utils;

/**
 * @author Suleiman Habeeb Opeyemi
 * @apiNote This is a class with static method for creating space within the result table.
 */

public class CreateTableSpacing {
    /**
     * 
     * @param length
     * @param index
     * @return space
     * @apiNote This function accept the length and index of the text to be inserted into the table and return the space within the table.
     */
    
    public static int createSpacing(int length, int index) {
        int totalLength = length + 3;
        int space = 0;
        switch (index) {
            case 0:
                space = 30 - totalLength;
                break;
            case 1:
                space = 18 - totalLength;
                break;
            case 2:
                space = 12 - totalLength;
                break;
            case 3:
                space = 18 - totalLength;
                break;
            default:
                break;
        }
        return space;
    }
}