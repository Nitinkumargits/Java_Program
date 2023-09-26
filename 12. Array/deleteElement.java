public class deleteElement {

    public static void main(String[] args) {
        int val[] = { 1, 2, 3, 4, 11, 5, 6, 7, 8, 9, 10 };

        for (int el : val) {
            System.out.printf(el + " ");
        }
        System.out.println("");

        int index = 4;
        int temp = val[index];
        for (int i = index; i < val.length - 1; i++) {
            val[i] = val[i + 1];

        }
        for (int el : val) {
            System.out.printf(el + " ");
        }
    }
}
