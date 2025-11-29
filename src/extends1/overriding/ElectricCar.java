package extends1.overriding;

public class ElectricCar extends Car
{
    @Override // 이 애노테이션은 상위 클래스의 메서드를 오버라이드한 것임을 나타낸다.
    public void move()
    { // 메서드 오버라디딩으로 부모(Car.class)에 있던 move() 기능을 재정의함
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
