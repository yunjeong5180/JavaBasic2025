package operator;

public class OperatorAdd1
{ // 증감 연산자
    // 증가 및 감소 연산자를 줄여서 증감 연산자라 한다.
    //증감 연산자는 ++ 와 -- 로 표현되며, 이들은 변수의 값을 1만큼 증가시키거나 감소시킨다.
    //프로그래밍에서는 값을 1씩 증가하거나 1씩 감소할 때가 아주 많기 때문에 이런 편의 기능을 제공한다.

    public static void main(String[] args)
    {
        int a = 0;
        
        a = a + 1;
        System.out.println("a = " + a); // 1

        a = a + 1;
        System.out.println("a = " + a); // 2

        // 증감 연산자
        // 정리하면, 해당 변수에 들어있는 숫자 값을 하나 증가하는 것
        ++a; // a = a + 1, 변수 안에 있는 값을 증갑해주는 것
        System.out.println("a = " + a); // 3
        ++a; 
        System.out.println("a = " + a); // 4


        --a;
        System.out.println("a = " + a); // 3
    }
}
