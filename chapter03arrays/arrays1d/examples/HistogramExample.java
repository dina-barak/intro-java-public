package chapter03arrays.arrays1d.examples;

public class HistogramExample {
    public static void main(String[] args) {
        final int MAX_GRADE = 10;
        final int NUM_OF_STUDENTS = 500;
        // array of grades between 0 to MAX_GRADE
        int[] grades = new int[NUM_OF_STUDENTS];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int)(Math.random() * (MAX_GRADE+1));
        }
        // count the number of appearances of each grade
        int[] histogram = new int[MAX_GRADE+1];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            histogram[grade]++;
        }
        // print the histogram
        for (int i = 0; i < histogram.length; i++) {
            System.out.println(i + ": " + histogram[i]);
        }
    }
}
