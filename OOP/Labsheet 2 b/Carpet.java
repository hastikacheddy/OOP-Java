import java.util.Scanner;

public class Carpet {
 
  public static void main(String[] args) {

    System.out.println("enter the width of the carpet : ");

    Scanner input = new Scanner(System.in);
        
    double width = input.nextDouble();

    System.out.println("enter the length of the carpet : ");
    double length = input.nextDouble();

    System.out.println("enter the price of the carpet per sq foot :");
    double price = input.nextDouble();

    input.close();

    double totalPrice = width * length * price;

    System.out.println("The total price of the carpet is : " + totalPrice);
  }
}
