package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P03CopyBytes {
    public static void main(String[] args) throws IOException {

        String pathRead = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathWrite = "04. Java-Advanced-Files-and-Streams-Lab-Resources/03.CopyBytesOutput.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);
        int oneByte = 0;
        while ((oneByte = inputStream.read()) >= 0) {
            if (oneByte == 10 || oneByte == 32) {
                outputStream.write(oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++)
                    outputStream.write(digits.charAt(i));
            }
        }

        inputStream.close();
        outputStream.close();

    }
}
