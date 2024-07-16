import java.util.*;
public class method 
{ 
     int a;
     int b;
     int mult(int x,int y)
     {
         System.out.println("inside mult "+x*y);
        return x*y;
     } 
     public static void main(String[] args) 
     {
        method me = new method();
        Scanner of = new Scanner(System.in);
        System.out.println("Enter two numbers");
        me.a=of.nextInt();
        me.b=of.nextInt();
        of.close();
        int k=me.mult(me.a,me.b);
        System.out.println("outside mult "+k);
     } 
}
