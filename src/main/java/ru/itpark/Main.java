package ru.itpark;

import ru.itpark.model.*;
import ru.itpark.repository.UlmartRepository;
import ru.itpark.service.UlmartService;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        UlmartService service = new UlmartService(new UlmartRepository());
        Collection<Product> newAdd = new LinkedList<>();
        newAdd.add(new Smartphone(0, "Iphone", 100_000, "gold", "Apple",
                "IOS", 3, "Cortex A9"
        ));
        newAdd.add(new Computer(0, "ПК", 200_000, "Ryzen 3950x", "RTX Titan", 1000));
        service.add(newAdd);
        service.add(
                new TV(0, "34JJre500", 500, "samsung", 34, false,"black"),
                new TV(0, "65WK1000", 1_000, "LG", 65, true, "White"),
                new TShirt(0, "made in china", 40, "blue", 56, "bla-bla"),
                new TShirt(0, "Russia", 60, "Red", 45, "RussiaFabric"),
                new Pot(0, "горшок", 12, "red", "china"),
                new Pot(0, "горшок1", 112, "green", "RosCosmos")
        );
        System.out.println(service.searchByName("Apple"));
        System.out.println();

        System.out.println(service.searchByType("tv"));
        System.out.println();

        List<Product> result = service.getSortedByPrice();

    }
}
