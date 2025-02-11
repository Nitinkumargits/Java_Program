import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/Nitin Kumar/Desktop/jjj/Text.txt");
            String str = "Nitin kumar";

            fos.write(str.getBytes());

            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
