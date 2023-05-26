package StreamsFilesAndDirectoriesExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P07MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        Path input1 = Paths.get("C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path input2 = Paths.get("C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");

        List<String> list1 = Files.readAllLines(input1);
        List<String> list2 = Files.readAllLines(input2);

        String pathOut = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        BufferedWriter out = new BufferedWriter(new FileWriter(pathOut));
        PrintWriter printWriter = new PrintWriter(out);


        for (int i = 0; i < list1.size(); i++) {
           printWriter.println(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            printWriter.println(list2.get(i));
        }
        printWriter.close();
    }
}


// Допъпнително решение пътя на взимане е различен защото е копирано решени

// package StreamsFileasAndDirectories;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.List;
//
//public class MergeTwoFiles_07 {
//    public static void main(String[] args) throws IOException {
//        //1. четем всички редове от файл 1
//        String pathFileOne = "C:\\Users\\I353529\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
//        //2. четем всички редове от файл 2
//        String pathFileTwo = "C:\\Users\\I353529\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
//        //3. записваме всички редове във файл 3
//        PrintWriter writer = new PrintWriter("outputMerge.txt");
//
//        List<String> allLinesFileOne = Files.readAllLines(Path.of(pathFileOne)); //всички редове от файл 1
//        allLinesFileOne.forEach(line -> writer.println(line));
//        List<String> allLinesFileTwo = Files.readAllLines(Path.of(pathFileTwo)); //всички редове от файл 2
//        allLinesFileTwo.forEach(line -> writer.println(line));
//
//        writer.close();
//
//
//    }
//}