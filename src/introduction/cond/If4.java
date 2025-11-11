package introduction.cond;

public class If4
{ // else if
    //당신은 연령에 따라 다른 메시지를 출력하는 프로그램을 작성해야 한다.
    //이 프로그램은 int age 라는 변수를 사용해야 하며, 연령에 따라 다음의 출력을 해야 한다.
    //else if 를 사용해서 완성해보자.

    public static void main(String[] args)
    {
        int age = 5;


        if (age <= 7) // 7세 이하일 경우: "미취학"
        {
            System.out.println("미취학");
        } else if (age <= 13) //8세 이상 13세 이하일 경우: "초등학생"
        {
            System.out.println("초등학생");
        } else if (age <= 16) //14세 이상 16세 이하일 경우: "중학생"
        {
            System.out.println("중학생");
        } else if (age <= 19) //17세 이상 19세 이하일 경우: "고등학생"
        {
            System.out.println("고등학생");
        } else if (age >= 20) //20세 이상일 경우: "성인"
        {
            System.out.println("성인");
        }

    }

}
