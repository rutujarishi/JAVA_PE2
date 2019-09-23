import java.util.Scanner;

public class Palindrome2{
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter the number");
         String number = s.nextLine();
         Palindrome(number);
    }
    public static void Palindrome(String number){
        String reverse = "";
        String numbercopy= number;
        String remainder;
        
    ;
        for(int i =number.length() - 1; i >= 0; i--)
        {
            reverse = reverse + number.charAt(i);
           
        }
        System.out.println(reverse);
        if (reverse.equals(number))
        {
                System.out.println("Number is palindrome ");
        }
        else
             {
                System.out.println("Number is not palindrome ");
             }
        

    }
}
