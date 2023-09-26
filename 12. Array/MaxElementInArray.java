public class MaxElementInArray {
    public static void main(String[] args) {
        int val[] = { 1, 2, 3, 11, 5, 6, 7, 8, 9, 10 };

        int max = 0;

        for (int i = 0; i < val.length; i++) {

            if (val[i] > max) {
                max = val[i];
            }
        }
        System.out.println(max);

    }
}
