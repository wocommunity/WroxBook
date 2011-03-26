//
// Main.java: Class file for WO Component 'Main'
// Project Chapter8Demo
//
// Created by bernhard on Tue Sep 11 2001
//
 
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;

public class Main extends WOComponent {
    protected NSMutableDictionary queryBindings;
    protected boolean resultsAvailable;

    /** @TypeInfo Customer */
    protected NSArray customerList;

    /** @TypeInfo Customer */
    protected Customer currentCustomer;

    public Main(WOContext context) {
        super(context);

	  queryBindings= new NSMutableDictionary();
    }

    public WOComponent submitValues()
    {
	        EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("genericFetchSpec", "Customer");
        
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(queryBindings);

        EOEditingContext myEditingContext = this.session().defaultEditingContext();
        
        customerList = myEditingContext.objectsWithFetchSpecification(fetchSpec);
        
		//NSLog.out.appendln("Customers: "+customers.toString());
        if (customerList.count() == 0) {
            resultsAvailable = false;
        } else {
            resultsAvailable = true;
        }
	  return null;

    }

}
