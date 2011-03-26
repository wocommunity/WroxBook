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
	public static final String PARENTID_KEY = "parentid";
	public static final String THEDESCRIPTION_KEY = "thedescription";

	// Relationships
	public static final String TCATEGORY_KEY = "tcategory";
	public static final String TCATEGORYS_KEY = "tcategorys";
	public static final String TITEMS_KEY = "titems";

  private static Logger LOG = Logger.getLogger(_Category.class);

  public Category localInstanceIn(EOEditingContext editingContext) {
    Category localInstance = (Category)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String parentid() {
    return (String) storedValueForKey("parentid");
  }

  public void setParentid(String value) {
    if (_Category.LOG.isDebugEnabled()) {
    	_Category.LOG.debug( "updating parentid from " + parentid() + " to " + value);
    }
    takeStoredValueForKey(value, "parentid");
  }

  public String thedescription() {
    return (String) storedValueForKey("thedescription");
  }

  public void setThedescription(String value) {
    if (_Category.LOG.isDebugEnabled()) {
    	_Category.LOG.debug( "updating thedescription from " + thedescription() + " to " + value);
    }
    takeStoredValueForKey(value, "thedescription");
  }

  public Category tcategory() {
    return (Category)storedValueForKey("tcategory");
  }

  public void setTcategoryRelationship(Category value) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("updating tcategory from " + tcategory() + " to " + value);
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
  
  public NSArray<Category> tcategorys() {
    return (NSArray<Category>)storedValueForKey("tcategorys");
  }

  public NSArray<Category> tcategorys(EOQualifier qualifier) {
    return tcategorys(qualifier, null, false);
  }

  public NSArray<Category> tcategorys(EOQualifier qualifier, boolean fetch) {
    return tcategorys(qualifier, null, fetch);
  }

  public NSArray<Category> tcategorys(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Category> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Category.TCATEGORY_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
      results = tcategorys();
      if (qualifier != null) {
        results = (NSArray<Category>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Category>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToTcategorysRelationship(Category object) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("adding " + object + " to tcategorys relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "tcategorys");
  }

  public void removeFromTcategorysRelationship(Category object) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("removing " + object + " from tcategorys relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "tcategorys");
  }

  public Category createTcategorysRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Category");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "tcategorys");
    return (Category) eo;
  }

  public void deleteTcategorysRelationship(Category object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "tcategorys");
    editingContext().deleteObject(object);
  }

  public void deleteAllTcategorysRelationships() {
    Enumeration objects = tcategorys().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTcategorysRelationship((Category)objects.nextElement());
    }
  }

  public NSArray<Item> titems() {
    return (NSArray<Item>)storedValueForKey("titems");
  }

  public NSArray<Item> titems(EOQualifier qualifier) {
    return titems(qualifier, null, false);
  }

  public NSArray<Item> titems(EOQualifier qualifier, boolean fetch) {
    return titems(qualifier, null, fetch);
  }

  public NSArray<Item> titems(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<Item> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(Item.TCATEGORY_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
      results = titems();
      if (qualifier != null) {
        results = (NSArray<Item>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<Item>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToTitemsRelationship(Item object) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("adding " + object + " to titems relationship");
    }
    addObjectToBothSidesOfRelationshipWithKey(object, "titems");
  }

  public void removeFromTitemsRelationship(Item object) {
    if (_Category.LOG.isDebugEnabled()) {
      _Category.LOG.debug("removing " + object + " from titems relationship");
    }
    removeObjectFromBothSidesOfRelationshipWithKey(object, "titems");
  }

  public Item createTitemsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Item");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, "titems");
    return (Item) eo;
  }

  public void deleteTitemsRelationship(Item object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, "titems");
    editingContext().deleteObject(object);
  }

  public void deleteAllTitemsRelationships() {
    Enumeration objects = titems().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteTitemsRelationship((Item)objects.nextElement());
    }
  }


  public static Category createCategory(EOEditingContext editingContext, String parentid
, String thedescription
) {
    Category eo = (Category) EOUtilities.createAndInsertInstance(editingContext, _Category.ENTITY_NAME);    
		eo.setParentid(parentid);
		eo.setThedescription(thedescription);
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
}
