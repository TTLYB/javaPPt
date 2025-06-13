package PPT3;
//文钱可以买一只公鸡，3文钱可以买一只母鸡，1文钱可以买3只雏鸡。现在用100文钱买100只鸡
public class test5 {
    public static boolean chickenSum(int x,int y,int z) {
        if (5 * x + y * 3 + (z-z%3) / 3 == 100 && x + y + z == 100) {
            return true;
            //  System.out.println(x + "只公鸡" + y + "只母鸡" + z + "只小鸡");
        } else
            return false;
    }

    public static void main(String[] args) {
        for (int a = 0; a < 20; a++) {
            for (int b = 1; b < 30; b++) {
                for (int c = 3; c < 100; c=c+3) {

                    if(chickenSum(a, b, c)) {
                        System.out.println(a + "只公鸡" + b + "只母鸡" + c + "只小鸡");
                    }
                }
            }
        }

    }
}

