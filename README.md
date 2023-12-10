# GPA Calculator

This console application calculates the Grade Point Average (GPA) for a semester based on the grades earned in different courses.

## How to Use

1. **Running the Application**
   - Clone or download this repository.
   - Open the project in your Java IDE.
   - Run the `Main` class.

2. **Input**
   - The application will prompt you to enter the number of courses you offer.
   - Then, it will prompt you to input details for each course:
     - Course name
     - Course credit unit
     - Score attained

3. **Output**
   - The application will display a table showing the course names, credit units, grades, and grade units.
   - Finally, it will provide the calculated Grade Point Average (GPA) for the semester.

## Sample Input and Output

Enter the number of courses: 3
Enter the name of course 1: Mathematics
Enter the credit unit: 4
Enter the score attained: 85
Enter the name of course 2: English
Enter the credit unit: 3
Enter the score attained: 72
Enter the name of course 3: Physics
Enter the credit unit: 2
Enter the score attained: 60

Output:

| COURSE & CODE | COURSE UNIT | GRADE | GRADE UNIT |
|---------------|-------------|-------|------------|
| Mathematics   | 4           | A     | 5          |
| English       | 3           | A     | 5          |
| Physics       | 2           | B     | 4          |

Your GPA is = 4.67 to 2 decimal places.

## Notes
- Ensure to input accurate course details to get the correct GPA.
- The application assumes a grading system where A=5, B=4, C=3, D=2, E=1, F=0.
- Double-check the calculated GPA for accuracy.

