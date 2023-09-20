import java.util.Scanner;

class findDomain {
    public static void main(String[] args) {
        System.out.printf("Enter the domain :");
        Scanner sc = new Scanner(System.in);
        String domain = sc.nextLine();
        String exe = domain.substring(domain.lastIndexOf('.') + 1);

        switch (exe) {
            case "com":
                System.out.println("Commericial ");
                break;
            case "net":
                System.out.println("Network ");
                break;
            case "gov":
                System.out.println("Goverment");
                break;
            default:
                System.out.println("Invalid INPUT");
        }
    }
}