package A00PreviousExams.magazine;

import java.util.LinkedList;
import java.util.List;

public class Magazine {
    private List<Cloth> data;
    private String type;
    private int capacity;


    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new LinkedList<>();
    }


    public void addCloth(Cloth cloth) {
        if (data.size() + 1 <= capacity) {
            data.add(cloth);
        }

    }

    public boolean removeCloth(String color) {
        for (Cloth colorCloth : data) {
            if (colorCloth.getColor().equals(color)) {
                data.remove(colorCloth);

                return true;

            }

        }
        return false;
    }


    public Cloth getSmallestCloth() {

        int small = Integer.MAX_VALUE;
        Cloth toReturn = null;
        for (Cloth smalestCloth : data) {
            int size = smalestCloth.getSize();

            if (size < small) {
                small = size;
                toReturn = smalestCloth;

            }

        }
        return toReturn;
    }


    public Cloth getCloth(String color) {
        for (Cloth colors : data) {
            String col = colors.getColor();
            if (col.equals(color)) {
                return colors;

            }
        }
        return null;

    }


    public int getCount() {
        return data.size();
    }


    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.type + " A00PreviousExams.magazine contains:");
        for (Cloth cloth : data) {
            sb.append(System.lineSeparator());
            sb.append(cloth);
        }
        return sb.toString();

    }

}
