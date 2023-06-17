package task1;

public class Task1 {
    public static void main(String[] args) {
        String[] fruits = {"brange", "plum", "tomato", "onibn", "grape"};
        output(fixMistakes(fruits));
    }
    private static void output(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ") " + array[i]);
        }
    }
    private static String[] fixMistakes(String[] array){
        String[] fixed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            fixed[i] = array[i].replace("b","o");
        }
        return fixed;
    }

}
