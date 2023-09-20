import java.util.*;

public class radix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num;
        System.out.printf("Enter the Value of String :");

        num = sc.nextLine();

        if (num.matches("[01]+")) {
            System.out.println("Binary Radix");
        } else if (num.matches("[0-7]+")) {
            System.out.println("Octal ");
        } else if (num.matches("[0-9]+")) {
            System.out.println("Decimal");

        } else {
            System.out.println("not a number");
        }

    }

}
