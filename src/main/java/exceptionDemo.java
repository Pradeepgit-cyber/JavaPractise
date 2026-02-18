//one try block can have multiple catch blocks to handle different types of exceptions.
// The finally block is optional and will always execute regardless of whether an exception was thrown or caught.
//Common exceptions include ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.
//ArithmeticException occurs when an illegal arithmetic operation is performed, such as division by zero.
//NullPointerException occurs when an application attempts to use null in a case where an object is required.
//ArrayIndexOutOfBoundsException occurs when an array has been accessed with an illegal index, either negative or greater than or equal to the size of the array.


public class exceptionDemo {
    public static void main(String[] args) {
        try
        {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw ArithmeticException

            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero ");
        }
        try {
            int arr[] = new int[5];
            arr[10] = 50; // This will throw ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds");

        }
        finally
        {
            System.out.println("This block will always execute.");
        }
    }
}
