package introduction.question.operatorEx;

public class Ex3
{ // 합격 범위
    // int 형 변수 score 를 선언하세요.
    //score 가 80점 이상이고, 100점 이하이면 true 를 출력하고, 아니면 false 를 출력하세요.

    public static void main(String[] args)
    {
        // 내가 푼거
        // int score = 99; // true
        // int score = 105; // false
        // boolean result = 80 <= score || score <= 100;

        // System.out.println("result = " + result);

        // 정답
//        int score = 80; // true
        int score = 101; // false

        boolean result = score >= 80 && score <= 100;
        System.out.println("result = " + result);
    }

}
