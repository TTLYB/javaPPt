package PPT3;
//写一个方法交换两个整数的值，看是否能交换成功
public class test_定义4 {
    public static boolean change(int sum1,int sum2)
    {
        int temp = 0;
        temp = sum1;
        sum1 = sum2;
        sum2 = temp;
        System.out.println("交换后的sum1 = " + sum1+",sum2 = " + sum2);
        return true;
    }
    public static void main(String[] args) {
        System.out.println(change(1,2));
        System.out.println(change(4,2));
        System.out.println(change(5,2));
        System.out.println(change(7,2));
    }
}
