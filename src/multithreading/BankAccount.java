package multithreading;

public class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void withdrawAmount(int amount){
        if(this.balance>=amount){
            System.out.println(Thread.currentThread().getName()+" is withdrawing "+amount);
            this.balance-=amount;
            System.out.println(Thread.currentThread().getName()+" completes the withdrawl , Remaining balance in account "+this.balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " tried to withdraw : "+amount+", but insufficient balance, current balance: "+this.balance);
        }
    }
}
