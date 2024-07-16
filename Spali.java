import java.util.*;
public class Spali 
{
  public static void main(String[] args) 
  {
    boolean pl=false;
    System.out.println("Enter name");
    String s;
    Scanner sc = new Scanner(System.in);
    s=sc.nextLine();
    int i=0;
    String s2 = new String(s);
    while( i < s2.length()/2)
    {
       if(s2.charAt(i) != s2.charAt(s2.length()-i-1))
       {
        pl=true;
        break;
       }
       else 
       {
        i++;
       }
    }
    if(pl)
    {
        System.out.println("not palindrome");
    }
    else
    {
        System.out.println("palindrome");
    } sc.close();
  }   
}
