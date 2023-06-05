package DefiningClassesExercise.P06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String trainerName;
    private List<Pokemon> collection;
    private int badges;

    public Trainer(String trainerName, List<Pokemon> collection) {
        this.trainerName = trainerName;
        this.collection = collection;
        this.badges = 0;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public List<Pokemon> getCollection() {
        return collection;
    }

    public void setCollection(List<Pokemon> collection) {
        this.collection = collection;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }


    public void executing(String command) {

        if (isExist(command)) {
            badges += 1;
        } else {
            for (int i = 0; i < collection.size(); i++) {
                collection.get(i).setHealth(collection.get(i).getHealth() - 10);
                if (collection.get(i).getHealth() <= 0) {
                    collection.remove(i);
                    i--;
                }

            }
        }
    }

    public boolean isExist(String command) {
        for (Pokemon pokemon : collection) {
            if (pokemon.getElement().equals(command)) {
                return true;
            }
        }

        return false;
    }


    @Override
    public String toString() {
        return trainerName + " " + badges + " " + collection.size();
    }
}
