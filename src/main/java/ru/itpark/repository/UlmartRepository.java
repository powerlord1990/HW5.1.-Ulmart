package ru.itpark.repository;

import ru.itpark.model.Product;

import java.util.Collection;
import java.util.LinkedList;

public class UlmartRepository {
    private Collection<Product> items = new LinkedList<>();
    private long nextId = 1;

    public void save(Product item) {
        item.setId(nextId++);
        items.add(item);
    }

    public boolean delete(long id) {
        return items.removeIf(Product -> Product.getId() == id);
    }

    public Collection<Product> getAll() {
        return items;
    }

    public Collection<Product> getProducts() {
        return items;
    }

    public long getNextId() {
        return nextId;
    }

    public void setNextId(long nextId) {
        this.nextId = nextId;
    }
}

