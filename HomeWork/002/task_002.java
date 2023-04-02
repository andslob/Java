import java.io.FileReader;
import java.util.Scanner;

public class task_002 {
    public static void main(String[] args) throws Exception {
        FileReader f = new FileReader("task_2.txt");
        Scanner sc = new Scanner(f);
        String result = sc.nextLine();
        System.out.println(result);
        f.close();
        sc.close();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) != '"') {

                if (result.charAt(i) == ':') {
                    res.append(',');

                } else {
                    res.append(result.charAt(i));
                }
            }
        }
        String[] arr = res.toString().split(",");
        System.out.println("Студент " + arr[1] + " получил " + arr[3] + " по предмету " + arr[5] + ".");

    }

}
