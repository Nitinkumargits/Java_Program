import java.lang.*;

// class MyThread extends Thread {
//     public void run() {
//         int i = 0;
//         while (true) {
//             i++;
//             System.out.println(i + " " + "Hello");

//         }
//     }

// }

public class ThreadTest extends Thread {

    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(i + " " + "Hello");

        }
    }

    public static void main(String args[]) {

        ThreadTest t = new ThreadTest();
        t.start();

        int i = 0;
        while (true) {
            i++;
            System.out.println(i + " " + "world");

        }
    }
}
