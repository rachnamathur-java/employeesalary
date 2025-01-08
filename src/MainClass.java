class A
{
    int i = 1;
    {
        System.out.println("inside A");
    }
}

class B extends A
{
    int i = 20;
    {
        System.out.println("inside B");
    }
}
class C extends B
{
    int i =30;
    {
        System.out.println("inside C");
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        A ab = new B();
        /*A a = new A();

        A abc = new C();
        B b = new B();
        B bc =new C();
        C c = new C();*/

        //System.out.println(a.i);
        System.out.println(ab.i);
        /*System.out.println(abc.i);
        System.out.println(b.i);
        System.out.println(bc.i);
        System.out.println(c.i);*/
    }
}
