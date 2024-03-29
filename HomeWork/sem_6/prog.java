package HomeWork.sem_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class prog {
    public static void main(String[] args) {

        Notebook n1 = new Notebook("MSI", 16, 512, "Windows", "black");
        Notebook n2 = new Notebook("Dell", 32, 256, "Windows", "grey");
        Notebook n3 = new Notebook("MSI", 4, 256, "Windows", "black");
        Notebook n4 = new Notebook("Asus", 8, 512, "Linux", "white");
        Notebook n5 = new Notebook("Apple", 32, 1024, "MacOs", "silver");
        ArrayList<Notebook> list = new ArrayList<>(Arrays.asList(n1, n2, n3, n4, n5));

        choiseNotebook(list, filter());
    }

    public static HashMap<String, Object> filter() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Object> custom = new HashMap<String, Object>();
        custom.put("ram", 0);
        custom.put("hdd", 0);
        custom.put("os", "");
        custom.put("color", "");
        System.out.println("\nВыбираем модель ноутбука");
        while (true) {
            System.out.println("\n1. Объем RAM");
            System.out.println("2. Объем HDD");
            System.out.println("3. OS");
            System.out.println("4. Цвет");
            System.out.println("0. Завершить выбор и вывести подходящую модель ");
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nВведите минимальный объем RAM: ");
                    int ram = sc.nextInt();
                    custom.put("ram", ram);
                    break;

                case 2:
                    System.out.println("\nВведите минимальный объем HDD: ");
                    int hdd = sc.nextInt();
                    custom.put("hdd", hdd);
                    break;

                case 3:
                    System.out.println("\nВыберите OS из списка\n");
                    System.out.println("1. Windows");
                    System.out.println("2. Linux");
                    System.out.println("3. MacOs");
                    System.out.println("Введите цифру, соответствующую необходимому критерию: ");
                    int choiceOs = sc.nextInt();
                    switch (choiceOs) {
                        case 1:
                            custom.put("os", "Windows");
                            break;
                        case 2:
                            custom.put("os", "Linux");
                            break;
                        case 3:
                            custom.put("os", "MacOs");
                            break;
                        default:
                            System.out.println("Ошибка выбора");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("\nВыберите цвет из списка\n");
                    System.out.println("1. Серый");
                    System.out.println("2. Белый");
                    System.out.println("3. Черный");
                    System.out.println("4. Серебристый");
                    System.out.println("Введите цифру, соответствующую необходимому критерию: ");
                    int choiceColor = sc.nextInt();
                    switch (choiceColor) {
                        case 1:
                            custom.put("color", "grey");
                            break;
                        case 2:
                            custom.put("color", "white");
                            break;
                        case 3:
                            custom.put("color", "black");
                            break;
                        case 4:
                            custom.put("color", "silver");
                            break;
                        default:
                            System.out.println("Ошибка выбора");
                            break;
                    }
                    break;

                case 0:
                    sc.close();
                    return custom;

                default:
                    System.out.println("Ошибка выбора");
                    break;
            }

        }

    }

    public static void choiseNotebook(ArrayList<Notebook> list, HashMap<String, Object> filter) {
        ArrayList<Notebook> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRam() > (Integer) filter.get("ram") &&
                    list.get(i).getHdd() > (Integer) filter.get("hdd") &&
                    (list.get(i).getOs().equals((String) filter.get("os"))
                            || filter.get("os").equals(""))
                    &&
                    (list.get(i).getColor().equals((String) filter.get("color"))
                            || filter.get("color").equals(""))) {
                result.add(list.get(i));
            }
        }
        if (result.size() == 0)
            System.out.println("Ноутбук под ваши параметры не найден.");
        else {
            System.out.println("\nПод ваши параметры подойдут следующие ноутбуки:");
            for (int index = 0; index < result.size(); index++) {
                System.out.println(result.get(index));
            }
        }

    }
}

