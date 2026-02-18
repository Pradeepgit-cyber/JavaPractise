public class childDemo extends parentDemo {
    String name = "child";
    public void getName()
    {
        System.out.println(name);
        System.out.println(super.name);
    }
    public void parentMethod()
    {
        super.parentMethod();
        System.out.println("This is child method");
    }
    public static void main(String[] args)
    {
        childDemo child = new childDemo();
        child.getName();
        child.parentMethod();

    }
}
