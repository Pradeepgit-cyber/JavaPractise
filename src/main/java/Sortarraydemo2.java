// This program demonstrates how to swap two numbers without using a temporary variable.

public class Sortarraydemo2 {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 4;

        a = a + b; // a = 5 + 4 = 9
        b = a - b; // b = 9 - 4 = 5
        a = a - b; // a = 9 - 5 = 4

        System.out.println(a);
        System.out.println(b);
    }
}

