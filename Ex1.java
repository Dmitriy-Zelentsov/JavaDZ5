import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что один человек может иметь несколько телефонов.

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите количество записей в книге: ");
        int lengthTelBook = scannerText();
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < lengthTelBook; i++) {
            System.out.println("Введите Фамилию: ");
            map.put(key(), value());
        }
        System.out.println(map);
    }

    public static ArrayList<Integer> value() {
        System.out.print("Введите количество номеров телефона: ");
        int length = scannerText();
        ArrayList<Integer> telephons = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            Integer value = scannerText();
            telephons.add(value);
        }
        return telephons;
    }

    public static String key() {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        return text;
    }

    public static Integer scannerText() {
        Scanner in = new Scanner(System.in);
        int text = in.nextInt();
        return text;
    }
}