import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponCollector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of distinct coupon numbers: ");
        int numberOfCoupons = scanner.nextInt();

        int[] couponNumbers = new int[numberOfCoupons];

        System.out.println("Enter the distinct coupon numbers:");

        for (int i = 0; i < numberOfCoupons; i++) {
            System.out.print("Coupon " + (i + 1) + ": ");
            couponNumbers[i] = scanner.nextInt();
        }

        int totalRandomNumbers = generateDistinctCoupons(couponNumbers);
        System.out.println("Total random numbers needed: " + totalRandomNumbers);
    }

    public static int generateDistinctCoupons(int[] couponNumbers) {
        Set<Integer> distinctCoupons = new HashSet<>();
        Random random = new Random();
        int totalRandomNumbers = 0;

        while (distinctCoupons.size() < couponNumbers.length) {
            int randomCoupon = couponNumbers[random.nextInt(couponNumbers.length)];
            distinctCoupons.add(randomCoupon);
            totalRandomNumbers++;
        }

        return totalRandomNumbers;
    }
}
