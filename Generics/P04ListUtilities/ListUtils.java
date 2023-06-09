package Generics.P04ListUtilities; // при събмит този package се трие!

import java.util.Collections;
import java.util.List;

public class ListUtils <T> {
    public static <T extends Comparable<T>> T getMax(List<T> list) {
        extracted(list);
        return Collections.max(list);

    }
    public static <T extends Comparable<T>> T getMin(List<T> list) {
        extracted(list);
        return Collections.min(list);

    }

    private static <T> void extracted(List<T> list) {
        if(list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
    }
}
