package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String DEFAULT_PATH = "D:/Program Files";

    public static void main(String[] args) {
        String path;
        if (args.length > 0) {
            path = args[0];
            System.out.println("Proceeding to file " + path);
        } else {
            path = DEFAULT_PATH;
            System.out.println("No arguments! Proceeding to default file " + path);
        }

        File initial = new File(path);

        FileSystemEntry fse = FileSystemEntry.newFileSystemEntry(initial);

        FileSystemEntry.printFSE(fse, 0, "\t");
    }

}
