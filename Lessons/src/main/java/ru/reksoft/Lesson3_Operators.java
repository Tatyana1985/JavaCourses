package ru.reksoft;

public class Lesson3_Operators {

    public static void main(String[] args) {
        String a = task1(-7, "ggjgjjhj");
        System.out.println(a);
        boolean b = task2(-5000);
        System.out.println(b);
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем целое число и строку
     * 2. Проверяем полученное число:
     * 2.1 если больше нуля, к строке в конец добавляем это число
     * 2.2 если меньше нуля, добавляем число в начало строки
     * 2.3 если равно нулю, заменяет содержимое строки на "0"
     * 3. Проверяем длину полученной строки:
     * 3.1 Если длина строки меньше или равна 10, возвращаем эту строку
     * 3.2 Иначе возвращаем первые 10 символов
     * <p>
     * Подсказки:
     * - получить длину строки можно методом .length()
     * - получить первые n символов из строки можно методом .substring(0, n)
     */
    public static String task1(int i, String str) {
        if (i > 0) {
            str = str + i;
        } else if (i < 0) {
            str = i + str;
        } else {
            str = "0";
        }
        if (str.length() <= 10) {
            return str;
        } else {
            return str.substring(0, 10);
        }

        // свой код нужно писать тут
        // следующую строку можно удалять

    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. Получаем целое число
     * 2. Уменьшаем его на единицу
     * 3. Проверяем полученное число:
     * 3.1 если оно больше 100 или меньше 30, прибавляем к нему 1000
     * 3.2 иначе, если оно больше 0 и делится на 2 без остатка, отнимаем от него 1000
     * 4. Проверяем знак числа:
     * 4.1 если меньше нуля, возвращаем false
     * 4.2 если больше или равно нулю, возвращаем true
     * <p>
     * Подсказка: тут все просто, думайте сами ;)
     */
    public static boolean task2(int i) {
        --i;
        if (i > 100 || i < 30) {
            i = i + 1000;
        } else if (i % 2 == 0) {
            i = i - 1000;
        }
        return i >= 0;

        // свой код нужно писать тут
        // следующую строку можно удалять
    }
}
