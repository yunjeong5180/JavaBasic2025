package question.method;

public class Ex2_2
{
    public static void main(String[] args)
    {
        printMessage ("Hello, world!", 3);
        System.out.println();
        printMessage ("Hello, world!", 5);
        System.out.println();
        printMessage ("Hello, world!", 7);
    }

    public static void printMessage(String message, int times)
    {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

}
