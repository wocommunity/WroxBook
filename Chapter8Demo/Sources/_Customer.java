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
	public static final String ALTERNATE_TELEPHONE_KEY = "alternateTelephone";
	public static final String EMAIL_KEY = "email";
	public static final String FIRST_NAME_KEY = "firstName";
	public static final String LAST_NAME_KEY = "lastName";
	public static final String LOGIN_NAME_KEY = "loginName";
	public static final String PASSWORD_KEY = "password";
	public static final String TELEPHONE_KEY = "telephone";
	public static final String TITLE_KEY = "title";

	// Relationships
	public static final String ADDRESS_KEY = "address";
	public static final String ORDERS_KEY = "orders";

  private static Logger LOG = Logger.getLogger(_Customer.class);

  public Customer localInstanceIn(EOEditingContext editingContext) {
    Customer localInstance = (Customer)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String alternateTelephone() {
    return (String) storedValueForKey("alternateTelephone");
  }

  public void setAlternateTelephone(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating alternateTelephone from " + alternateTelephone() + " to " + value);
    }
    takeStoredValueForKey(value, "alternateTelephone");
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

  public String firstName() {
    return (String) storedValueForKey("firstName");
  }

  public void setFirstName(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating firstName from " + firstName() + " to " + value);
    }
    takeStoredValueForKey(value, "firstName");
  }

  public String lastName() {
    return (String) storedValueForKey("lastName");
  }

  public void setLastName(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating lastName from " + lastName() + " to " + value);
    }
    takeStoredValueForKey(value, "lastName");
  }

  public String loginName() {
    return (String) storedValueForKey("loginName");
  }

  public void setLoginName(String value) {
    if (_Customer.LOG.isDebugEnabled()) {
    	_Customer.LOG.debug( "updating loginName from " + loginName() + " to " + value);
    }
    takeStoredValueForKey(value, "loginName");
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

  public Address address() {
    return (Address)storedValueForKey("address");
  }

  public void setAddressRelationship(Address value) {
    if (_Customer.LOG.isDebugEnabled()) {
      _Customer.LOG.debug("updating address from " + address() + " to " + value);
    }
    if (value == null) {
    	Address oldValue = address();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "address");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "address");
    }
  }
  
  public NSArray<Order> orders() {
    return (NSArray<Order>)storedValueForKey("orders");
  }

  public NSArray<Order> orders(EOQualifier qualifier) {
    return orders(qualifier, null, false);
  }

  public NSArray<Order> orders(EOQualifier qualifier, boolean fetch) {
    return orders(qualifier, null, fetch);
  }

  public NSArray<Order> orders(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Order> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Order.CUSTOMER_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
      results = orders();
      if (qualifier != null) {
        results = (NSArray<Order>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Order>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToOrdersRelationship(Order object) {
    if (_Customer.LOG.isDebugEnabled()) {
      _Customer.LOG.debug("adding " + object + " to orders relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "orders");
  }

  public void removeFromOrdersRelationship(Order object) {
    if (_Customer.LOG.isDebugEnabled()) {
      _Customer.LOG.debug("removing " + object + " from orders relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "orders");
  }

  public Order createOrdersRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Order");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "orders");
    return (Order) eo;
  }

  public void deleteOrdersRelationship(Order object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "orders");
  }

  public void deleteAllOrdersRelationships() {
    Enumeration objects = orders().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteOrdersRelationship((Order)objects.nextElement());
    }
  }


  public static Customer createCustomer(EOEditingContext editingContext, String email
, String firstName
, String lastName
, String loginName
, String password
, String telephone
) {
    Customer eo = (Customer) EOUtilities.createAndInsertInstance(editingContext, _Customer.ENTITY_NAME);    
		eo.setEmail(email);
		eo.setFirstName(firstName);
		eo.setLastName(lastName);
		eo.setLoginName(loginName);
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
  public static NSArray<Customer> fetchGenericFetchSpec(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("genericFetchSpec", "Customer");
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<Customer>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<Customer> fetchGenericFetchSpec(EOEditingContext editingContext,
	String cityBinding,
	String countryBinding,
	String eMailBinding,
	String firstNameBinding,
	String lastNameBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("genericFetchSpec", "Customer");
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(cityBinding, "city");
    bindings.takeValueForKey(countryBinding, "country");
    bindings.takeValueForKey(eMailBinding, "eMail");
    bindings.takeValueForKey(firstNameBinding, "firstName");
    bindings.takeValueForKey(lastNameBinding, "lastName");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<Customer>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<Customer> fetchLastNameFetchSpec(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lastNameFetchSpec", "Customer");
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<Customer>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<Customer> fetchLastNameFetchSpec(EOEditingContext editingContext,
	String lastNameValueBinding)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("lastNameFetchSpec", "Customer");
    NSMutableDictionary<String, Object> bindings = new NSMutableDictionary<String, Object>();
    bindings.takeValueForKey(lastNameValueBinding, "lastNameValue");
	fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<Customer>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
