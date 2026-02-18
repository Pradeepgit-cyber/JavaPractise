//this keyword is a reference variable in Java that refers to the current object. It is used to differentiate between instance variables and local variables when they have the same name. It can also be used to call other constructors in the same class.
public class thisDemo {
    int num = 10;
    public void getNum()
    {
        int num = 20;
        int sum = num + this.num;
        System.out.println("Local variable num: " + num);
        System.out.println("Instance variable num: " + this.num);
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        thisDemo demo = new thisDemo();
        demo.getNum();
    }


}
