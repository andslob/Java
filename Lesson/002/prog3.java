import java.util.Scanner;

// Напишите метод, который сжимает строку. 

// Пример: вход aaaabbbcddaaa.
// a4b3cd2a3

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        sc.close();

        System.out.println(compressString(str));
    }

    static String compressString(String str) {
        if (str.length() < 2)
            return str;
        StringBuilder result = new StringBuilder();
        int count = 1;
        char[] charArray = str.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                count += 1;
            } else {
                result.append(charArray[i - 1]);
                if (count != 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
        result.append(charArray[charArray.length - 1]);
        if (count != 1)
            result.append(count);

        return result.toString();
    }
}