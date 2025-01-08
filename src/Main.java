class X
{
    public X(int i)
    {
        System.out.println(i);
    }
}

class Y extends X
{
    public Y()
    {
       super(10);
        System.out.println(2);
    }
}