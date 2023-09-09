import java.lang.*;

class StringObjectPoll{
    public static void main(String arg[]){

        String str1="java";
        String str2="java";
        String str3="Java";


        System.out.println(str1==str2);
        // str1 and str2 holding the same object ,means java is maintaing the single object in pool
        System.out.println(str1==str3);


        String stringPool="java";
        String stringHeap=new String("java");
        System.out.println(stringPool==stringHeap); //false(They are not refering the same object in pool)
    }
}