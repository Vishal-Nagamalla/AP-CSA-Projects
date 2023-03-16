public class BankAcccount {

  private String clientName;
  private int accNumber;
  private double balance; 
  private static int accountNum;

  public BankAcccount() {
    this.clientName = "Anonymous";
    this.accNumber = 0;
    this.balance = 0;
    accountNum++;
  }


  public BankAcccount(String clientName, int accNumber, double balance) {
    this.clientName = clientName;
    this.accNumber = accNumber;
    this.balance = balance;
      accountNum++;
  }




  public String toString() {

    return "Name = " + clientName + ", Account Number = " + accNumber + ", Balance = " + balance;


  }


  public  void deposit(double ammount) {
  
      this.balance = this.balance + ammount;
  }



  public  void withdrawn(double ammount) {
    if (ammount <= this.balance)
      this.balance = this.balance - ammount;
  }


  public static int accCounter() {
      return accountNum;
  }
}