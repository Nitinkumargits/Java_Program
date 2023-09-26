public class addTwoMatrices {
    public static void main(String[] args) {

        int A[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int B[][] = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
        int c[][] = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {

                c[i][j] = A[i][j] + B[i][j];// For Adding two matrice
                // c[i][j] = A[i][j] * B[i][j];// For multiply two matrice

            }
            System.out.println("");
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf(c[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
