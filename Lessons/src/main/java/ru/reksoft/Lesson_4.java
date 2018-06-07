package ru.reksoft;

public class Lesson_4 {
    public static void main(String[] args) {
        String[] books = {"qwerty","qwer90", "qwertyu", "qwertyui", "qwertyuio", "qwertyuiop", "qwertyuiopa", "qwertyuiopas", "qwertyuiopasd", "qwertyuiopasdf", "rt"};
        String max = books[0];
        String min = books[0];
        for (String book : books) {



            if (book.length() > max.length()) {
                max = book;
            }
            if (book.length() < min.length()) {
                min = book;
            }
        }


        System.out.println(min);

        System.out.println(max);
    }

}
