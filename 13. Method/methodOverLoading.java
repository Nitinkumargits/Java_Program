public class methodOverLoading {
    static int max(int x, int y, int z) {
        return x > y && x > z ? x : (y > z ? y : z);
    }

    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static float max(float x, float y) {
        return x > y ? x : y;

    }

    static void valueChange(int A[], int index, int value) {
        A[index] = value;
    }

    public static void main(String[] args) {

        int A[] = { 1, 2, 3, 4, 5 };
        valueChange(A, 0, 990);

        for (int x : A) {
            System.out.print(x + " ,");
        }

    }
}
