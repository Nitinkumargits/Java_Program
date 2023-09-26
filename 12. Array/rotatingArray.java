public class rotatingArray {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 55, 33, 33 };
        int len = a.length;
        int b[] = new int[len];

        for (int i = 0, j = a.length - 1; i < a.length && j >= 0; i++, j--) {
            if (b[j] == 0) {
                b[j] = a[j];
            }
            System.out.println(a[i] + " " + b[j]);
        }

    }
}
