import java.util.Scanner;

public class StudentMarks {
    
    public static void main(String[] args) {

    

    Scanner input = new Scanner(System.in);
    
    System.out.println("Input marks for continuous assessments : ");
    int continuousMarks = input.nextInt();

    System.out.println("Input Exams marks : ");
    int examsMarks = input.nextInt();
    
    input.close();
    String grade;
    continuousMarks = continuousMarks * 2 ;

    if (continuousMarks>40 && examsMarks> 40 ) {
        grade = "passed" ;
    }
    else if ((continuousMarks>80 && (examsMarks>34 && examsMarks < 41)) || examsMarks>80 && (continuousMarks>34 && continuousMarks < 41)) {

        grade = "pushup" ;

    } else{
        grade= "failed" ;
    }

    System.out.println("grade : " + grade);
}
}