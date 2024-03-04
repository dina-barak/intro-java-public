package chapter03arrays.arrays2d.basics;
/**
 * Save students' grades: 3 grades per student
 * and print the average of grades per student
 */
public class StudentsGradesVer3 {
    public static void main(String[] args) {
        //declare array of 2 dim
        int[][] studentsGrades;
        studentsGrades = new int[10][3];
        //enter random grades
        for (int i1 = 0; i1 < studentsGrades.length; i1++)
            for (int i2 = 0; i2 < studentsGrades[0].length ; i2++)
                studentsGrades[i1][i2] = 51 + (int)(Math.random() * 50);//random number in [51, 100]

        for (int i1 = 0; i1 < studentsGrades.length; i1++) {
            //double gradeSum = 0;
            System.out.print("student " + i1 + " grades: ");
            for (int i2 = 0; i2 < studentsGrades[0].length; i2++) {
                System.out.print( studentsGrades[i1][i2] + " ");
                //gradeSum += studentsGrades[i1][i2];
            }
            System.out.println();
            //System.out.println("average of grades = " + gradeSum/ studentsGrades[0].length);
        }
    }
}

