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
	public static final String QUANTITY_IN_STOCK_KEY = "quantityInStock";
	public static final String RETAIL_PRICE_KEY = "retailPrice";
	public static final String STORE_PRICE_KEY = "storePrice";
	public static final String THE_DESCRIPTION_KEY = "theDescription";
	public static final String TITLE_KEY = "title";

	// Relationships
	public static final String CATEGORY_KEY = "category";

  private static Logger LOG = Logger.getLogger(_Item.class);

  public Item localInstanceIn(EOEditingContext editingContext) {
    Item localInstance = (Item)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Integer quantityInStock() {
    return (Integer) storedValueForKey("quantityInStock");
  }

  public void setQuantityInStock(Integer value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating quantityInStock from " + quantityInStock() + " to " + value);
    }
    takeStoredValueForKey(value, "quantityInStock");
  }

  public Double retailPrice() {
    return (Double) storedValueForKey("retailPrice");
  }

  public void setRetailPrice(Double value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating retailPrice from " + retailPrice() + " to " + value);
    }
    takeStoredValueForKey(value, "retailPrice");
  }

  public Double storePrice() {
    return (Double) storedValueForKey("storePrice");
  }

  public void setStorePrice(Double value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating storePrice from " + storePrice() + " to " + value);
    }
    takeStoredValueForKey(value, "storePrice");
  }

  public String theDescription() {
    return (String) storedValueForKey("theDescription");
  }

  public void setTheDescription(String value) {
    if (_Item.LOG.isDebugEnabled()) {
    	_Item.LOG.debug( "updating theDescription from " + theDescription() + " to " + value);
    }
    takeStoredValueForKey(value, "theDescription");
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

  public Category category() {
    return (Category)storedValueForKey("category");
  }

  public void setCategoryRelationship(Category value) {
    if (_Item.LOG.isDebugEnabled()) {
      _Item.LOG.debug("updating category from " + category() + " to " + value);
    }
    if (value == null) {
    	Category oldValue = category();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "category");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "category");
    }
  }
  

  public static Item createItem(EOEditingContext editingContext, Integer quantityInStock
, Double retailPrice
, Double storePrice
, String theDescription
, String title
, Category category) {
    Item eo = (Item) EOUtilities.createAndInsertInstance(editingContext, _Item.ENTITY_NAME);    
		eo.setQuantityInStock(quantityInStock);
		eo.setRetailPrice(retailPrice);
		eo.setStorePrice(storePrice);
		eo.setTheDescription(theDescription);
		eo.setTitle(title);
    eo.setCategoryRelationship(category);
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
  public static NSArray<Item> fetchFetchSpec(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("FetchSpec", "Item");
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<Item>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<Item> fetchFetchSpec(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("FetchSpec", "Item");
    return (NSArray<Item>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
