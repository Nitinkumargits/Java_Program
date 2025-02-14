import java.util.BitSet;

public class BitDemo {
    public static void main(String[] args) {
        BitSet b = new BitSet();
        b.set(2);
        b.set(4);
        b.set(6);
        b.set(8);
        b.flip(0, b.length());
        System.out.println(b);
    }

}
