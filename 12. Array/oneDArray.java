import java.util.Scanner;

public class oneDArray {
    public static void main(String[] args) {

        // int A[] = new int[5];
        // System.out.println(A);// [I@1372ed45

        // int a[] = { 1, 2, 3, 4, 5 };

        // for (int i = 0; i < a.length; i++) {
        // // System.out.println(a[i]);
        // }
        int A[] = { 11, 22, 33, 44, 55, 66 };

        // for (int i = A.length; i > 0; i--) {
        // System.out.println(i);

        // }

        // for (int x : A) {
        // System.out.println(A[x] - 1);
        // }

        // int b[] = new int[5];
        // b[0] = 15;

        // for (int el : b) {

        // System.out.println(b.length);
        // }

        int c[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum = 0;
        // for (int i = 0; i < c.length; i++) {

        // sum += c[i];
        // }
        // System.out.println(sum);

        // for (int el : c) {
        // sum += el;
        // }
        // System.out.println(sum);

        //////////////////////////////////////////////
        int keyArray[] = { 2, 433, 51, 34, 6, 15, 21, 876, 95 };

        /* Find the key in array */

        System.out.printf("Enter the Key :");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        for (int i = 0; i < keyArray.length; i++) {

            if (key == keyArray[i]) {
                System.out.printf("found the key at index " + i);
                System.exit(0);
            }

        }
        System.out.printf("NOT FOUND");
        //////////////////////////////////////////////
        /* Find the MAX element in array */

    }
}
