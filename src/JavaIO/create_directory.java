package JavaIO;

import java.io.File;
import java.util.Scanner;

public class create_directory {

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



    public static void readFileInfo(String path){
        File file = new File(path);
        if(file.exists()){
            System.out.println(file.getName());
            System.out.println(file.getParentFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.isHidden());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.length());
        }else System.out.println("File does NOT exist!");
    }

//recursive method to print out all the sub-directories
    public static void printDirectoryList(String drPath){
        File dr = new File(drPath);

        if (dr.listFiles()==null) return;

        if(dr.exists()){
            for(File f: dr.listFiles()){
                if(f.isDirectory()){
                    System.out.println("Dir: " + f.getAbsolutePath());
                    printDirectoryList(f.getAbsolutePath());
                }else System.out.println("File:"+f.getAbsolutePath());
            }
        }
    }
}
