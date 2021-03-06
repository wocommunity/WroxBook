//
// Application.java
// Project WOGreetingCDP
//
// Created by chanoch on Tue Sep 11 2001
//

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;

public class Application extends WOApplication {
    
    public static void main(String argv[]) {
        WOApplication.main(argv, Application.class);
    }

    public Application() {
        super();
        System.out.println("Welcome to " + this.name() + "!");
        
        /* ** Put your application initialization code here ** */
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
