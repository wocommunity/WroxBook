//
// PersonalizedGreeting.java: Class file for WO Component 'PersonalizedGreeting'
// Project WOGreetingCDP
//
// Created by chanoch on Tue Sep 11 2001
//

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;

public class PersonalizedGreeting extends WOComponent {
    protected String userName;
    protected String tempUserName;

    public PersonalizedGreeting(WOContext context) {
        super(context);
    }

    public void setUserName(String newUserName)
    {
        userName = newUserName;
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
