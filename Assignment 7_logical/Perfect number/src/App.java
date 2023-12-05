public class App {

    public static void main(String[] args) {
        int numberToCheck = 496;

        if (isPerfectNumber(numberToCheck)) {
            System.out.println(numberToCheck + " is a perfect number.");
        } else {
            System.out.println(numberToCheck + " is not a perfect number.");
        }
    }

    static boolean isPerfectNumber(int num) {
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
