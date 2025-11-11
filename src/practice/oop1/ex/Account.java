package practice.oop1.ex;

public class Account
{
    int balance; // 금액

    // 입금 메서드
    void deposit(int amount)
    { // 입금시 잔액 증가
        balance += amount;
    }

    // 출금 메서드
    void withdraw(int amount) 
    { // 출금시 잔액 감소, 만약 부족하면 잔액 부족을 출력
        if (balance >= amount)
        {
            balance -= amount;
        } else
        {
            System.out.println("잔액 부족");
        } 
    }

}
