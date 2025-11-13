import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time period (years): ");
        double time = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        double compoundInterest = calculateCompoundInterest(principal, rate, time);

        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
        System.out.printf("Compound Interest: %.2f%n", compoundInterest);

        scanner.close();
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (Math.pow(1 + rate / 100, time) - 1);
    }
}
