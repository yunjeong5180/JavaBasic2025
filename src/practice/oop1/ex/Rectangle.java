package practice.oop1.ex;

public class Rectangle 
{ // 속성 + 기능 = 객체를 제공
    int width;
    int height;

    // 계산지역
    int calculateArea() {
        return width * height;
    }

    // 계산경계
    int calculatePerimeter() {
        return 2* (width + height);
    }

    // 정사각형
    boolean isSquare() {
        return width == height;
    }
    
}
