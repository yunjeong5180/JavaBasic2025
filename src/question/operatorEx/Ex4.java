package question.operatorEx;

public class Ex4
{ // 사탕 나눠주기
    // 목표: 산술 연산자, 특히 나눗셈(/)과 나머지(%) 연산자의 사용법을 익힙니다.
    // sweets라는 변수에 사탕의 총 개수가, students라는 변수에 학생 수가 할당되어 있습니다.
    // 각 학생에게 사탕을 똑같이 나누어 줄 때, 한 학생이 받게 될 사탕의 수와 나누어 주고 남은 사탕의 수를 계산하여 출력하는 코드를 작성하세요.

    public static void main(String[] args)
    {
        int sweets = 365;
        int students = 30;

        int candyPerStudent = sweets / students; // 한 학생이 받게 될 사탕의 수
        int remainingSweets = sweets % students; // 나누어 주고 남은 사탕의 수

        System.out.println("candyPerStudent = " + candyPerStudent);
        System.out.println("remainingSweets = " + remainingSweets);
    }
}
