package pw.thedrhax.semester_3.Lab_1_2;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Айбелив Айкенфлаев", "email@email.com", 'м');
        System.out.println(author);

        author.setEmail("new_email@email.com");
        System.out.println(author);
    }

}
