package pw.thedrhax.semester_3.Lab_2;

import pw.thedrhax.semester_3.Lab_1_2.Author;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Айбелив Айкенфлаев", "email@email.com", 'м');
        Book book = new Book("Вера в полёты", author, 0, 1000);
        System.out.println(book);
    }

}
