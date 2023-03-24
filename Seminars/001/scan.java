import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(name);
        System.out.println(age);
        sc.close();
    }
}
