package Les_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    static public Map<String, ArrayList<String>> book = new HashMap<>();

    public static void get(String name){
        System.out.println(name + ": " + book.get(name));
    }

    public static void add(String name, String... telephons){

        ArrayList<String> phones = (book.get(name) != null) ? book.get(name) : new ArrayList<>();

        for (int i = 0; i < telephons.length; i++)
            phones.add(telephons[i]);
            book.put(name, phones);
    }
}
