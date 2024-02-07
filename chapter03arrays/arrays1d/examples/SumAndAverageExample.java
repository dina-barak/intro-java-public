package chapter03arrays.arrays1d.examples;

class SumAndAverageExample {
    public static void main(String[] args) {

        double sum = 0;
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};


        // access all elements using for each loop
        // add each element in sum
        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        // calculate the average
        double average =  sum / numbers.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        //same example:  with for-each loop
        sum = 0;
        for (int number : numbers)
            sum += number;
        average = sum / numbers.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

}
