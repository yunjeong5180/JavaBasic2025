package final1;

public class ConstructInit 
{
    final int value;
    
    // final을 필드에서 사용할 경우 생성자를 통해서 사용가능 -> 초기값이 없는 경우 생성자에서 할당 가능
    public ConstructInit(int value) {
        this.value = value;
    }
}
