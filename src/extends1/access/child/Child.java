package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent
{ // 자식 클래스
    public void call() 
    { // 부모(parent.class)에 있는거 가져다 쓰기
        publicValue = 1;
        potectedeValue = 1; // 상속관계 or 같은 패키지
        // defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류
        // privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속관계 or 같은 패키지
        //defaultMethod(); // 다른 패키지 접근 불가, 컴파일 오류
        //privateMethod(); // 접근 불가, 컴파일 오류

        printParent();
    }
}
