package PPT5_类和对象;

//static 静态关键字
//说明：用来区分类和对象用的。
//加不加static通过类的属性是一个还是多个来判断
// 被static修饰的成员属于类，类成员，静态成员，通过类.成员方式来调用
//不被static修饰的成员属于对象，对象成员，非静态成员，通过对象.成员调用
//静态成员可以被所有对象引用或者说共享
public class T4 {

        static  int a = 2;
        static  void m(){
            System.out.println(20);
        }

        int b = 10;
        void m1()
        {
            System.out.println(30);
        }


        public static void main(String[] args) {
        System.out.println(T4.a);
        T4.m();

        //创建对象
        T4 t = new T4();
        System.out.println(t.b);
        t.m1();
        //静态成员可以被所有对象引用或者说共享
        t.m();
            System.out.println(A.c);//调用的T3中的A类

    }

    }

