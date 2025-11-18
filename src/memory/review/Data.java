package memory.review;

public class Data
{
    private int value;

    // 생성자
    public Data(int value) {
        this.value = value;
    }

    // value가 프라이빗이기 때문에 외부 클래스에서 가져다 쓰는 위한 통로!!!!
    public int getValue() {
        return value;
    }

    
    // 연습
    public String setValue(int i) {
        value = i;

        return null;
    }
}
