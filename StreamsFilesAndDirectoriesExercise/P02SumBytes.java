package StreamsFilesAndDirectoriesExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader in = new BufferedReader(new FileReader(path));

        Scanner scanner = new Scanner(in);

        long sum = 0;
        while (scanner.hasNextLine()) {

            String current = scanner.nextLine();

            char[] charArray = current.toCharArray();
            for (char c : charArray) {
                sum += c;
            }
        }
        in.close();
        System.out.println(sum);


    }
}


// Допъпнително решение пътя на взимане е различен защото е копирано решението

//package StreamsFileasAndDirectories;
//
//        import javax.swing.plaf.basic.BasicColorChooserUI;
//        import java.io.IOException;
//        import java.nio.file.Files;
//        import java.nio.file.Path;
//        import java.util.List;
//
//public class SumBytes_02 {
//    public static void main(String[] args) throws IOException {
//        //1. всички редове от файл input.txt
//        //2. принтираме сумата от ascii кодовете на символите на всички редове
//
//        String pathToFile = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\JavaAdvanced_Jan_2023\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
//        long sum = 0; //сума от аски кодовете на всички символи
//
//        //начин 1:
//        /*List<String> allLines = Files.readAllLines(Path.of(pathToFile)); //лист с всички редове (текст)
//
//        for (String line : allLines) {
//            for (char symbol : line.toCharArray()) {
//                sum += symbol;
//            }
//        }
//        System.out.println(sum);*/
//
//        //начин 2:
//        //byte -> -127 до 128
//        //sbyte -> 0 до 256
//        byte [] allBytes = Files.readAllBytes(Path.of(pathToFile));
//        //масив от аски кодовете на всички символи (включително нов ред и carriage return) във файл
//        // ascii = 10 -> символ за нов ред
//        // ascii = 13 -> символ, обозначаващ начало на нов ред
//        for (byte ascii : allBytes) {
//            if (ascii != 13 && ascii != 10) {
//                sum += ascii;
//            }
//        }
//        System.out.println(sum);
//    }
//}