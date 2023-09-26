public class insertElementInAray {
    public static void main(String[] args) {

        int a[] = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;

        int x = 99;
        int y = 88;
        int index = 2;
        int index2 = 3;

        for (int el : a) {
            System.out.printf(el + " ");
        }
        System.out.println("");

        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }

        a[index] = x;
        a[index2] = y;

        for (int el : a) {
            System.out.printf(el + " ");
        }
    }
}
