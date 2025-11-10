package casting;

public class Casting4
{
    public static void main(String[] args) {
        int div1 = 3 / 2; // 1.5
        System.out.println("div1 = " + div1); // 1

        double div2 = 3 / 2; // 1.0 ??
        System.out.println("div2 = " + div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3); // 1.5

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b; // int형의 나눗셈인데, 먼저 double형으로 casting하고 나눗셈을 한다.
        System.out.println("result = " + result);

        // 공부를 할 때 대 원칙을 기준을 잡고 하면, 대원칙을 기준으로 풀 수 있다.
        //
    }
}
