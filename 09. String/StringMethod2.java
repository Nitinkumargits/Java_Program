import java.lang.*;


class StringMethod2{
    public static void main(String args[]){
        String str="www.abcd.org";
        // System.out.println(str.startsWith( "www"));
        // System.out.println(str.endsWith( ".org"));
        // System.out.println(str.charAt(4));
        // System.out.println(str.lastIndexOf("."));


        String str1="pyramid";
        String str2="pyramid";
        String str3="Pyramid";
        // System.out.println(str1.equals(str2));//true
        // System.out.println(str1.equals(str3));//false
        // System.out.println(str1.equalsIgnoreCase(str3));//true
        // System.out.println(str1==str2);//true
        // System.out.println(str1==str3);//false
      

        String str4="pyramid";
        String str5=new String("pyramid");

        // System.out.println(str4==str5);//false
        // System.out.println(str4.equals(str5));//true

          // /////////////////////////////
        // compareTO() string method.

        String str6="java";
        String str7="Java";
        String str8="JAVA";
        String str9="python";
        String str10="Python";

        System.out.println(str6.compareTo(str7));
        System.out.println(str6.compareTo(str9));
        System.out.println(str9.compareTo(str6));

    }
}