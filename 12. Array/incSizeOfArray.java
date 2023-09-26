public class incSizeOfArray {
    public static void main(String[] args) {

        int A[] = { 1, 2, 3, 4, 5 };

        int B[] = new int[2 * A.length];

        for (int i = 0, j = 0; i < A.length; i++, j++) {
            B[i] = A[j];
        }
        A = B;
        B = null;
        for (int el : A) {
            System.out.printf(el + " ");
        }
    }
}
