package ru.reksoft;

class Lesson2 {

    public static void main(String[] args)
    {

        System.out.println(formula(4));
        System.out.println(initials("иванов Петр Александрович"));

    }

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */
    static int formula(int x)
    {
        double y;
        y = Math.sqrt(13*x + 13/x);
        int f = (int) y;
        return f;
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *toUpperCase()дном параметре может быть любым.
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName)
    {
        String [] initials =  fullName.split(" ");
        String initial = initials[0].charAt(0) + "." +
                initials[1].charAt(0)+ "." +
                initials[2].charAt(0) + ".";
        initial = initial.toUpperCase();
        return initial;
    }

}
