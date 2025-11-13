class Withdraw implements Runnable {
    private BankAccount account;
    private String user;
    private int amount;

    public Withdraw(BankAccount account, String user, int amount) {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(user, amount);
    }
}