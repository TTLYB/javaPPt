package PPT3;
//打印1000以内所有水仙花数 各数字立方等于其本身
public class test4 {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++)
                for (int k = 0; k <= 10; k++) {
                    sum = i * 100 + j * 10 + k;
                    if(sum == i*i*i+j*j*j+k*k*k)
                        System.out.println(i*i*i+j*j*j+k*k*k+" YES");
                }
        }
    }
}
