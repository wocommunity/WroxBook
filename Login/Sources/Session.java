// Generated by the WebObjects Wizard

import com.webobjects.appserver.WOSession;

public class Session extends WOSession {
  protected Customer user;

  public  void setUser(Customer user) {
    this.user = user;    
  }

  public Customer getUser(Customer user) {
    return user;
  }

  public boolean isUserLoggedIn() {
    if(user == null) {
      return false;
    } else {
      return true;
    }
  }
}
