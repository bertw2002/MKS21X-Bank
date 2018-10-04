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
  public boolean increasebal(int depo){
    if (depo >= 0){
      balance += depo;
      return true;
    }
    return false;
  }
  public boolean decreasebal(int withdraw){
    if (withdraw < balance){
      balance -= withdraw;
      return true;
    }
    return false;
  }
}
