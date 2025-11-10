package cond;

public class CoundOp2
{
    public static void main(String[] args) {
        int age = 17;
        String status = (age >= 18) ? "성인" : "미성년자";
        // age가 18보다 크거나 같니? / 맞으면 성인 / 아니면 미성년자

        System.out.println("age = " + age + ", status = " + status);
    }
}
