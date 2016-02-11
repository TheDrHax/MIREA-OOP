package pw.thedrhax.semester_4.Task_1;

public class Main {

    public static void main(String[] argv) {
        MyArrayList list = new MyArrayList();

        list.add("test").add(0, "456").add(0, "123");

        System.out.println(list.toString());

        list.remove().add("number_1");

        System.out.println(list.toString());

        list.replace(1, "789");

        System.out.println(list.toString());
    }
}