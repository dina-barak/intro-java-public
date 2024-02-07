package chapter02flowcontrol.conditions.switchcase;

/**
 * Switch case: Multi option per case.
 */
public class SwitchMultiOptionCase {
    public static void main(String[] args) {
        String str1 = "Sun";
        String str2 = "day";
        switch (str1 + str2){
            case "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday":
                System.out.println(str1 + str2 + " is a week day.....");
                break;
            case "Friday", "Saturday":
                System.out.println(str1 + str2 + "is weeeeekend!!!");
                break;

            default:
                System.out.println("not a day ?!");
        }

        /*int num = 1+ (int)(Math.random() * 7);
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
            default: switchReturned =  "Weekend";
        }
        System.out.println("\nnum = " + num + ", day = " + switchReturned);*/
    }
}
