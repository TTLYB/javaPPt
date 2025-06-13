package PPT4;

import java.util.Scanner;

//public String( )：创建一个空的字符串
//public String( String  original ) ：利用一个已经存在的字符串创建一个新的 String对象，其字符序列与参数相同
//public String( StringBuffer  buffer )：利用一个已经存在的可变字符串创建 String对象，其字符序列与参数相同。
//public String( char[] value )：利用一个已经存在的字符数组创建 String对象，其字符序列与参数相同
public class test2_string {
    public static void main(String[] args) {
        //创建字符转数组
        String S = new String("ABC");
        //获取字符段长度的方法 -public int length(): 获取字符段长度
        //数据提取方法
        //-public char charAT(int index):返回字符串中指定位置的字符
        //-public String substring(int beginIndex, int endIndex)：-返回字符串中从beginIndex至endIndex-1上的子串
        //public String substring(int beginIndex)：返回字符串中从beginIndex至字符串结尾的子串

        //分割字符串
        String s = "i,will,kill you";
        String[] res = s.split(" ");
        for(String str : res)
            System.out.println(str);
    }
}
