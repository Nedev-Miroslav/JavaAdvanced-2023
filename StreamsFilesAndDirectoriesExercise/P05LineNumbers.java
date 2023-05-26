package StreamsFilesAndDirectoriesExercise;

import java.io.*;
import java.util.Scanner;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {

        String pathIn = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String pathOut = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader in = new BufferedReader(new FileReader(pathIn));
        BufferedWriter out = new BufferedWriter(new FileWriter(pathOut));

        Scanner scanner = new Scanner(in);
        PrintWriter printWriter = new PrintWriter(out);

        int counter = 1;
        while (scanner.hasNextLine()) {

            String currentLine = scanner.nextLine();

            String toPrint = String.format("%d. %s%n", counter, currentLine);

            printWriter.print(toPrint);

            counter++;

        }

        in.close();
        out.close();
    }
}



// Допъпнително решение пътя на взимане е различен защото е копирано решени

//package StreamsFileasAndDirectories;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.List;
//
//public class LineNumbers_05 {
//    public static void main(String[] args) throws IOException {
//        //1. прочитам всички редове от файл inputLineNumbers.txt
//        //2. обхождаме всеки ред -> записваме в нов файл с пореден номер отпред
//        String path = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\JavaAdvanced_Jan_2023\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
//        List<String> allLines = Files.readAllLines(Path.of(path));
//
//        PrintWriter writer = new PrintWriter("output_line_numbers.txt");
//        int lineNumber = 1;
//        for (String line : allLines) {
//            writer.println(lineNumber + ". " + line);
//            lineNumber++;
//        }
//
//        writer.close(); //спирам да пиша във файла и файлът се затваря
//    }
//}