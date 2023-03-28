// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//  которая состоит из чередующихся символов c1 и c2, начиная с c1.
// 6
// a b
// ababab

import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число четное: ");
        int numb = sc.nextInt();
        System.out.print("Введите символ c1: ");
        String StrC1 = sc.next();
        System.out.print("Введите символ c2: ");
        String StrC2 = sc.next();
        System.out.print(function1(numb, StrC1, StrC2));
        sc.close();
    }

    static StringBuilder function1(int numb, String StrC1, String StrC2){
        String newStrC1C2 = StrC1 + StrC2;
        StringBuilder resultSrtBl = new StringBuilder();
        for (int index = 0; index < numb/2; index++) {
            resultSrtBl.append(newStrC1C2);
        }
        return resultSrtBl;
    }
}