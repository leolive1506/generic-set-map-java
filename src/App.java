
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import generics.entities.Client;
import generics.entities.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
