import java.lang.*;

class StringObject {
    public static void main(String arg[]) {

        String str = "java program";
        System.out.println(str.length());
        System.out.println(str);

        char c[] = { 'A', 'B', 'C', 'D' };
        String str1 = new String(c);
        System.out.println("character :" + str1);

        byte b[] = { 65, 66, 67, 68 };
        String str2 = new String(b);
        System.out.println("byte :" + str2);

        char k[] = { 'h', 'e', 'l', 'l', 'o' };
        String str4 = new String(k, 1, 3);
        int str5 = k.length;
        System.out.println(str5);// ell

    }
}