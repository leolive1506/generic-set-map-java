package set.entities;

import java.time.Instant;

public class LogEntry implements Comparable<LogEntry> {
  private String username;
  private Instant loggedDate;

  public LogEntry(String username, Instant loggedDate) {
    this.username = username;
    this.loggedDate = loggedDate;
  }

  public String getUsername() {
    return username;
  }

  public void setusername(String username) {
    this.username = username;
  }

  public Instant getLoggedDate() {
    return loggedDate;
  }

  public void setLoggedDate(Instant loggedDate) {
    this.loggedDate = loggedDate;
  }

  @Override
  public String toString() {
    return "User [username=" + username + ", loggedDate=" + loggedDate + "]";
  }

  @Override


  public int compareTo(LogEntry other) {
    return username.compareTo(other.getUsername());
  }  
}
