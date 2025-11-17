package method2;

public class Method1Ref
{ // 같은 연상 수행하는 코드

    public static void main(String[] args)
    {
        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과1 출력: " + sum1);

        System.out.println("=======================");

        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력: " + sum2);
    }

    // add 메서드 만들기
    public static int add(int a, int b)
    {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b; // 연산 수행 후 결과를 sum에 담기
        return sum; // 결과 돌려주기
    }
}
