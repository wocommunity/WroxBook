// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Item.java instead.
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Item extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Item";

	// Attributes
	public static final String CATEGORYID_KEY = "categoryid";
	public static final String QUANTITYINSTOCK_KEY = "quantityinstock";
	public static final String RETAILPRICE_KEY = "retailprice";
	public static final String STOREPRICE_KEY = "storeprice";
	public static final String THEDESCRIPTION_KEY = "thedescription";
	public static final String TITLE_KEY = "title";

	// Relationships
	public static final String TCATEGORY_KEY = "tcategory";

  private static Logger LOG = Logger.getLogger(_Item.class);

  public Item localInstanceIn(EOEditingContext editingContext) {
    Item localInstance = (Item)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String categoryid() {
    return (String) storedValueForKey("categoryid");
  }

  public void setCategoryid(String value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating categoryid from " + categoryid() + " to " + value);
    }
    takeStoredValueForKey(value, "categoryid");
  }

  public Long quantityinstock() {
    return (Long) storedValueForKey("quantityinstock");
  }

  public void setQuantityinstock(Long value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating quantityinstock from " + quantityinstock() + " to " + value);
    }
    takeStoredValueForKey(value, "quantityinstock");
  }

  public java.math.BigDecimal retailprice() {
    return (java.math.BigDecimal) storedValueForKey("retailprice");
  }

  public void setRetailprice(java.math.BigDecimal value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating retailprice from " + retailprice() + " to " + value);
    }
    takeStoredValueForKey(value, "retailprice");
  }

  public java.math.BigDecimal storeprice() {
    return (java.math.BigDecimal) storedValueForKey("storeprice");
  }

  public void setStoreprice(java.math.BigDecimal value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating storeprice from " + storeprice() + " to " + value);
    }
    takeStoredValueForKey(value, "storeprice");
  }

  public String thedescription() {
    return (String) storedValueForKey("thedescription");
  }

  public void setThedescription(String value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating thedescription from " + thedescription() + " to " + value);
    }
    takeStoredValueForKey(value, "thedescription");
  }

  public String title() {
    return (String) storedValueForKey("title");
  }

  public void setTitle(String value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating title from " + title() + " to " + value);
    }
    takeStoredValueForKey(value, "title");
  }

  public Category tcategory() {
    return (Category)storedValueForKey("tcategory");
  }

  public void setTcategoryRelationship(Category value) {
    if (_Item.LOG.isDebugEnabled()) {
      _Item.LOG.debug("updating tcategory from " + tcategory() + " to " + value);
    }
    if (value == null) {
    	Category oldValue = tcategory();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "tcategory");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "tcategory");
    }
  }
  

  public static Item createItem(EOEditingContext editingContext, String categoryid
, Long quantityinstock
, java.math.BigDecimal retailprice
, java.math.BigDecimal storeprice
, String thedescription
, String title
) {
    Item eo = (Item) EOUtilities.createAndInsertInstance(editingContext, _Item.ENTITY_NAME);    
		eo.setCategoryid(categoryid);
		eo.setQuantityinstock(quantityinstock);
		eo.setRetailprice(retailprice);
		eo.setStoreprice(storeprice);
		eo.setThedescription(thedescription);
		eo.setTitle(title);
    return eo;
  }

  public static NSArray<Item> fetchAllItems(EOEditingContext editingContext) {
    return _Item.fetchAllItems(editingContext, null);
  }

  public static NSArray<Item> fetchAllItems(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Item.fetchItems(editingContext, null, sortOrderings);
  }

  public static NSArray<Item> fetchItems(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Item.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Item> eoObjects = (NSArray<Item>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Item fetchItem(EOEditingContext editingContext, String keyName, Object value) {
    return _Item.fetchItem(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Item fetchItem(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Item> eoObjects = _Item.fetchItems(editingContext, qualifier, null);
    Item eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Item)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Item that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Item fetchRequiredItem(EOEditingContext editingContext, String keyName, Object value) {
    return _Item.fetchRequiredItem(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Item fetchRequiredItem(EOEditingContext editingContext, EOQualifier qualifier) {
    Item eoObject = _Item.fetchItem(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Item that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Item localInstanceIn(EOEditingContext editingContext, Item eo) {
    Item localInstance = (eo == null) ? null : (Item)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
