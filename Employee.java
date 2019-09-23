import java.util.*;

 class User 
{
    
    String firstname;
    String lastname;
    int Age;
    double Salary;

   User(String efirstname ,String elastname , int eAge, double eSalary)
    {
        this.firstname = efirstname;
        this.lastname = elastname;
        this.Age= eAge;
        this.Salary = eSalary;

    }
    public boolean isValidAge()
    { 
        boolean s =false;
        if( this.Age <0 || this.Age >100 )
        {
            System.out.println("age cannot be less than 0 or greater than 100.");
        }
        if(this.Age>18 && this.Age < 60)
        {
            s= true;
        }
        return s;
    }

    public  void getFullName()
        {
            System.out.println("fullname" +this.firstname + " " +this.lastname);
        }
        
}


 class Employee {
     public static void main(String[] args) {
        User obj = new User("Harry", "Potter", 2500.3);
        
       boolean  a=obj.isValidAge();
        obj.getFullName();
        System.out.println(a);
    }
}
  
 



