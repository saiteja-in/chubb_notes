import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
            new Account("Alice", 103, "TRX001", "India", "HDFC0001", 25000.50),
            new Account("John", 101, "TRX002", "USA", "CITI0002", 55000.00),
            new Account("Bob", 105, "TRX003", "UK", "BARC0003", 30000.75),
            new Account("David", 102, "TRX004", "Canada", "RBC0004", 12000.00),
            new Account("Charlie", 104, "TRX005", "Australia", "ANZ0005", 70000.25)
        );

        System.out.println("Original List:");
        System.out.println(accounts);

        Collections.sort(accounts);
        System.out.println("Sorted by Account Holder Name (Comparable):");
        System.out.println(accounts);

        Collections.sort(accounts, new SortByAccountNo());
        System.out.println("\nSorted by Account Number (Comparator):");
        System.out.println(accounts);

        Collections.sort(accounts, new SortByBalance());
        System.out.println("\nSorted by Balance (Comparator):");
        System.out.println(accounts);
//
//        Account a1 = new Account("John", 101, "TRX006", "USA", "CITI9999", 99999.99);
//        Account a2 = new Account("John", 101, "TRX007", "USA", "CITI9998", 88888.88);
//
//        System.out.println("\nEquality Test:");
//        System.out.println("a1.equals(a2): " + a1.equals(a2));
//        System.out.println("a1.hashCode() == a2.hashCode(): " + (a1.hashCode() == a2.hashCode()));
    }
}