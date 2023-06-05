package Generics.P02GenericArrayCreator; // при събмит този package се трие!

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.create(Integer.class, 6, 6);

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}
