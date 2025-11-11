package introduction.loop;

public class Cuntinue1
{// 1부터 5까지 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어야 한다.
    public static void main(String[] args) {
        int i = 1;

        // i=1,2,3,4,5
        while (i <= 5)
        {
            // i가 3일 때 출력 건너뛰기!
            if (i == 3)
            {
                i++;
                continue; // if의 조건이 맞으면, 밑의 코드를 실행하는 것이 아닌, while의 조건으로 돌아간다.
            }
            System.out.println(i);
            i++;
        }
    }
}
