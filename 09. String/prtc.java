public class prtc {
    public static void main(String arg[]){
        int x=10;
        float f=12.4f;
        char z='A';
        String str="java Program";

        // System.out.printf("%4$s %1$d %2$e %3$C",x,f,z,str);

        // String object 

        String str1="java";
        String str2=new String("java")  ;

        str1=str1.toUpperCase();
        // System.out.println(str1);


        // String  str4="    WELCOME    ";

        // str4=str4.trim().toLowerCase().replace('e', 'k');
        // System.out.println(str4 );



        /*Regular Expression */

        // String str9="abc9de";
        // System.out.println(str9.matches("[a-z][0-9]"));
            
        String strgmail="nitink@gmail.com";
        System.out.println(strgmail.matches("\\w*@gmail.*"));
    }
}
