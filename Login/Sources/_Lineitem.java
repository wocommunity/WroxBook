// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Lineitem.java instead.
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Lineitem extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Lineitem";

	// Attributes
	public static final String PRICE_KEY = "price";
	public static final String QUANTITY_KEY = "quantity";

	// Relationships
	public static final String TORDER_KEY = "torder";

  private static Logger LOG = Logger.getLogger(_Lineitem.class);

  public Lineitem localInstanceIn(EOEditingContext editingContext) {
    Lineitem localInstance = (Lineitem)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public java.math.BigDecimal price() {
    return (java.math.BigDecimal) storedValueForKey("price");
  }

  public void setPrice(java.math.BigDecimal value) {
    if (_Lineitem.LOG.isDebugEnabled()) {
    	_Lineitem.LOG.debug( "updating price from " + price() + " to " + value);
    }
    takeStoredValueForKey(value, "price");
  }

  public Long quantity() {
    return (Long) storedValueForKey("quantity");
  }

  public void setQuantity(Long value) {
    if (_Lineitem.LOG.isDebugEnabled()) {
    	_Lineitem.LOG.debug( "updating quantity from " + quantity() + " to " + value);
    }
    takeStoredValueForKey(value, "quantity");
  }

  public Order torder() {
    return (Order)storedValueForKey("torder");
  }

  public void setTorderRelationship(Order value) {
    if (_Lineitem.LOG.isDebugEnabled()) {
      _Lineitem.LOG.debug("updating torder from " + torder() + " to " + value);
    }
    if (value == null) {
    	Order oldValue = torder();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "torder");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "torder");
    }
  }
  

  public static Lineitem createLineitem(EOEditingContext editingContext, java.math.BigDecimal price
, Long quantity
) {
    Lineitem eo = (Lineitem) EOUtilities.createAndInsertInstance(editingContext, _Lineitem.ENTITY_NAME);    
		eo.setPrice(price);
		eo.setQuantity(quantity);
    return eo;
  }

  public static NSArray<Lineitem> fetchAllLineitems(EOEditingContext editingContext) {
    return _Lineitem.fetchAllLineitems(editingContext, null);
  }

  public static NSArray<Lineitem> fetchAllLineitems(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Lineitem.fetchLineitems(editingContext, null, sortOrderings);
  }

  public static NSArray<Lineitem> fetchLineitems(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Lineitem.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Lineitem> eoObjects = (NSArray<Lineitem>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Lineitem fetchLineitem(EOEditingContext editingContext, String keyName, Object value) {
    return _Lineitem.fetchLineitem(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Lineitem fetchLineitem(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Lineitem> eoObjects = _Lineitem.fetchLineitems(editingContext, qualifier, null);
    Lineitem eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Lineitem)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Lineitem that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Lineitem fetchRequiredLineitem(EOEditingContext editingContext, String keyName, Object value) {
    return _Lineitem.fetchRequiredLineitem(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Lineitem fetchRequiredLineitem(EOEditingContext editingContext, EOQualifier qualifier) {
    Lineitem eoObject = _Lineitem.fetchLineitem(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Lineitem that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Lineitem localInstanceIn(EOEditingContext editingContext, Lineitem eo) {
    Lineitem localInstance = (eo == null) ? null : (Lineitem)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
