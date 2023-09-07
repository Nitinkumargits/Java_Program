public class stringTwo {
    public static void main(String arg[]){
        int x=10;
        float f=14.3f;
        float y=0.000012f;
        char c='A';
        String str="java progarm";

        // System.out.printf(" hello %S  \n ",str);
        // System.out.printf("hello %d %f %C world\n nitin\n" ,x,f,c);
        // System.out.printf("%e\n", f);
        // System.out.printf("%e\n", y);
        
        
        System.out.printf("%1$d %1$d  %1$d\n",x);
        System.out.printf("%1$d %1$d  %2$f\n",x,y);
        System.out.printf(" %3$S %2$f %1$d",x,f,str);
    }
}
