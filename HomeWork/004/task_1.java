import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(reversArray(ll));
    }

    public static ArrayList<Integer> reversArray(LinkedList<Integer> list) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            array.add((Integer) list.get(i));
        }
        return array;
    }
}