public class pattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j > 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }

        for (int k = 1; k <= 5; k++) {
            for (int j = 1; j <= 5; j++) {
                if (k + j > 5) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

    }

}
