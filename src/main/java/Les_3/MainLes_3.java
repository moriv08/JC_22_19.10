package Les_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainLes_3 {
    public static void main(String[] args) {

        String[] stringArr = {
            "Катя","Маша","Рита","Кира","Лера","Иван","Сергей", "Илья", "Слава", "Рома", "Катя","Катя","Маша","Рита","Кира","Лера","Иван","Сергей", "Илья", "Катя",
            "Маша", "Рита", "Кира", "Кира", "Кира", "Лера", "Иван", "Сергей","Илья","Слава","Рома", "Маша", "Рита", "Кира", "Кира", "Кира", "Лера", "Илья","Слава","Рома"
        };

        countWords(stringArr);

        PhoneBook.add("Кира", "999-99-99", "999-88-88");
        PhoneBook.add("Кира", "999-77-77, 999-55-55");

        PhoneBook.get("Кира");
    }

    private static void countWords(String[] arr){

        Map<String, Integer> map = new HashMap<>();

        for (String s : arr) {
            int counter = (map.get(s) != null) ? (map.get(s) + 1) : 1;
            map.put(s, counter);
        }

        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name + " - " + map.get(name));
        }
        System.out.println();
    }
}
