package static2;

//import static static2.DecoData.staticCall;
//import static static2.DecoData.*;

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


        // 추가
        // 인스턴스를 통한 접근 -> 권장하지 않음
        DecoData data3 = new DecoData();
        data3.staticCall(); // 인스턴스에 들렸다가 static영역임을 확인하고 static으로 보냄

        // 클래스를 통한 접근 -> 맞는 접근법
        DecoData.staticCall();
    }
}
