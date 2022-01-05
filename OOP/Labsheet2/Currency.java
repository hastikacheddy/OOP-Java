import java.util.Scanner;

public class Currency {

    public static void main(String[] string) {
      
        Scanner input = new Scanner(System.in);

        System.out.print("Input an amount of currency in dollars: ");
        double dollars = input.nextDouble();

        System.out.println("input exchange rate :");
        double exchangeRate = input.nextDouble();

        input.close();
        double rupees = dollars * exchangeRate ;

        System.out.println(dollars + " dollars is equal to " + rupees + " rupees");
    }

}