import java.util.Scanner;

public class MarkToGrade {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("input mark") ;
        
        int mark = input.nextInt();
        input.close();
        
        String grade = null;
      
        switch(mark/10) {
          // for >= 90
          case 10:
          case 9:
             grade = "A";
             break;
          // for >= 80 and <90
          case 8:
             grade = "B";
             break;
          // for >= 70 and <80
          case 7:
             grade = "C";
             break;
          // for >= 60 and <70
          case 6:
             grade = "D";
             break;
          // for >= 50 and <60
          case 5:
             grade = "E";
             break;
          // for < 50
          default:
             grade = "F";
             break;
        }
       System.out.println("grade :" + grade);
    }
}
