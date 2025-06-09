package PPT3;
//求两个数的最小公倍数
public class test3 {
    public static int gcd(int a,int b)
    {
        if (b==0)
            return a;
        else return gcd(b,a%b);
    }
    //求最小公倍数
    public static int Lvm(int a,int b)
    {
       return (a * b)/gcd(a,b);
    }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 32;
        int gcd = gcd(num1,num2);
        System.out.println(gcd);
        int lvm = Lvm(num1,num2);
        System.out.println("最小公倍数"+lvm);

    }
}
