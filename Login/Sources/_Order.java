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
	public static final String CUSTOMERID_KEY = "customerid";
	public static final String PAYMENTID_KEY = "paymentid";
	public static final String THEDATE_KEY = "thedate";

	// Relationships
	public static final String TCUSTOMER_KEY = "tcustomer";
	public static final String TLINEITEMS_KEY = "tlineitems";

  private static Logger LOG = Logger.getLogger(_Order.class);

  public Order localInstanceIn(EOEditingContext editingContext) {
    Order localInstance = (Order)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Long customerid() {
    return (Long) storedValueForKey("customerid");
  }

  public void setCustomerid(Long value) {
    if (_Order.LOG.isDebugEnabled()) {
    	_Order.LOG.debug( "updating customerid from " + customerid() + " to " + value);
    }
    takeStoredValueForKey(value, "customerid");
  }

  public Long paymentid() {
    return (Long) storedValueForKey("paymentid");
  }

  public void setPaymentid(Long value) {
    if (_Order.LOG.isDebugEnabled()) {
    	_Order.LOG.debug( "updating paymentid from " + paymentid() + " to " + value);
    }
    takeStoredValueForKey(value, "paymentid");
  }

  public NSTimestamp thedate() {
    return (NSTimestamp) storedValueForKey("thedate");
  }

  public void setThedate(NSTimestamp value) {
    if (_Order.LOG.isDebugEnabled()) {
    	_Order.LOG.debug( "updating thedate from " + thedate() + " to " + value);
    }
    takeStoredValueForKey(value, "thedate");
  }

  public Customer tcustomer() {
    return (Customer)storedValueForKey("tcustomer");
  }

  public void setTcustomerRelationship(Customer value) {
    if (_Order.LOG.isDebugEnabled()) {
      _Order.LOG.debug("updating tcustomer from " + tcustomer() + " to " + value);
    }
    if (value == null) {
    	Customer oldValue = tcustomer();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "tcustomer");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "tcustomer");
    }
  }
  
  public NSArray<Lineitem> tlineitems() {
    return (NSArray<Lineitem>)storedValueForKey("tlineitems");
  }

  public NSArray<Lineitem> tlineitems(EOQualifier qualifier) {
    return tlineitems(qualifier, null, false);
  }

  public NSArray<Lineitem> tlineitems(EOQualifier qualifier, boolean fetch) {
    return tlineitems(qualifier, null, fetch);
  }

  public NSArray<Lineitem> tlineitems(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Lineitem> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Lineitem.TORDER_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = Lineitem.fetchLineitems(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = tlineitems();
      if (qualifier != null) {
        results = (NSArray<Lineitem>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Lineitem>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToTlineitemsRelationship(Lineitem object) {
    if (_Order.LOG.isDebugEnabled()) {
      _Order.LOG.debug("adding " + object + " to tlineitems relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "tlineitems");
  }

  public void removeFromTlineitemsRelationship(Lineitem object) {
    if (_Order.LOG.isDebugEnabled()) {
      _Order.LOG.debug("removing " + object + " from tlineitems relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "tlineitems");
  }

  public Lineitem createTlineitemsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Lineitem");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "tlineitems");
    return (Lineitem) eo;
  }

  public void deleteTlineitemsRelationship(Lineitem object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "tlineitems");
    editingContext().deleteObject(object);
  }

  public void deleteAllTlineitemsRelationships() {
    Enumeration objects = tlineitems().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTlineitemsRelationship((Lineitem)objects.nextElement());
    }
  }


  public static Order createOrder(EOEditingContext editingContext, Long customerid
, Long paymentid
, NSTimestamp thedate
) {
    Order eo = (Order) EOUtilities.createAndInsertInstance(editingContext, _Order.ENTITY_NAME);    
		eo.setCustomerid(customerid);
		eo.setPaymentid(paymentid);
		eo.setThedate(thedate);
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
