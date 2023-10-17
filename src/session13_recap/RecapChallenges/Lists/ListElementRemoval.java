package session13_recap.RecapChallenges.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListElementRemoval {
    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("New York");
        cityList.add("Los Angels");
        cityList.add("Chicago");
        cityList.add("Huston");
        cityList.add("Phoenix");

        List<String> newCityList = new ArrayList<>();
        newCityList.add(cityList.get(1));
        newCityList.add(cityList.get(3));
        System.out.println("New city list is: " + newCityList);
    }
}