//
// Application.java
// Project MonitorTest
//
// Created by admin on Sat Jan 03 1970
//

import com.webobjects.appserver.WOApplication;

public class Application extends WOApplication {
    
    public static void main(String argv[]) {
        WOApplication.main(argv, Application.class);
    }

    public Application() {
        super();
        System.out.println("Welcome to " + this.name() + "!");
        
        /* ** Put your application initialization code here ** */
    }
    
}
