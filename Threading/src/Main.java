public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        Thread t1 = new Thread(new Withdraw(ba, "User1", 700));
        Thread t2 = new Thread(new Withdraw(ba, "User2", 700));
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {}

        t2.start();
       
        
        System.out.println("Final balance: " + ba.getBalance());
    }
}