package introduction.scope;

public class Scope3_1
{ // if의 조건이 맞으면 m의 값을 2배로 출력
    // 여기서 2배 증가한 값을 저장해두기 위해 임시 변수 temp 를 사용했다.
    // 그런데 이 코드는 좋은 코드라고 보기는 어렵다.
    // 왜냐하면 임시 변수 temp 는 if 조건이 만족할 때 임시로 잠깐 사용하는 변수이다.
    // 그런데 임시 변수 temp main() 코드 블록에 선언되어 있다. 이렇게 되면 다음과 같은 문제가 발생한다.
        // 비효율적인 메모리 사용 = temp 는 if 코드 블록에서만 필요하지만, main() 코드 블록이 종료될 때 까지 메모리에 유지된다.
        // 코드 복잡성 증가 = 좋은 코드는 군더더기 없는 단순한 코드이다.

    public static void main(String[] args)
    {
        int m = 10;
        int temp = 0;
        if (m > 0)
        {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
    
}
