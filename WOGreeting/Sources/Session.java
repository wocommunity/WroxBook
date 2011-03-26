//
// Session.java
// Project WOGreetingCDP
//
// Created by chanoch on Tue Sep 11 2001
//

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;
import com.webobjects.appserver.WOSession;
import com.webobjects.foundation.NSMutableArray;

public class Session extends WOSession {

    /** @TypeInfo java.lang.String */
    protected NSMutableArray pastUserNames;

    public Session() {
        super();
        pastUserNames = new NSMutableArray();
        
        /* ** Put your per-session initialization code here ** */
    }
    
    public void addUserName(String newUser) {
      pastUserNames.addObject(newUser);
    }
    
    public void takeValuesFromRequest(WORequest aRequest, WOContext aContext) {
      System.out.println("\r\n=== " + this.getClass().getName()
                                    + " takeValuesFromRequest");
                                    
      super.takeValuesFromRequest(aRequest, aContext);
    }
    
        public void appendToResponse(WOResponse aResponse, WOContext aContext) {
      System.out.println("\r\n=== " + this.getClass().getName()
                                    + " appendToResponse");
                                    
      super.appendToResponse(aResponse, aContext);
    }

    public WOActionResults invokeAction(WORequest aRequest, WOContext aContext) {
      System.out.println("\r\n=== " + this.getClass().getName()
                                    + " invokeAction");
                                    
      return super.invokeAction(aRequest, aContext);
    }

    
}
