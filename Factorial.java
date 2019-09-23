import java.util.*;
import java.lang.Integer;
import java.lang.*;

class Factorial{
 
    public static void main(String[] args) {
        iFactorial();
        LFactorial();
    }
 
    


public  static void iFactorial()
{
    int extreme= Integer.MAX_VALUE;
    int fact = 1;
     int i=1;
    

    while(true)
    {
      
        
        if(extreme/fact <(i+1))
       {
         System.out.println("The Factorial of" +i +"is out of range");
        break;
       }
       else
       {
        fact= fact*i;
        System.out.println("The Factorial of" +i +"is"+fact);
        i++;
       }
    }
}
public  static void LFactorial()
{
    long extreme= Long.MAX_VALUE;
    long fact = 1;
     int i=1;
    

    while(true)
    {
      
        
        if(extreme/fact <(i+1))
       {
        System.out.println("The Factorial of" +i +"is out of range");
        break;
       }
       else
       {
        fact= fact*i;
        System.out.println("The Factorial of" +i +"is"+fact);
        i++;
       }
    }
}
}