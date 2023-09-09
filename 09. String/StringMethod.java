import java.lang.*;

class StringMethod{
    public static void main(String arg[]){

       String str1=new String ("JavaProgram");
       System.out.println(str1.length());
       System.out.println( str1.toUpperCase());
       System.out.println(str1.substring(2, 5));
       
       String str2=new String ("    Java     ");
       System.out.println(str2);
       System.out.println(str2.trim());

       String str3=new String("netbean");
       String str4=str3.replace('e', 'M');
       System.out.println(str4);
         

       System.out.println(str1 +" "+str4);
       System.out.println(str1 + str4);

      

    }
}