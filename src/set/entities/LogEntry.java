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
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((username == null) ? 0 : username.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    LogEntry other = (LogEntry) obj;
    if (username == null) {
      if (other.username != null)
        return false;
    } else if (!username.equals(other.username))
      return false;
    return true;
  }

  @Override


  public int compareTo(LogEntry other) {
    return username.compareTo(other.getUsername());
  }  
}
