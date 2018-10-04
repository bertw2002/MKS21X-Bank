public class driver{
  public static void main(String[]args){
    BankAccount x = new BankAccount(101, "password",100.3);
    // should print 101
    System.out.println(x.getaccountID());
    // 100.3
    System.out.println(x.getbalance());
    // 101 tab 100.3
    System.out.println(x.toString());
    //failure
    if(x.withdraw(1000) ){
       System.out.println("Withdrawal success!");
     }else{
       System.out.println("Withdrawal failure");
     }
     //success
     if(x.withdraw(10) ){
        System.out.println("Withdrawal success!");
      }else{
        System.out.println("Withdrawal failure");
      }
      //success
      if(x.deposit(10) ){
         System.out.println("Withdrawal success!");
       }else{
         System.out.println("Withdrawal failure");
       }
       //failure
       if(x.deposit(-1)) {
          System.out.println("Withdrawal success!");
        }else{
          System.out.println("Withdrawal failure");
        }
  }
}
