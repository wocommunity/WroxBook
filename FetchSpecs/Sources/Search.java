//
// Search.java: Class file for WO Component 'Search'
// Project Sample
//
// Created by Tom on Wed Aug 15 2001
//

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableDictionary;

public class Search extends WOComponent {
    protected String lastName;
    protected Customer customer;

    /** @TypeInfo Customer */
    protected NSArray customers;
    protected NSMutableDictionary queryBindings;
    protected boolean showResults;
    protected boolean noResults;

    public Search(WOContext context) {
        super(context);
    
    queryBindings = new NSMutableDictionary();
    
    }

    public WOComponent searchForCustomers()
    {
                
        EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lastNameFetchSpec", "Customer");
        
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(queryBindings);

        EOEditingContext myEditingContext = this.session().defaultEditingContext();
        
        customers = myEditingContext.objectsWithFetchSpecification(fetchSpec);
        
        if (customers.count() !=1) {
            showResults = false;
            noResults = true;
                return null;
        } else {
            showResults = true;
            noResults = false;
                return null;
        }
    }
}

