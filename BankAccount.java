public class BankAccount {
  public double balance;
  public int accountID;
  public String password;
  public BankAccount(double b,int x, String s){
    balance = b;
    accountID = x;
    password = s;
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
  public boolean withdraw(double amount){
    if (amount < balance){
      balance -= amount;
      return true;
    }
    return false;
  }



  private boolean authenticate(String password){
    return this.password.equals(password);
  }
  public boolean transferTo(BankAccount other, double amount, String password){
    return (other.authenticate(password) && this.withdraw(amount)) && other.deposit(amount);
  }
}
