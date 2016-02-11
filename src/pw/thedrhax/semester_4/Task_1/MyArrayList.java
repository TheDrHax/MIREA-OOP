package pw.thedrhax.semester_4.Task_1;

public class MyArrayList {
    private String[] array;
    private int size = 0;

    public MyArrayList(int size) {
        array = new String[size];
    }

    public MyArrayList() {
        this(10);
    }

    public MyArrayList add (String element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        }
        return this;
    }

    public MyArrayList add (int index, String element) {
        String old_element;
        String new_element = element;
        size++;

        for (int i = index; i < size; i++) {
            old_element = array[i];
            array[i] = new_element;
            new_element = old_element;
        }

        return this;
    }

    public MyArrayList replace(int index, String element) {
        array[index] = element;
        return this;
    }

    public MyArrayList remove(int index) {
        array[index] = null;
        size--;
        for (int i = index; i < size; i++)
            array[i] = array[i+1];
        return this;
    }

    public MyArrayList remove() {
        return remove(size);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i != size - 1) result.append(", ");
        }
        return result.toString();
    }
}