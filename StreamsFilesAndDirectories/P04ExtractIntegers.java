package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String pathRead = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathWrite = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";


        FileInputStream inputStream = new FileInputStream(pathRead);
        Scanner scanner = new Scanner(inputStream);

        FileOutputStream outputStream = new FileOutputStream(pathWrite);
        PrintWriter writer = new PrintWriter(outputStream);



        while (scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                int n = scanner.nextInt();
               writer.println(n);

            }
            scanner.next();
        }

        writer.close();


    }
}
