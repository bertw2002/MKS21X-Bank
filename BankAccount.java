public class BankAccount {
  public double balance;
  public int accountID;
  public String password;
  public BankAccount(int x, String s,double b){
    b = balance;
    x = accountID;
    s = password;
  }
  public int getaccountID(){
    return accountID;
  }
  public double getbalance(){
    return balance;
  }
  public void setpassword(String newPass){
    password = newPass;
  }
  public String toString(){
    return accountID + "\t" + balance;
  }
  public boolean deposit(double amount){
    if (amount >= 0){
      balance += amount;
      return true;
    }
    return false;
  }
  public boolean decreasebal(double amount){
    if (amount < balance){
      balance -= amount;
      return true;
    }
    return false;
  }
}
