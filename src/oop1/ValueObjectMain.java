package oop1;

public class ValueObjectMain
{
    public static void main(String[] args)
    {
        ValueData valueData = new ValueData(); //  객체 생성으로 멤버변수 + 메서드 사용 가능

        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자= " + valueData.value);

    }


}
