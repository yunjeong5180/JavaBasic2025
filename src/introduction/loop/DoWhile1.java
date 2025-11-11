package introduction.loop;

public class DoWhile1
{// do-while 문은 최초 한번은 코드 블럭을 꼭 실행해야 하는 경우에 사용하면 된다
    // do-while 문은 while 문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
    public static void main(String[] args)
    {
        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는 = " + i);
            i++;
        }
    }
}
