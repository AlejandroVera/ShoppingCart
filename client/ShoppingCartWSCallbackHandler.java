
/**
 * ShoppingCartWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */

    package client;

    /**
     *  ShoppingCartWSCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ShoppingCartWSCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ShoppingCartWSCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ShoppingCartWSCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for productsInCart method
            * override this method for handling normal response from productsInCart operation
            */
           public void receiveResultproductsInCart(
                    client.ShoppingCartWSStub.ProductsAmountsList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from productsInCart operation
           */
            public void receiveErrorproductsInCart(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductAvailableUnits method
            * override this method for handling normal response from getProductAvailableUnits operation
            */
           public void receiveResultgetProductAvailableUnits(
                    client.ShoppingCartWSStub.ProductAvailableUnits result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductAvailableUnits operation
           */
            public void receiveErrorgetProductAvailableUnits(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for budget method
            * override this method for handling normal response from budget operation
            */
           public void receiveResultbudget(
                    client.ShoppingCartWSStub.Budget result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from budget operation
           */
            public void receiveErrorbudget(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for login method
            * override this method for handling normal response from login operation
            */
           public void receiveResultlogin(
                    client.ShoppingCartWSStub.LoginResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from login operation
           */
            public void receiveErrorlogin(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for costOfCart method
            * override this method for handling normal response from costOfCart operation
            */
           public void receiveResultcostOfCart(
                    client.ShoppingCartWSStub.CostOfCart result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from costOfCart operation
           */
            public void receiveErrorcostOfCart(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductsList method
            * override this method for handling normal response from getProductsList operation
            */
           public void receiveResultgetProductsList(
                    client.ShoppingCartWSStub.ProductsList result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductsList operation
           */
            public void receiveErrorgetProductsList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for checkProductAvailability method
            * override this method for handling normal response from checkProductAvailability operation
            */
           public void receiveResultcheckProductAvailability(
                    client.ShoppingCartWSStub.ProductAvailable result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from checkProductAvailability operation
           */
            public void receiveErrorcheckProductAvailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addToCart method
            * override this method for handling normal response from addToCart operation
            */
           public void receiveResultaddToCart(
                    client.ShoppingCartWSStub.ProductAvailableUnits result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addToCart operation
           */
            public void receiveErroraddToCart(java.lang.Exception e) {
            }
                
               // No methods generated for meps other than in-out
                
           /**
            * auto generated Axis2 call back method for buy method
            * override this method for handling normal response from buy operation
            */
           public void receiveResultbuy(
                    client.ShoppingCartWSStub.Budget result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from buy operation
           */
            public void receiveErrorbuy(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for removeFromCart method
            * override this method for handling normal response from removeFromCart operation
            */
           public void receiveResultremoveFromCart(
                    client.ShoppingCartWSStub.ProductAvailableUnits result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from removeFromCart operation
           */
            public void receiveErrorremoveFromCart(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProductPrice method
            * override this method for handling normal response from getProductPrice operation
            */
           public void receiveResultgetProductPrice(
                    client.ShoppingCartWSStub.ProductPrice result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProductPrice operation
           */
            public void receiveErrorgetProductPrice(java.lang.Exception e) {
            }
                


    }
    