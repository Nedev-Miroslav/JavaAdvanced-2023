package StreamsFilesAndDirectoriesExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P01SumLines {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\src\\StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedReader in = new BufferedReader(new FileReader(path));

        Scanner scanner = new Scanner(in);

        while (scanner.hasNextLine()) {

            String current = scanner.nextLine();

            char[] charArray = current.toCharArray();
            long sum = 0;
            for (char c : charArray) {
                sum += c;
            }
            System.out.println(sum);
        }
        in.close();

    }
}


// Допъпнително решение пътя на взимане е различен защото е копирано решението

//package StreamsFileasAndDirectories;
//
//        import java.io.IOException;
//        import java.nio.file.Files;
//        import java.nio.file.Path;
//        import java.util.List;
//
//public class SumLines_01 {
//    public static void main(String[] args) throws IOException {
//        //1. всички редове от файл input.txt
//        //2. за всеки ред -> намирам суамта от аscii -> принтираме сумата
//
//        String pathToFile = "C:\\Users\\I353529\\Documents\\SoftUni\\Projects\\JavaAdvanced_Jan_2023\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
//        List<String> allLines = Files.readAllLines(Path.of(pathToFile));
//
//        //начин 1:
//       /* for (String line : allLines) {
//            //line = "Michael Angelo, "
//            int sum = 0; //сума от кодовете на символите на този ред
//            for (char symbol : line.toCharArray()) {
//                sum += (int) symbol;
//            }
//            System.out.println(sum);
//        }*/
//
//        //начин 2:
//        allLines.forEach(line -> {
//            int sum = 0; //сума от кодовете на символите на този ред
//            for (char symbol : line.toCharArray()) {
//                sum += (int) symbol;
//            }
//            System.out.println(sum);
//        });
//
//        //начин 3:
//        /*allLines.stream()
//                .map(line -> line.toCharArray())
//                .forEach(arr -> { //за всеки един масив от символи
//                    int sum = 0; //сума от кодовете на символите на този ред
//                    for (char symbol : arr) {
//                        sum += (int) symbol;
//                    }
//                    System.out.println(sum);
//                });*/
//    }
//}