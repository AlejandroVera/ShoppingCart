
/**
 * NotEnoughUnitsError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package client;

public class NotEnoughUnitsError extends java.lang.Exception{
    
    private client.ShoppingCartWSStub.ErrorMessage faultMessage;

    
        public NotEnoughUnitsError() {
            super("NotEnoughUnitsError");
        }

        public NotEnoughUnitsError(java.lang.String s) {
           super(s);
        }

        public NotEnoughUnitsError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NotEnoughUnitsError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(client.ShoppingCartWSStub.ErrorMessage msg){
       faultMessage = msg;
    }
    
    public client.ShoppingCartWSStub.ErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    