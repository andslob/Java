import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;

public class task_003 {
    /**
     * @param args
     * @throws IOException
     * @throws SecurityException
     */
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(task_003.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        double ans;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num1 = scanner.nextDouble();
        System.out.print("\nВведите оператор (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Введите число: ");
        double num2 = scanner.nextDouble();
        
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Введите корректный оператор");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        logger.info(num1 + " " + op + " " + num2 + " = " + ans);
        scanner.close();
    }
}

