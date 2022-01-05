import java.util.Scanner;

public class Wonderland {
    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Input the amount of money : ");
    double money = input.nextDouble();

    System.out.println("Input number of children : ");
    int children = input.nextInt();

    input.close();
    double house = money * 0.5;
    double car  = (house * 1/3);
    double saved = ((money - (house + car )) * 1/3);
    double remaining = ((money - (house + car + saved )) / (2 + children));
    double parent = remaining * 2;

    System.out.println("parent : " + parent);
    System.out.println("child : "  + remaining);

    }
}
