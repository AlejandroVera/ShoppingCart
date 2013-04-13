
/**
 * ProductUnknownError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

package shoppingCart;

public class ProductUnknownError extends java.lang.Exception{
    
    private es.upm.fi.sos.t3.shoppingcart.ErrorMessage faultMessage;

    
        public ProductUnknownError() {
            super("ProductUnknownError");
        }

        public ProductUnknownError(java.lang.String s) {
           super(s);
        }

        public ProductUnknownError(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ProductUnknownError(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(es.upm.fi.sos.t3.shoppingcart.ErrorMessage msg){
       faultMessage = msg;
    }
    
    public es.upm.fi.sos.t3.shoppingcart.ErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    