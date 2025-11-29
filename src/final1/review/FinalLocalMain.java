package final1.review;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // 컴파일 오류

        // final 지역변수2
        final int data2 = 10;
//        data2 = 20; // 컴파일 오류

        method(10); // 최초의 값으로 할당됨
    }

    static void method(final int parameter) {
//        parameter = 20 // 컴파일 오류 -> method 호출하면서 할당된 값이 최초의 값이므로 컴파일 오류남
    }
}
