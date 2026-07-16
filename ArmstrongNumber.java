public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153, sum = 0, temp = n;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
