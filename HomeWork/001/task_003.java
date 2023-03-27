import java.util.Scanner;

public class task_003 {
    public static void main(String[] args) {
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
        scanner.close();
    }
}
