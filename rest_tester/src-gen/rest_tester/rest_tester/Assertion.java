/**
 */
package rest_tester.rest_tester;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.Assertion#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends Statement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(BoolExpr)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getAssertion_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BoolExpr getExpr();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.Assertion#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(BoolExpr value);

} // Assertion
