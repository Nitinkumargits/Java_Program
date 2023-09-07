import java.util.*;
import java.lang.*;

public class areaOfTriangle{

public static void main(String arg[]){

Scanner sc=new Scanner(System.in);
float base,height,area;

base=sc.nextFloat();
height=sc.nextFloat();
area=(base*height)*0.5f;

System.out.println("Area of Triangel : "+area);

}
}