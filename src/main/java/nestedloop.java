public class nestedloop {
    public static void main(String[] args)
    {
        for (int i=1; i<=4; i++)
        {
            System.out.println("Outer loop started");
            for (int j=1; j<=3; j++)
            {
                System.out.println("Inner loop started");
            }
            System.out.println("Outer loop ended");



        }

    }
}
