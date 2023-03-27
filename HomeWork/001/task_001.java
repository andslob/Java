import java.util.Scanner;

public class task_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        long sumN = 0;
        long prN = 1;
        
        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
            prN = prN * i;
        }
        
        System.out.println("Сумма первых n натуральных чисел: " + sumN);
        System.out.println("Произведение первых n натуральных чисел: " + prN);
        scanner.close();
    }
}
