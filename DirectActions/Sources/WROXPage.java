/* WROXPage.java created by chanochw on Fri 14-Sep-2001 */

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public abstract class WROXPage extends WROXComponent {

  public void takeFormValues(NSDictionary value) {
    java.util.Enumeration enumerator = getValueList().objectEnumerator();
    while(enumerator.hasMoreElements()) {
      String key=(String) enumerator.nextElement();

      Object obj = context().request().formValueForKey(key);
      if (obj != null) {
        takeValueForKey(obj,key);
      }
    }
  }

  public NSArray getValueList() {
    return NSArray.EmptyArray;
  }

  public WROXPage(WOContext context) {
    super(context);
  }

  public WROXPage getPage() {
    return (WROXPage)context().page();
  }
}
