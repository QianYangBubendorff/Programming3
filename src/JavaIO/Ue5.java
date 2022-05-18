package JavaIO;

import java.io.File;

public class Ue5 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\s51644\\Desktop\\test1\\test12\\");
        createDirectories(dir);
    }
    public static void createDirectories(File f){
       if(f.isDirectory()) {
            System.out.println("Directory "+ f.getAbsolutePath()+ "created?: " + f.mkdirs());
        }else{
            System.out.println("Directory "+ f.getAbsolutePath()+ "not created.");
        }
    }
}
