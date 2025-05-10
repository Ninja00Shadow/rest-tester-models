/**
 */
package rest_tester.rest_tester;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.BooleanValue#isLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getBooleanValue()
 * @model
 * @generated
 */
public interface BooleanValue extends Value {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(boolean)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getBooleanValue_Literal()
	 * @model
	 * @generated
	 */
	boolean isLiteral();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.BooleanValue#isLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #isLiteral()
	 * @generated
	 */
	void setLiteral(boolean value);

} // BooleanValue
