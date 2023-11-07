package HashMap;

import java.util.HashMap;

public class Example9 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("USA", "Washington DC");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");


        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}

