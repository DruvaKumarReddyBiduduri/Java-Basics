package multithreading;

public class WithdrawlThread extends  Thread{
    BankAccount account;
    int amount;

    public WithdrawlThread(BankAccount account,int amount) {
        this.account = account;
        this.amount=amount;
    }

    @Override
    public void run() {
        account.withdrawAmount(this.amount);
    }
}
