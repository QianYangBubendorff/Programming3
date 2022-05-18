package JavaIO;

public class Quiz {

//    1. Was ist ein Separator und wofür wird der benötigt? + Beispiel + Wie rufe ich den auf? + Welche Werte hat dieser typischerweise?
//
//        System.out.println("File Separator: " + System.getProperty("file.separator"));
//
//
//            2. Wie übergebe ich am einfachsten ein File aus dem aktuellen IDE Directory?
//
//
//
//            3. Was macht ein Scanner? Wozu wird der benötigt?
//
//
//
//            4. Was ist ein rekursiver Aufruf? + Anwendungsbeispiel
//
//
//
//5. Unterschied: (File)
//
//            - mkdir() vs. mkdirs()
//
//6. Unterschied: (File)
//
//            - listFiles() vs. list()  list(), list of file names, listFiles(), list of file objects
//
//7. Unterschied: (File)
//
//            - getAbsolutePath() vs. getAbsoluteFile()
//
//8. Was retourniert File.mkdir() / File.mkdirs()?
//
// false/true
//
//            9. Was retourniert File.length()?
//
//   size of file
//
//            10. Wie kann ich von Bytes zu MB umrechnen?
//
//            divided by 1m
//
//            10. Was macht File.createNewFile()? Was gibt es zurück?
//
//              true, false, create the file in the path of File
//
//            11. Wie erzeugt man eine Random Number?
//
//             class GenerateRandom {
//          public static void main( String args[] ) {
//           int min = 50;
//           int max = 100;
//
//      //Generate random int value from 50 to 100
//      System.out.println("Random value in int from "+min+" to "+max+ ":");
//      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
//      System.out.println(random_int);
//    }
//      int int_random = rand.nextInt(upperbound);
//       double double_random=rand.nextDouble();
//       float float_random=rand.nextFloat();
//}
//
//            12. Welche Parameter erwartet der File Konstruktur? (Nenne 2)
//              File(String path)
//
//
//            13. Was ist der Unterschied zw. Binar und Text? Wie kann man den Unterschied erkennen? Gibt es Beispiele für Binär und Text?
//          There are two types of files in Java - text files and binary files. Files provide both sequential and random access. A text file is processed as a sequence of characters. A binary file is processed as a sequence of bytes. In a text file you have the illusion that the file is divided into lines.
//              public static String binaryToText(String binaryString) {
//              StringBuilder stringBuilder = new StringBuilder();
//              int charCode;
//              for (int i = 0; i < binaryString.length(); i += 8) {
//              charCode = Integer.parseInt(binaryString.substring(i, i + 8), 2);
//              String returnChar = Character.toString((char) charCode);
//              stringBuilder.append(returnChar);
//    }
//    return stringBuilder.toString();
//}
//
//            14. Welche Datenquellen hat JAVA? Wie kommt JAVA zu externen Daten?
//
//
//
//            15. Was macht File.getParent()?
//returns a String value which is the Parent of the given File object.
}
