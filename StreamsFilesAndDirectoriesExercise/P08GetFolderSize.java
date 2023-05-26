package StreamsFilesAndDirectoriesExercise;

import java.io.*;

public class P08GetFolderSize {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        int sum = 0;
        if (file.isDirectory()) {
            File [] files = file.listFiles();

            for (File f : files) {
              sum +=  f.length();
            }

        }

        String pathOut = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(pathOut));
        PrintWriter printWriter = new PrintWriter(out);
        String toPrint = String.format("Folder size: %d%n", sum);
        printWriter.print(toPrint);
        printWriter.close();
    }
}


// Допъпнително решение пътя на взимане е различен защото е копирано решени

// package StreamsFileasAndDirectories;
//
//import java.io.File;
//
//public class GetFolderSize_08 {
//    public static void main(String[] args) {
//        String pathFolder = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\JavaAdvanced_Jan_2023\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
//        File folder = new File(pathFolder);
//
//        File[] allFilesInFolder = folder.listFiles(); //масив с всички файлове в папката
//
//        int folderSize = 0; //размер на папката
//        if (allFilesInFolder != null) {
//            for (File file : allFilesInFolder) {
//                folderSize += file.length();
//            }
//        }
//
//
//        System.out.println("Folder size: " + folderSize);
//    }
//}