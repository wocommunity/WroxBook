/* created by DirectToWeb's Project Builder Wizard
*/

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2W;

public class Main extends WOComponent {

    public String username;
    public String password;
    public boolean wantsWebAssistant=false;
    
    public Main(WOContext aContext) {
        super(aContext);
    }
    
    public WOComponent defaultPage() {
        D2W.factory().setWebAssistantEnabled(wantsWebAssistant);
        return D2W.factory().defaultPage(session());
    }

}

