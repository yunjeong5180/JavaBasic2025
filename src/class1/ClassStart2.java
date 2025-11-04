package class1;

public class ClassStart2
{ // 학생 정보 출력 프로그램 만들기
    // 요구 사항:
    //1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
    //2. 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
    //3. 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다: "이름: [이름] 나이: [나이] 성적: [성적]"
    //4. 배열을 사용하자

    public static void main(String[] args)
    {
        String[] studentNames = {"학생1", "학생2", "학생3"};
        int[] studentAges = {15,16, 17};
        int[] studentGrades = {90, 80, 70};

        for (int i = 0; i < studentNames.length; i++)
        {
            System.out.println("이름:" + studentNames[i] + ", 나이:" + studentAges[i] + ", 성적:" + studentGrades[i]);
        }


    }

}
