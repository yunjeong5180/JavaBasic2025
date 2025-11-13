package practice.construct;

public class MemberConstruct
{
    String name;
    int age;
    int grade;

    //추가 -> 생성자 오버로딩
    MemberConstruct(String name, int age)
    {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        // 변경된 코드
        this(name, age, 60);
    }

    // 생성자 -> 클래스와 이름이 같아야 한다. 반환 타입이 없다.
    MemberConstruct(String name, int age, int grade)
    {
        System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
