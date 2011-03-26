// Generated by the WebObjects Wizard Fri Sep 14 14:28:54 GMT 2001

import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;

public class MenuElement extends WROXPage {
  protected String area;
  protected String highlight = "FFFF00";
  protected String background = "CE0031";
  protected String align = "center";
  protected String width = "72";

  public MenuElement(WOContext context) {
      super(context);
  }

  public NSArray bindingList() {
    return new NSArray(new Object[] {"area","highlight","background"});
  }

  public boolean isStateless() {
    return true;
  }

  public String getColor() {
    String area = (String)valueForBinding("area");

    if (getPage().getArea().equals(area)) {
      return highlight;
    } else {
      return background;
    }
  }
  
  public String getArea() {
    return area;
  }
  public void setArea(String newArea) {
    area = newArea;
  }

  public String getHighlight() {
    return highlight;
  }
  public void setHighlight(String newHighlight) {
    highlight = newHighlight;
  }
  public String getBackground() {
    return background;
  }
  public void setBackground(String newBackground) {
    background = newBackground;
  }

  public String getAlign() {
    return align;
  }
  public void setAlign(String newAlign) {
    align = newAlign;
  }

  public String getWidth() {
    return width;
  }
  public void setWidth(String newWidth) {
    width = newWidth;
  }

}

