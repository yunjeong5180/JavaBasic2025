package question.operatorEx;

public class Ex6
{ //  증감 연산자 문제
    // 변수 x는 10입니다. 다음 두 연산 후 x의 최종 값과 각 연산의 결과를 출력하세요.
    //int y = ++x;
    //int z = x++;

    public static void main(String[] args)
    {
        int x = 10;

        int y = ++x; // x:11, y:11 (a의 값을 먼저 증가 시키고, 그 결과를 y에 대입)
        System.out.println("x = " + x + ", y = " + y); 

        int z = x++; // z:11, x:12 (a의 현재 값을 z에 먼저 대입하고, 그 후에 a 값을 증가시킴)
        System.out.println("z = " + z + ", x = " + x);
        
        System.out.println("x의 최종 값 = " + x); //13



    }

}
