package PPT5_类和对象;
//定义一个圆形类，其属性包含圆心坐标、半径，并定义无参和带参数的构造方法
class circle
{
    //1. 圆心坐标：可以用两个double类型表示，分别代表x和y坐标，或者用一个Point类。
    // 这里我们简单用两个double：centerX和centerY。
    private double cenX;
    private double cenY;
    private double rds; // 半径
    //无参构造方法
    public  circle()
    {
        //创建默认圆形
        cenX = 0;
        cenY = 0;
        rds = 1;
    }
    //有参构造方法
    public circle(double cenX, double cenY, double rds)
    {
        this.cenX = cenX;
        this.cenY = cenY;
        this.rds = rds;
    }
    //计算周长
    public  double getzhouchang()
    {
        return 2*Math.PI*rds;
    }
    //计算面积
    public double getmainji()
    {
        return Math.PI*rds*rds;
    }
}

public class T2 {
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle(2,3,2);
        System.out.println("周长："+c1.getzhouchang());
        System.out.println("周长："+c2.getzhouchang());
        System.out.println("面积："+c1.getmainji());
        System.out.println("面积："+c2.getmainji());

    }

}
