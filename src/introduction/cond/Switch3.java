package introduction.cond;

public class Switch3
{
    public static void main(String[] args)
    { //grade 1:1000, 2:2000, 3:3000, 나머지: 500
        int grade = 3;

        int coupoun;
        switch (grade) {
            case 1:
                coupoun = 1000;
                break;
            case 2:
            case 3:
                coupoun = 3000;
                break;
            default:
                coupoun = 500;
        }
        System.out.println("발급받은 쿠폰: " + coupoun);
    }
}
