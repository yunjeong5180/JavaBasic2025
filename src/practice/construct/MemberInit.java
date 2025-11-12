package practice.construct;

public class MemberInit
{
    String name;
    int age;
    int grade;

    // 추가 - this = 내 인스턴스의 이름, 나이, 학점을 선택하게 된다.
    void initMember(String name, int age, int grade)
    { // member의 초기값 설정하는 메서드

        // this는 인스턴스 자신을 가리킨다.
        // 매개변수의 이름과 맴버 변수의 이름이 같은 경우 this를 사용해서 둘을 명확하게 구분해야 한다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
