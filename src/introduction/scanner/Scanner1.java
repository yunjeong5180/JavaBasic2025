package introduction.scanner;

import java.util.Scanner;

public class Scanner1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 입력을 String으로 가져온다.

        System.out.println("입력한 문자열: " + str);

        // .next() -> 공백을 기준으로 한 단어 또는 한 문자씩 입력받는다.
        // .nextLine() -> 문자 또는 엔터를 치기 전까지의 문장 전체 입력 받음

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
