//
// Application.java
// Project OneDay
//
// Created by admin on Tue Sep 18 2001
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
