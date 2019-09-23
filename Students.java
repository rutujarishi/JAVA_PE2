import java.util.Scanner;

public class Students{
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);  // Create a Scanner object
         System.out.println("Enter the number of students");
         int n = s.nextInt();
    
         int [] grades = new int [n];
         for(int i=0;i<n;i++)
         {
             System.out.println("Enter the grades for student" +(i+1));
             grades[i] = s.nextInt();
         }

         average(n,grades);
        max(n,grades); 
        min(n,grades);
    }
    public static void average( int n, int[] grades)
    {
            int sum =0;
            for(int i=0;i<n ;i++)
            {
                sum = sum + grades[i];
            }
            double avg = sum/n;
            System.out.println("The average is" +avg);
    }
    public static void max( int n, int[] grades)
    {
           int temp = grades[0];
           for(int i=1;i<n;i++)
           {
               if(temp<grades[i])
               {
                    temp = grades[i];
               }
              
           }
           System.out.println("The max number is" +temp);
    }
    public static void min( int n, int[] grades)
    {
           int temp = grades[0];
           for(int i=1;i<n;i++)
           {
               if(temp>grades[i])
               {
                    temp = grades[i];
               }
              
           }
           System.out.println("The min is" +temp);
    }
        
        
}
