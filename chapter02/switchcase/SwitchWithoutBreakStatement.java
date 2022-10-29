package sce.cs.chapter02.switchcase;

class SwitchWithoutBreakStatement {
    public static void main(String[] args) {
        int expression = 2;
        // switch statement to check size
        switch (expression) {
            case 1:
                System.out.println("Case 1");
            case 2: // matching case
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default case");
        }
    }
}
//output
//Case 2
//Case 3
//Default case