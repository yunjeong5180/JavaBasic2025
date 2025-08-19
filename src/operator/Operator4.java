package operator;

public class Operator4
{// 연산자 우선순위2
    // 연산자 우선순위가 애매하거나 조금이라도 복잡하다면 언제나 괄호를 고려하자!

    // 정리
    //연산자 우선순위는 상식선에서 생각하고, 애매하면 괄호를 사용하자
    //누구나 코드를 보고 쉽고 명확하게 이해할 수 있어야 한다.
    //개발자들이 연산자 우선순위를 외우고 개발하는 것이 아니다! 복잡하면 명확하게 괄호를 넣어라!
    //개발에서 가장 중요한 것은 단순함과 명확함이다! 애매하거나 복잡하면 안된다.

    public static void main(String[] args)
    {
        int sum3 = 2 * 2 + 3 * 3; // ((2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3과 같다
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
