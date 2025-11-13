import java.util.*;
import com.app.dto.*;
import com.app.process.*;
import com.app.exceptions.*;
import com.app.auth.UserSignIn;

public class FundTransfer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Customer loggedInUser = UserSignIn.login();
            if (loggedInUser == null) {
                System.out.println(" Login failed. Exiting.");
                return;
            }
            Customer bene1 = new Customer("Robin", "robin@gmail.com", "22222", 500000);
            Customer bene2 = new Customer("Alice", "alice@gmail.com", "33333", 800000);
            Customer bene3 = new Customer("John", "john@gmail.com", "44444", 300000);

            Customer[] beneficiaries = {bene1, bene2, bene3};

            NEFTProcessFund neft = new NEFTProcessFund();

            boolean continueTransactions = true;

            while (continueTransactions) {
                try {
                    System.out.println("\nNew Transaction");
                    System.out.print("Enter beneficiary account number: ");
                    String beneAccNo = sc.nextLine();
                    Customer receiver = findBeneficiary(beneficiaries, beneAccNo);

                    if (receiver == null) {
                        throw new BeneNotFoundException("Beneficiary with account " + beneAccNo + " not found.");
                    }
                    System.out.print("Enter amount to transfer: ");
                    double amount = Double.parseDouble(sc.nextLine());

                    if (amount <= 0) throw new InvalidAmountException("Amount must be positive.");
                    if (loggedInUser.getAmountbalance() < amount)
                        throw new InsufficientBalanceException("Insufficient balance.");
                    neft.processFund(loggedInUser, receiver, amount);
                    neft.sendSMS(receiver);

                    System.out.println("Transaction successful!");
                    System.out.println("Your balance: ₹" + loggedInUser.getAmountbalance());
                    System.out.println("Beneficiary balance: ₹" + receiver.getAmountbalance());

                } catch (BeneNotFoundException | InvalidAmountException |
                        InsufficientBalanceException | AccountBalaneException e) {
                    System.out.println("Transaction failed: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Unexpected error: " + e.getMessage());
                }
                System.out.print("\nDo you want to perform another transaction? (y/n): ");
                String choice = sc.nextLine();
                if (!choice.equalsIgnoreCase("y")) {
                    continueTransactions = false;
                }
            }

            System.out.println("Session ended. Final balance: " + loggedInUser.getAmountbalance());

        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: Invalid credentials.");
        } finally {
            sc.close();
        }
    }

    private static Customer findBeneficiary(Customer[] users, String accountNo) {
        for (Customer c : users) {
            if (c.getAccountno().equals(accountNo)) return c;
        }
        return null;
    }
}
