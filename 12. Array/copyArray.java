public class copyArray {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int len = A.length;

        int B[] = new int[len];

        for (int el : A) {
            System.out.printf(el + " ");
        }
        System.out.println("");

        for (int i = 0, j = 0; i < A.length; i++, j++) {
            B[j] = A[i];
        }

        for (int el : B) {
            System.out.printf(el + " ");
        }
    }

}
