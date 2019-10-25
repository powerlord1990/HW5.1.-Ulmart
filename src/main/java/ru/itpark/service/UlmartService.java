package ru.itpark.service;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itpark.model.Product;
import ru.itpark.repository.UlmartRepository;

import java.util.*;
@Data
@NoArgsConstructor
public class UlmartService {
    private UlmartRepository repository;

    public UlmartService(UlmartRepository repository) {
        this.repository = repository;
    }

    public void add(Collection<Product> items) {
        for (Product item : items) {
            repository.save(item);
        }
    }

    public void add(Product... items) {
        Collection<Product> products = new LinkedList<>(Arrays.asList(items));
        add(products);
    }

    public List<Product> searchByName(String text) {
        List<Product> items = new LinkedList<>();
        for (Product item : repository.getAll()) {
            if (item.getName().toUpperCase().contains(text.toUpperCase())) {
                items.add(item);
            }
        }
        items.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return items;
    }

    public List<Product> searchByType(String type) {
        List<Product> items = new LinkedList<>();
        for (Product item : repository.getAll()) {
            if (item.match(type)) {
                items.add(item);
            }
        }
        items.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return items;
    }

    public boolean remove(int id) {
        return repository.delete(id);
    }

    private List<Product> SortBy(Comparator<Product> comparator) {
        List<Product> result = new LinkedList<>(repository.getAll());
        result.sort(comparator);
        return result;
    }

    public List<Product> SortByPrice() {
        return SortBy((o1, o2) -> o1.getPrice() - o2.getPrice());
    }

    public List<Product> SortByPriceDesc() {
        return SortBy((o1, o2) -> -(o1.getPrice() - o2.getPrice()));
    }

    public List<Product> SortByName() {
        return SortBy((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }

    public List<Product> SortByRating() {
        return SortBy(Comparator.comparingDouble(Product::getRating));
    }



}

