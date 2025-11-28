package static2;

public class DecoUtil2
{
    public static String deco(String str)
    { // static 가 붙음으로 정적 메서드가 된다.
        // 정적 메서드는 정적 변수처럼 인스턴스 생성없이 클래스 명을 통해서 바로 호출할 수 있다.
        String result = "*" + str + "*";
        return result;
    }
}
