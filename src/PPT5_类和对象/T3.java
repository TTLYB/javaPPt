package PPT5_类和对象;

// 域分为 静态域和对象域
//静态域的访问 直接通过类名访问。（推荐方式） 通过类的某一对象访问
//static域在类加载时初始化；对象域只在创建对象时初始化。
//static域仅在类加载时初始化一次，与创建对象个数无关；每个对象都有其独立的对象域，因此每创建一个对象都要对其内的对象域进行初始化。
//static域初始化地点：在类中声明的同时进行初始---通过静态初始化器完成初始化
//定义静态属性的情况:所有对象的属性值都相同，在内存中只分配一份----作为全局变量使用
//static 域初始化例子
//静态方法无法操作对象，即不能在静态方法中访问实例域。这是因为静态方法没有this这个隐式参数

class A
{
    int i;
    static int j = 0;
    static char c;
    static {
        c = 'a';
    }
    A(int k)
    {
        i = k;
    }
}
public class T3 {

    public static void main(String[] args) {
        //第一条语句会加载类A,所以会初始化静态域
        A a = new A(10);
        A.j = 1;
        //A.c = 'b';
        A b = new A(20);
        System.out.println(A.c);
        System.out.println(A.j);
        System.out.println();
    }

}
