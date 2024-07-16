import java.util.*;
public class prime 
{
    public static void main(String[] args)
    {
        int n,i,k=1;
        Scanner os=new Scanner(System.in);
        System.out.print("Enter the number");
        n=os.nextInt();
        os.close();
        if(n<0)
        {
            System.out.println("Invalid number");
        }
        else
        {
            if(n==1 || n==2)
            {
                System.out.println("Number is prime number");
            }
            else
            {
                for(i=2 ; i<n ; i++)
                {
                     k = n % i;
                     if(k==0)
                     {
                        System.out.println("number is not prime");
                        break;
                     }
                }
                if(k!=0)
                {
                    System.out.println("number is prime");
                }
            }  
        }    
    }   
} 
