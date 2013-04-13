/**
 * ShoppingCartWSStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.4  Built on : Dec 19, 2010 (08:18:42 CET)
 */
package client;

/*
 *  ShoppingCartWSStub java implementation
 */

public class ShoppingCartWSStub extends org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis())
				+ "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService(
				"ShoppingCartWS" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[12];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "productsInCart"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es",
				"getProductAvailableUnits"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "budget"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "login"));
		_service.addOperation(__operation);

		_operations[3] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "costOfCart"));
		_service.addOperation(__operation);

		_operations[4] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "getProductsList"));
		_service.addOperation(__operation);

		_operations[5] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es",
				"checkProductAvailability"));
		_service.addOperation(__operation);

		_operations[6] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "addToCart"));
		_service.addOperation(__operation);

		_operations[7] = __operation;

		__operation = new org.apache.axis2.description.RobustOutOnlyAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "logout"));
		_service.addOperation(__operation);

		_operations[8] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "buy"));
		_service.addOperation(__operation);

		_operations[9] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "removeFromCart"));
		_service.addOperation(__operation);

		_operations[10] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "getProductPrice"));
		_service.addOperation(__operation);

		_operations[11] = __operation;

	}

	// populates the faults
	private void populateFaults() {

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotEnoughUnitsError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotEnoughUnitsError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotEnoughBudgetError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotEnoughBudgetError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ProductUnknownError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

		faultExceptionNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultExceptionClassNameMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.NotValidSessionError");
		faultMessageMap.put(new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage"),
				"ShoppingCart.client.ShoppingCartWSStub$ErrorMessage");

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public ShoppingCartWSStub(
			org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public ShoppingCartWSStub(
			org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener)
					throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(
				configurationContext, _service);

		_serviceClient.getOptions().setTo(
				new org.apache.axis2.addressing.EndpointReference(
						targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		// Set the soap version
		_serviceClient
		.getOptions()
		.setSoapVersionURI(
				org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

	}

	/**
	 * Default Constructor
	 */
	public ShoppingCartWSStub(
			org.apache.axis2.context.ConfigurationContext configurationContext)
					throws org.apache.axis2.AxisFault {

		this(configurationContext,
				"http://localhost:8080/axis2/services/ShoppingCartWS");

	}

	/**
	 * Default Constructor
	 */
	public ShoppingCartWSStub() throws org.apache.axis2.AxisFault {

		this("http://localhost:8080/axis2/services/ShoppingCartWS");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public ShoppingCartWSStub(java.lang.String targetEndpoint)
			throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#productsInCart
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.ProductsAmountsList productsInCart(

			)

					throws java.rmi.RemoteException

					, client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("urn:productsInCart");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			// Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an
			// empty soap message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
					.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.ProductsAmountsList.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.ProductsAmountsList) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startproductsInCart
	 */
	public void startproductsInCart(

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction("urn:productsInCart");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is taken to be "document". No input parameters
		// according to the WS-Basic profile in this case we have to send an
		// empty soap message
		org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
				.getOptions().getSoapVersionURI());
		env = factory.getDefaultEnvelope();

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(
							resultEnv.getBody().getFirstElement(),
							client.ShoppingCartWSStub.ProductsAmountsList.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultproductsInCart((client.ShoppingCartWSStub.ProductsAmountsList) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorproductsInCart(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorproductsInCart((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErrorproductsInCart(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorproductsInCart(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorproductsInCart(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorproductsInCart(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorproductsInCart(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorproductsInCart(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorproductsInCart(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorproductsInCart(f);
							}
						} else {
							callback.receiveErrorproductsInCart(f);
						}
					} else {
						callback.receiveErrorproductsInCart(f);
					}
				} else {
					callback.receiveErrorproductsInCart(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorproductsInCart(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#getProductAvailableUnits
	 * @param productName14
	 * 
	 * @throws client.ProductUnknownError
	 *             :
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.ProductAvailableUnits getProductAvailableUnits(

			client.ShoppingCartWSStub.ProductName productName14)

					throws java.rmi.RemoteException

					, client.ProductUnknownError, client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction(
					"urn:getProductAvailableUnits");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), productName14,
					optimizeContent(new javax.xml.namespace.QName(
							"http://shoppingCart.t3.sos.fi.upm.es",
							"getProductAvailableUnits")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.ProductAvailableUnits.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.ProductAvailableUnits) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.ProductUnknownError) {
							throw (client.ProductUnknownError) ex;
						}

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startgetProductAvailableUnits
	 * @param productName14
	 */
	public void startgetProductAvailableUnits(

			client.ShoppingCartWSStub.ProductName productName14,

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction("urn:getProductAvailableUnits");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), productName14,
				optimizeContent(new javax.xml.namespace.QName(
						"http://shoppingCart.t3.sos.fi.upm.es",
						"getProductAvailableUnits")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(
							resultEnv.getBody().getFirstElement(),
							client.ShoppingCartWSStub.ProductAvailableUnits.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetProductAvailableUnits((client.ShoppingCartWSStub.ProductAvailableUnits) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetProductAvailableUnits(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.ProductUnknownError) {
									callback.receiveErrorgetProductAvailableUnits((client.ProductUnknownError) ex);
									return;
								}

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorgetProductAvailableUnits((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErrorgetProductAvailableUnits(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductAvailableUnits(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductAvailableUnits(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductAvailableUnits(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductAvailableUnits(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductAvailableUnits(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductAvailableUnits(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductAvailableUnits(f);
							}
						} else {
							callback.receiveErrorgetProductAvailableUnits(f);
						}
					} else {
						callback.receiveErrorgetProductAvailableUnits(f);
					}
				} else {
					callback.receiveErrorgetProductAvailableUnits(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetProductAvailableUnits(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#budget
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.Budget budget(

			)

					throws java.rmi.RemoteException

					, client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient.getOptions().setAction("urn:budget");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			// Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an
			// empty soap message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
					.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(), client.ShoppingCartWSStub.Budget.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.Budget) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startbudget
	 */
	public void startbudget(

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[2].getName());
		_operationClient.getOptions().setAction("urn:budget");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is taken to be "document". No input parameters
		// according to the WS-Basic profile in this case we have to send an
		// empty soap message
		org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
				.getOptions().getSoapVersionURI());
		env = factory.getDefaultEnvelope();

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(resultEnv
							.getBody().getFirstElement(),
							client.ShoppingCartWSStub.Budget.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultbudget((client.ShoppingCartWSStub.Budget) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorbudget(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorbudget((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErrorbudget(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbudget(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbudget(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbudget(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbudget(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbudget(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbudget(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbudget(f);
							}
						} else {
							callback.receiveErrorbudget(f);
						}
					} else {
						callback.receiveErrorbudget(f);
					}
				} else {
					callback.receiveErrorbudget(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorbudget(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[2].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#login
	 * @param login18
	 */

	public client.ShoppingCartWSStub.LoginResponse login(

			client.ShoppingCartWSStub.Login login18)

					throws java.rmi.RemoteException

					{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction("urn:login");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), login18,
					optimizeContent(new javax.xml.namespace.QName(
							"http://shoppingCart.t3.sos.fi.upm.es", "login")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.LoginResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.LoginResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
					}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startlogin
	 * @param login18
	 */
	public void startlogin(

			client.ShoppingCartWSStub.Login login18,

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction("urn:login");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), login18,
				optimizeContent(new javax.xml.namespace.QName(
						"http://shoppingCart.t3.sos.fi.upm.es", "login")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(
							resultEnv.getBody().getFirstElement(),
							client.ShoppingCartWSStub.LoginResponse.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultlogin((client.ShoppingCartWSStub.LoginResponse) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorlogin(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								callback.receiveErrorlogin(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorlogin(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorlogin(f);
							}
						} else {
							callback.receiveErrorlogin(f);
						}
					} else {
						callback.receiveErrorlogin(f);
					}
				} else {
					callback.receiveErrorlogin(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorlogin(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[3].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#costOfCart
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.CostOfCart costOfCart(

			)

					throws java.rmi.RemoteException

					, client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[4].getName());
			_operationClient.getOptions().setAction("urn:costOfCart");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			// Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an
			// empty soap message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
					.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.CostOfCart.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.CostOfCart) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startcostOfCart
	 */
	public void startcostOfCart(

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[4].getName());
		_operationClient.getOptions().setAction("urn:costOfCart");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is taken to be "document". No input parameters
		// according to the WS-Basic profile in this case we have to send an
		// empty soap message
		org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
				.getOptions().getSoapVersionURI());
		env = factory.getDefaultEnvelope();

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(resultEnv
							.getBody().getFirstElement(),
							client.ShoppingCartWSStub.CostOfCart.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultcostOfCart((client.ShoppingCartWSStub.CostOfCart) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorcostOfCart(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorcostOfCart((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErrorcostOfCart(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcostOfCart(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcostOfCart(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcostOfCart(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcostOfCart(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcostOfCart(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcostOfCart(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcostOfCart(f);
							}
						} else {
							callback.receiveErrorcostOfCart(f);
						}
					} else {
						callback.receiveErrorcostOfCart(f);
					}
				} else {
					callback.receiveErrorcostOfCart(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcostOfCart(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[4].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#getProductsList
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.ProductsList getProductsList(

			)

					throws java.rmi.RemoteException

					, client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[5].getName());
			_operationClient.getOptions().setAction("urn:getProductsList");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			// Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an
			// empty soap message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
					.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.ProductsList.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.ProductsList) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startgetProductsList
	 */
	public void startgetProductsList(

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[5].getName());
		_operationClient.getOptions().setAction("urn:getProductsList");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is taken to be "document". No input parameters
		// according to the WS-Basic profile in this case we have to send an
		// empty soap message
		org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
				.getOptions().getSoapVersionURI());
		env = factory.getDefaultEnvelope();

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(
							resultEnv.getBody().getFirstElement(),
							client.ShoppingCartWSStub.ProductsList.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetProductsList((client.ShoppingCartWSStub.ProductsList) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetProductsList(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorgetProductsList((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErrorgetProductsList(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductsList(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductsList(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductsList(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductsList(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductsList(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductsList(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductsList(f);
							}
						} else {
							callback.receiveErrorgetProductsList(f);
						}
					} else {
						callback.receiveErrorgetProductsList(f);
					}
				} else {
					callback.receiveErrorgetProductsList(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetProductsList(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[5].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[5].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#checkProductAvailability
	 * @param productAmount24
	 * 
	 * @throws client.ProductUnknownError
	 *             :
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.ProductAvailable checkProductAvailability(

			client.ShoppingCartWSStub.ProductAmount productAmount24)

					throws java.rmi.RemoteException

					, client.ProductUnknownError, client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[6].getName());
			_operationClient.getOptions().setAction(
					"urn:checkProductAvailability");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), productAmount24,
					optimizeContent(new javax.xml.namespace.QName(
							"http://shoppingCart.t3.sos.fi.upm.es",
							"checkProductAvailability")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.ProductAvailable.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.ProductAvailable) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.ProductUnknownError) {
							throw (client.ProductUnknownError) ex;
						}

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startcheckProductAvailability
	 * @param productAmount24
	 */
	public void startcheckProductAvailability(

			client.ShoppingCartWSStub.ProductAmount productAmount24,

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[6].getName());
		_operationClient.getOptions().setAction("urn:checkProductAvailability");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), productAmount24,
				optimizeContent(new javax.xml.namespace.QName(
						"http://shoppingCart.t3.sos.fi.upm.es",
						"checkProductAvailability")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(
							resultEnv.getBody().getFirstElement(),
							client.ShoppingCartWSStub.ProductAvailable.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultcheckProductAvailability((client.ShoppingCartWSStub.ProductAvailable) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorcheckProductAvailability(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.ProductUnknownError) {
									callback.receiveErrorcheckProductAvailability((client.ProductUnknownError) ex);
									return;
								}

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorcheckProductAvailability((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErrorcheckProductAvailability(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcheckProductAvailability(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcheckProductAvailability(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcheckProductAvailability(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcheckProductAvailability(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcheckProductAvailability(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcheckProductAvailability(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorcheckProductAvailability(f);
							}
						} else {
							callback.receiveErrorcheckProductAvailability(f);
						}
					} else {
						callback.receiveErrorcheckProductAvailability(f);
					}
				} else {
					callback.receiveErrorcheckProductAvailability(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorcheckProductAvailability(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[6].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[6].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#addToCart
	 * @param productAmount26
	 * 
	 * @throws client.ProductUnknownError
	 *             :
	 * @throws client.NotEnoughUnitsError
	 *             :
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.ProductAvailableUnits addToCart(

			client.ShoppingCartWSStub.ProductAmount productAmount26)

					throws java.rmi.RemoteException

					, client.ProductUnknownError, client.NotEnoughUnitsError,
					client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[7].getName());
			_operationClient.getOptions().setAction("urn:addToCart");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(
					getFactory(_operationClient.getOptions()
							.getSoapVersionURI()),
							productAmount26,
							optimizeContent(new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es", "addToCart")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.ProductAvailableUnits.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.ProductAvailableUnits) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.ProductUnknownError) {
							throw (client.ProductUnknownError) ex;
						}

						if (ex instanceof client.NotEnoughUnitsError) {
							throw (client.NotEnoughUnitsError) ex;
						}

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startaddToCart
	 * @param productAmount26
	 */
	public void startaddToCart(

			client.ShoppingCartWSStub.ProductAmount productAmount26,

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[7].getName());
		_operationClient.getOptions().setAction("urn:addToCart");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), productAmount26,
				optimizeContent(new javax.xml.namespace.QName(
						"http://shoppingCart.t3.sos.fi.upm.es", "addToCart")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(
							resultEnv.getBody().getFirstElement(),
							client.ShoppingCartWSStub.ProductAvailableUnits.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultaddToCart((client.ShoppingCartWSStub.ProductAvailableUnits) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErroraddToCart(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.ProductUnknownError) {
									callback.receiveErroraddToCart((client.ProductUnknownError) ex);
									return;
								}

								if (ex instanceof client.NotEnoughUnitsError) {
									callback.receiveErroraddToCart((client.NotEnoughUnitsError) ex);
									return;
								}

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErroraddToCart((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErroraddToCart(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErroraddToCart(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErroraddToCart(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErroraddToCart(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErroraddToCart(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErroraddToCart(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErroraddToCart(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErroraddToCart(f);
							}
						} else {
							callback.receiveErroraddToCart(f);
						}
					} else {
						callback.receiveErroraddToCart(f);
					}
				} else {
					callback.receiveErroraddToCart(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErroraddToCart(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[7].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[7].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 */
	public void logout(

			) throws java.rmi.RemoteException

			{
		org.apache.axis2.context.MessageContext _messageContext = null;

		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[8].getName());
			_operationClient.getOptions().setAction("urn:logout");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			org.apache.axiom.soap.SOAPEnvelope env = null;
			_messageContext = new org.apache.axis2.context.MessageContext();

			// Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an
			// empty soap message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
					.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// create message context with that soap envelope

			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			_operationClient.execute(true);

		} catch (org.apache.axis2.AxisFault f) {
			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}

		return;
			}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#buy
	 * @throws client.NotValidSessionError
	 *             :
	 * @throws client.NotEnoughBudgetError
	 *             :
	 */

	public client.ShoppingCartWSStub.Budget buy(

			)

					throws java.rmi.RemoteException

					, client.NotValidSessionError, client.NotEnoughBudgetError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[9].getName());
			_operationClient.getOptions().setAction("urn:buy");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			// Style is taken to be "document". No input parameters
			// according to the WS-Basic profile in this case we have to send an
			// empty soap message
			org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
					.getOptions().getSoapVersionURI());
			env = factory.getDefaultEnvelope();

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(), client.ShoppingCartWSStub.Budget.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.Budget) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						if (ex instanceof client.NotEnoughBudgetError) {
							throw (client.NotEnoughBudgetError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startbuy
	 */
	public void startbuy(

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[9].getName());
		_operationClient.getOptions().setAction("urn:buy");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is taken to be "document". No input parameters
		// according to the WS-Basic profile in this case we have to send an
		// empty soap message
		org.apache.axiom.soap.SOAPFactory factory = getFactory(_operationClient
				.getOptions().getSoapVersionURI());
		env = factory.getDefaultEnvelope();

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(resultEnv
							.getBody().getFirstElement(),
							client.ShoppingCartWSStub.Budget.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultbuy((client.ShoppingCartWSStub.Budget) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorbuy(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorbuy((client.NotValidSessionError) ex);
									return;
								}

								if (ex instanceof client.NotEnoughBudgetError) {
									callback.receiveErrorbuy((client.NotEnoughBudgetError) ex);
									return;
								}

								callback.receiveErrorbuy(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbuy(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbuy(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbuy(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbuy(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbuy(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbuy(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorbuy(f);
							}
						} else {
							callback.receiveErrorbuy(f);
						}
					} else {
						callback.receiveErrorbuy(f);
					}
				} else {
					callback.receiveErrorbuy(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorbuy(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[9].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[9].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#removeFromCart
	 * @param productAmount31
	 * 
	 * @throws client.ProductUnknownError
	 *             :
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.ProductAvailableUnits removeFromCart(

			client.ShoppingCartWSStub.ProductAmount productAmount31)

					throws java.rmi.RemoteException

					, client.ProductUnknownError, client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[10].getName());
			_operationClient.getOptions().setAction("urn:removeFromCart");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), productAmount31,
					optimizeContent(new javax.xml.namespace.QName(
							"http://shoppingCart.t3.sos.fi.upm.es",
							"removeFromCart")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.ProductAvailableUnits.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.ProductAvailableUnits) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.ProductUnknownError) {
							throw (client.ProductUnknownError) ex;
						}

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startremoveFromCart
	 * @param productAmount31
	 */
	public void startremoveFromCart(

			client.ShoppingCartWSStub.ProductAmount productAmount31,

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[10].getName());
		_operationClient.getOptions().setAction("urn:removeFromCart");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), productAmount31,
				optimizeContent(new javax.xml.namespace.QName(
						"http://shoppingCart.t3.sos.fi.upm.es",
						"removeFromCart")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(
							resultEnv.getBody().getFirstElement(),
							client.ShoppingCartWSStub.ProductAvailableUnits.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultremoveFromCart((client.ShoppingCartWSStub.ProductAvailableUnits) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorremoveFromCart(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.ProductUnknownError) {
									callback.receiveErrorremoveFromCart((client.ProductUnknownError) ex);
									return;
								}

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorremoveFromCart((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErrorremoveFromCart(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorremoveFromCart(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorremoveFromCart(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorremoveFromCart(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorremoveFromCart(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorremoveFromCart(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorremoveFromCart(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorremoveFromCart(f);
							}
						} else {
							callback.receiveErrorremoveFromCart(f);
						}
					} else {
						callback.receiveErrorremoveFromCart(f);
					}
				} else {
					callback.receiveErrorremoveFromCart(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorremoveFromCart(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[10].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[10].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#getProductPrice
	 * @param productName33
	 * 
	 * @throws client.ProductUnknownError
	 *             :
	 * @throws client.NotValidSessionError
	 *             :
	 */

	public client.ShoppingCartWSStub.ProductPrice getProductPrice(

			client.ShoppingCartWSStub.ProductName productName33)

					throws java.rmi.RemoteException

					, client.ProductUnknownError, client.NotValidSessionError {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[11].getName());
			_operationClient.getOptions().setAction("urn:getProductPrice");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), productName33,
					optimizeContent(new javax.xml.namespace.QName(
							"http://shoppingCart.t3.sos.fi.upm.es",
							"getProductPrice")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody()
					.getFirstElement(),
					client.ShoppingCartWSStub.ProductPrice.class,
					getEnvelopeNamespaces(_returnEnv));

			return (client.ShoppingCartWSStub.ProductPrice) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						if (ex instanceof client.ProductUnknownError) {
							throw (client.ProductUnknownError) ex;
						}

						if (ex instanceof client.NotValidSessionError) {
							throw (client.NotValidSessionError) ex;
						}

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender()
			.cleanup(_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * 
	 * @see ShoppingCart.client.ShoppingCartWS#startgetProductPrice
	 * @param productName33
	 */
	public void startgetProductPrice(

			client.ShoppingCartWSStub.ProductName productName33,

			final client.ShoppingCartWSCallbackHandler callback)

					throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[11].getName());
		_operationClient.getOptions().setAction("urn:getProductPrice");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), productName33,
				optimizeContent(new javax.xml.namespace.QName(
						"http://shoppingCart.t3.sos.fi.upm.es",
						"getProductPrice")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
		.setCallback(new org.apache.axis2.client.async.AxisCallback() {
			public void onMessage(
					org.apache.axis2.context.MessageContext resultContext) {
				try {
					org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
							.getEnvelope();

					java.lang.Object object = fromOM(
							resultEnv.getBody().getFirstElement(),
							client.ShoppingCartWSStub.ProductPrice.class,
							getEnvelopeNamespaces(resultEnv));
					callback.receiveResultgetProductPrice((client.ShoppingCartWSStub.ProductPrice) object);

				} catch (org.apache.axis2.AxisFault e) {
					callback.receiveErrorgetProductPrice(e);
				}
			}

			public void onError(java.lang.Exception error) {
				if (error instanceof org.apache.axis2.AxisFault) {
					org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
					org.apache.axiom.om.OMElement faultElt = f
							.getDetail();
					if (faultElt != null) {
						if (faultExceptionNameMap.containsKey(faultElt
								.getQName())) {
							// make the fault by reflection
							try {
								java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
										.get(faultElt.getQName());
								java.lang.Class exceptionClass = java.lang.Class
										.forName(exceptionClassName);
								java.lang.Exception ex = (java.lang.Exception) exceptionClass
										.newInstance();
								// message class
								java.lang.String messageClassName = (java.lang.String) faultMessageMap
										.get(faultElt.getQName());
								java.lang.Class messageClass = java.lang.Class
										.forName(messageClassName);
								java.lang.Object messageObject = fromOM(
										faultElt, messageClass, null);
								java.lang.reflect.Method m = exceptionClass
										.getMethod(
												"setFaultMessage",
												new java.lang.Class[] { messageClass });
								m.invoke(
										ex,
										new java.lang.Object[] { messageObject });

								if (ex instanceof client.ProductUnknownError) {
									callback.receiveErrorgetProductPrice((client.ProductUnknownError) ex);
									return;
								}

								if (ex instanceof client.NotValidSessionError) {
									callback.receiveErrorgetProductPrice((client.NotValidSessionError) ex);
									return;
								}

								callback.receiveErrorgetProductPrice(new java.rmi.RemoteException(
										ex.getMessage(), ex));
							} catch (java.lang.ClassCastException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductPrice(f);
							} catch (java.lang.ClassNotFoundException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductPrice(f);
							} catch (java.lang.NoSuchMethodException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductPrice(f);
							} catch (java.lang.reflect.InvocationTargetException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductPrice(f);
							} catch (java.lang.IllegalAccessException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductPrice(f);
							} catch (java.lang.InstantiationException e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductPrice(f);
							} catch (org.apache.axis2.AxisFault e) {
								// we cannot intantiate the class -
								// throw the original Axis fault
								callback.receiveErrorgetProductPrice(f);
							}
						} else {
							callback.receiveErrorgetProductPrice(f);
						}
					} else {
						callback.receiveErrorgetProductPrice(f);
					}
				} else {
					callback.receiveErrorgetProductPrice(error);
				}
			}

			public void onFault(
					org.apache.axis2.context.MessageContext faultContext) {
				org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
						.getInboundFaultFromMessageContext(faultContext);
				onError(fault);
			}

			public void onComplete() {
				try {
					_messageContext.getTransportOut().getSender()
					.cleanup(_messageContext);
				} catch (org.apache.axis2.AxisFault axisFault) {
					callback.receiveErrorgetProductPrice(axisFault);
				}
			}
		});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[11].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[11].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(
			org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
					.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// http://localhost:8080/axis2/services/ShoppingCartWS
	public static class ProductsAmountsList implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "productsAmountsList",
				"ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for ProductAmountInfo This was an Array!
		 */

		protected ProductAmountType[] localProductAmountInfo;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localProductAmountInfoTracker = false;

		/**
		 * Auto generated getter method
		 * 
		 * @return ProductAmountType[]
		 */
		public ProductAmountType[] getProductAmountInfo() {
			return localProductAmountInfo;
		}

		/**
		 * validate the array for ProductAmountInfo
		 */
		protected void validateProductAmountInfo(ProductAmountType[] param) {

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            ProductAmountInfo
		 */
		public void setProductAmountInfo(ProductAmountType[] param) {

			validateProductAmountInfo(param);

			if (param != null) {
				// update the setting tracker
				localProductAmountInfoTracker = true;
			} else {
				localProductAmountInfoTracker = false;

			}

			this.localProductAmountInfo = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param
		 *            ProductAmountType
		 */
		public void addProductAmountInfo(ProductAmountType param) {
			if (localProductAmountInfo == null) {
				localProductAmountInfo = new ProductAmountType[] {};
			}

			// update the setting tracker
			localProductAmountInfoTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
					.toList(localProductAmountInfo);
			list.add(param);
			this.localProductAmountInfo = (ProductAmountType[]) list
					.toArray(new ProductAmountType[list.size()]);

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ProductsAmountsList.this.serialize(MY_QNAME, factory,
							xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace,
							parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix,
							parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType) {

				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":productsAmountsList",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "productsAmountsList", xmlWriter);
				}

			}
			if (localProductAmountInfoTracker) {
				if (localProductAmountInfo != null) {
					for (int i = 0; i < localProductAmountInfo.length; i++) {
						if (localProductAmountInfo[i] != null) {
							localProductAmountInfo[i]
									.serialize(
											new javax.xml.namespace.QName(
													"http://shoppingCart.t3.sos.fi.upm.es",
													"productAmountInfo"),
													factory, xmlWriter);
						} else {

							// we don't have to do any thing since minOccures is
							// zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException(
							"productAmountInfo cannot be null!!");

				}
			}
			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localProductAmountInfoTracker) {
				if (localProductAmountInfo != null) {
					for (int i = 0; i < localProductAmountInfo.length; i++) {

						if (localProductAmountInfo[i] != null) {
							elementList.add(new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es",
									"productAmountInfo"));
							elementList.add(localProductAmountInfo[i]);
						} else {

							// nothing to do

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException(
							"productAmountInfo cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ProductsAmountsList parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ProductsAmountsList object = new ProductsAmountsList();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type") != null) {
						java.lang.String fullTypeName = reader
								.getAttributeValue(
										"http://www.w3.org/2001/XMLSchema-instance",
										"type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
										fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName
									.substring(fullTypeName.indexOf(":") + 1);

							if (!"productsAmountsList".equals(type)) {
								// find namespace for the prefix
								java.lang.String nsUri = reader
										.getNamespaceContext().getNamespaceURI(
												nsPrefix);
								return (ProductsAmountsList) ExtensionMapper
										.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es",
									"productAmountInfo").equals(reader
											.getName())) {

						// Process the array and step past its final element's
						// end.
						list1.add(ProductAmountType.Factory.parse(reader));

						// loop until we find a start element that is not part
						// of this array
						boolean loopDone1 = false;
						while (!loopDone1) {
							// We should be at the end element, but make sure
							while (!reader.isEndElement())
								reader.next();
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement()
									&& !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()) {
								// two continuous end elements means we are
								// exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName(
										"http://shoppingCart.t3.sos.fi.upm.es",
										"productAmountInfo").equals(reader
												.getName())) {
									list1.add(ProductAmountType.Factory
											.parse(reader));

								} else {
									loopDone1 = true;
								}
							}
						}
						// call the converter utility to convert and set the
						// array

						object.setProductAmountInfo((ProductAmountType[]) org.apache.axis2.databinding.utils.ConverterUtil
								.convertToArray(ProductAmountType.class, list1));

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement "
										+ reader.getLocalName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ProductsList implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "productsList", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for Product This was an Array!
		 */

		protected java.lang.String[] localProduct;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
		 */
		protected boolean localProductTracker = false;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String[]
		 */
		public java.lang.String[] getProduct() {
			return localProduct;
		}

		/**
		 * validate the array for Product
		 */
		protected void validateProduct(java.lang.String[] param) {

		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Product
		 */
		public void setProduct(java.lang.String[] param) {

			validateProduct(param);

			if (param != null) {
				// update the setting tracker
				localProductTracker = true;
			} else {
				localProductTracker = false;

			}

			this.localProduct = param;
		}

		/**
		 * Auto generated add method for the array for convenience
		 * 
		 * @param param
		 *            java.lang.String
		 */
		public void addProduct(java.lang.String param) {
			if (localProduct == null) {
				localProduct = new java.lang.String[] {};
			}

			// update the setting tracker
			localProductTracker = true;

			java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
					.toList(localProduct);
			list.add(param);
			this.localProduct = (java.lang.String[]) list
					.toArray(new java.lang.String[list.size()]);

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ProductsList.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace,
							parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix,
							parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType) {

				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":productsList",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "productsList", xmlWriter);
				}

			}
			if (localProductTracker) {
				if (localProduct != null) {
					namespace = "http://shoppingCart.t3.sos.fi.upm.es";
					boolean emptyNamespace = namespace == null
							|| namespace.length() == 0;
					prefix = emptyNamespace ? null : xmlWriter
							.getPrefix(namespace);
					for (int i = 0; i < localProduct.length; i++) {

						if (localProduct[i] != null) {

							if (!emptyNamespace) {
								if (prefix == null) {
									java.lang.String prefix2 = generatePrefix(namespace);

									xmlWriter.writeStartElement(prefix2,
											"product", namespace);
									xmlWriter
									.writeNamespace(prefix2, namespace);
									xmlWriter.setPrefix(prefix2, namespace);

								} else {
									xmlWriter.writeStartElement(namespace,
											"product");
								}

							} else {
								xmlWriter.writeStartElement("product");
							}

							xmlWriter
							.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localProduct[i]));

							xmlWriter.writeEndElement();

						} else {

							// we have to do nothing since minOccurs is zero

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException(
							"product cannot be null!!");

				}

			}
			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			if (localProductTracker) {
				if (localProduct != null) {
					for (int i = 0; i < localProduct.length; i++) {

						if (localProduct[i] != null) {
							elementList.add(new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es",
									"product"));
							elementList
							.add(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(localProduct[i]));
						} else {

							// have to do nothing

						}

					}
				} else {

					throw new org.apache.axis2.databinding.ADBException(
							"product cannot be null!!");

				}

			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ProductsList parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ProductsList object = new ProductsList();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type") != null) {
						java.lang.String fullTypeName = reader
								.getAttributeValue(
										"http://www.w3.org/2001/XMLSchema-instance",
										"type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
										fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName
									.substring(fullTypeName.indexOf(":") + 1);

							if (!"productsList".equals(type)) {
								// find namespace for the prefix
								java.lang.String nsUri = reader
										.getNamespaceContext().getNamespaceURI(
												nsPrefix);
								return (ProductsList) ExtensionMapper
										.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					java.util.ArrayList list1 = new java.util.ArrayList();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es",
									"product").equals(reader.getName())) {

						// Process the array and step past its final element's
						// end.
						list1.add(reader.getElementText());

						// loop until we find a start element that is not part
						// of this array
						boolean loopDone1 = false;
						while (!loopDone1) {
							// Ensure we are at the EndElement
							while (!reader.isEndElement()) {
								reader.next();
							}
							// Step out of this element
							reader.next();
							// Step to next element event.
							while (!reader.isStartElement()
									&& !reader.isEndElement())
								reader.next();
							if (reader.isEndElement()) {
								// two continuous end elements means we are
								// exiting the xml structure
								loopDone1 = true;
							} else {
								if (new javax.xml.namespace.QName(
										"http://shoppingCart.t3.sos.fi.upm.es",
										"product").equals(reader.getName())) {
									list1.add(reader.getElementText());

								} else {
									loopDone1 = true;
								}
							}
						}
						// call the converter utility to convert and set the
						// array

						object.setProduct((java.lang.String[]) list1
								.toArray(new java.lang.String[list1.size()]));

					} // End of if for expected property start element

					else {

					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement "
										+ reader.getLocalName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Login implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "login", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for Username
		 */

		protected java.lang.String localUsername;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getUsername() {
			return localUsername;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Username
		 */
		public void setUsername(java.lang.String param) {

			this.localUsername = param;

		}

		/**
		 * field for Password
		 */

		protected java.lang.String localPassword;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getPassword() {
			return localPassword;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Password
		 */
		public void setPassword(java.lang.String param) {

			this.localPassword = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					Login.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace,
							parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix,
							parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType) {

				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":login", xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "login", xmlWriter);
				}

			}

			namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "username", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "username");
				}

			} else {
				xmlWriter.writeStartElement("username");
			}

			if (localUsername == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"username cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localUsername);

			}

			xmlWriter.writeEndElement();

			namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "password", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "password");
				}

			} else {
				xmlWriter.writeStartElement("password");
			}

			if (localPassword == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"password cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localPassword);

			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add(new javax.xml.namespace.QName(
					"http://shoppingCart.t3.sos.fi.upm.es", "username"));

			if (localUsername != null) {
				elementList
				.add(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localUsername));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"username cannot be null!!");
			}

			elementList.add(new javax.xml.namespace.QName(
					"http://shoppingCart.t3.sos.fi.upm.es", "password"));

			if (localPassword != null) {
				elementList
				.add(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localPassword));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"password cannot be null!!");
			}

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static Login parse(javax.xml.stream.XMLStreamReader reader)
					throws java.lang.Exception {
				Login object = new Login();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type") != null) {
						java.lang.String fullTypeName = reader
								.getAttributeValue(
										"http://www.w3.org/2001/XMLSchema-instance",
										"type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
										fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName
									.substring(fullTypeName.indexOf(":") + 1);

							if (!"login".equals(type)) {
								// find namespace for the prefix
								java.lang.String nsUri = reader
										.getNamespaceContext().getNamespaceURI(
												nsPrefix);
								return (Login) ExtensionMapper.getTypeObject(
										nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es",
									"username").equals(reader.getName())) {

						java.lang.String content = reader.getElementText();

						object.setUsername(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement "
										+ reader.getLocalName());
					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es",
									"password").equals(reader.getName())) {

						java.lang.String content = reader.getElementText();

						object.setPassword(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement "
										+ reader.getLocalName());
					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement "
										+ reader.getLocalName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class CostOfCart implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "costOfCart", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for CostOfCart
		 */

		protected double localCostOfCart;

		/**
		 * Auto generated getter method
		 * 
		 * @return double
		 */
		public double getCostOfCart() {
			return localCostOfCart;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            CostOfCart
		 */
		public void setCostOfCart(double param) {

			this.localCostOfCart = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					CostOfCart.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			java.lang.String namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			java.lang.String localName = "costOfCart";

			if (!namespace.equals("")) {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, localName, namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, localName);
				}

			} else {
				xmlWriter.writeStartElement(localName);
			}

			// add the type details if this is used in a simple type
			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":costOfCart", xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "costOfCart", xmlWriter);
				}
			}

			if (java.lang.Double.isNaN(localCostOfCart)) {

				throw new org.apache.axis2.databinding.ADBException(
						"property value cannot be null!!");

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localCostOfCart));
			}

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localCostOfCart) }, null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static CostOfCart parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				CostOfCart object = new CostOfCart();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"costOfCart").equals(reader
													.getName())) {

								java.lang.String content = reader
										.getElementText();

								object.setCostOfCart(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToDouble(content));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ProductAvailableUnits implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es",
				"productAvailableUnits", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for ProductAvailableUnits
		 */

		protected int localProductAvailableUnits;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getProductAvailableUnits() {
			return localProductAvailableUnits;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            ProductAvailableUnits
		 */
		public void setProductAvailableUnits(int param) {

			this.localProductAvailableUnits = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ProductAvailableUnits.this.serialize(MY_QNAME, factory,
							xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			java.lang.String namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			java.lang.String localName = "productAvailableUnits";

			if (!namespace.equals("")) {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, localName, namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, localName);
				}

			} else {
				xmlWriter.writeStartElement(localName);
			}

			// add the type details if this is used in a simple type
			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":productAvailableUnits",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "productAvailableUnits", xmlWriter);
				}
			}

			if (localProductAvailableUnits == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"property value cannot be null!!");

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localProductAvailableUnits));
			}

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localProductAvailableUnits) },
							null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ProductAvailableUnits parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ProductAvailableUnits object = new ProductAvailableUnits();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"productAvailableUnits")
							.equals(reader.getName())) {

								java.lang.String content = reader
										.getElementText();

								object.setProductAvailableUnits(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToInt(content));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ProductAmountType implements
	org.apache.axis2.databinding.ADBBean {
		/*
		 * This type was generated from the piece of schema that had name =
		 * productAmountType Namespace URI =
		 * http://shoppingCart.t3.sos.fi.upm.es Namespace Prefix = ns1
		 */

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for Product
		 */

		protected java.lang.String localProduct;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getProduct() {
			return localProduct;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Product
		 */
		public void setProduct(java.lang.String param) {

			this.localProduct = param;

		}

		/**
		 * field for Amount
		 */

		protected int localAmount;

		/**
		 * Auto generated getter method
		 * 
		 * @return int
		 */
		public int getAmount() {
			return localAmount;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Amount
		 */
		public void setAmount(int param) {

			this.localAmount = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, parentQName) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ProductAmountType.this.serialize(parentQName, factory,
							xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					parentQName, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			java.lang.String prefix = null;
			java.lang.String namespace = null;

			prefix = parentQName.getPrefix();
			namespace = parentQName.getNamespaceURI();

			if ((namespace != null) && (namespace.trim().length() > 0)) {
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null) {
					xmlWriter.writeStartElement(namespace,
							parentQName.getLocalPart());
				} else {
					if (prefix == null) {
						prefix = generatePrefix(namespace);
					}

					xmlWriter.writeStartElement(prefix,
							parentQName.getLocalPart(), namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);
				}
			} else {
				xmlWriter.writeStartElement(parentQName.getLocalPart());
			}

			if (serializeType) {

				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":productAmountType",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "productAmountType", xmlWriter);
				}

			}

			namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "product", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "product");
				}

			} else {
				xmlWriter.writeStartElement("product");
			}

			if (localProduct == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"product cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localProduct);

			}

			xmlWriter.writeEndElement();

			namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "amount", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "amount");
				}

			} else {
				xmlWriter.writeStartElement("amount");
			}

			if (localAmount == java.lang.Integer.MIN_VALUE) {

				throw new org.apache.axis2.databinding.ADBException(
						"amount cannot be null!!");

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localAmount));
			}

			xmlWriter.writeEndElement();

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			java.util.ArrayList elementList = new java.util.ArrayList();
			java.util.ArrayList attribList = new java.util.ArrayList();

			elementList.add(new javax.xml.namespace.QName(
					"http://shoppingCart.t3.sos.fi.upm.es", "product"));

			if (localProduct != null) {
				elementList
				.add(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localProduct));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"product cannot be null!!");
			}

			elementList.add(new javax.xml.namespace.QName(
					"http://shoppingCart.t3.sos.fi.upm.es", "amount"));

			elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
					.convertToString(localAmount));

			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					qName, elementList.toArray(), attribList.toArray());

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ProductAmountType parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ProductAmountType object = new ProductAmountType();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type") != null) {
						java.lang.String fullTypeName = reader
								.getAttributeValue(
										"http://www.w3.org/2001/XMLSchema-instance",
										"type");
						if (fullTypeName != null) {
							java.lang.String nsPrefix = null;
							if (fullTypeName.indexOf(":") > -1) {
								nsPrefix = fullTypeName.substring(0,
										fullTypeName.indexOf(":"));
							}
							nsPrefix = nsPrefix == null ? "" : nsPrefix;

							java.lang.String type = fullTypeName
									.substring(fullTypeName.indexOf(":") + 1);

							if (!"productAmountType".equals(type)) {
								// find namespace for the prefix
								java.lang.String nsUri = reader
										.getNamespaceContext().getNamespaceURI(
												nsPrefix);
								return (ProductAmountType) ExtensionMapper
										.getTypeObject(nsUri, type, reader);
							}

						}

					}

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					reader.next();

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es",
									"product").equals(reader.getName())) {

						java.lang.String content = reader.getElementText();

						object.setProduct(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement "
										+ reader.getLocalName());
					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement()
							&& new javax.xml.namespace.QName(
									"http://shoppingCart.t3.sos.fi.upm.es",
									"amount").equals(reader.getName())) {

						java.lang.String content = reader.getElementText();

						object.setAmount(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToInt(content));

						reader.next();

					} // End of if for expected property start element

					else {
						// A start element we are not expecting indicates an
						// invalid parameter was passed
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement "
										+ reader.getLocalName());
					}

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					if (reader.isStartElement())
						// A start element we are not expecting indicates a
						// trailing invalid property
						throw new org.apache.axis2.databinding.ADBException(
								"Unexpected subelement "
										+ reader.getLocalName());

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ProductAvailable implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "productAvailable",
				"ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for ProductAvailable
		 */

		protected boolean localProductAvailable;

		/**
		 * Auto generated getter method
		 * 
		 * @return boolean
		 */
		public boolean getProductAvailable() {
			return localProductAvailable;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            ProductAvailable
		 */
		public void setProductAvailable(boolean param) {

			this.localProductAvailable = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ProductAvailable.this.serialize(MY_QNAME, factory,
							xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			java.lang.String namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			java.lang.String localName = "productAvailable";

			if (!namespace.equals("")) {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, localName, namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, localName);
				}

			} else {
				xmlWriter.writeStartElement(localName);
			}

			// add the type details if this is used in a simple type
			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":productAvailable",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "productAvailable", xmlWriter);
				}
			}

			if (false) {

				throw new org.apache.axis2.databinding.ADBException(
						"property value cannot be null!!");

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localProductAvailable));
			}

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localProductAvailable) },
							null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ProductAvailable parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ProductAvailable object = new ProductAvailable();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"productAvailable").equals(reader
													.getName())) {

								java.lang.String content = reader
										.getElementText();

								object.setProductAvailable(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToBoolean(content));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ExtensionMapper {

		public static java.lang.Object getTypeObject(
				java.lang.String namespaceURI, java.lang.String typeName,
				javax.xml.stream.XMLStreamReader reader)
						throws java.lang.Exception {

			if ("http://shoppingCart.t3.sos.fi.upm.es".equals(namespaceURI)
					&& "productAmountType".equals(typeName)) {

				return ProductAmountType.Factory.parse(reader);

			}

			throw new org.apache.axis2.databinding.ADBException(
					"Unsupported type " + namespaceURI + " " + typeName);
		}

	}

	public static class ProductAmount implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "productAmount", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for ProductAmount
		 */

		protected ProductAmountType localProductAmount;

		/**
		 * Auto generated getter method
		 * 
		 * @return ProductAmountType
		 */
		public ProductAmountType getProductAmount() {
			return localProductAmount;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            ProductAmount
		 */
		public void setProductAmount(ProductAmountType param) {

			this.localProductAmount = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ProductAmount.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			if (localProductAmount == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"Property cannot be null!");
			}
			localProductAmount.serialize(MY_QNAME, factory, xmlWriter);

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return localProductAmount.getPullParser(MY_QNAME);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ProductAmount parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ProductAmount object = new ProductAmount();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"productAmount").equals(reader
													.getName())) {

								object.setProductAmount(ProductAmountType.Factory
										.parse(reader));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ErrorMessage implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "ErrorMessage", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for ErrorMessage
		 */

		protected java.lang.String localErrorMessage;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getErrorMessage() {
			return localErrorMessage;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            ErrorMessage
		 */
		public void setErrorMessage(java.lang.String param) {

			this.localErrorMessage = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ErrorMessage.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			java.lang.String namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			java.lang.String localName = "ErrorMessage";

			if (!namespace.equals("")) {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, localName, namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, localName);
				}

			} else {
				xmlWriter.writeStartElement(localName);
			}

			// add the type details if this is used in a simple type
			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":ErrorMessage",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "ErrorMessage", xmlWriter);
				}
			}

			if (localErrorMessage == null) {

				throw new org.apache.axis2.databinding.ADBException(
						"Value cannot be null !!");

			} else {

				xmlWriter.writeCharacters(localErrorMessage);

			}

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localErrorMessage) }, null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ErrorMessage parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ErrorMessage object = new ErrorMessage();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"ErrorMessage").equals(reader
													.getName())) {

								java.lang.String content = reader
										.getElementText();

								object.setErrorMessage(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(content));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ProductName implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "productName", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for ProductName
		 */

		protected java.lang.String localProductName;

		/**
		 * Auto generated getter method
		 * 
		 * @return java.lang.String
		 */
		public java.lang.String getProductName() {
			return localProductName;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            ProductName
		 */
		public void setProductName(java.lang.String param) {

			this.localProductName = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ProductName.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			java.lang.String namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			java.lang.String localName = "productName";

			if (!namespace.equals("")) {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, localName, namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, localName);
				}

			} else {
				xmlWriter.writeStartElement(localName);
			}

			// add the type details if this is used in a simple type
			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":productName", xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "productName", xmlWriter);
				}
			}

			if (localProductName == null) {

				throw new org.apache.axis2.databinding.ADBException(
						"Value cannot be null !!");

			} else {

				xmlWriter.writeCharacters(localProductName);

			}

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localProductName) }, null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ProductName parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ProductName object = new ProductName();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"productName").equals(reader
													.getName())) {

								java.lang.String content = reader
										.getElementText();

								object.setProductName(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(content));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class ProductPrice implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "productPrice", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for ProductPrice
		 */

		protected double localProductPrice;

		/**
		 * Auto generated getter method
		 * 
		 * @return double
		 */
		public double getProductPrice() {
			return localProductPrice;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            ProductPrice
		 */
		public void setProductPrice(double param) {

			this.localProductPrice = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					ProductPrice.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			java.lang.String namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			java.lang.String localName = "productPrice";

			if (!namespace.equals("")) {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, localName, namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, localName);
				}

			} else {
				xmlWriter.writeStartElement(localName);
			}

			// add the type details if this is used in a simple type
			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":productPrice",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "productPrice", xmlWriter);
				}
			}

			if (java.lang.Double.isNaN(localProductPrice)) {

				throw new org.apache.axis2.databinding.ADBException(
						"property value cannot be null!!");

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localProductPrice));
			}

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localProductPrice) }, null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static ProductPrice parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				ProductPrice object = new ProductPrice();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"productPrice").equals(reader
													.getName())) {

								java.lang.String content = reader
										.getElementText();

								object.setProductPrice(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToDouble(content));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class Budget implements org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "budget", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for Budget
		 */

		protected double localBudget;

		/**
		 * Auto generated getter method
		 * 
		 * @return double
		 */
		public double getBudget() {
			return localBudget;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            Budget
		 */
		public void setBudget(double param) {

			this.localBudget = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					Budget.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			java.lang.String namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			java.lang.String localName = "budget";

			if (!namespace.equals("")) {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, localName, namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, localName);
				}

			} else {
				xmlWriter.writeStartElement(localName);
			}

			// add the type details if this is used in a simple type
			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":budget", xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "budget", xmlWriter);
				}
			}

			if (java.lang.Double.isNaN(localBudget)) {

				throw new org.apache.axis2.databinding.ADBException(
						"property value cannot be null!!");

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localBudget));
			}

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localBudget) }, null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static Budget parse(javax.xml.stream.XMLStreamReader reader)
					throws java.lang.Exception {
				Budget object = new Budget();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"budget").equals(reader.getName())) {

								java.lang.String content = reader
										.getElementText();

								object.setBudget(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToDouble(content));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	public static class LoginResponse implements
	org.apache.axis2.databinding.ADBBean {

		public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				"http://shoppingCart.t3.sos.fi.upm.es", "loginResponse", "ns1");

		private static java.lang.String generatePrefix(
				java.lang.String namespace) {
			if (namespace.equals("http://shoppingCart.t3.sos.fi.upm.es")) {
				return "ns1";
			}
			return org.apache.axis2.databinding.utils.BeanUtil
					.getUniquePrefix();
		}

		/**
		 * field for LoginResponse
		 */

		protected boolean localLoginResponse;

		/**
		 * Auto generated getter method
		 * 
		 * @return boolean
		 */
		public boolean getLoginResponse() {
			return localLoginResponse;
		}

		/**
		 * Auto generated setter method
		 * 
		 * @param param
		 *            LoginResponse
		 */
		public void setLoginResponse(boolean param) {

			this.localLoginResponse = param;

		}

		/**
		 * isReaderMTOMAware
		 * 
		 * @return true if the reader supports MTOM
		 */
		public static boolean isReaderMTOMAware(
				javax.xml.stream.XMLStreamReader reader) {
			boolean isReaderMTOMAware = false;

			try {
				isReaderMTOMAware = java.lang.Boolean.TRUE
						.equals(reader
								.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
			} catch (java.lang.IllegalArgumentException e) {
				isReaderMTOMAware = false;
			}
			return isReaderMTOMAware;
		}

		/**
		 * 
		 * @param parentQName
		 * @param factory
		 * @return org.apache.axiom.om.OMElement
		 */
		public org.apache.axiom.om.OMElement getOMElement(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory)
						throws org.apache.axis2.databinding.ADBException {

			org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
					this, MY_QNAME) {

				public void serialize(
						org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
								throws javax.xml.stream.XMLStreamException {
					LoginResponse.this.serialize(MY_QNAME, factory, xmlWriter);
				}
			};
			return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
					MY_QNAME, factory, dataSource);

		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {
			serialize(parentQName, factory, xmlWriter, false);
		}

		public void serialize(
				final javax.xml.namespace.QName parentQName,
				final org.apache.axiom.om.OMFactory factory,
				org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
				boolean serializeType)
						throws javax.xml.stream.XMLStreamException,
						org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it

			java.lang.String namespace = "http://shoppingCart.t3.sos.fi.upm.es";
			java.lang.String localName = "loginResponse";

			if (!namespace.equals("")) {
				java.lang.String prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, localName, namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, localName);
				}

			} else {
				xmlWriter.writeStartElement(localName);
			}

			// add the type details if this is used in a simple type
			if (serializeType) {
				java.lang.String namespacePrefix = registerPrefix(xmlWriter,
						"http://shoppingCart.t3.sos.fi.upm.es");
				if ((namespacePrefix != null)
						&& (namespacePrefix.trim().length() > 0)) {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", namespacePrefix + ":loginResponse",
							xmlWriter);
				} else {
					writeAttribute("xsi",
							"http://www.w3.org/2001/XMLSchema-instance",
							"type", "loginResponse", xmlWriter);
				}
			}

			if (false) {

				throw new org.apache.axis2.databinding.ADBException(
						"property value cannot be null!!");

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(localLoginResponse));
			}

			xmlWriter.writeEndElement();

		}

		/**
		 * Util method to write an attribute with the ns prefix
		 */
		private void writeAttribute(java.lang.String prefix,
				java.lang.String namespace, java.lang.String attName,
				java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (xmlWriter.getPrefix(namespace) == null) {
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			}

			xmlWriter.writeAttribute(namespace, attName, attValue);

		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeAttribute(java.lang.String namespace,
				java.lang.String attName, java.lang.String attValue,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attValue);
			}
		}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
				java.lang.String attName, javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			java.lang.String attributeNamespace = qname.getNamespaceURI();
			java.lang.String attributePrefix = xmlWriter
					.getPrefix(attributeNamespace);
			if (attributePrefix == null) {
				attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
			}
			java.lang.String attributeValue;
			if (attributePrefix.trim().length() > 0) {
				attributeValue = attributePrefix + ":" + qname.getLocalPart();
			} else {
				attributeValue = qname.getLocalPart();
			}

			if (namespace.equals("")) {
				xmlWriter.writeAttribute(attName, attributeValue);
			} else {
				registerPrefix(xmlWriter, namespace);
				xmlWriter.writeAttribute(namespace, attName, attributeValue);
			}
		}

		/**
		 * method to handle Qnames
		 */

		private void writeQName(javax.xml.namespace.QName qname,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String namespaceURI = qname.getNamespaceURI();
			if (namespaceURI != null) {
				java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
				if (prefix == null) {
					prefix = generatePrefix(namespaceURI);
					xmlWriter.writeNamespace(prefix, namespaceURI);
					xmlWriter.setPrefix(prefix, namespaceURI);
				}

				if (prefix.trim().length() > 0) {
					xmlWriter.writeCharacters(prefix
							+ ":"
							+ org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				} else {
					// i.e this is the default namespace
					xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
				}

			} else {
				xmlWriter
				.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(qname));
			}
		}

		private void writeQNames(javax.xml.namespace.QName[] qnames,
				javax.xml.stream.XMLStreamWriter xmlWriter)
						throws javax.xml.stream.XMLStreamException {

			if (qnames != null) {
				// we have to store this data until last moment since it is not
				// possible to write any
				// namespace data after writing the charactor data
				java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
				java.lang.String namespaceURI = null;
				java.lang.String prefix = null;

				for (int i = 0; i < qnames.length; i++) {
					if (i > 0) {
						stringToWrite.append(" ");
					}
					namespaceURI = qnames[i].getNamespaceURI();
					if (namespaceURI != null) {
						prefix = xmlWriter.getPrefix(namespaceURI);
						if ((prefix == null) || (prefix.length() == 0)) {
							prefix = generatePrefix(namespaceURI);
							xmlWriter.writeNamespace(prefix, namespaceURI);
							xmlWriter.setPrefix(prefix, namespaceURI);
						}

						if (prefix.trim().length() > 0) {
							stringToWrite
							.append(prefix)
							.append(":")
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						} else {
							stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
						}
					} else {
						stringToWrite
						.append(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qnames[i]));
					}
				}
				xmlWriter.writeCharacters(stringToWrite.toString());
			}

		}

		/**
		 * Register a namespace prefix
		 */
		private java.lang.String registerPrefix(
				javax.xml.stream.XMLStreamWriter xmlWriter,
				java.lang.String namespace)
						throws javax.xml.stream.XMLStreamException {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
					prefix = org.apache.axis2.databinding.utils.BeanUtil
							.getUniquePrefix();
				}

				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}

			return prefix;
		}

		/**
		 * databinding method to get an XML representation of this object
		 * 
		 */
		public javax.xml.stream.XMLStreamReader getPullParser(
				javax.xml.namespace.QName qName)
						throws org.apache.axis2.databinding.ADBException {

			// We can safely assume an element has only one type associated with
			// it
			return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
					MY_QNAME,
					new java.lang.Object[] {
							org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
							org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localLoginResponse) },
							null);

		}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory {

			/**
			 * static method to create the object Precondition: If this object
			 * is an element, the current or next start element starts this
			 * object and any intervening reader events are ignorable If this
			 * object is not an element, it is a complex type and the reader is
			 * at the event just after the outer start element Postcondition: If
			 * this object is an element, the reader is positioned at its end
			 * element If this object is a complex type, the reader is
			 * positioned at the end element of its outer element
			 */
			public static LoginResponse parse(
					javax.xml.stream.XMLStreamReader reader)
							throws java.lang.Exception {
				LoginResponse object = new LoginResponse();

				int event;
				java.lang.String nillableValue = null;
				java.lang.String prefix = "";
				java.lang.String namespaceuri = "";
				try {

					while (!reader.isStartElement() && !reader.isEndElement())
						reader.next();

					// Note all attributes that were handled. Used to differ
					// normal attributes
					// from anyAttributes.
					java.util.Vector handledAttributes = new java.util.Vector();

					while (!reader.isEndElement()) {
						if (reader.isStartElement()) {

							if (reader.isStartElement()
									&& new javax.xml.namespace.QName(
											"http://shoppingCart.t3.sos.fi.upm.es",
											"loginResponse").equals(reader
													.getName())) {

								java.lang.String content = reader
										.getElementText();

								object.setLoginResponse(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToBoolean(content));

							} // End of if for expected property start element

							else {
								// A start element we are not expecting
								// indicates an invalid parameter was passed
								throw new org.apache.axis2.databinding.ADBException(
										"Unexpected subelement "
												+ reader.getLocalName());
							}

						} else {
							reader.next();
						}
					} // end of while loop

				} catch (javax.xml.stream.XMLStreamException e) {
					throw new java.lang.Exception(e);
				}

				return object;
			}

		}// end of factory class

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.ProductsAmountsList param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.ProductsAmountsList.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.ErrorMessage param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.ErrorMessage.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.ProductName param, boolean optimizeContent)
					throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.ProductName.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.ProductAvailableUnits param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.ProductAvailableUnits.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.Budget param, boolean optimizeContent)
					throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.Budget.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.Login param, boolean optimizeContent)
					throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(client.ShoppingCartWSStub.Login.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.LoginResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.LoginResponse.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.CostOfCart param, boolean optimizeContent)
					throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.CostOfCart.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.ProductsList param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.ProductsList.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.ProductAmount param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.ProductAmount.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.ProductAvailable param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.ProductAvailable.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			client.ShoppingCartWSStub.ProductPrice param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					client.ShoppingCartWSStub.ProductPrice.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			client.ShoppingCartWSStub.ProductName param, boolean optimizeContent)
					throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							client.ShoppingCartWSStub.ProductName.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			client.ShoppingCartWSStub.Login param, boolean optimizeContent)
					throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							client.ShoppingCartWSStub.Login.MY_QNAME, factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			client.ShoppingCartWSStub.ProductAmount param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope.getBody().addChild(
					param.getOMElement(
							client.ShoppingCartWSStub.ProductAmount.MY_QNAME,
							factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
			java.lang.Class type, java.util.Map extraNamespaces)
					throws org.apache.axis2.AxisFault {

		try {

			if (client.ShoppingCartWSStub.ProductsAmountsList.class
					.equals(type)) {

				return client.ShoppingCartWSStub.ProductsAmountsList.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductName.class.equals(type)) {

				return client.ShoppingCartWSStub.ProductName.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductAvailableUnits.class
					.equals(type)) {

				return client.ShoppingCartWSStub.ProductAvailableUnits.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.Budget.class.equals(type)) {

				return client.ShoppingCartWSStub.Budget.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.Login.class.equals(type)) {

				return client.ShoppingCartWSStub.Login.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.LoginResponse.class.equals(type)) {

				return client.ShoppingCartWSStub.LoginResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.CostOfCart.class.equals(type)) {

				return client.ShoppingCartWSStub.CostOfCart.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductsList.class.equals(type)) {

				return client.ShoppingCartWSStub.ProductsList.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductAmount.class.equals(type)) {

				return client.ShoppingCartWSStub.ProductAmount.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductAvailable.class.equals(type)) {

				return client.ShoppingCartWSStub.ProductAvailable.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductAmount.class.equals(type)) {

				return client.ShoppingCartWSStub.ProductAmount.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductAvailableUnits.class
					.equals(type)) {

				return client.ShoppingCartWSStub.ProductAvailableUnits.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.Budget.class.equals(type)) {

				return client.ShoppingCartWSStub.Budget.Factory.parse(param
						.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductAmount.class.equals(type)) {

				return client.ShoppingCartWSStub.ProductAmount.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductAvailableUnits.class
					.equals(type)) {

				return client.ShoppingCartWSStub.ProductAvailableUnits.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductName.class.equals(type)) {

				return client.ShoppingCartWSStub.ProductName.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ProductPrice.class.equals(type)) {

				return client.ShoppingCartWSStub.ProductPrice.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (client.ShoppingCartWSStub.ErrorMessage.class.equals(type)) {

				return client.ShoppingCartWSStub.ErrorMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
