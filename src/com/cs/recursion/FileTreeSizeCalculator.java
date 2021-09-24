package com.cs.recursion;

import java.io.File;

class FileTreeSizeCalculator {
    private static long getFolderSize(File folder, int level) {
        long length = 0;
        File[] files = folder.listFiles();
        int count = files.length;

        for (int i = 0; i < count; i++) {
            File file = files[i];
            if (file.isFile()) {
                length += files[i].length();
                System.out.println(getTabs(level) + file.getName() + " <" + level + ", " + file.length() + ">");
            } else {
                length += getFolderSize(file, level + 1);
                System.out.println(getTabs(level) + file.getName() + " [" + level + ", " + length + "]");
                if (level == 0)
                    length = 0;
            }
        }

        return length;
    }

    private static String getTabs(int level) {
        return  " ".repeat(level * 7) + "|" + "-".repeat(4) + " ";
        //return  " ".repeat(level * level * level) + "|" + "-".repeat(level*4) + " ";
        // return  "|" + "-".repeat(level*4);

        //return "\t".repeat(level);

        //return "|" + "-".repeat(level - 2);
    }

    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/java-program-to-get-the-size-of-a-directory/
        File root = new File(new File("../../cs").getAbsolutePath());
        //File root = new File("/Users/parshurampatil/IdeaProjects/Tries/src/com/cs");
        getFolderSize(root, 0);
    }
}
