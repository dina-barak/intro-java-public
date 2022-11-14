package chapter02flowcontrol.conditions.switchcase;

class SwitchDefaultStatement {
    public static void main(String[] args) {
        int expression = 9;
        switch (expression) {
            case 2:
                System.out.println("Small Size");
                break;
            case 3:
                System.out.println("Large Size");
                break;
            default: // default case
                System.out.println("Unknown Size");
        }
    }
}
//output
//Unknown Size