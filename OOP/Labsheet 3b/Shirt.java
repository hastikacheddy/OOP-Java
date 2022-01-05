public class Shirt {
    
  private Integer collarSize;
  private Double sleeveLength;
  private String material = "cotton";

  public void setCollarSize(Integer collarSize) {
    this.collarSize = collarSize;
  }

  public void setSleevesLength(Double sleeveLength) {
    this.sleeveLength = sleeveLength;
  }

  public void setMaterial(String material) {

    this.material = material;
  }

  public Integer getCollarSize() {
    return collarSize;
  }

  public Double getSleevesLength() {
    return sleeveLength;
  }
  
  public String getMaterial() {
    return material;
  }

}

class TestShirt{
   
  public static void main(String[] args) {

    Shirt shirt1 = new Shirt();
    shirt1.setCollarSize(30);
    shirt1.setSleevesLength(34.0);
    shirt1.setMaterial("wool");

    System.out.println("Shirt 1");
    System.out.println("Collar size : " + shirt1.getCollarSize());
    System.out.println("Sleeve length : " + shirt1.getSleevesLength());
    System.out.println("Material : " + shirt1.getMaterial());

    Shirt shirt2 = new Shirt();
    System.out.println("Shirt 2");
    shirt2.setCollarSize(20);
    shirt2.setSleevesLength(32.0);
    shirt2.setMaterial("linen");
 
    System.out.println("Collar size : " + shirt2.getCollarSize());
    System.out.println("Sleeve length : " + shirt2.getSleevesLength());
    System.out.println("Material : " + shirt2.getMaterial());
    
    Shirt shirt3 = new Shirt();
    System.out.println("Shirt 3");
    shirt3.setCollarSize(10);
    shirt3.setSleevesLength(14.0);
    shirt3.setMaterial("cotton");

    System.out.println("Collar size : " + shirt3.getCollarSize());
    System.out.println("Sleeve length : " + shirt3.getSleevesLength());
    System.out.println("Material : " + shirt3.getMaterial());
  }

}

