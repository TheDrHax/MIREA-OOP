package pw.thedrhax.semester_4.Task_2;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    private static LinkedList<String> out = new LinkedList<>();

    public static File[] ls (File dir) {
        return dir.listFiles();
    }

    public static long tree (File dir, int level) throws IOException {
        long size = 0;
        for (File i : ls(dir)) {
            long sub_size;

            StringBuilder prefix = new StringBuilder();
            for (int count = 0; count < level; count++) {
                prefix.append("-");
            }
            if (prefix.length() != 0) prefix.append(" ");

            if (i.isDirectory()) {
                sub_size = tree(i, level + 1);
            } else {
                sub_size = i.length();
            }

            out.add(prefix + i.getName() + " (" + sub_size + " байт)");
            size += sub_size;
        }
        return size;
    }

    public static void main(String[] args) throws IOException {
        tree(new File("/tmp/test"), 0);

        for (int i = out.size() - 1; i >= 0; i--) {
            System.out.println(out.get(i));
        }
    }
}
