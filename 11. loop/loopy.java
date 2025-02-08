import java.util.Scanner;

class loopy {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        String str = "";

        while (n > 0) {
            r = n % 10;
            n /= 10;
            str = str + r;

        }
        System.out.println(str);

        char c;

        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);

            switch (c) {
                case '1':
                    System.out.printf("One ");

                    break;
                case '2':
                    System.out.printf("Two ");

                    break;
                case '3':
                    System.out.printf("Three ");

                    break;
                case '4':
                    System.out.printf("Four ");

                    break;
                case '5':
                    System.out.printf("Five ");

                    break;

                default:
                    System.out.printf("INVALID NUMBER");
                    break;
            }

        }

    }
}