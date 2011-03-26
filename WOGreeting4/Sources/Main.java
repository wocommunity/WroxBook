//
// Main.java: Class file for WO Component 'Main'
// Project WOGreeting4
//
// Created by admin on Mon Sep 10 2001
//
 
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;

public class Main extends WOComponent {
    protected String userName;
    public Main(WOContext context) {
        super(context);
    }

    public WOComponent submitName()
    {
        PersonalizedGreeting greetingPage=(PersonalizedGreeting)pageWithName("PersonalizedGreeting");
        greetingPage.setUserName(userName);
        ((Session)session()).addUserName(userName);
        return greetingPage;
    }

}
