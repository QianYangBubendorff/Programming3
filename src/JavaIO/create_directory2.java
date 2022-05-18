package JavaIO;

import java.io.File;
import java.util.Scanner;

public class create_directory2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Directory path where new folder should be created");
        String path = scanner.next(); // need to add a "\" at the end of the path
        System.out.println("Enter the name of the NEW directory");
        path = path + scanner.next();


        File file = new File(path);
//        with mkdirs we can create multiple directories (input test2/test2)
        boolean created = file.mkdirs();

        if(created){
            System.out.println("Directory has been created");
        }else System.out.println("Directory has NOT been created");

    }
}
