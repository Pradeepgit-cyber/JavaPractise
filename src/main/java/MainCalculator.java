public class MainCalculator
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        cal.add(20, 20);
    }
}

class Calculator
{
    void add(int a , int b){
        System.out.println(a + b);
    }

}
