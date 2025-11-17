package oop1.ex;

public class RectangleProceduralMain
{ // 사용
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        // 영역
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        // 둘레
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        // 정사각형
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);


    }


}
