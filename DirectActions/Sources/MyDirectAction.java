/* MyDirectAction.java created by chanochw on Sat 15-Sep-2001 */

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;

public class MyDirectAction extends DirectAction {
  public MyDirectAction(WORequest aRequest) {
    super(aRequest);
  }
  
  public WOActionResults performActionNamed(String name) {

    WROXPage nextPage=(WROXPage) pageWithName(name);
    nextPage.takeFormValues (request().formValues());

    return nextPage;
  }

}
