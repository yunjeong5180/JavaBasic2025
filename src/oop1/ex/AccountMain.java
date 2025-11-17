package oop1.ex;

public class AccountMain
{
    public static void main(String[] args)
    {
        Account account = new Account();
        account.deposit(10000); // 입금
        System.out.println("입금 후  잔고: " + account.balance);
        account.withdraw(9000); // 출금
        System.out.println("출금 후  잔고: " + account.balance);
        account.withdraw(2000); // 출금
        System.out.println("현재 잔고: " + account.balance);
    }
}
