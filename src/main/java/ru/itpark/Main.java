package ru.itpark;


import ru.itpark.model.Computer;
import ru.itpark.model.Product;
import ru.itpark.model.Smartphone;
import ru.itpark.model.TV;
import ru.itpark.repository.UlmartRepository;
import ru.itpark.service.UlmartService;

import java.util.Collection;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {


        UlmartService service = new UlmartService(new UlmartRepository());
        Collection<Product> newAdd = new LinkedList<>();
        newAdd.add(new Smartphone(265,
                "Iphone",
                100_000,
                "gold",
                "Apple",
                "IOS",
                3,
                "Cortex A9"
                ));
        newAdd.add(new Computer(,"ПК",200_000,"Ryzen 3950x","RTX Titan"))
    }
}