// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to LineItem.java instead.
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _LineItem extends  EOGenericRecord {
	public static final String ENTITY_NAME = "LineItem";

	// Attributes
	public static final String PRICE_KEY = "price";
	public static final String QUANTITY_KEY = "quantity";

	// Relationships
	public static final String ITEM_KEY = "item";
	public static final String ORDER_KEY = "order";

  private static Logger LOG = Logger.getLogger(_LineItem.class);

  public LineItem localInstanceIn(EOEditingContext editingContext) {
    LineItem localInstance = (LineItem)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Double price() {
    return (Double) storedValueForKey("price");
  }

  public void setPrice(Double value) {
    if (_LineItem.LOG.isDebugEnabled()) {
    	_LineItem.LOG.debug( "updating price from " + price() + " to " + value);
    }
    takeStoredValueForKey(value, "price");
  }

  public Integer quantity() {
    return (Integer) storedValueForKey("quantity");
  }

  public void setQuantity(Integer value) {
    if (_LineItem.LOG.isDebugEnabled()) {
    	_LineItem.LOG.debug( "updating quantity from " + quantity() + " to " + value);
    }
    takeStoredValueForKey(value, "quantity");
  }

  public Item item() {
    return (Item)storedValueForKey("item");
  }

  public void setItemRelationship(Item value) {
    if (_LineItem.LOG.isDebugEnabled()) {
      _LineItem.LOG.debug("updating item from " + item() + " to " + value);
    }
    if (value == null) {
    	Item oldValue = item();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "item");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "item");
    }
  }
  
  public Order order() {
    return (Order)storedValueForKey("order");
  }

  public void setOrderRelationship(Order value) {
    if (_LineItem.LOG.isDebugEnabled()) {
      _LineItem.LOG.debug("updating order from " + order() + " to " + value);
    }
    if (value == null) {
    	Order oldValue = order();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "order");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "order");
    }
  }
  

  public static LineItem createLineItem(EOEditingContext editingContext, Double price
, Integer quantity
, Item item, Order order) {
    LineItem eo = (LineItem) EOUtilities.createAndInsertInstance(editingContext, _LineItem.ENTITY_NAME);    
		eo.setPrice(price);
		eo.setQuantity(quantity);
    eo.setItemRelationship(item);
    eo.setOrderRelationship(order);
    return eo;
  }

  public static NSArray<LineItem> fetchAllLineItems(EOEditingContext editingContext) {
    return _LineItem.fetchAllLineItems(editingContext, null);
  }

  public static NSArray<LineItem> fetchAllLineItems(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _LineItem.fetchLineItems(editingContext, null, sortOrderings);
  }

  public static NSArray<LineItem> fetchLineItems(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_LineItem.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<LineItem> eoObjects = (NSArray<LineItem>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static LineItem fetchLineItem(EOEditingContext editingContext, String keyName, Object value) {
    return _LineItem.fetchLineItem(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static LineItem fetchLineItem(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<LineItem> eoObjects = _LineItem.fetchLineItems(editingContext, qualifier, null);
    LineItem eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (LineItem)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one LineItem that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static LineItem fetchRequiredLineItem(EOEditingContext editingContext, String keyName, Object value) {
    return _LineItem.fetchRequiredLineItem(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static LineItem fetchRequiredLineItem(EOEditingContext editingContext, EOQualifier qualifier) {
    LineItem eoObject = _LineItem.fetchLineItem(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no LineItem that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static LineItem localInstanceIn(EOEditingContext editingContext, LineItem eo) {
    LineItem localInstance = (eo == null) ? null : (LineItem)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
