package PPT1;
// 1-100 素数实现
//什么是素数
//
public class test3 {
    public static boolean isPrime(int num)
    {
        for (int i = 2; i *i <= num; i++)//如果
        {
            if(num % i == 0)
                return false;
        }
        if (num <= 1) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }

    }}
