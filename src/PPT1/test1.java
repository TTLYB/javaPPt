package PPT1;
public class test1 {
    public static void main(String[] args) {
        //循环计算
        int num = 10;
        long sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;

        }

        System.out.println(sum);
        // 递归计算
        int num2 = 8;
        long sum2 = summber(num2);
        System.out.println(sum2);
    }
    public static long summber(int n)
    {
        if(n==0||n==1){
            return 1;
        }
        return n * summber(n-1);
    }

}
