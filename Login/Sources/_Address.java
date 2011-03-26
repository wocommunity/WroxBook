// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Address.java instead.
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Address extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Address";

	// Attributes
	public static final String ADDRESS_KEY = "address";
	public static final String AREACODE_KEY = "areacode";
	public static final String CITY_KEY = "city";
	public static final String COUNTRY_KEY = "country";
	public static final String STATEPROVINCE_KEY = "stateprovince";

	// Relationships
	public static final String TCUSTOMERS_KEY = "tcustomers";

  private static Logger LOG = Logger.getLogger(_Address.class);

  public Address localInstanceIn(EOEditingContext editingContext) {
    Address localInstance = (Address)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String address() {
    return (String) storedValueForKey("address");
  }

  public void setAddress(String value) {
    if (_Address.LOG.isDebugEnabled()) {
    	_Address.LOG.debug( "updating address from " + address() + " to " + value);
    }
    takeStoredValueForKey(value, "address");
  }

  public String areacode() {
    return (String) storedValueForKey("areacode");
  }

  public void setAreacode(String value) {
    if (_Address.LOG.isDebugEnabled()) {
    	_Address.LOG.debug( "updating areacode from " + areacode() + " to " + value);
    }
    takeStoredValueForKey(value, "areacode");
  }

  public String city() {
    return (String) storedValueForKey("city");
  }

  public void setCity(String value) {
    if (_Address.LOG.isDebugEnabled()) {
    	_Address.LOG.debug( "updating city from " + city() + " to " + value);
    }
    takeStoredValueForKey(value, "city");
  }

  public String country() {
    return (String) storedValueForKey("country");
  }

  public void setCountry(String value) {
    if (_Address.LOG.isDebugEnabled()) {
    	_Address.LOG.debug( "updating country from " + country() + " to " + value);
    }
    takeStoredValueForKey(value, "country");
  }

  public String stateprovince() {
    return (String) storedValueForKey("stateprovince");
  }

  public void setStateprovince(String value) {
    if (_Address.LOG.isDebugEnabled()) {
    	_Address.LOG.debug( "updating stateprovince from " + stateprovince() + " to " + value);
    }
    takeStoredValueForKey(value, "stateprovince");
  }

  public NSArray<Customer> tcustomers() {
    return (NSArray<Customer>)storedValueForKey("tcustomers");
  }

  public NSArray<Customer> tcustomers(EOQualifier qualifier) {
    return tcustomers(qualifier, null, false);
  }

  public NSArray<Customer> tcustomers(EOQualifier qualifier, boolean fetch) {
    return tcustomers(qualifier, null, fetch);
  }

  public NSArray<Customer> tcustomers(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Customer> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Customer.TADDRESS_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = Customer.fetchCustomers(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = tcustomers();
      if (qualifier != null) {
        results = (NSArray<Customer>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Customer>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToTcustomersRelationship(Customer object) {
    if (_Address.LOG.isDebugEnabled()) {
      _Address.LOG.debug("adding " + object + " to tcustomers relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "tcustomers");
  }

  public void removeFromTcustomersRelationship(Customer object) {
    if (_Address.LOG.isDebugEnabled()) {
      _Address.LOG.debug("removing " + object + " from tcustomers relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "tcustomers");
  }

  public Customer createTcustomersRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Customer");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "tcustomers");
    return (Customer) eo;
  }

  public void deleteTcustomersRelationship(Customer object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "tcustomers");
    editingContext().deleteObject(object);
  }

  public void deleteAllTcustomersRelationships() {
    Enumeration objects = tcustomers().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTcustomersRelationship((Customer)objects.nextElement());
    }
  }


  public static Address createAddress(EOEditingContext editingContext, String address
, String areacode
, String city
, String country
, String stateprovince
) {
    Address eo = (Address) EOUtilities.createAndInsertInstance(editingContext, _Address.ENTITY_NAME);    
		eo.setAddress(address);
		eo.setAreacode(areacode);
		eo.setCity(city);
		eo.setCountry(country);
		eo.setStateprovince(stateprovince);
    return eo;
  }

  public static NSArray<Address> fetchAllAddresses(EOEditingContext editingContext) {
    return _Address.fetchAllAddresses(editingContext, null);
  }

  public static NSArray<Address> fetchAllAddresses(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Address.fetchAddresses(editingContext, null, sortOrderings);
  }

  public static NSArray<Address> fetchAddresses(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Address.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Address> eoObjects = (NSArray<Address>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Address fetchAddress(EOEditingContext editingContext, String keyName, Object value) {
    return _Address.fetchAddress(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Address fetchAddress(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Address> eoObjects = _Address.fetchAddresses(editingContext, qualifier, null);
    Address eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Address)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Address that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Address fetchRequiredAddress(EOEditingContext editingContext, String keyName, Object value) {
    return _Address.fetchRequiredAddress(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Address fetchRequiredAddress(EOEditingContext editingContext, EOQualifier qualifier) {
    Address eoObject = _Address.fetchAddress(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Address that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Address localInstanceIn(EOEditingContext editingContext, Address eo) {
    Address localInstance = (eo == null) ? null : (Address)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
