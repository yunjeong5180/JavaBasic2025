package method;

public class MethodValue3
{
    public static void main(String[] args)
    {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1); // 계산된 값 받기
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }

    public static int changeNumber(int num2)
    {
       num2 = num2 * 2;
       return num2; // 계산된 값 더지기
    }

}
