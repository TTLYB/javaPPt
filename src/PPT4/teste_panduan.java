package PPT4;
import java.util.Arrays;  // 导入Arrays工具类

//冒泡排序
public class teste_panduan {
    //大小比较
    public static void compare(int a[])
    {
        for (int i = 0; i < a.length-1-i; i++) {
            int temp = 0;
            if (a[i] > a[i + 1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {15,6,12,18,36,45};
        compare(a);
        System.out.println(a);
    }
}
