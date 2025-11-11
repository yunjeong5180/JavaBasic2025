package introduction.loop;

public class For2
{// i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i ~ endNum 더하기)

    public static void main(String[] args)
    {
        int sum = 0; // 누적할 값
        int endNum = 3; // 조건 값

        for (int i = 1; i <= endNum; i++)
        {
            sum = sum + i;
            System.out.println("i= " + i + " sum= " + sum);
        }
    }

}
