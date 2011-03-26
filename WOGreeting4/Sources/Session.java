//
// Session.java
// Project WOGreeting4
//
// Created by admin on Mon Sep 10 2001
//

import com.webobjects.appserver.WOSession;
import com.webobjects.foundation.NSMutableArray;

public class Session extends WOSession {

    /** @TypeInfo java.lang.String */
    protected NSMutableArray pastUserNames;

    public Session() {
        super();
        pastUserNames=new NSMutableArray();
        }
        
        public void addUserName(String newUser){
        pastUserNames.addObject(newUser);
        
        /* ** Put your per-session initialization code here ** */
    }
    
}
