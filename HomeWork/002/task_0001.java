import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class task_0001 {
    public static void main(String[] args) {
        String text = "0001.txt";
        File task = new File(text);
        int [] array = {13, 28, 30, 29, 28, 22, 3, 1};
        
        boolean isSorted = false;
        int buf;
        try {
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length-1; i++) {
                    if(array[i] > array[i+1]){
                        isSorted = false;
    
                        buf = array[i];
                        array[i] = array[i+1];
                        array[i+1] = buf;
                    }
                }System.out.println(Arrays.toString(array));
                FileWriter writer = new FileWriter(text, true);
                    writer.write(Arrays.toString(array));
                    writer.write("\n");
                    writer.close();
                } 
                    
                }
                catch (Exception e) {
                    System.out.println("Что-то не то");
                }
            
        } 
}
