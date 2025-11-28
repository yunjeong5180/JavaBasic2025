package static2;

public class DecoData
{
    private int instanceValue;
    private static int staticValue;

    public static void staticCall()
    { // static은 static만 접근 가능 / static이 없는 인스턴스 변수나, 인스턴스 메서드에 접근하면 컴파일 요류가 발생
//        instanceValue++; // 인스턴스 변수 접근, compile error
//        instanceMethod(); // 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instaticCall()
    { // 밖에서는 static에 접근이 가능하다! /
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceMethod=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticMethod=" + staticValue);
    }




}
