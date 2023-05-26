package StreamsFilesAndDirectoriesExercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P09CopyAPicture {
    public static void main(String[] args) throws IOException {

        String inPath = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Picture.jpg.jpg";
        String outPath = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Picture-copy.jpg";


        FileInputStream fileStream = new FileInputStream(inPath);
        FileOutputStream outputStream = new FileOutputStream(outPath);


        int oneByte = fileStream.read();
        while (oneByte >= 0) {
            outputStream.write(oneByte);
            oneByte = fileStream.read();
        }
        fileStream.close();
        outputStream.close();
    }
}
