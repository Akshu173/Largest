import java.util.Scanner;
public class primenumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the lower bound: ");
            int lowerBound = scanner.nextInt();

            System.out.print("Enter the upper bound: ");
            int upperBound = scanner.nextInt();

            for (int num = lowerBound; num <= upperBound; num++) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }

        private static boolean isPrime(int number) {
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


