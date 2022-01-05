import java.util.Scanner;

public class TestingOfArray {
  
  public static void main(String[] args) {

    System.out.println("Input the number of integers");

    Scanner input = new Scanner(System.in);
    int numberOfInteger = input.nextInt();
    int  [] number = new int[numberOfInteger];
        
    for (int i = 0; i < numberOfInteger; i++) {
      System.out.println("input number " + i);
      number[i] = input.nextInt();   
    }

        
    Big(number);
    check(number);
    arrayToString(number);
    reverseOrder(number);
    average(number);
  }


  public static void Big(int[] number) {

    int big = 0;
    for (int i = 0; i < number.length; i++) {
      if (number[i] > big) {
        big = number[i];
      }
    }
    System.out.println("biggest integer : " + big);  
  }

  public static void check(int[] number) {
    System.out.println("enter the integer to check : ");
          
    Scanner input = new Scanner(System.in);
    int check = input.nextInt();
          
    for (int i = 0; i < number.length; i++) {
      if (number[i] == check) {
        System.out.println("found at array number " + 1);
      }
    }
  }

  public static void arrayToString(int[] number) {
    String stringNum = "";
    for (int i = 0; i < number.length; i++) {
            
      stringNum = number[i] + " ";
      System.out.print(stringNum);
    } 
  }

  public static void reverseOrder(int[] number) {
       
    int [] reverse = new int[number.length];

    for (int i = number.length - 1; i >= 0; i--) {
      reverse[i] = number[i];

      System.out.println("reverse order : " + reverse[i]);
    }
  }

  public static void average(int[] number) {
    int sum = 0;
    for (int i = 0; i < number.length; i++) {
      sum = sum + number[i]; 
    }

    double avg = sum / number.length;
    System.out.println("Average : " + avg);
  }
}