package PPT1;
//闰年判断

public class test4 {

    public boolean isLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int year = 2000;
        test4 test4 = new test4();
        System.out.println(test4.isLeapYear(year));
    }
}
