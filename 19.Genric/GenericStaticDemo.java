public class GenericStaticDemo {
    static <E> void show(E... list) {
        for (E x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        show(1, 2, 4, 5, 6);
    }
}
