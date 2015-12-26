package pw.thedrhax.labs_3_sem.Task_2;

import pw.thedrhax.labs_3_sem.Task_1_2.Author;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Айбелив Айкенфлаев", "email@email.com", 'м');
        Book book = new Book("Вера в полёты", author, 0, 1000);
        System.out.println(book);
    }

}
