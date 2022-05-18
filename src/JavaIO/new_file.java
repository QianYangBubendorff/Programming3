package JavaIO;

import java.io.File;
import java.io.IOException;

public class new_file {

    public static void main(String[] args) throws IOException{

        // find out which separator this PC's operating system uses
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("File Separator: " + fileSeparator);


        File file = new File("C:\\Users\\s51644\\Desktop\\test.txt");
        File file2 = new File("C:" + fileSeparator +"Users"+ fileSeparator +"s51644" + fileSeparator + "Desktop" + fileSeparator + "test.txt");
        File html = new File ("test.html");

        try{
            if(html.createNewFile()){

                System.out.println("new file");
                System.out.println(html.getName());
                System.out.println(html.getAbsolutePath());
                System.out.println(html.getAbsoluteFile());

            }else{
                System.out.println("already exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
