/* WROXPage.java created by chanochw on Tue 11-Sep-2001 */

import com.webobjects.appserver.WOContext;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public class WROXPage extends WROXComponent {

  protected String entityName;
  protected String area;
  
  public WROXPage(WOContext context) {
      super(context);
   }

  public WROXPage getPage() {
    return (WROXPage) context().page();
  }

  public void takeFormValues(NSDictionary values) {
    java.util.Enumeration enumerator = getValueList().objectEnumerator();
 
    while(enumerator.hasMoreElements()) {
      String key = (String) enumerator.nextElement();

      Object value = values.objectForKey(key);
      if (value != null) {
        takeValueForKey(value, key);
      }
    }
  }

  public void setSid(String urlvalue) {
    Object obj = EOUtilities.objectWithPrimaryKeyValue(session().defaultEditingContext(), getEntityName(), urlvalue);
    takeValueForKey(obj, getEntityName());
  }

  public void setIid(String urlvalue) {
    Object obj= EOUtilities.objectWithPrimaryKeyValue(session().defaultEditingContext(), getEntityName(), Integer.decode(urlvalue));
    takeValueForKey(obj, getEntityName());
  }

  public NSArray getValueList() {
    // return new NSArray();
    return NSArray.EmptyArray;
  }

  public String getEntityName() {
    if(entityName == null) {
      entityName = (String)valueForBinding("entityName");
    }
    return entityName;
  }

  public String getArea() {
    return (String)valueForBinding("area");
  }

  public void setArea(String area) {
    this.area = area;
  }

}  
