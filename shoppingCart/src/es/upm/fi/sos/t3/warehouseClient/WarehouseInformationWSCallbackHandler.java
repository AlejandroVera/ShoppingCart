
/**
 * WarehouseInformationWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package es.upm.fi.sos.t3.warehouseClient;

    /**
     *  WarehouseInformationWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WarehouseInformationWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WarehouseInformationWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WarehouseInformationWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getProductAvailableUnits method
            * override this method for handling normal response from getProductAvailableUnits operation
            */
           public void receiveResultgetProductAvailableUnits(
                    es.upm.fi.sos.t3.warehouseClient.WarehouseInformationWSStub.ProductAvailableUnits result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductAvailableUnits operation
           */
            public void receiveErrorgetProductAvailableUnits(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductPrice method
            * override this method for handling normal response from getProductPrice operation
            */
           public void receiveResultgetProductPrice(
                    es.upm.fi.sos.t3.warehouseClient.WarehouseInformationWSStub.ProductPrice result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductPrice operation
           */
            public void receiveErrorgetProductPrice(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductsList method
            * override this method for handling normal response from getProductsList operation
            */
           public void receiveResultgetProductsList(
                    es.upm.fi.sos.t3.warehouseClient.WarehouseInformationWSStub.ProductsList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductsList operation
           */
            public void receiveErrorgetProductsList(java.lang.Exception e) {
            }
                


    }
    