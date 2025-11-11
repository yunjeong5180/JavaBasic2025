package introduction.array;

public class EnhancedFor1
{// 향상된 for문
    // 앞서 반복문에서 설명하지 않은 내용이 하나 있는데, 바로 향상된 for문(Enhanced For Loop)이다.
    // 향상된 for문을 이해하려면 배열을 먼저 알아야 한다. 각각의 요소를 탐색한다는 의미로 for-each문이라고도 많이 부른다.
    //향상된 for 문은 배열을 사용할 때 기존 for 문 보다 더 편리하게 사용할 수 있다.

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++)
        {
            int number = numbers[i]; // numbers에서 값을 1개씩 꺼내서 number에 넣기
            System.out.println(number);
        }

        // 향상된 for문, for-each문 -> 실무에서 많이 사용하는 for문
        for (int number : numbers)
        {
            System.out.print(number);
        }

        System.out.println(); // 줄바꿈

        // for-each문을 사용할 수 없는 경우 -> 증가하는 index 값이 필요
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

    }
}
