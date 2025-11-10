package ref;

public class NullMain1
{
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);

        // 생성을 하면 참조값이 나온다.
        data = new Data();
        System.out.println("2. data = " + data);

        // 주소지 뺄거야,
        data = null;
        System.out.println("3. data = " + data);
    }
}
