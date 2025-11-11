package introduction.casting;

public class Casting1
{
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // 작은 그릇을 큰그릇에 넣기
        longValue = intValue; // int -> long
        System.out.println("doubleValue = " + longValue);

        // 작은 그릇을 큰 그릇에 넣기
        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
