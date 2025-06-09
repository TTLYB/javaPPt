package PPT1;
import java.util.Scanner;
// 16 4 的最大公约数是4 18 和 9 是 9
//最大公约数：注意此代码并未有此函数 gcd函数返回最大公约数 0 和 10  的最大公约数是10
//最小公倍数：两数相乘/最大公约数
public class test55 {
    //最大公约数 - 递归实现
//    public static int gcd(int a, int b)
//    {
//        if(b==0)
//            return a;
//        else
//            return gcd(b, a % b);
//    }
    //迭代实现
    public static int gcd(int a, int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //最小公倍数
    public static int lcm(int a, int b)
    {
        //公式：LCM(a,b) = (a * b) /gcd(a.b)
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 12;

        int gcdResult = gcd(num1, num2);
        int lcmResult = lcm(num1, num2);

        System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcdResult);
        System.out.println("LCM(" + num1 + ", " + num2 + ") = " + lcmResult);

    }
}
