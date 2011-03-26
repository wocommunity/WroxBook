// Address.java
// Created on Wed Sep 12 22:24:07  2001 by Apple EOModeler Version 5.0


public class Address extends _Address {

    public Address() {
        super();
    }
 
    public String complement() {
        return (String)storedValueForKey("complement");
    }

    public void setComplement(String value) {
        takeStoredValueForKey(value, "complement");
    }

 }
