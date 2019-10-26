package ru.itpark;

import ru.itpark.model.*;
import ru.itpark.repository.UlmartRepository;
import ru.itpark.service.UlmartService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        UlmartService service = new UlmartService(new UlmartRepository());
        Collection<Product> collection = new ArrayList<>();


        collection.add(new TV(6, "45646ffgs", 75_000, 4.4, "Sony", 55, true, "black"));
        service.add(collection);

        service.add(
                new Smartphone(46, "Mi5", 50_000, 4.3, "white", "Xiaomi", "Android", 3),
                new Smartphone(75, "Iphone", 100_000, 1.0, "gold", "Apple", "IOS", 3),
                new Computer(74, "ПК Интел", 2_000_000, 4.9, "Celeron D", "gt 1030", 1000),
                new Computer(20, "ПК АМД", 200_000, 5, "Ryzen 3950x", "RTX Titan", 1000),
                new TV(78, "34JJre500", 50_000, 4.3, "samsung", 34, false, "black"),
                new TV(7, "65WK1000", 100_000, 2.3, "LG", 65, true, "White"),
                new TShirt(4, "made in china", 400, 3.9, "blue", 56, "bla-bla"),
                new TShirt(345, "Russia", 600, 2.9, "Red", 45, "RussiaFabric"),
                new Pot(234, "горшок", 120, 4.8, "Red", "china"),
                new Pot(1234, "горшок стальной", 1_000, 4.5, "green", "RosCosmos")
        );

        System.out.println(service.searchByName("ПК"));
        System.out.println("Отсортированный по именам " + service.SortByName());
        System.out.println();
        System.out.println(service.searchByType("smartphone"));
        System.out.println();
        System.out.println("Отсортированный по цене по возрастанию " + service.SortByPrice());
        System.out.println();
        System.out.println("Отсортированный по цене по убыванию " + service.SortByPriceDesc());
        System.out.println();
        System.out.println("Отсортированный по рейтингу " + service.SortByRating());
        System.out.println();


        System.out.println(service.getRepository());
        service.remove(3);
        System.out.println(service.getRepository());

    }
}
