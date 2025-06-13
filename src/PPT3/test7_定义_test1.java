package PPT3;

import java.util.Scanner;

public class test7_定义_test1 {
    //无返回值则为void
    //求n!，要求定义一个方法求n!,调用该方法求5！
    public static int sum(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n * sum(n-1);
    }
    public static void main(String[] args) {

        System.out.println("请输入n的值：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum(n));
    }

}
