class MethPr {
    static void update(int A[]) {
        A[0] = 25;
    }

    static int max(int x, int y) {
        return x > y ? x : y;
    }

    static String userName(String email) {
        int a = email.indexOf('a');
        String name = email.substring(0, a);
        return name;
    }

    public static void main(String[] args) {

        int A[] = { 1, 2, 3, 4, 5 };
        update(A);
        for (int x : A) {

            System.out.println(x);
        }
    }
}