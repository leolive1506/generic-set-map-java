package set.exercicie;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import set.entities.LogEntry;

public class Loggin {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    Set<LogEntry> users = new HashSet<>();

    System.out.print("Enter file full path: ");
    String path = sc.next();

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String line = reader.readLine();
      while (line != null) {
        String[] fields = line.split(" ");
        Instant instant = Instant.parse(fields[1]);
        users.add(new LogEntry(fields[0], instant));

        line = reader.readLine();
      }

      System.out.print("Total users: " + users.size());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }
}
