package com.cs.recursion;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HierarchyTrace {

    public void walk(String path, Map<String, String> data, List<String> currentFile, String parent, long size, int level) throws IOException {

        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                data.put(parent, String.valueOf(size));
                currentFile = new ArrayList<>();
                System.out.println("\t".repeat(level) + f.getAbsoluteFile().getName());
                // System.out.println("\t".repeat(level) + f.getAbsoluteFile().getName() + " [" + size + " " + level + "]");
                walk(f.getAbsolutePath(), data, currentFile, f.getName(), size, level + 1);

            } else {
                long currentSize = Files.size(Paths.get(f.getAbsolutePath()));
                size += currentSize;
                System.out.println("\t".repeat(level) + f.getAbsoluteFile().getName());
                //System.out.println("\t".repeat(level) + f.getAbsoluteFile().getName() + "<" + currentSize + ">");
            }
            //System.out.println("---- " + size + " --- " + f.getParent() + " ------ " + f.getName());
        }

    }

    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        HierarchyTrace fw = new HierarchyTrace();
        fw.walk("/Users/parshurampatil/IdeaProjects/Tries/src/com/cs/patterns", map, list, "tmp", 0, 0);
        //System.out.println(map.toString());
    }

}
