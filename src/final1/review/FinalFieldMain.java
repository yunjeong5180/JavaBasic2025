package final1.review;

public class FinalFieldMain 
{
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
//        ConstructInit constructInit2 = new ConstructInit(30); 이미 constructInit2 라는 상수에는 값이 할당되었기에 값 변경이 불가하므로 컴파일 오류
        System.out.println("construnt1=" + constructInit1.value);
        System.out.println("construnt2=" + constructInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("FieldInit1=" + fieldInit1.value);
        System.out.println("FieldInit2=" + fieldInit2.value);
        System.out.println("FieldInit3=" + fieldInit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
