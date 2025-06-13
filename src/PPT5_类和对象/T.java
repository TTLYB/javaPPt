package PPT5_类和对象;
//把一组相似对象的共同特征抽取出来并存储在一起，形成一个数据结构，就是类
//类是一个集合
//对象是集合中的一个具体的元素
//有参数构造方法
class Person
{
    String name;
    int age;
    public void sleep()
    {
        System.out.println("i want play game");
    }
    public void shout()
    {
        System.out.println("my si ji is wan dan");
    }

}
class xerson1
{
    String name;
    int age;
    xerson1(String n, int a)
    {
        name = n;
        age = a;
    }
}

//无参构造方法
class person1
{
    String name;
    int age;
    person1()
    {
        name = "GGB";
        age = 18;
    }
}
//构造函数例子改变
class xerson2
{
    private String name;
    private int age;
    public xerson2(String n, int a)
    {
        if (a>10)
        {
            this.name = n;
            this.age = a;
            System.out.println("wo de nian ling :"+age);
        }
        else
        {
            System.out.println("年龄必须大于十岁！！！！");
            System.exit(1);
        }
    }
    public xerson2(String n)
    {
        this(n,1);
    }
    public xerson2()
    {
        this("张北饿",19);
    }
}

public class T {
    public static void main(String[] args) {
        Person sc1 = new Person();
        Person sc2 = new Person();
        Person sc3 = new Person();

        xerson1 s1 = new xerson1("GGB1", 18);
        xerson1 s2 = new xerson1("GGB1", 19);
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.age);
        System.out.println(s2.age);

        person1 p1 = new person1();
        person1 p2 = new person1();
        System.out.println(p1.name);
        System.out.println(p2.age);
        sc1.age = 30;
        sc1.sleep();
        sc2.sleep();
        sc1.shout();
        sc2.shout();

        //xerson2
        xerson2 x1 = new xerson2("GGB2", 13);
        xerson2 x3 = new xerson2();
        // 当岁数小于1 时 程序会因为 System.exit(1); 强制终止，便不会进行下面的操作
        //throw new IllegalArgumentException("无效年龄: " + a);-抛出异常而不是终止就可以改变
        xerson2 x2 = new xerson2("北冰洋");

    }

}
