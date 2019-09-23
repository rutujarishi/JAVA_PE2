import java.util.*;


public class EvenNumTest{
 public static void main(String[] args) 
 {
    Scanner s = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter the number");
    int number = s.nextInt();
   boolean result= isEven(number);
   System.out.println(result);
    
 }
  

public static boolean isEven(int number)
{

    if(number%2==0)
    {
        return true;
    }
    else
    {
        return false;
    }

}


}