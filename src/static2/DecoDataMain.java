package static2;

public class DecoDataMain
{
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); // 클래스 자체에서 호출

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData(); // 인스턴스 생성
        data1.instaticCall(); // 생성된 인스턴스 호출

        System.out.println("3. 인스턴스 호출1");
        DecoData data2 = new DecoData();
        data2.instaticCall();
    }
}
