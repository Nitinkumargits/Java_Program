import java.util.*;

public class arrayListCollection {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(10);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(20, 30, 40, 50));

        al1.addAll(al2);
        // System.out.println(al1);

        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addAll(List.of(9, 8, 7, 6, 5));
        l1.forEach(n -> System.out.println(n));
    }

}
