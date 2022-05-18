package JavaIO;

import java.io.File;
import java.util.Scanner;

public class create_directory3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Directory Name, which should be created");
        String path = scanner.next();
        System.out.println("New Directory : " + path);

        File file = new File(path);
//        with mkdirs we can create multiple directories (input test2/test2)
        boolean created = file.mkdirs();

        if (created) {
            System.out.println("Directory has been created");
        } else System.out.println("Directory has NOT been created");

        printDirectoryList("C:\\Users\\s51644\\OneDrive - CAMPUS 02 Fachhochschule der Wirtschaft GmbH\\Programming 2");

    }


    public static void printDirectoryList(String drPath) {
        File root = new File(drPath);
        File[] list = root.listFiles();
        for (File f : list) {
            if (f.isDirectory()) {
                System.out.println("Dir:" + f.getAbsolutePath());
            } else System.out.println("File:" + f.getAbsolutePath());
        }

    }

    }

