import java.util.LinkedList;
import java.util.Scanner;

public class task_3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        ll.add(num);
        while (true) {
            System.out.println("Введите действие (+, -, *, / или 'cancel' для отмены операции или 'exit' для выхода): ");
            String res = sc.next();

            switch (res) {
                case "+":
                    System.out.println("Введите число: ");
                    num = sc.nextInt();
                    System.out.println(ll.get(ll.size() - 1) + num);
                    ll.add(ll.get(ll.size() - 1) + num);
                    break;
                case "-":
                    System.out.println("Введите число: ");
                    num = sc.nextInt();
                    System.out.println(ll.get(ll.size() - 1) - num);
                    ll.add(ll.get(ll.size() - 1) - num);
                    break;

                case "*":
                    System.out.println("Введите число: ");
                    num = sc.nextInt();
                    System.out.println(ll.get(ll.size() - 1) * num);
                    ll.add(ll.get(ll.size() - 1) * num);
                    break;

                case "/":
                    System.out.println("Введите число: ");
                    num = sc.nextInt();
                    System.out.println(ll.get(ll.size() - 1) / num);
                    ll.add(ll.get(ll.size() - 1) / num);
                    break;

                case "cancel":
                    if (ll.size() > 1) {
                        ll.removeLast();
                        System.out.println(ll.getLast());
                    }
                    else System.out.println("Осталось только первое число - " + ll.getLast());
                    break;

                case "exit":
                    sc.close();
                    return;
            }
        }

    }
}