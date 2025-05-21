/**
 */
package rest_tester.rest_tester;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.Request#getMethod <em>Method</em>}</li>
 *   <li>{@link rest_tester.rest_tester.Request#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link rest_tester.rest_tester.Request#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends Statement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link rest_tester.rest_tester.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see rest_tester.rest_tester.HttpMethod
	 * @see #setMethod(HttpMethod)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getRequest_Method()
	 * @model required="true"
	 * @generated
	 */
	HttpMethod getMethod();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.Request#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see rest_tester.rest_tester.HttpMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' attribute.
	 * @see #setEndpoint(String)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getRequest_Endpoint()
	 * @model required="true"
	 * @generated
	 */
	String getEndpoint();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.Request#getEndpoint <em>Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' attribute.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(ObjectValue)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getRequest_Config()
	 * @model containment="true"
	 * @generated
	 */
	ObjectValue getConfig();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.Request#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(ObjectValue value);

} // Request
