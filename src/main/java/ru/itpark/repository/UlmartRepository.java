package ru.itpark.repository;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itpark.model.Product;

import java.util.Collection;
import java.util.LinkedList;
@Data
@NoArgsConstructor
public class UlmartRepository {
    private Collection<Product> items = new LinkedList<>();
    private int nextId = 1;

    public void save(Product item) {
        item.setId(nextId++);
        items.add(item);
    }

    public boolean delete(int id) {
        return items.removeIf(Product -> Product.getId() == id);
    }

    public Collection<Product> getAll() {
        return items;
    }

    public Collection<Product> getProducts() {
        return items;
    }

    public void setItems(Collection<Product> items) {
        this.items = items;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }
}

