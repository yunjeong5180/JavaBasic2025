package memory;

public class JavaMemortMain
{
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");

    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2; // main에서 넘어온 값에 곱하고 cal에 넣어서 m2로 넘긴다.
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");

    }
}
