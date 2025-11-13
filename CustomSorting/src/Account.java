import java.util.*;
public class Account implements Comparable<Account>{
	 String accountHolderName;
	    int accountNo;
	    String transCode;
	    String country;
	    String ifscCode;
	    double balance;
	    public Account(String accountHolderName, int accountNo, String transCode, String country, String ifscCode, double balance) {
	        this.accountHolderName = accountHolderName;
	        this.accountNo = accountNo;
	        this.transCode = transCode;
	        this.country = country;
	        this.ifscCode = ifscCode;
	        this.balance = balance;
	    }
	    @Override
	    public int compareTo(Account other) {
	        return this.accountHolderName.compareToIgnoreCase(other.accountHolderName);
	    }
	    @Override
	    public String toString() {
	        return String.format("%s | %d | %.2f | %s", accountHolderName, accountNo, balance, country);
	    }
	

}


class SortByAccountNo implements Comparator<Account> {
    @Override
    public int compare(Account a, Account b) {
        return Integer.compare(a.accountNo, b.accountNo);
    }
}

// 5️⃣ Comparator for sorting by Balance
class SortByBalance implements Comparator<Account> {
    @Override
    public int compare(Account a, Account b) {
        return Double.compare(a.balance, b.balance);
    }
}