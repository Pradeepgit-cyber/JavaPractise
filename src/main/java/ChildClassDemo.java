public class ChildClassDemo extends ParentclassDemo
{
    public void engine()
    {
        System.out.println("New Engine is implemented");
    }
    public void colour()
    {
        System.out.println(colour);

    }
    public static void main(String[] args)
    {
        ChildClassDemo cd = new ChildClassDemo();
        cd.colour();
        cd.Brakes();



    }
}
