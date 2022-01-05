import java.util.*;

public class Checkup {
   
    private Integer patientNumber;
    private Integer systolicBP;
    private Integer diastolicBP;
    private Integer LDL;
    private Integer HDL;
   
    public Checkup() {
      patientNumber = 0;
      systolicBP = 0;
      diastolicBP = 0;
      LDL = 0;
      HDL = 0;
    }

 public void setPatientNumber(Integer patientNumber){
     this.patientNumber = patientNumber;
 }

 public void setSystolicBP(Integer systolicBP){
     this.systolicBP = systolicBP;
 }

 public void setDiastolicBP(Integer diastolicBP){
     this.diastolicBP = diastolicBP;
 }

 public void setLDL(Integer LDL){
     this.LDL = LDL;
 }

 public void setHDL(Integer HDL){
     this.HDL = HDL;
 }
 
 public Integer getPatientNumber(){
     return patientNumber;
 }

 public Integer getSystolicBP(){
     return systolicBP;
 }

 public Integer getDiastolicBP(){
     return diastolicBP;
 }

 public Integer getLDL(){
     return LDL;
 }

 public Integer getHDL(){
     return HDL;
 }
  
 public Integer computeRatio(){
     return LDL/HDL;
 }

 public String explainRatio(){
    
    String s ="LDL is known as 'good' cholesterol and a ratio of 3.5 or lower is considered as optimum";
   return s;
 }

}

 class TestCheckup {

    public static void main(String[] args) {
          
        Checkup check1 = new Checkup();
        Checkup check2 = new Checkup();
        Checkup check3 = new Checkup();
        Checkup check4 = new Checkup();

        getData(check1);
        getData(check2);
        getData(check3);
        getData(check4);

        showValues(check1);
        showValues(check2);
        showValues(check3);
        showValues(check4);

      
      
       
    }
    
    
    public static Checkup getData(Checkup check){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Patient Number : ");
        check.setPatientNumber(input.nextInt()); 

        System.out.println("Please enter a Stylostic pressure : ");
        check.setSystolicBP(input.nextInt()); 

        System.out.println("Please enter a diastolic pressure : ");
        check.setDiastolicBP(input.nextInt()); 

        System.out.println("Please enter LDL : ");
        check.setLDL(input.nextInt());
        
        System.out.println("Please enter HDL : ");
        check.setHDL(input.nextInt());
         
        return check;
    }

    public static void showValues(Checkup check){

       System.out.println("Patient Number :" + check.getPatientNumber());
        System.out.println("Blood Pressure : " + check.getSystolicBP() +"/" + check.getDiastolicBP());
        System.out.print("Ratio : " + check.computeRatio() + " " + check.explainRatio());

    }
   
}