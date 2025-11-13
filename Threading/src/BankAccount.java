class BankAccount {
    private int balance = 1000;
    public  void withdraw(String user, int amount) {
        if (balance >= amount) {
            System.out.println(user + " is withdrawing " + amount);
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            balance -= amount;
            System.out.println(user + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(user + " tried to withdraw " + amount + " but insufficient balance!");
        }
    }

    public int getBalance() {
        return balance;
    }
}