package class1;

public class ClassStart3
{ // 클래스를 사용하면 타입을 만들 수 있다.
    //예) 학생을 관리하는 타입 = Student();
    // 설계도 + 틀 = 클래스
    // 설계도 + 틀을 통해 만들어진 실체 = 객체, 인스턴스

    public static void main(String[] args) 
    { // 객체 생성 및 변수 대입
        Student student1; // 학생을 담아두는 변수 선언 = student 타입의 객체를 받을 수 있는 변수 선언
        student1 = new Student(); // 학생을 실제 메모리에 만듬 (인스턴스1) =
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // (인스턴스2)
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 학점:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 학점:" + student2.grade);

    }
}
