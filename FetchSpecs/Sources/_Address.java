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
	public static final String AREA_CODE_KEY = "areaCode";
	public static final String CITY_KEY = "city";
	public static final String COMPLEMENT_KEY = "complement";
	public static final String COUNTRY_KEY = "country";
	public static final String STATE_PROVINCE_KEY = "stateProvince";

	// Relationships
	public static final String CUSTOMERS_KEY = "customers";

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

  public String areaCode() {
    return (String) storedValueForKey("areaCode");
  }

  public void setAreaCode(String value) {
    if (_Address.LOG.isDebugEnabled()) {
    	_Address.LOG.debug( "updating areaCode from " + areaCode() + " to " + value);
    }
    takeStoredValueForKey(value, "areaCode");
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

  public String complement() {
    return (String) storedValueForKey("complement");
  }

  public void setComplement(String value) {
    if (_Address.LOG.isDebugEnabled()) {
    	_Address.LOG.debug( "updating complement from " + complement() + " to " + value);
    }
    takeStoredValueForKey(value, "complement");
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

  public String stateProvince() {
    return (String) storedValueForKey("stateProvince");
  }

  public void setStateProvince(String value) {
    if (_Address.LOG.isDebugEnabled()) {
    	_Address.LOG.debug( "updating stateProvince from " + stateProvince() + " to " + value);
    }
    takeStoredValueForKey(value, "stateProvince");
  }

  public NSArray<Customer> customers() {
    return (NSArray<Customer>)storedValueForKey("customers");
  }

  public NSArray<Customer> customers(EOQualifier qualifier) {
    return customers(qualifier, null, false);
  }

  public NSArray<Customer> customers(EOQualifier qualifier, boolean fetch) {
    return customers(qualifier, null, fetch);
  }

  public NSArray<Customer> customers(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Customer> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Customer.ADDRESS_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
      results = customers();
      if (qualifier != null) {
        results = (NSArray<Customer>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Customer>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToCustomersRelationship(Customer object) {
    if (_Address.LOG.isDebugEnabled()) {
      _Address.LOG.debug("adding " + object + " to customers relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "customers");
  }

  public void removeFromCustomersRelationship(Customer object) {
    if (_Address.LOG.isDebugEnabled()) {
      _Address.LOG.debug("removing " + object + " from customers relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "customers");
  }

  public Customer createCustomersRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Customer");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "customers");
    return (Customer) eo;
  }

  public void deleteCustomersRelationship(Customer object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "customers");
    editingContext().deleteObject(object);
  }

  public void deleteAllCustomersRelationships() {
    Enumeration objects = customers().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteCustomersRelationship((Customer)objects.nextElement());
    }
  }


  public static Address createAddress(EOEditingContext editingContext, String address
, String areaCode
, String city
, String complement
, String country
, String stateProvince
) {
    Address eo = (Address) EOUtilities.createAndInsertInstance(editingContext, _Address.ENTITY_NAME);    
		eo.setAddress(address);
		eo.setAreaCode(areaCode);
		eo.setCity(city);
		eo.setComplement(complement);
		eo.setCountry(country);
		eo.setStateProvince(stateProvince);
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
