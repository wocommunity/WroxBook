// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Customer.java instead.
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Customer extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Customer";

	// Attributes
	public static final String ADDRESSID_KEY = "addressid";
	public static final String ALTERNATETELEPHONE_KEY = "alternatetelephone";
	public static final String EMAIL_KEY = "email";
	public static final String FIRSTNAME_KEY = "firstname";
	public static final String LASTNAME_KEY = "lastname";
	public static final String LOGINNAME_KEY = "loginname";
	public static final String PASSWORD_KEY = "password";
	public static final String TELEPHONE_KEY = "telephone";
	public static final String TITLE_KEY = "title";

	// Relationships
	public static final String TADDRESS_KEY = "taddress";
	public static final String TORDERS_KEY = "torders";

  private static Logger LOG = Logger.getLogger(_Customer.class);

  public Customer localInstanceIn(EOEditingContext editingContext) {
    Customer localInstance = (Customer)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Long addressid() {
    return (Long) storedValueForKey("addressid");
  }

  public void setAddressid(Long value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating addressid from " + addressid() + " to " + value);
    }
    takeStoredValueForKey(value, "addressid");
  }

  public String alternatetelephone() {
    return (String) storedValueForKey("alternatetelephone");
  }

  public void setAlternatetelephone(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating alternatetelephone from " + alternatetelephone() + " to " + value);
    }
    takeStoredValueForKey(value, "alternatetelephone");
  }

  public String email() {
    return (String) storedValueForKey("email");
  }

  public void setEmail(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating email from " + email() + " to " + value);
    }
    takeStoredValueForKey(value, "email");
  }

  public String firstname() {
    return (String) storedValueForKey("firstname");
  }

  public void setFirstname(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating firstname from " + firstname() + " to " + value);
    }
    takeStoredValueForKey(value, "firstname");
  }

  public String lastname() {
    return (String) storedValueForKey("lastname");
  }

  public void setLastname(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating lastname from " + lastname() + " to " + value);
    }
    takeStoredValueForKey(value, "lastname");
  }

  public String loginname() {
    return (String) storedValueForKey("loginname");
  }

  public void setLoginname(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating loginname from " + loginname() + " to " + value);
    }
    takeStoredValueForKey(value, "loginname");
  }

  public String password() {
    return (String) storedValueForKey("password");
  }

  public void setPassword(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating password from " + password() + " to " + value);
    }
    takeStoredValueForKey(value, "password");
  }

  public String telephone() {
    return (String) storedValueForKey("telephone");
  }

  public void setTelephone(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating telephone from " + telephone() + " to " + value);
    }
    takeStoredValueForKey(value, "telephone");
  }

  public String title() {
    return (String) storedValueForKey("title");
  }

  public void setTitle(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating title from " + title() + " to " + value);
    }
    takeStoredValueForKey(value, "title");
  }

  public Address taddress() {
    return (Address)storedValueForKey("taddress");
  }

  public void setTaddressRelationship(Address value) {
    if (_Customer.LOG.isDebugEnabled()) {
      _Customer.LOG.debug("updating taddress from " + taddress() + " to " + value);
    }
    if (value == null) {
    	Address oldValue = taddress();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "taddress");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "taddress");
    }
  }
  
  public NSArray<Order> torders() {
    return (NSArray<Order>)storedValueForKey("torders");
  }

  public NSArray<Order> torders(EOQualifier qualifier) {
    return torders(qualifier, null, false);
  }

  public NSArray<Order> torders(EOQualifier qualifier, boolean fetch) {
    return torders(qualifier, null, fetch);
  }

  public NSArray<Order> torders(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Order> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Order.TCUSTOMER_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = Order.fetchOrders(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = torders();
      if (qualifier != null) {
        results = (NSArray<Order>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Order>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToTordersRelationship(Order object) {
    if (_Customer.LOG.isDebugEnabled()) {
      _Customer.LOG.debug("adding " + object + " to torders relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "torders");
  }

  public void removeFromTordersRelationship(Order object) {
    if (_Customer.LOG.isDebugEnabled()) {
      _Customer.LOG.debug("removing " + object + " from torders relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "torders");
  }

  public Order createTordersRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Order");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "torders");
    return (Order) eo;
  }

  public void deleteTordersRelationship(Order object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "torders");
    editingContext().deleteObject(object);
  }

  public void deleteAllTordersRelationships() {
    Enumeration objects = torders().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTordersRelationship((Order)objects.nextElement());
    }
  }


  public static Customer createCustomer(EOEditingContext editingContext, Long addressid
, String email
, String firstname
, String lastname
, String loginname
, String password
, String telephone
) {
    Customer eo = (Customer) EOUtilities.createAndInsertInstance(editingContext, _Customer.ENTITY_NAME);    
		eo.setAddressid(addressid);
		eo.setEmail(email);
		eo.setFirstname(firstname);
		eo.setLastname(lastname);
		eo.setLoginname(loginname);
		eo.setPassword(password);
		eo.setTelephone(telephone);
    return eo;
  }

  public static NSArray<Customer> fetchAllCustomers(EOEditingContext editingContext) {
    return _Customer.fetchAllCustomers(editingContext, null);
  }

  public static NSArray<Customer> fetchAllCustomers(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Customer.fetchCustomers(editingContext, null, sortOrderings);
  }

  public static NSArray<Customer> fetchCustomers(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Customer.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Customer> eoObjects = (NSArray<Customer>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Customer fetchCustomer(EOEditingContext editingContext, String keyName, Object value) {
    return _Customer.fetchCustomer(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Customer fetchCustomer(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Customer> eoObjects = _Customer.fetchCustomers(editingContext, qualifier, null);
    Customer eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Customer)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Customer that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Customer fetchRequiredCustomer(EOEditingContext editingContext, String keyName, Object value) {
    return _Customer.fetchRequiredCustomer(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Customer fetchRequiredCustomer(EOEditingContext editingContext, EOQualifier qualifier) {
    Customer eoObject = _Customer.fetchCustomer(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Customer that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Customer localInstanceIn(EOEditingContext editingContext, Customer eo) {
    Customer localInstance = (eo == null) ? null : (Customer)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
