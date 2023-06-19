package A00PreviousExams.easterBasket;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Basket {


    private String material;
    private  int capacity;
    private List<Egg> data;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new LinkedList<>();
    }



    public void addEgg(Egg egg){
        if (data.size() < capacity){
            data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        for (Egg egg : data) {
            if(egg.getColor().equals(color)){
                data.remove(egg);
                return true;
            }
        }
        return false;
    }

    public Egg getStrongestEgg(){
        return this.data.stream().max(Comparator.comparingInt(Egg::getStrength)).get();


    }

    public Egg getEgg(String color) {
        return this.data.stream().filter(e -> e.getColor().equals(color)).findFirst().get();
    }

    public int getCount(){
        return data.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s basket contains:", this.material));
        for (Egg egg : data) {
            sb.append(System.lineSeparator());
            sb.append(egg);
        }
        return sb.toString();
    }

}
