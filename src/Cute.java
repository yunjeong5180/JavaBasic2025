import java.util.*;
import java.lang.*;
import java.io.*;

class Cute
{
    public static void main(String[] args)
    {
        Person 지민 = new Person("지민"); // 객체 생성 할 떄 이름을 전달해서 저장하는거지 각자. 객체 이름 메겨주는거.
        Person 지환 = new Person("지환");

        지민.walk();
        지환.walk();

        지민.hand();
        지환.hand();
    }
}

// 이게 사람 클래스.
// 모델 클래스라고 해. 사람을 구성하고 그 사람이 동작을 가지고있는 메서드를 생성하고 걷는다. 손을 흔든다. 뛴다 이런거.
class Person
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    public void walk()
    {
        System.out.println(name + "이(가) 걷는다.");
    }

    public void hand()
    {
        System.out.println(name + "이(가) 손을 흔든다.");
    }
}