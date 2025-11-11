package introduction.operator;

public class Operator2
{ // 문자열 더하기
    // 자바는 특별하게 문자열에도 + 연산자를 사용할 수 있다.
    // 문자열에 + 연산자를 사용하면 두 문자를 연결할 수 있다
    // 자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다.
    // 쉽게 이야기해서 문자열에 더하는 것은 다 문자열이 된다.

    public static void main(String[] args)
    {
        // 1. 문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println("1. " + result1); // 출력 값 (1. hello world)

        // 2. 문자열과 문자열 더하기2
        String s1 = "string1 ";
        String s2 = "string2";
        String rerult2 = s1 + s2;
        System.out.println("2. " + rerult2); // 출력 값 (2. string1 string2)

        // 3. 문자열과 숫자 더하기1
        String result3 = "a + b = " + 10; // 숫자 10을 문자열로 변환해버림
        System.out.println("3. " + result3); // 출력 값 (3. a + b = 10)

        // 4. 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println("4. " + result4); // 출력 값 (4. a + b = 20)

    }
}
