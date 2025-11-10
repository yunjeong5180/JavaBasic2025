package array;

public class ArrayDi4
{
    public static void main(String[] args)
    { // 구조 개선 - 초기화, 배열의 길이

        // 2x3 2차원 배열, 초기화
        int [][] arr = new int [10][10];

        int i = 1;
        for (int row = 0; row < arr.length; row++)
        {
            for (int column = 0; column < arr[row].length; column++)
            {
                arr[row][column] = i++;
            }
        }

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++)
        {
            for (int column = 0; column < arr[row].length; column++)
            {
                System.out.print(arr[row][column] + " "); // 0열 출력
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
