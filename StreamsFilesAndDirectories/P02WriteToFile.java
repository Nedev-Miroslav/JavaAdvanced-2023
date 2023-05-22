package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {

        String pathRead = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathWrite = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);


        int currentByte = inputStream.read();

        while (currentByte >= 0) {
            char currentChar = (char) currentByte;

            if (currentChar != ',' && currentChar != '.' && currentChar != '!' && currentChar != '?') {
                outputStream.write(currentChar);
            }
            currentByte = inputStream.read();
        }

        inputStream.close();
        outputStream.close();

    }
}
