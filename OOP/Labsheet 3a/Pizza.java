public class Pizza {
    
private String topping = "";
private Integer diameter= 0;
private Double price = 0.0;

 public void setTopping(String topping) {
     this.topping = topping;
 }

  public void setDiameter(Integer diameter) {
       this.diameter = diameter;
 }
   public void setPrice(Double price) {
       this.price = price;

   }

   public String getTopping() {
       return this.topping;
   }

   public Integer getDiameter(){
      return this.diameter;
   }

   public Double getPrice() {
       return this.price;
   }
}

class testPizza{
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.setTopping("cheese");
        pizza1.setDiameter(10);
        pizza1.setPrice(39.8);
        System.out.println("Topping : " + pizza1.getTopping());
        System.out.println("Diameter : " + pizza1.getDiameter());
        System.out.println("Price : " + pizza1.getPrice());
            
        Pizza pizza2 = new Pizza();
        pizza2.setTopping("bacon");
        pizza2.setDiameter(5);
        pizza2.setPrice(40.5);
       
        System.out.println("Topping : " + pizza2.getTopping());
        System.out.println("Diameter : " + pizza2.getDiameter());
        System.out.println("Price : " + pizza2.getPrice());
       
       
       }
}