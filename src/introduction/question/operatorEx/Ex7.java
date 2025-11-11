package introduction.question.operatorEx;

public class Ex7
{ // 복합 할당 연산자 문제
    // 변수 num은 5입니다. 다음 코드를 실행했을 때 num의 최종 값을 출력하세요.
    //num += 3;
    //num *= 2;
    //num %= 7;

    public static void main(String[] args)
    {
        int num = 5;
        num += 3;
        System.out.println("num = " + num); // 8(5 + 3)
        num *= 3;
        System.out.println("num = " + num); // 24(8 * 3)
        num %= 3;
        System.out.println("num의 최종 값 = " + num); // 0(24 % 3)



    }

}
