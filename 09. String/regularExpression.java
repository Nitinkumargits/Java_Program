import java.lang.*;

class regularExpression{

    public static void main(String arg[]){
        

        String str1="f";
        String str2="4";
        String str3="%";
        String str4="abc";
        // System.out.println(str1.matches("."));//true
        // System.out.println(str2.matches("."));//true
        // System.out.println(str3.matches("."));//true
        // System.out.println(str4.matches("."));//false(Only for single character)


        String str5= "b";
        String str6= "ab";
        String str7= "p";
        System.out.println(str5.matches("[abc]"));//true
        System.out.println(str6.matches("[abc]"));//false
        System.out.println(str7.matches("[abc]"));//false
         

   

    }
}