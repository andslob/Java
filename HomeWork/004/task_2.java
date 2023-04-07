import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Поместить элемент в конец");
            System.out.println("2. Вернуть первый элемент из очереди и удалить его");
            System.out.println("3. Вернуть первый элемент из очереди не удаляя его");
            System.out.println("4. Выход\n");
            System.out.println("Выберите действие: ");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Введите число: ");
                    int num = sc.nextInt();
                    enqueue(ll, num);
                    break;
                case 2:
                    if (!ll.isEmpty()) {
                        dequeue(ll);
                    } else {
                        System.out.println("\nОчередь пуста");
                    }
                    break;
                case 3:
                    if (!ll.isEmpty()) {
                        first(ll);
                    } else {
                        System.out.println("\nОчередь пуста");
                    }
                    break;
                case 4:
                    sc.close();
                    System.out.println(ll);
                    return;
            }
        }
    }

    public static void enqueue(LinkedList<Integer> list, int elem) {
        list.add(elem);
    }

    public static void dequeue(LinkedList<Integer> list) {
        System.out.println("\n" + list.removeFirst());
    }

    public static void first(LinkedList<Integer> list) {
        System.out.println("\n" + list.getFirst());
    }
}