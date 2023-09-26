public class findtheSecondLargest {
    public static void main(String[] args) {
        int val[] = { 1, 2, 3, 11, 5, 6, 7, 8, 9, 10 };

        int max1, max2;

        max1 = max2 = val[0];

        for (int i = 0; i < val.length; i++) {

            if (val[i] > max1) {
                max2 = max1;
                max1 = val[i];
            } else if (max2 < val[i]) {
                max2 = val[i];
            }
        }
        System.out.println(" largerts value :" + max1);
        System.out.printf("Second largerts value :" + max2);
    }
}
