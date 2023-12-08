package map;

import java.util.HashMap;
import java.util.Map;

import map.entities.Product;

public class Index {
  public static void main() {
    // MainFunctions.main();
    Map<Product, Double> productStock = new HashMap<>();

    Product p1 = new Product("TV", 900.0);
    Product p2 = new Product("Notebook", 1200.0);
    Product p3 = new Product("Tablet", 400.0);

    productStock.put(p1, 10000.0);
    productStock.put(p2, 20000.0);
    productStock.put(p3, 15000.0);

    Product ps = new Product("TV", 900.0);

    // retorna true pois compara com base no equals e hashCode da class
    System.out.println("Contains 'ps' key: " + productStock.containsKey(ps));
  }
}
