package GenericsExercise.P08CustomListSorter;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();

        while (!command.equals("END")) {
            String[] separateCommand = command.split("\\s+");
            String currentCommand = separateCommand[0];

            if (currentCommand.equals("Add")) {
                String element = separateCommand[1];
                customList.add(element);

            } else if (currentCommand.equals("Remove")) {
                int index = Integer.parseInt(separateCommand[1]);
                customList.remove(index);

            } else if (currentCommand.equals("Contains")) {
                String element = separateCommand[1];
                System.out.println(customList.contains(element));

            } else if (currentCommand.equals("Swap")) {
                int index1 = Integer.parseInt(separateCommand[1]);
                int index2 = Integer.parseInt(separateCommand[2]);
                customList.swap(index1, index2);

            } else if (currentCommand.equals("Greater")) {
                String element = separateCommand[1];
                System.out.println(customList.countGreaterThan(element));

            } else if (currentCommand.equals("Max")) {
                System.out.println(customList.getMax());

            } else if (currentCommand.equals("Min")) {
                System.out.println(customList.getMin());

            } else if (currentCommand.equals("Print")) {
                System.out.println(customList);
            } else if (currentCommand.equals("Sort")) {
                    Sorter.sort(customList);
            }


            command = scanner.nextLine();
        }


    }

}
