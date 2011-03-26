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
	public static final String CREDIT_CARD_EXPIRY_DATE_KEY = "creditCardExpiryDate";
	public static final String CREDIT_CARD_NAME_KEY = "creditCardName";
	public static final String CREDIT_CARD_NUMBER_KEY = "creditCardNumber";
	public static final String DATE_PAID_KEY = "datePaid";
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

  public Double amount() {
    return (Double) storedValueForKey("amount");
  }

  public void setAmount(Double value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating amount from " + amount() + " to " + value);
    }
    takeStoredValueForKey(value, "amount");
  }

  public String creditCardExpiryDate() {
    return (String) storedValueForKey("creditCardExpiryDate");
  }

  public void setCreditCardExpiryDate(String value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating creditCardExpiryDate from " + creditCardExpiryDate() + " to " + value);
    }
    takeStoredValueForKey(value, "creditCardExpiryDate");
  }

  public String creditCardName() {
    return (String) storedValueForKey("creditCardName");
  }

  public void setCreditCardName(String value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating creditCardName from " + creditCardName() + " to " + value);
    }
    takeStoredValueForKey(value, "creditCardName");
  }

  public String creditCardNumber() {
    return (String) storedValueForKey("creditCardNumber");
  }

  public void setCreditCardNumber(String value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating creditCardNumber from " + creditCardNumber() + " to " + value);
    }
    takeStoredValueForKey(value, "creditCardNumber");
  }

  public NSTimestamp datePaid() {
    return (NSTimestamp) storedValueForKey("datePaid");
  }

  public void setDatePaid(NSTimestamp value) {
    if (_Payment.LOG.isDebugEnabled()) {
    	_Payment.LOG.debug( "updating datePaid from " + datePaid() + " to " + value);
    }
    takeStoredValueForKey(value, "datePaid");
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


  public static Payment createPayment(EOEditingContext editingContext, Double amount
, String creditCardExpiryDate
, String creditCardName
, String creditCardNumber
, String type
) {
    Payment eo = (Payment) EOUtilities.createAndInsertInstance(editingContext, _Payment.ENTITY_NAME);    
		eo.setAmount(amount);
		eo.setCreditCardExpiryDate(creditCardExpiryDate);
		eo.setCreditCardName(creditCardName);
		eo.setCreditCardNumber(creditCardNumber);
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
