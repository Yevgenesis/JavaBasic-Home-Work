package de.telran.lesson15;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(21);
        int daysCount = 0;

        while (myAccount.getBalance() != 0) {
            int withdrawn = myAccount.withdrawAllowedAmount();
            int balance = myAccount.getBalance();
            System.out.println("Снято: " + withdrawn + ", осталось: " + balance);
            daysCount++;
        }
        System.out.println("Сняли за " + daysCount + getDaysString(daysCount));
    }

    public static String getDaysString(int days) {
        // Метод рассчитывает склонение слова "день".
        int daysResult;
        if (days % 100 > 20) daysResult = days % 10;
        else daysResult = days % 20;
        return daysResult == 1 ? " день" : daysResult >= 2 && daysResult <= 4 ? " дня" : " дней";
    }

}
