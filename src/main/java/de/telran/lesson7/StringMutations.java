package de.telran.lesson7;

public class StringMutations {
    public static void main(String[] args) {
        // 1-Создаем строку через new - I study Basic Java!
        String myStr = new String("I study Basic Java!");


        // 3-Передаём в этот метод строку, которую создали в п.1
        printString(myStr);


        // 4-Распечатываем пред-последний символ строки. Используем метод String.charAt().
        System.out.println("Предпоследний символ в строке: " + myStr.charAt(myStr.length() - 2));


        // 5-Проверить, содержит ли строка подстроку “Java”. Используем метод String.contains().
        boolean isContains = myStr.contains("Java");
        System.out.println("Содеержит ли строка слово 'Java'?: " + isContains);


        // 6-Вырезать строку Java c помощью метода String.substring()
        System.out.println("Вырезать слово 'Java': " + myStr.substring(14, 18));

        System.out.println("Было:  " + myStr);
        String newStr = myStr.substring(0, 14) + myStr.substring(18);
        System.out.println("Стало: " + newStr);


        // 7-Заменить все символы “а” на “о”.
        String replacedStr = myStr.replaceAll("a", "o");
        System.out.println(replacedStr);


        // 8-Преобразуйте строку к верхнему регистру.
        System.out.println(myStr.toUpperCase());


        // 8-Преобразуйте строку к нижнему регистру.
        System.out.println(myStr.toLowerCase());
    }


    // 2-Написать метод, который принимает в качестве параметра строку
    public static void printString(String str) {
        System.out.println(str);
    }
}
