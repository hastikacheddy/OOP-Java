import java.util.Scanner;

public class Calculate {
    
  public static void main(String[] args){

    System.out.println("Enter a character");
     
    Scanner input = new Scanner(System.in);
    char character = input.next().charAt(0);
     
    System.out.println("enter number 1 : ");
    int number1 = input.nextInt();
    
    System.out.println("enter number 2 : ");
    int number2 = input.nextInt();
    input.close();

    double result = 0;
    if (character == 'A'){
      result = number1 + number2;
    } else if (character == 'M') {
      result = number1 * number2;
    } else if (character == 'S') {
      result = number1 - number2;
    }
    System.out.println("Result : " + result);
  }
}
