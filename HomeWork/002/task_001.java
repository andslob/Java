public class task_001 {
    public static void main(String[] args) {
        int[] array = { 1, 4, 32, 8, 3, 2, 5 };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print(array);
    }
}