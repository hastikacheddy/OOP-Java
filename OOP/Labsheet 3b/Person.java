public class Person {
  //Constant for upper age limit
  private static final int UPPER_AGE = 105;
  private String forename;
  private String initials;
  private String surname;
  private int age;
  //Methods available within the Person class
  //returns the forename attribute of the person
 
  public String getForename() {
    return forename;
  }
  //returns the initials attribute of the person
  
  public String getInitials() {
    return initials;
  }
  //returns the surname attribute of the person

  public String getSurname() {
    return surname;
  }

  //return the age attribute of the person

  public int getAge() {
    return age;
  }
  //set the forename attribute of the person
  
  public void setForename(String f) {
   
    if (f.length() < 1) {
      System.err.println("Bad forename argument in 'setForename");
      System.exit(1);
    }
    forename = f;
  }
  //set the initials attribute of the person
  
  public void setInitials(String f) {
    initials = f;
  }
  //set the surname attribute of the person
  public void setSurname(String s) { 
   
    if (s.length() < 1) {
      System.err.println("Bad forename argument in 'setSurname");
      System.exit(1);
    }
    surname = s;
  }
  //set the age attribute of the person
  public void setAge(int a) {
    
    if ((a < 0) || (a > UPPER_AGE)) {
      System.err.println("Bad age argument in 'setAge");
      System.exit(1);
    }
    age = a;
  }
}

class TestPerson {
  public static void main(String[] args){
    Person person1 = new Person();
    Person person2 = new Person();
    
    person1.setForename("Dipsi");
    person1.setSurname("Lala");
    person1.setAge(34);

    person2.setForename("Tinky");
    person2.setSurname("Winky");
    person2.setAge(66);

    System.out.print("This person is " + person1.getForename() + " " + person1.getSurname() + " (" + person1.getAge() + ", male)");
  }
}