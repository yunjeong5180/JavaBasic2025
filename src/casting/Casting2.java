package casting;

public class Casting2
{// 자바에서 변수의 값을 바꾸는 유일한 방법은 대입연산자를 사용할 때!

    public static void main(String[] args)
    {
         double doubleValue = 1.5;
         int intValue = 0;

//         intValue = doubleValue; // 컴파일 오류 발생
         intValue = (int) doubleValue; // (명시적) 형변환
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
