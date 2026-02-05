//Overloading means same method name under a class but with differet parameters or values

public class Overloading {
    static void add(int a, int b){
        System.out.println(a + b);
    }
    static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
    static void add(double a, double b){
        System.out.println(a + b);
    }

    public static void main(String[] args){
        add(5, 3);
        add(10, 15);
        add(20, 30);
    }

}
