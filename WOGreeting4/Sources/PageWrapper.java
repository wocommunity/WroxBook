//
// PageWrapper.java: Class file for WO Component 'PageWrapper'
// Project WOGreeting4
//
// Created by admin on Mon Sep 10 2001
//

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;

public class PageWrapper extends WOComponent {
    protected String tempUserName;

    public PageWrapper(WOContext context) {
        super(context);
    }

}
