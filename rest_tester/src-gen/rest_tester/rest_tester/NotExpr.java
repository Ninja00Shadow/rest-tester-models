/**
 */
package rest_tester.rest_tester;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.NotExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getNotExpr()
 * @model
 * @generated
 */
public interface NotExpr extends BoolExpr {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(BoolExpr)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getNotExpr_Expr()
	 * @model containment="true"
	 * @generated
	 */
	BoolExpr getExpr();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.NotExpr#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(BoolExpr value);

} // NotExpr
