// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Order.java instead.
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Order extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Order";

	// Attributes
	public static final String DATE_KEY = "date";

	// Relationships
	public static final String CUSTOMER_KEY = "customer";
	public static final String LINE_ITEMS_KEY = "lineItems";
	public static final String PAYMENT_KEY = "payment";

  private static Logger LOG = Logger.getLogger(_Order.class);

  public Order localInstanceIn(EOEditingContext editingContext) {
    Order localInstance = (Order)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public NSTimestamp date() {
    return (NSTimestamp) storedValueForKey("date");
  }

  public void setDate(NSTimestamp value) {
    if (_Order.LOG.isDebugEnabled()) {
    	_Order.LOG.debug( "updating date from " + date() + " to " + value);
    }
    takeStoredValueForKey(value, "date");
  }

  public Customer customer() {
    return (Customer)storedValueForKey("customer");
  }

  public void setCustomerRelationship(Customer value) {
    if (_Order.LOG.isDebugEnabled()) {
      _Order.LOG.debug("updating customer from " + customer() + " to " + value);
    }
    if (value == null) {
    	Customer oldValue = customer();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "customer");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "customer");
    }
  }
  
  public Payment payment() {
    return (Payment)storedValueForKey("payment");
  }

  public void setPaymentRelationship(Payment value) {
    if (_Order.LOG.isDebugEnabled()) {
      _Order.LOG.debug("updating payment from " + payment() + " to " + value);
    }
    if (value == null) {
    	Payment oldValue = payment();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "payment");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "payment");
    }
  }
  
  public NSArray<LineItem> lineItems() {
    return (NSArray<LineItem>)storedValueForKey("lineItems");
  }

  public NSArray<LineItem> lineItems(EOQualifier qualifier) {
    return lineItems(qualifier, null, false);
  }

  public NSArray<LineItem> lineItems(EOQualifier qualifier, boolean fetch) {
    return lineItems(qualifier, null, fetch);
  }

  public NSArray<LineItem> lineItems(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<LineItem> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(LineItem.ORDER_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = LineItem.fetchLineItems(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = lineItems();
      if (qualifier != null) {
        results = (NSArray<LineItem>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<LineItem>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToLineItemsRelationship(LineItem object) {
    if (_Order.LOG.isDebugEnabled()) {
      _Order.LOG.debug("adding " + object + " to lineItems relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "lineItems");
  }

  public void removeFromLineItemsRelationship(LineItem object) {
    if (_Order.LOG.isDebugEnabled()) {
      _Order.LOG.debug("removing " + object + " from lineItems relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "lineItems");
  }

  public LineItem createLineItemsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("LineItem");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "lineItems");
    return (LineItem) eo;
  }

  public void deleteLineItemsRelationship(LineItem object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "lineItems");
  }

  public void deleteAllLineItemsRelationships() {
    Enumeration objects = lineItems().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteLineItemsRelationship((LineItem)objects.nextElement());
    }
  }


  public static Order createOrder(EOEditingContext editingContext, NSTimestamp date
, Customer customer, Payment payment) {
    Order eo = (Order) EOUtilities.createAndInsertInstance(editingContext, _Order.ENTITY_NAME);    
		eo.setDate(date);
    eo.setCustomerRelationship(customer);
    eo.setPaymentRelationship(payment);
    return eo;
  }

  public static NSArray<Order> fetchAllOrders(EOEditingContext editingContext) {
    return _Order.fetchAllOrders(editingContext, null);
  }

  public static NSArray<Order> fetchAllOrders(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Order.fetchOrders(editingContext, null, sortOrderings);
  }

  public static NSArray<Order> fetchOrders(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Order.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Order> eoObjects = (NSArray<Order>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Order fetchOrder(EOEditingContext editingContext, String keyName, Object value) {
    return _Order.fetchOrder(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Order fetchOrder(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Order> eoObjects = _Order.fetchOrders(editingContext, qualifier, null);
    Order eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Order)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Order that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Order fetchRequiredOrder(EOEditingContext editingContext, String keyName, Object value) {
    return _Order.fetchRequiredOrder(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Order fetchRequiredOrder(EOEditingContext editingContext, EOQualifier qualifier) {
    Order eoObject = _Order.fetchOrder(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Order that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Order localInstanceIn(EOEditingContext editingContext, Order eo) {
    Order localInstance = (eo == null) ? null : (Order)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
