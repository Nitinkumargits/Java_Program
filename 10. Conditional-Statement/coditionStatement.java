import java.util.*;

public class coditionStatement {

    public static void main(String[] args) {
        // int x = 5;
        // if (x >= 0) {
        // System.out.println("positive");
        // } else {
        // System.out.println("negative");
        // }

        // Example 2:-
        // int a = 4, b = 6, c = 10;

        // if (a > c && a > b) {
        // System.out.println(a);
        // } else {
        // if (b > c) {
        // System.out.println(b);
        // } else {
        // System.out.println(c);
        // }
        // }

        // Example 3: find the number is Even or not :->

        // if it is divisble by x%2==0

        int x;
        System.out.printf("Enter the value of x: ");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("the Number is Even");
        } else {
            System.out.println("the Number is Odd");

        }
    }
}
