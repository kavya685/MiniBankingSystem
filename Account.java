public class Account {
  private int accountID;
  private String name;
  private double balance;

  public Account(int accountID, String name, double balance)
  {
    this.accountID = accountID;
    this.name = name;
    this.balance = balance;
  }

  //getters
  public int getAccountID()
  {
    return accountID;
  }

  public String getName()
  {
    return name;
  }

  public double getBalance()
  {
    return balance;
  }
}
