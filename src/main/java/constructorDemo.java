//Constructor is a special method used to initialize object data automatically when an object is created.

public class constructorDemo {
// Default constructor
    public constructorDemo()
    {
        System.out.println("This is a constructor");
    }

//    Paremtrized constructor
    public constructorDemo(int a, int b)
    {
        System.out.println("This is a parametrized constructor");
    }
    public constructorDemo(String str)
    {
        System.out.println(str);
    }


    public void getData()
    {
        System.out.println("This is a method");
    }

    public static void main(String[] args)
    {
//        can create multiple objects of the same class and call the constructor
        constructorDemo cd = new constructorDemo();
        constructorDemo c = new constructorDemo(4,5);
        constructorDemo str = new constructorDemo("Hello World");


    }


}
