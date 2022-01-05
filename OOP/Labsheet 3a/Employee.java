import java.util.Scanner;

public class Employee {
 
    private String firstName;
    private String lastName;
    private static Double salary;

    public Employee() {
       firstName = "";
       lastName = "";
       salary = 0.0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getFirstName(String firstName) {
        return firstName;
    }

    public String getLastName (String lastName) {
        return lastName;
    }

    public Double getSalary(Double salary) {
        return salary;
    }


}

class EmployeeTest{
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);

      Employee employee1 = new Employee();
      Employee employee2 = new Employee();
       System.out.println("enter salary : ");
        Double salary = input.nextDouble();

          employee1.setSalary(salary);
        if(salary < 0.0){

            salary = 0.0;
        }
       
       
        salary= salary * 1.1;

        System.out.println("salary : " + salary);
        System.out.println("enter salary : ");
         salary = input.nextDouble();
        
          employee2.setSalary(salary);
        if(salary < 0.0){

            salary = 0.0;
        }
       
       
        salary= salary * 1.1;

        System.out.println("salary : " + salary);
        

    }
}
