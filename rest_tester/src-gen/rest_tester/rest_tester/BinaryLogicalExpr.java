/**
 */
package rest_tester.rest_tester;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Logical Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.BinaryLogicalExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link rest_tester.rest_tester.BinaryLogicalExpr#getOp <em>Op</em>}</li>
 *   <li>{@link rest_tester.rest_tester.BinaryLogicalExpr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getBinaryLogicalExpr()
 * @model
 * @generated
 */
public interface BinaryLogicalExpr extends BoolExpr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(BoolExpr)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getBinaryLogicalExpr_Left()
	 * @model containment="true"
	 * @generated
	 */
	BoolExpr getLeft();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.BinaryLogicalExpr#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(BoolExpr value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link rest_tester.rest_tester.LogicalOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see rest_tester.rest_tester.LogicalOp
	 * @see #setOp(LogicalOp)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getBinaryLogicalExpr_Op()
	 * @model
	 * @generated
	 */
	LogicalOp getOp();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.BinaryLogicalExpr#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see rest_tester.rest_tester.LogicalOp
	 * @see #getOp()
	 * @generated
	 */
	void setOp(LogicalOp value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(BoolExpr)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getBinaryLogicalExpr_Right()
	 * @model containment="true"
	 * @generated
	 */
	BoolExpr getRight();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.BinaryLogicalExpr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(BoolExpr value);

} // BinaryLogicalExpr
