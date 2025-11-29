package static2.ex;

public class MathArrayUtils
{ // 요구사항
    // MathArrayUtils는 객체를 생성하지 않고 사용해야 한다.
    // 누군가 실수로 MathArraayUtils의 인스턴스를 생성하지 못하게 막아야 한다.
    // 실행 코드에 static, import를 사용해도 된다.

    private MathArrayUtils() {
        // private 인스턴스 생성을 막는다.
    }

    //배열의 모든 요소를 더하여 합계를 반환
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    // 배열의 모든 요소의 평균값을 계산
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    // 배열에서 최소값을 찾는다.
    public static int min(int[] values) {
        int minvalue = values[0];
        for (int value : values) {
            if (value < minvalue) {
                minvalue = value;
            }
        }
        return minvalue;
    }

    // 배열에서 최대값을 찾는다.
    public static int max(int[] values) {
        int maxvalue = values[0];
        for (int value : values) {
            if (value > maxvalue) {
                maxvalue = value;
            }
        }
        return maxvalue;
    }









}
