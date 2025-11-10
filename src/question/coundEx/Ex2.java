package question.coundEx;

public class Ex2
{ // 학점 계산하기
    // 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
        //90점 이상: "A"
        //80점 이상 90점 미만: "B"
        //70점 이상 80점 미만: "C"
        //60점 이상 70점 미만: "D"
        //60점 미만: "F"
    //점수는 변수( int score )로 지정하고, 해당 변수를 기반으로 학점을 출력하자.

    public static void main(String[] args)
    {
        int score = 99;

        String grade;
        switch (score) {
            case 1 :
              grade = "A";
              break;
            case 2 :
                grade = "B";
                break;
            case 3 :
                grade = "C";
                break;
            case 4 :
                grade = "D";
                break;
            default:
                grade = "F";
        }
    }
}



