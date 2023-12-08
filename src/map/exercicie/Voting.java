package map.exercicie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Voting {
  public static void main() {
    Map<String, Integer> votings = new HashMap<>();
    String path = "../voting.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String line = reader.readLine();
      while (line != null) {
        String[] fields = line.split(",");
        String name = fields[0];
        Integer qtdVoting = Integer.parseInt(fields[1]);

        Integer currentQtdVoting = votings.containsKey(name) ? votings.get(name) : 0;
        votings.put(name, currentQtdVoting + qtdVoting);
        line = reader.readLine();
      }

      for (String name: votings.keySet()) {
        System.out.println(name + ": " + votings.get(name));
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
