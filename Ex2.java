
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

public class Ex2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Иван");
        list.add("Петр");
        list.add("Антон");
        list.add("Иван");
        list.add("Петр");
        list.add("Антон");
        list.add("Иван");
        list.add("Костя");
        list.add("Антон");
        list.add("Николя");
        list.add("Антон");
        list.add("Регина");
        list.add("Дима");
        list.add("Регин");
        int count = 0;
        Collections.sort(list);
        System.out.println(list);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            count += 1;
            if ((i + 1) == list.size() || !list.get(i).equals(list.get(i + 1))) {
                map.put(list.get(i), count);
                count = 0;
            }
        }
        System.out.println(map);

        map.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);
    }
}
