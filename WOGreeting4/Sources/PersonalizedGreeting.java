//
// PersonalizedGreeting.java: Class file for WO Component 'PersonalizedGreeting'
// Project WOGreeting4
//
// Created by admin on Mon Sep 10 2001
//

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;

public class PersonalizedGreeting extends WOComponent {
    protected String userName;

    public PersonalizedGreeting(WOContext context) {
        super(context);
    }

    public void setUserName(String newUserName)
    {
        userName = newUserName;
    }

}
