package casting;

public class Casting3
{// 자바에서 변수의 값을 바꾸는 유일한 방법은 대입연산자를 사용할 때!
    
    public static void main(String[] args)
    { // 오버플로우가 발생하면 안된다. 발생하지 않게 타입을 변경하면 된다.

        long maxIntValue = 2147483647; // int의 최고값
        long maxIntOver = 2147483648L; // int의 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue);
    }
}
