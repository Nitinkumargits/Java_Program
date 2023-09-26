public class rotateFirstElementtolast {
    public static void main(String[] args) {

        int a[] = { 1, 24, 45, 234, 56, 68, 9, 78, 98, 100 };
        int temp = a[0];

        for (int el : a) {
            System.out.printf(el + " ");
        }
        System.out.println("\n");

        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;

        for (int x : a) {
            System.out.printf(x + " ");
        }
    }
}
