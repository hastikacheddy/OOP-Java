import java.util.Scanner;

public class Invoice {

    private String number;
    private String description;
    private static Integer quantity;
    private static Double price;

   public Invoice(){

    number = ""; 
    description = "";
    quantity = 0;
    price = 0.0;

   }

   public void setNumber(String number){
       this.number = number;
   }

   public void setDescription(String description){
       this.description = description;
   }

   public void setQuantity(Integer quantity){
       this.quantity = quantity;
   }
   
   public void setPrice(Double price){
       this.price = price;
   }

   public String getNumber(){
       return number;
   }

   public String getDescription(){
       return description;
   }

   public Integer getQuantity(){
       return quantity;
   }

   public Double getPrice(){
       return price;
   }

   public static Double getInvoiceAmount(Double price, Integer quantity){
      
    Double invoiceAmount;
     invoiceAmount = price * quantity;
    
     return invoiceAmount;
    }

    class invoiceTest{
       
        public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter the quantity of item : ");
             quantity= input.nextInt();

             System.out.println("Please enter the price of the item : ");
             price=input.nextDouble();
           
             if(quantity<0){
                 quantity = 0;
             }
             if(price <0.0){
                 price = 0.0;
             }
             System.out.println("Amount : " + getInvoiceAmount(price, quantity));
        }

    }
}
