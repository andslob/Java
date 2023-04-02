import java.util.ArrayList;

public class task_002 {
    public static void main(String[] args) {
            
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i ++){
            list.add(i);
        }
        System.out.println("Список: \n" + list);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println("Cписок без четных: \n" + list);

    }
}