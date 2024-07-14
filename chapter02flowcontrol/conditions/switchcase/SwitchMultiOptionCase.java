package chapter02flowcontrol.conditions.switchcase;

/**
 * Switch case: Multi option per case.
 */
public class SwitchMultiOptionCase {
    public static void main(String[] args) {

        int num = 1 + (int)(Math.random() * 10);
        String switchReturned;
        switch (num){
            case 1:
                switchReturned = "Sunday";
                break;
            case 2:
                switchReturned =  "Monday";
                break;
            case 3:
                switchReturned =  "Tuesday";
                break;
            case 4:
                switchReturned =  "Wednesday";
                break;
            case 5:
                switchReturned =  "Thursday";
                break;
            case 6, 7:
                switchReturned =  "Weekend";
                break;
            default: switchReturned =  "No such day";
        }
        System.out.println("\nnum = " + num + ", day = " + switchReturned);
    }
}
