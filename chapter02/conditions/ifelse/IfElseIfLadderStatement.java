package chapter02.conditions.ifelse;

class IfElseIfLadderStatement {
    public static void main(String[] args) {

        int number = 0;

        if (number > 0) { // checks if number is greater than 0
            System.out.println("The number is positive.");
        }
        else if (number < 0) {  // checks if number is less than 0
            System.out.println("The number is negative.");
        }
        else { // if both condition is false
            System.out.println("The number is 0.");
        }
    }
}