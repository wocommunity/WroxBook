//
// DirectAction.java
// Project WOGreetingCDP
//
// Created by chanoch on Tue Sep 11 2001
//

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WODirectAction;
import com.webobjects.appserver.WORequest;

public class DirectAction extends WODirectAction {

    public DirectAction(WORequest aRequest) {
        super(aRequest);
    }

    public WOActionResults defaultAction() {
        return pageWithName("Main");
    }

}
