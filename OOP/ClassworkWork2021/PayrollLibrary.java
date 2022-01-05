import java.util.Scanner;

public class PayrollLibrary {

    public static Double computeTotalSalary( Double salary, Double years){
     
        Double bonus;
        Double sum;
       if(years < 5){
        
        bonus= 0.05 * salary;

       }else if (years >= 5 && years <= 10){

        bonus=0.1 * salary;
       } else{

        bonus= 5000.0;
       }
      sum = salary + bonus;

      return sum;
    }

  public static String displaySalary (String Firstname, String Lastname, Double salary){

       String s;
       s = "Employee" + Firstname + " " + Lastname + "earns Rs " + salary;

       return s;
  }  

  public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter firstname :");

    String Firstname = input.nextLine();

    System.out.println("Enter lastname :");

    String Lastname = input.nextLine();

    System.out.println("Enter Salary : ");
    Double salary = input.nextDouble();

    System.out.println("Enter years : ");

    Double years = input.nextDouble();

    double sum = PayrollLibrary.computeTotalSalary(salary, years);
    PayrollLibrary.displaySalary(Firstname, Lastname, salary);
   
    System.out.println(s);
  }
}
