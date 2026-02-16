//Function overloading - Either argument should be different or argument data type should be different.

public class Overloading
{
    public void getdata(int a)
    {
        System.out.println(a);
    }
    public void getdata(String b)
    {
        System.out.println(b);
    }
    public void getdata(int a, int b)
    {
        System.out.println(b);
    }

    public static void main(String[] args){
        Overloading c = new Overloading();
        c.getdata(2);
        c.getdata("Hello");
        c.getdata(3, 4);

    }
}
