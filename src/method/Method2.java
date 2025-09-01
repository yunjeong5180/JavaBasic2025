package method;

public class Method2
{ // 매개변수가 없거나 반환 타입이 없는 경우
    public static void main(String[] args) {
        printHeader();
        System.out.println("  프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프린트를 시작합니다 =");
        return;
    }

    public static void printFooter() {
        System.out.println("= 프러그램을 종요합니다 =");
        return;
    }
}
