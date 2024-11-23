package exampletests;

public class Question2a {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(randomInt(5, 10));
        }
    }
    public static int randomInt(int min, int max){
        return min + (int)(Math.random() * (max - min + 1));
    }
}
