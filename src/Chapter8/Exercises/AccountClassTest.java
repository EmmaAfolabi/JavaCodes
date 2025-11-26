package Chapter8.Exercises;

import Chapter8.Date;

public class AccountClassTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        AccountClass accountClass = new AccountClass("Emma", "Bobo", birth, hire);
        System.out.println(accountClass);
    }
}
