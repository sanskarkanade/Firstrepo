import java.util.Scanner;

class Derivative
{
    public static void main(String[] args) 
    {   
       
       String s1=new String("x");
       String s2=new String("sinx");
       String s3=new String("cosx");
       String s4=new String("tanx");
       String s5=new String("cotx");
       String s6=new String("secx");
       String s7=new String("cosecx");
       String term;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a single term ");
       term=sc.nextLine();
       System.out.println("Enter the angle(1,2,...) if function is trignometric\nOR\nPower of x");
       int n = sc.nextInt();
       sc.close();
       String s8=new String(term);
       if(n==1)
       {
       if(s1.equals(s8))
       {
         System.out.println("1");
       }
       else if(s2.equals(s8))
       {
        System.out.println("cosx");
       }
       else if(s3.equals(s8))
       {
        System.out.println("-sinx");
       }
       else if(s4.equals(s8))
       {
        System.out.println("sec^2 x");
       }
       else if(s5.equals(s8))
       {
        System.out.println("-cosec^2 x");
       }
       else if(s6.equals(s8))
       {
        System.out.println("secx*tanx");
       }
       else if(s7.equals(s8))
       {
        System.out.println("-cotx");
       }
       else
       {
        System.out.println("Invalid input");
       }
      }
      else
      {
        if(s1.equals(s8))
       {
         System.out.println(n+"x^"+(n-1));
       }
       else if(s2.equals(s8))
       {
        System.out.println( n+"cos"+n+"x");
       }
       else if(s3.equals(s8))
       {
        System.out.println(n+"-sin"+n+"x");
       }
       else if(s4.equals(s8))
       {
        System.out.println(n+"sec^2"+n+"x");
       }
       else if(s5.equals(s8))
       {
        System.out.println(n+"-cosec^2"+n+"x");
       }
       else if(s6.equals(s8))
       {
        System.out.println(n+"sec"+n+"x*tan"+n+"x");
       }
       else if(s7.equals(s8))
       {
        System.out.println(n+"-cot"+n+"x");
       }
       else
       {
        System.out.println("Invalid input");
       }
      }
    }
}
