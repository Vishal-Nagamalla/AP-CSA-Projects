class Main {
  public static void main(String[] args) {
    BankAcccount fred = new BankAcccount("Vishal", 4, 2300);
    BankAcccount mildred = new BankAcccount("Someone", 213, -1450);
    BankAcccount joe = new BankAcccount();

    System.out.println(BankAcccount.accCounter());
  }
}