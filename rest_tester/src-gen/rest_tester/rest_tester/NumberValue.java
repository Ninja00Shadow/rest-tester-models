/**
 */
package rest_tester.rest_tester;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.NumberValue#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getNumberValue()
 * @model
 * @generated
 */
public interface NumberValue extends Value {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(double)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getNumberValue_Literal()
	 * @model
	 * @generated
	 */
	double getLiteral();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.NumberValue#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(double value);

} // NumberValue
