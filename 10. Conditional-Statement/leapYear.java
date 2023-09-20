import java.util.*;

public class leapYear {
    public static void main(String[] args) {

        int x;

        System.out.printf("Enter the Year :");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x % 4 == 0) {
            // then its a leap year
            if (x % 100 == 0) {
                if (x % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("NOT leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("NOT a leap year");
        }
    }
}