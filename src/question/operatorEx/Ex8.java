package question.operatorEx;

public class Ex8
{ // 관계 및 논리 연산자 문제
    // 변수 p는 15, q는 20입니다. 다음 논리 표현식의 결과를 출력하세요.
    //p > 10 && q < 25  -> 둘 참, 하나 거짓
    //p == 15 || q > 30 -> 하나 참, 둘 거짓
    //!(p < 10) -> 반대

    public static void main(String[] args) 
    {
        int p = 15, q = 20;
        boolean and =  p > 10 && q < 25; // true (p는 10보다 큼(참), q는 25 작음(참)
        System.out.println("and = " + and);

        boolean or = p == 15 || q > 30; // true (p는 15와 같다(참), q는 30보다 작다(거짓)
        System.out.println("or = " + or);

        boolean denial = !(p < 10); // true (p는 10보다 크다 하지만 반대로
        System.out.println("denial = " + denial);

    }

}
