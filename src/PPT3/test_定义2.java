package PPT3;

public class test_定义2 {
    public static boolean isprime(int sum) {
        for (int i = 2; i *i <= sum; i++) {
            if (sum % i == 0)
                return false;
        }
        if (sum <= 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int sum = 100;
        for (int j = 1; j <= sum; j++) {
            if (isprime(j) == true) {
                System.out.println(j);
            }
        }
    }
}
