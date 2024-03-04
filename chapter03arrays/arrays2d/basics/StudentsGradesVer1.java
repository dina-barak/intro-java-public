package chapter03arrays.arrays2d.basics;

/**
 * Save students' grades and print average
 */
public class StudentsGradesVer1 {
    public static void main(String[] args) {
        int[] studentsGrades = new int[10];
        for (int i = 0; i < studentsGrades.length; i++)
            studentsGrades[i] = 51 + (int)(Math.random() * 50);//random number in [51, 100]

        double gradeSum = 0;
        for (int i = 0; i < studentsGrades.length; i++) {
            System.out.println("student " + i + ", grade =" + studentsGrades[i]);
            gradeSum += studentsGrades[i];
        }
        System.out.println("average of grades = " + gradeSum/ studentsGrades.length);

    }
}
