package task3;

import java.util.Scanner;

public class Task3 {
     static Scanner scanner;
     static String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        output(name,counter(names, name));
    }

    private static int counter (String[] array, String name) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                counter++;
            }
        }
        if(counter == 0){
            throw new RuntimeException("Заданого имени нет в списке.");
        }
        return counter;
    }

    private static void output(String name, int count){
        System.out.println("Имя ".concat(name).concat(" ").concat("встретилось ") + count + " раз(a).");
    }
}
