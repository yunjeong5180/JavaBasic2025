package question.operatorEx;

public class Ex5
{ // 산술 연산자 문제
    // 두 정수 변수 a와 b가 있습니다. a는 25, b는 7입니다.
    //a를 b로 나눈 몫을 구하여 int 변수 quotient에 저장하고, 결과를 출력하세요.
    //a를 b로 나눈 나머지를 구하여 int 변수 remainder에 저장하고, 결과를 출력하세요.

    public static void main(String[] args)
    {
        int a = 25;
        int b = 7;

        int quotient = a / b; // a를 b로 나눈 몫
        System.out.println("quotient = " + quotient);

        int remainder = a % b; // a를 b로 나눈 나머지
        System.out.println("remainder = " + remainder);

    }
}
