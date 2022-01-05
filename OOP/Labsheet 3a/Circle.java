public class Circle {

 private static Double radius ;
 private static Double diameter ;
 private static Double area ;

 public Double Circle(double radius){
       radius = 1;
       return radius;
 }

 
    
 public void setRadius(Double radius){
  this.radius = radius;
 }

 public Double getRadius(){
     return radius;
 }

 public static Double computeDiameter(){
     diameter= radius * 2;
    return diameter;
 }
  public static Double computeArea(){
      area = radius * radius  * 3.14;
      return area;
  }

}

class TestCircle{

    public static void main(String[] args) {
   
        Circle circle1 = new Circle() ;
        circle1.setRadius(5.0);
        System.out.println("Diameter : " + Circle.computeDiameter());
        System.out.println("Area : " + Circle.computeArea());
        
        Circle circle2 = new Circle() ;
        circle2.setRadius(-5.0);
        System.out.println("Diameter : " + Circle.computeDiameter());
        System.out.println("Area : " + Circle.computeArea());

        Circle circle3 = new Circle() ;
        circle3.setRadius(1.0);
        System.out.println("Diameter : " + Circle.computeDiameter());
        System.out.println("Area : " + Circle.computeArea());
     } 
     
}