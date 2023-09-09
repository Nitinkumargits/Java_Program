import java.lang.*;

class flagAndWidth{
    public static void main(String arg[]){
        int a=10;
        int b=-10;
        System.out.printf("%5d\n",a);
        System.out.printf("%05d\n",a);
        System.out.printf("%(5d\n",b);
        System.out.printf("%+5d\n",a);
        System.out.printf("%+5d\n",b);

        float f=12.3456f;
        System.out.printf("%6.2f\n",f);
        float k=8918122.45f;
        System.out.printf("%6.2f\n",k);

        String  str="java";
        System.out.printf("%20S\n",str);
        System.out.printf("%-20S",str);
    }
}