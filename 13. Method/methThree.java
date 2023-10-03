public class methThree {
    static void change(int x, int value) {
        x = value;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 10;
        change(x, 30);
        System.out.println(x);
    }
}
