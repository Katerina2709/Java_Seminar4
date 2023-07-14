package gb.javaproject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
public class Task4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> startList = new LinkedList<>();
        Random rand = new Random();
        int size = 20;
        for (int i = 0; i < size; i++) {
            startList.add(i, rand.nextInt(100));
        }
        System.out.printf("Первоначальный список: %s\n", startList);
        System.out.printf("Перевернутый список: %s\n", reverseList(startList));
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        return reverseList;
    }
}
