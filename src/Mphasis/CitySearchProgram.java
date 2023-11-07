package Mphasis;

import java.util.ArrayList;

public class CitySearchProgram {
    public static void main(String[] args) {
        // Create an ArrayList to store city names
        ArrayList<String> cities = new ArrayList<>();

        // Add 5 city names to the ArrayList
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("San Francisco");
        cities.add("Miami");

        // Call the searchCity method to find and print a city
        searchCity(cities, "Chicag");
    }

    public static void searchCity(ArrayList<String> cities, String targetCity) {
        // Search for the target city in the ArrayList
        for (String city : cities) {
            if (city.equals(targetCity)) {
                System.out.println("City found: " + city);


                 // Exit the method when the city is found
            }
            
            else {
                System.out.println("city not here");
            }
        }
    }
}
