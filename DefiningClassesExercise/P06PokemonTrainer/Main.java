package DefiningClassesExercise.P06PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, ArrayList<Pokemon>> map = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {

            String trainerName = input.split("\\s+")[0];
            String pokemonName = input.split("\\s+")[1];
            String pokemonElement = input.split("\\s+")[2];
            int pokemonHealth = Integer.parseInt(input.split("\\s+")[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            map.putIfAbsent(trainerName, new ArrayList<>());
                map.get(trainerName).add(pokemon);


            input = scanner.nextLine();
        }
            List<Trainer> list = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Pokemon>> entry : map.entrySet()) {
            Trainer trainer = new Trainer(entry.getKey(), entry.getValue());
            list.add(trainer);


        }


        String element = scanner.nextLine();

        while (!element.equals("End")) {


            for (Trainer trainer : list) {
            trainer.executing(element);


            }

            element = scanner.nextLine();
        }


        list.stream()
                .sorted(Comparator.comparingInt(Trainer::getBadges).reversed())
                .forEach(System.out::println);


    }
}
