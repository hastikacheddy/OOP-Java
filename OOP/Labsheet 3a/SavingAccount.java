public class SavingAccount {

    private static Double annualInterestRate;
    private Double savingsBalance;

    public void SavingsAccount() {
     annualInterestRate = 0.0;
     savingsBalance = 0.0;
     }

    public void SavingsAccount(double intRate, double savBal) {
        annualInterestRate = intRate;
        savingsBalance = savBal;
        }
    
    public double calculateMonthlyInterest() {
        double intRate = (savingsBalance * annualInterestRate/12);
        savingsBalance = savingsBalance + intRate;
        return intRate;
        }    
        
    public static void modifyInterestRate(double newInteresRate) {
        annualInterestRate = newInteresRate;
        }    

    public void setSavingsBalance(double newBal) {
        savingsBalance = newBal;
        }    

    public double getSavingsBalance() {
      return savingsBalance;
     }


     public double getAnnualInterestRate() {
      return annualInterestRate;
     }

}

 class SavingsAccountTest {
    public static void main(String[] args) {
    SavingAccount saver1, saver2;
     saver1 = new SavingAccount();
     saver2 = new SavingAccount();
    saver1.setSavingsBalance(2000.00);
    saver2.setSavingsBalance(3000.00);
    SavingAccount.modifyInterestRate(0.04);
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();


    System.out.println("This month:\nSaver 1 balance= "+ saver1.getSavingsBalance());
    System.out.println("Saver 2 balance= "+ saver2.getSavingsBalance());

    SavingAccount.modifyInterestRate(0.05);
    
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println("Next month:\nSaver 1 balance= "+ saver1.getSavingsBalance());
    System.out.println("Saver 2 balance= "+ saver2.getSavingsBalance());


    }
}

