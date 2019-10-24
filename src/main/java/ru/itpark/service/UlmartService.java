package ru.itpark.service;

import ru.itpark.model.Product;
import ru.itpark.repository.UlmartRepository;

import java.util.*;

public class UlmartService {
    private final UlmartRepository repository;

    public UlmartService(UlmartRepository repository) {
        this.repository = repository;
    }

    public UlmartRepository getRepository() {
        return repository;
    }

    public List<Product> searchByName(String text) {
        List<Product> result = new LinkedList<>();
        for (Product item : repository.getAll()) {
            if (item.getName().toLowerCase().contains(text.toLowerCase())) {
                result.add(item);
            }
        }
        result.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return result;
    }

    public List<Product> searchByType(String productType) {
        List<Product> result = new LinkedList<>();
        for (Product item : repository.getAll()) {
            if (item.match(productType)) {
                result.add(item);
            }
        }
        result.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        return result;
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

    public boolean remove(long id) {
        return repository.delete(id);
    }

    public List<Product> getSortedByPrice() {
        return getSortedBy((o1, o2) -> o1.getPrice() - o2.getPrice());
    }

    public List<Product> getSortedByPriceDesc() {
        return getSortedBy((o1, o2) -> -(o1.getPrice() - o2.getPrice()));
    }

    public List<Product> getSortedByName() {
        return getSortedBy((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }

    private List<Product> getSortedBy(Comparator<Product> comparator) {
        List<Product> result = new LinkedList<>(repository.getAll());
        result.sort(comparator);
        return result;
    }


}

