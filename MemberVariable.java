import java.util.*;

class member
{
    
    String name;
    int Age;
    double Salary;

    member(String ename , int eAge, double eSalary)
    {
        this.name = ename;
        this.Age= eAge;
        this.Salary = eSalary;

    }
   public void display()
{
    System.out.println( "Member Name:" +name);
    System.out.println( "Member Age:" +Age);
    System.out.println( "Member Salary:" +Salary);
}  
}



 class MemberVariable{
     public static void main(String[] args) {
        member obj = new member("HarryPotter" , 30, 2500.3);
        obj.display();
    }
  
}

