public class recursion {

    static void fun(int n) {
        if (n > 0) {
            System.out.printf(" " + n);
            fun(n - 1);

        }

    }

    public static void main(String[] args) {

        fun(3);
    }
}
