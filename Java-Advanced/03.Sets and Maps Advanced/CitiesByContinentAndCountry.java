package SetsAndMapsAdvanced_Lab;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Map<String, LinkedHashMap<String, ArrayList<String>>> towns = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String continents = input[0];
            String country = input[1];
            String city = input[2];

            if (!towns.containsKey(continents)) {
                towns.put(continents, new LinkedHashMap<>() {{
                    put(country, new ArrayList<>() {{
                        add(city);
                    }});
                }});
            } else {
                if (!towns.get(continents).containsKey(country)) {
                    towns.get(continents).put(country, new ArrayList<>() {
                        {
                            add(city);
                        }
                    });
                } else {
                    towns.get(continents).get(country).add(city);
                }
            }
            if (!towns.get(continents).get(country).contains(city)) {
                towns.get(continents).get(country).add(city);
            }
        }
        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : towns.entrySet()) {
            String continent = entry.getKey();
            System.out.println(continent + ":");
            LinkedHashMap<String, ArrayList<String>> productPrice = entry.getValue();
            for (Map.Entry<String, ArrayList<String>> citiesEntry : productPrice.entrySet()) {
                String country = citiesEntry.getKey();
                List<String> cities = citiesEntry.getValue();
                System.out.println(country + " -> " + cities.toString().replaceAll("[\\[\\]]", ""));
            }
        }
    }
}

