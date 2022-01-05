public class Vehicle {
   
  private Integer noOfTyres;
  private Boolean accessories;
  private String brand;
  private static Integer counter=0;
  private Integer counterNum;

public Vehicle(Integer noOfTyres, Boolean accessories, String brand){
 counter++;
 this.noOfTyres= noOfTyres;
 this.accessories = accessories;
 this.brand= brand;
 counterNum= counter;
}

}
