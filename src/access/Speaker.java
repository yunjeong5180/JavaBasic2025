package access;

public class Speaker
{
    // 해당 클래스 내부에서만 호출하도록 설정, 모든 외부 호출은 막는다.
    private int volume;

    // default(public-private): 같은 패키지 안에서 호출은 허용
//    int volume;

    // 생성자 - 초기 볼륨값을 받음
    Speaker(int volume) {
        this.volume = volume;
    }

    // 
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    // 현재 음량 출력
    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }

}
