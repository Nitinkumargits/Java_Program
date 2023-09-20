
import java.lang.*;
import java.util.Scanner;

public class swt {
    public static void main(String arg[]) {
        System.out.println("Enter the value`");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();

        switch (option) {
            case "New":
                System.out.printf("New file added");
                break;

            case "save":
                System.out.printf("Save the file ");
                break;

            default:
                System.out.printf("INVALID INPUT");
        }
    }

}