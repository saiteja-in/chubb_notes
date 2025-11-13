public class Main {
    record Account(String name, double balance) {}
    public static Account[] transferFunds(Account from, Account to, double amount) {
        System.out.println("\nAttempting to transfer " + amount + " from " + from.name() + " to " + to.name());

        if (amount <= 0) {
            System.out.println("Invalid transfer amount!");
            return new Account[]{from, to};
        }

        if (from.balance() < amount) {
            System.out.println("Insufficient funds in " + from.name() + "'s account!");
            return new Account[]{from, to};
        }
        Account updatedFrom = new Account(from.name(), from.balance() - amount);
        Account updatedTo = new Account(to.name(), to.balance() + amount);

        System.out.println("Transfer successful.");
        return new Account[]{updatedFrom, updatedTo};
    }

    public static void main(String[] args) {
        Account acc1 = new Account("Teja", 5000);
        Account acc2 = new Account("Sharath", 3000);

        System.out.println("Initial Balances:");
        System.out.println(acc1);
        System.out.println(acc2);
        Account[] updated = transferFunds(acc1, acc2, 1500);
        acc1 = updated[0];
        acc2 = updated[1];

        System.out.println("\nAfter Transfer:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
