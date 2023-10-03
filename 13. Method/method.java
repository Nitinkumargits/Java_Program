public class method {

    int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {

        method mp = new method();
        System.out.println(mp.max(10, 20));

    }
}
