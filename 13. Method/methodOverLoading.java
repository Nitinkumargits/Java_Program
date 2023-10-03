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

    public static void main(String[] args) {

    }
}
