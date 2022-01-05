import java.util.Scanner;

public class Celsius {

  public static void main(String[] Strings) {

    Scanner input = new Scanner(System.in);

    System.out.print("Input a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble();
    input.close();
    double  celsius = ((5 * (fahrenheit - 32.0)) / 9.0);

    System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
  }
}

