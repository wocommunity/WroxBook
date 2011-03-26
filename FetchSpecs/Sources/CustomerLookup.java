//
// CustomerLookup.java: Class file for WO Component 'CustomerLookup'
// Project Sample
//
// Created by Tom on Wed Aug 15 2001
//

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;

public class CustomerLookup extends WOComponent {
    protected String customerName2Find;
    
    
    /** @TypeInfo com.webobjects.eocontrol.Customer */
    protected NSArray customerList;
    protected Customer customer;
    protected boolean foundResults;
    protected boolean showDetails;
    protected boolean noResults=false;

    public CustomerLookup(WOContext context) {
        super(context);
    }

// This is where we do our intitial search
    public WOComponent lookUpCustomer()
    {

     String name2FindString = "*";
		if ( customerName2Find != null )
		{
		    name2FindString = customerName2Find+"*";
		}

		NSArray bindings = new NSArray( new Object [] { name2FindString, name2FindString } );
			
	    EOQualifier qualifier = EOQualifier.qualifierWithQualifierFormat(
				"firstName like %@ or lastName like %@", bindings );

        EOSortOrdering lastNameSortOrdering =  EOSortOrdering.sortOrderingWithKey("lastName", EOSortOrdering.CompareAscending);

        EOSortOrdering firstNameSortOrdering =  EOSortOrdering.sortOrderingWithKey("firstName", EOSortOrdering.CompareAscending);

        NSArray sortOrderings =
            new NSArray( new Object[]{lastNameSortOrdering, firstNameSortOrdering});

	EOFetchSpecification fetchSpec = new EOFetchSpecification("Customer", qualifier, sortOrderings);
		 
	EOEditingContext myEditingContext = this.session().defaultEditingContext();

	customerList = myEditingContext.objectsWithFetchSpecification(fetchSpec);
        
        if (customerList.count() ==0) {
            noResults = true;
            foundResults = false;
            
        } else {
            noResults = false;
            foundResults = true;
            
        }                
         showDetails = false;
        return null;
    }

// The View Customer conditional component
public WOComponent viewDetails()
    {
    	showDetails = true;
    	foundResults = false;
        noResults = false;
        return null;
    }
}

