/* WROXPage.java created by chanochw on Fri 14-Sep-2001 */

import com.webobjects.appserver.WOContext;


public abstract class WROXPage extends WROXComponent {

  public WROXPage(WOContext context) {
    super(context);
  }

  public WROXPage getPage() {
    return (WROXPage)context().page();
  }
}
