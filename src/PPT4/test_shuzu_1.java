package PPT4;

public class test_shuzu_1 {
    // 二维数组的输出（修正后）
    public static void P(int arr1[][]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " \t");
            }
            System.out.println();
        }
    }

    // 求数组的最大值和最小值（添加安全检查）
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6,8}, {7, 8, 9}};

        // 求一维数组的最大最小值
        if (arr.length == 0) {
            System.out.println("数组为空！");
        } else {
            int min = arr[0];
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) min = arr[i];
                if (arr[i] > max) max = arr[i];
            }
            System.out.println("最大值: " + max);
            System.out.println("最小值: " + min);
        }

        // 输出二维数组
        System.out.println("\n二维数组输出:");
        P(arr1);
    }
}