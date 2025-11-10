package operator;

public class Logical2
{ // 논리 연산자 활용
    //논리 연산자를 활용하는 다음 코드를 만들어보자.
    //변수 a 가 10 보다 크고 20 보다 작은지 논리 연산자를 사용해서 확인해보자.

    public static void main(String[] args)
    {
        int a = 15;
        // a는 10보다 크고 20보다 작다
//        boolean result = a > 10 && a < 20; // true
        boolean result = 10 < a && a < 20; // true
        System.out.println("result = " + result);

    }
}
