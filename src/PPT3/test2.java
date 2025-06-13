package PPT3;
import java.util.Scanner;
import java.util.Random;//随机生成整数
//随机生成数字来猜
//
public class test2 {
    public static void main(String[] args) {
        //创建随机数生成器
        Random rand = new Random();
        //生成1-100之间的随机整数
        int secretNUmbers = rand.nextInt(100) + 1;
        //创建扫描器读取用户输入
        Scanner sc = new Scanner(System.in);
        int gussescount = 0;//记录猜测次数
        int uesrgusses = 0; //存储猜测数字
        System.out.println("you have can Enter the secret number: 1-100");
        do{
            System.out.println("Enter the secret number: ");
            uesrgusses = sc.nextInt();//读取输入的整数
            gussescount++;
            if(uesrgusses < secretNUmbers){
                System.out.println("太小了");

            }
            else if (uesrgusses > secretNUmbers){
                System.out.println("太大了");
            }
            else{
                System.out.println("猜对了");
                System.out.println("数字是"+uesrgusses);
                System.out.println("你一共菜了"+gussescount + "次");
            }
        }while(uesrgusses != secretNUmbers);//猜错时继续循环

      sc.close();

    }
}
