package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String pathRead = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathWrite = "C:\\Users\\nedev\\IdeaProjects\\ADVANCED\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

       BufferedReader in = new BufferedReader(new FileReader(pathRead));
        Scanner scanner = new Scanner(in);

        BufferedWriter out = new BufferedWriter(new FileWriter(pathWrite));
        PrintWriter writer = new PrintWriter(out);


        int n = 0;

        while (scanner.hasNextLine()){
            n++;

            String currentLine = scanner.nextLine();


            if(n % 3 == 0) {

                writer.println(currentLine);
            }

        }

        writer.close();

    }
}
