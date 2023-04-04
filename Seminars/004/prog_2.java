import java.util.LinkedList;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text
// сохранить text в связный список.
// Если введено print~num, выводит строку из позиции 
// num в связном списке и удаляет её из списка.
// Работать до тех пор, пока не введен stop
// asd
// [asd]
// cvbn
// [asd, cvbn]
// g
// [asd, cvbn, g]
// print~1
// cvbn
// [asd,g]
public class prog_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> text = new LinkedList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Введите текст: ");
            String textLine = sc.nextLine();
            if (textLine.equals("stop")) {
                flag = false;
            }
            if (textLine.contains("print~")) {
                Integer index = Integer.parseInt(textLine.split("~")[1]);
                text.remove(index);
                System.out.println(text);
            } else {
                text.add(textLine);
                System.out.println(text);
            }

        }
    }
}
