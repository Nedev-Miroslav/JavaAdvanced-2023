package StreamsFilesAndDirectories;

import java.io.File;
import java.nio.file.Files;

public class P07ListFiles {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        if (folder.exists()) {
            if(folder.isDirectory()) {
                File[] allFiles = folder.listFiles();
                for (File allFile : allFiles) {
                    if(!allFile.isDirectory()){
                        System.out.printf("%s: [%d]%n", allFile.getName(), allFile.length());
                    }
                }
            }
        }

    }
}
