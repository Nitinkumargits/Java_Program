class twoDArray {
    public static void main(String[] args) {
        // int A[][] = new int[3][4];

        int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 } };

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.printf(A[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        ////////////////////////////////////////////////////////////////////////////

        int B[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 3 } };

        for (int x[] : B) {
            for (int y : x) {
                System.out.printf(y + " ");
            }
            System.out.println(" ");
        }
        System.out.println("");

        ////////////////////////////////////////////////////////////////////////////

        /* Jagged Array */

        int D[][];

        D = new int[3][];

        D[0] = new int[5];
        D[1] = new int[2];
        D[2] = new int[9];

        for (int i = 0; i < D.length; i++) {
            for (int j = 0; j < D[i].length; j++) {
                System.out.printf(D[i][j] + " ");
            }
            System.out.println(" ");
        }

        ////////////////////////////////////////////////////////////////////////////

    }
}