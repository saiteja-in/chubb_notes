public class Main {                                    // 1
    public static void main(String[] args) {          // 2
        int n = 10; // Number of Fibonacci numbers to generate
        System.out.println("Fibonacci Series up to " + n + " numbers:");
        fibonacci(n);

        // Test prime numbers
        System.out.println("\nTesting prime numbers:");
        System.out.println("Is 7 prime? " + isPrime(7));
        System.out.println("Is 4 prime? " + isPrime(4));
    }

    public static void fibonacci(int n) {
        int firstNumber = 0, secondNumber = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
