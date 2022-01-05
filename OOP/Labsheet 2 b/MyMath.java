import java.util.Scanner;

public class MyMath {
    
  public double PI = 3.14159;

  public double square(double x) {
    return x * x;
  }

  public static int divide(int num1, int num2) {
    
    int tmp = num1 - num2;
    int c = 1;

    while (tmp > 0 && tmp >= num2){
      tmp = tmp - num2;
      c++;
    }
    return c;
  }

  static int factorial(int n)
  {
    int output;
    if (n == 1) {
      return 1;
    }
    //Recursion: Function calling itself!!
    output = factorial(n - 1) * n;
    return output;
  }

  public static void main(String[] args) {
    //Scanner object for capturing the user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number:");
    //Stored the entered value in variable
    int num = scanner.nextInt();
    //Called the user defined function fact
    int factorial = factorial(num);
    System.out.println("Factorial of entered number is: " + factorial);
    System.out.println("enter 2 number for division : ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    System.out.println("division :" + divide(num1, num2));
  }
}


