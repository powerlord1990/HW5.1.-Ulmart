package ru.itpark;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.itpark.model.Product;
import ru.itpark.model.Smartphone;
import ru.itpark.model.TV;
@Data
@AllArgsConstructor
public class Main {
    Product product=new Product(1,"Книга",500);
    Product tv=new TV();


}
