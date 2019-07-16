class Bank{
  float balance=5000.00f;

  synchronized void withdraw(float amount){
    try{
      System.out.println("Withdraw thread !!");
      if(balance<amount){
        System.out.println("Can't withdraw! waiting to deposite");
        System.out.println("wait() method called");
        wait();

      }
      balance-=amount;
      System.out.println("withdraw complete");
    }catch(Exception e){
      System.err.println(e);
    }
  }

  synchronized void deposite(float amount){
    System.out.println("deposite thread !!");
    try{
      balance+=amount;
      System.out.println("Deposite succeed");
            System.out.println("Notify() called");
      notify();

    }catch(Exception e){
      System.err.println(e);
    }
  }
}

class Customer1 extends Thread{
  Bank b;
  public Customer1(Bank b){
    this.b=b;
  }
  public void run(){
    b.withdraw(8000.00f);
  }
}

class Customer2 extends Thread{
  Bank b;
  public Customer2(Bank b){
    this.b=b;
  }
  public void run(){
    b.deposite(5000.00f);
  }
}

class BankMultiThreadDemo{
  public static void main(String[] args){
    Bank bd=new Bank();
    Customer1 c1=new Customer1(bd);
    c1.start();
    Customer2 c2=new Customer2(bd);
    c2.start();


  }

}
