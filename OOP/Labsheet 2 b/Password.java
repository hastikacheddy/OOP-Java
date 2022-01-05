import java.util.Scanner;

public class Password {
    
  public static void main(String[] args) {

    System.out.println("Enter password : ");

    Scanner input = new Scanner(System.in);

    String password = input.nextLine();
       
    input.close();

    if (password.equalsIgnoreCase("bolt")) {
      System.out.println("The password is valid"); 
    }
    else {
      System.out.println("The password is invalid!");
    }
  }

}


