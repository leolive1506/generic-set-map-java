import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import generics.entities.Product;
import generics.service.CalculationService;

public class GenericMethod {
  public static void main() {
    List<Product> list = new ArrayList<>();
        String path = "../in.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = reader.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
  }
}
