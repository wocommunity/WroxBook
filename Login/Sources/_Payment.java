// $LastChangedRevision: 5810 $ DO NOT EDIT.  Make changes to Payment.java instead.
import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

@SuppressWarnings("all")
public abstract class _Payment extends  EOGenericRecord {
	public static final String ENTITY_NAME = "Payment";

	// Attributes
	public static final String AMOUNT_KEY = "amount";
	public static final String CREDITCARDEXPIRYDATE_KEY = "creditcardexpirydate";
	public static final String CREDITCARDNAME_KEY = "creditcardname";
	public static final String CREDITCARDNUMBER_KEY = "creditcardnumber";
	public static final String DATEPAID_KEY = "datepaid";
	public static final String TYPE_KEY = "type";

	// Relationships

  private static Logger LOG = Logger.getLogger(_Payment.class);

  public Payment localInstanceIn(EOEditingContext editingContext) {
    Payment localInstance = (Payment)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public java.math.BigDecimal amount() {
    return (java.math.BigDecimal) storedValueForKey("amount");
  }

  public void setAmount(java.math.BigDecimal value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating amount from " + amount() + " to " + value);
    }
    takeStoredValueForKey(value, "amount");
  }

  public String creditcardexpirydate() {
    return (String) storedValueForKey("creditcardexpirydate");
  }

  public void setCreditcardexpirydate(String value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating creditcardexpirydate from " + creditcardexpirydate() + " to " + value);
    }
    takeStoredValueForKey(value, "creditcardexpirydate");
  }

  public String creditcardname() {
    return (String) storedValueForKey("creditcardname");
  }

  public void setCreditcardname(String value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating creditcardname from " + creditcardname() + " to " + value);
    }
    takeStoredValueForKey(value, "creditcardname");
  }

  public String creditcardnumber() {
    return (String) storedValueForKey("creditcardnumber");
  }

  public void setCreditcardnumber(String value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating creditcardnumber from " + creditcardnumber() + " to " + value);
    }
    takeStoredValueForKey(value, "creditcardnumber");
  }

  public NSTimestamp datepaid() {
    return (NSTimestamp) storedValueForKey("datepaid");
  }

  public void setDatepaid(NSTimestamp value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating datepaid from " + datepaid() + " to " + value);
    }
    takeStoredValueForKey(value, "datepaid");
  }

  public String type() {
    return (String) storedValueForKey("type");
  }

  public void setType(String value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating type from " + type() + " to " + value);
    }
    takeStoredValueForKey(value, "type");
  }


  public static Payment createPayment(EOEditingContext editingContext, java.math.BigDecimal amount
, String creditcardexpirydate
, String creditcardname
, String creditcardnumber
, String type
) {
    Payment eo = (Payment) EOUtilities.createAndInsertInstance(editingContext, _Payment.ENTITY_NAME);    
		eo.setAmount(amount);
		eo.setCreditcardexpirydate(creditcardexpirydate);
		eo.setCreditcardname(creditcardname);
		eo.setCreditcardnumber(creditcardnumber);
		eo.setType(type);
    return eo;
  }

  public static NSArray<Payment> fetchAllPayments(EOEditingContext editingContext) {
    return _Payment.fetchAllPayments(editingContext, null);
  }

  public static NSArray<Payment> fetchAllPayments(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Payment.fetchPayments(editingContext, null, sortOrderings);
  }

  public static NSArray<Payment> fetchPayments(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    EOFetchSpecification fetchSpec = new EOFetchSpecification(_Payment.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<Payment> eoObjects = (NSArray<Payment>)editingContext.objectsWithFetchSpecification(fetchSpec);
    return eoObjects;
  }

  public static Payment fetchPayment(EOEditingContext editingContext, String keyName, Object value) {
    return _Payment.fetchPayment(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Payment fetchPayment(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Payment> eoObjects = _Payment.fetchPayments(editingContext, qualifier, null);
    Payment eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = (Payment)eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Payment that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Payment fetchRequiredPayment(EOEditingContext editingContext, String keyName, Object value) {
    return _Payment.fetchRequiredPayment(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static Payment fetchRequiredPayment(EOEditingContext editingContext, EOQualifier qualifier) {
    Payment eoObject = _Payment.fetchPayment(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Payment that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Payment localInstanceIn(EOEditingContext editingContext, Payment eo) {
    Payment localInstance = (eo == null) ? null : (Payment)EOUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
