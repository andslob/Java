import java.util.Arrays;

public class task_0001 {
    public static void main(String[] args) {
        int [] array = {13, 28, 30, 29, 28, 22, 3, 1};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
 
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}