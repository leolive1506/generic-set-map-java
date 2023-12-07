package set.entities;

import java.time.Instant;

public class User implements Comparable<User> {
  private String userName;
  private Instant loggedDate;

  public User(String userName, Instant loggedDate) {
    this.userName = userName;
    this.loggedDate = loggedDate;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Instant getLoggedDate() {
    return loggedDate;
  }

  public void setLoggedDate(Instant loggedDate) {
    this.loggedDate = loggedDate;
  }

  @Override
  public String toString() {
    return "User [userName=" + userName + ", loggedDate=" + loggedDate + "]";
  }

  @Override


  public int compareTo(User other) {
    return userName.compareTo(other.getUserName());
  }  
}
