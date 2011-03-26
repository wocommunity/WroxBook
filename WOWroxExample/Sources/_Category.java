// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Category.java instead.
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Category extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Category";

	// Attributes
	public static final String CATEGORY_ID_KEY = "categoryID";
	public static final String THE_DESCRIPTION_KEY = "theDescription";

	// Relationships
	public static final String CHILDREN_KEY = "children";
	public static final String ITEMS_KEY = "items";
	public static final String PARENT_KEY = "parent";

  private static Logger LOG = Logger.getLogger(_Category.class);

  public Category localInstanceIn(EOEditingContext editingContext) {
    Category localInstance = (Category)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String categoryID() {
    return (String) storedValueForKey("categoryID");
  }

  public void setCategoryID(String value) {
    if (_Category.LOG.isDebugEnabled()) {
    	_Category.LOG.debug( "updating categoryID from " + categoryID() + " to " + value);
    }
    takeStoredValueForKey(value, "categoryID");
  }

  public String theDescription() {
    return (String) storedValueForKey("theDescription");
  }

  public void setTheDescription(String value) {
    if (_Category.LOG.isDebugEnabled()) {
    	_Category.LOG.debug( "updating theDescription from " + theDescription() + " to " + value);
    }
    takeStoredValueForKey(value, "theDescription");
  }

  public Category parent() {
    return (Category)storedValueForKey("parent");
  }

  public void setParentRelationship(Category value) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("updating parent from " + parent() + " to " + value);
    }
    if (value == null) {
    	Category oldValue = parent();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, "parent");
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, "parent");
    }
  }
  
  public NSArray<Category> children() {
    return (NSArray<Category>)storedValueForKey("children");
  }

  public NSArray<Category> children(EOQualifier qualifier) {
    return children(qualifier, null, false);
  }

  public NSArray<Category> children(EOQualifier qualifier, boolean fetch) {
    return children(qualifier, null, fetch);
  }

  public NSArray<Category> children(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Category> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Category.PARENT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = Category.fetchCategories(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = children();
      if (qualifier != null) {
        results = (NSArray<Category>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Category>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToChildrenRelationship(Category object) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("adding " + object + " to children relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "children");
  }

  public void removeFromChildrenRelationship(Category object) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("removing " + object + " from children relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "children");
  }

  public Category createChildrenRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Category");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "children");
    return (Category) eo;
  }

  public void deleteChildrenRelationship(Category object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "children");
  }

  public void deleteAllChildrenRelationships() {
    Enumeration objects = children().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteChildrenRelationship((Category)objects.nextElement());
    }
  }

  public NSArray<Item> items() {
    return (NSArray<Item>)storedValueForKey("items");
  }

  public NSArray<Item> items(EOQualifier qualifier) {
    return items(qualifier, null, false);
  }

  public NSArray<Item> items(EOQualifier qualifier, boolean fetch) {
    return items(qualifier, null, fetch);
  }

  public NSArray<Item> items(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Item> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Item.CATEGORY_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = Item.fetchItems(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = items();
      if (qualifier != null) {
        results = (NSArray<Item>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Item>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToItemsRelationship(Item object) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("adding " + object + " to items relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "items");
  }

  public void removeFromItemsRelationship(Item object) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("removing " + object + " from items relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "items");
  }

  public Item createItemsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Item");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "items");
    return (Item) eo;
  }

  public void deleteItemsRelationship(Item object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "items");
    editingContext().deleteObject(object);
  }

  public void deleteAllItemsRelationships() {
    Enumeration objects = items().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteItemsRelationship((Item)objects.nextElement());
    }
  }


  public static Category createCategory(EOEditingContext editingContext, String categoryID
, String theDescription
, Category parent) {
    Category eo = (Category) EOUtilities.createAndInsertInstance(editingContext, _Category.ENTITY_NAME);    
		eo.setCategoryID(categoryID);
		eo.setTheDescription(theDescription);
    eo.setParentRelationship(parent);
    return eo;
  }

  public static NSArray<Category> fetchAllCategories(EOEditingContext editingContext) {
    return _Category.fetchAllCategories(editingContext, null);
  }

  public static NSArray<Category> fetchAllCategories(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Category.fetchCategories(editingContext, null, sortOrderings);
  }

  public static NSArray<Category> fetchCategories(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Category.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Category> eoObjects = (NSArray<Category>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Category fetchCategory(EOEditingContext editingContext, String keyName, Object value) {
    return _Category.fetchCategory(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Category fetchCategory(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Category> eoObjects = _Category.fetchCategories(editingContext, qualifier, null);
    Category eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Category)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Category that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Category fetchRequiredCategory(EOEditingContext editingContext, String keyName, Object value) {
    return _Category.fetchRequiredCategory(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Category fetchRequiredCategory(EOEditingContext editingContext, EOQualifier qualifier) {
    Category eoObject = _Category.fetchCategory(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Category that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Category localInstanceIn(EOEditingContext editingContext, Category eo) {
    Category localInstance = (eo == null) ? null : (Category)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<Category> fetchFetchSpec(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("FetchSpec", "Category");
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<Category>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<Category> fetchFetchSpec(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("FetchSpec", "Category");
    return (NSArray<Category>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
}
