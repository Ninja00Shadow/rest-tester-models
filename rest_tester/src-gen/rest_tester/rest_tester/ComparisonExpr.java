/**
 */
package rest_tester.rest_tester;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.ComparisonExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link rest_tester.rest_tester.ComparisonExpr#getOp <em>Op</em>}</li>
 *   <li>{@link rest_tester.rest_tester.ComparisonExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getComparisonExpr()
 * @model
 * @generated
 */
public interface ComparisonExpr extends BoolExpr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Value)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getComparisonExpr_Left()
	 * @model containment="true"
	 * @generated
	 */
	Value getLeft();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.ComparisonExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Value value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link rest_tester.rest_tester.ComparisonOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see rest_tester.rest_tester.ComparisonOp
	 * @see #setOp(ComparisonOp)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getComparisonExpr_Op()
	 * @model
	 * @generated
	 */
	ComparisonOp getOp();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.ComparisonExpr#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see rest_tester.rest_tester.ComparisonOp
	 * @see #getOp()
	 * @generated
	 */
	void setOp(ComparisonOp value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Value)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getComparisonExpr_Right()
	 * @model containment="true"
	 * @generated
	 */
	Value getRight();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.ComparisonExpr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Value value);

} // ComparisonExpr
