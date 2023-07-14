package gb.javaproject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class Task4_2 {
//    private static LinkedList<Integer> star;

    public static void main(String[] args) {
        LinkedList<Integer> starList = new LinkedList<>();
        Random rand = new Random();
        int size = 20;
        for (int i = 0; i < size; i++) {
            starList.add(i, rand.nextInt(100));
        }
        int n = 16;                ;
        MyQueue myQueue = new MyQueue(starList);
        System.out.printf("Первоначальный список:\n" + starList + "\n");
        myQueue.enqueue(n);
        System.out.printf("Список с добавлением элемента %s в конец:\n %s \n", n, starList);
        System.out.printf("Исходный список без удаления первого элемента, равного %s:\n", myQueue.first());
        System.out.println(starList);
        System.out.printf("Исходный список с удалением первого элемента, равного %s:\n", myQueue.dequeue());
        System.out.println(starList);
    }
}

