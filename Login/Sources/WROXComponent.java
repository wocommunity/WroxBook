/* WROXComponent.java created by chanochw on Tue 11-Sep-2001 */

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;
import com.webobjects.foundation.NSArray;


public class WROXComponent extends WOComponent {

  public WROXComponent(WOContext context) {
      super(context);
  }

  public boolean synchronizesVariablesWithBindings() {
    if (isStateless()) {
      return false;
    }
    return true;
  }

  public void appendToResponse (WOResponse response, WOContext context) {
    if (!synchronizesVariablesWithBindings()) {
      pullBindings();
    }
    super.appendToResponse(response, context);
  }

  public void takeValuesFromRequest( WORequest request, WOContext context) {
    if (!synchronizesVariablesWithBindings()) {
      pullBindings();
    }
    super.takeValuesFromRequest(request, context);
  }

  public WOActionResults invokeAction(WORequest request, WOContext context) {
    if (!synchronizesVariablesWithBindings()) {
      pullBindings();
    }
    return super.invokeAction(request, context);
  }

  public void pullBindings() {
    java.util.Enumeration enumerator = getBindingList().objectEnumerator();

    while(enumerator.hasMoreElements()) {
      String key = (String) enumerator.nextElement();
      this.takeValueForKey(valueForBinding(key), key);
    }
  }

  public void reset() {
    java.util.Enumeration enumerator = getBindingList().objectEnumerator();
    String key;
    while (enumerator.hasMoreElements()) {
      key = (String) enumerator.nextElement();
      takeValueForKey(null, key);
    }
  }

  public NSArray getBindingList() {
    // return new NSArray();
    return NSArray.EmptyArray;
  }

}


