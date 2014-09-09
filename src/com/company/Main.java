package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*String dirPath = "E:/";//args[0];
        File initialDir = new File(dirPath);

        if (!initialDir.isDirectory()) {
            System.err.println("Given pathname do not represents directory!");
            return;
        }*/

        File file = new File("E:/EmptyDir");
        FileSystemEntry fse = FileSystemEntry.newFileSystemEntry(file);

        FileSystemEntry.printFSE(fse, 0, "\t");
    }

}
