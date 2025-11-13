class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        balance += amount;
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds in " + name + "'s account!");
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return name + " - Balance: " + balance;
    }
}