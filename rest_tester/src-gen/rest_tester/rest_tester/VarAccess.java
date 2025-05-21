/**
 */
package rest_tester.rest_tester;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.VarAccess#getName <em>Name</em>}</li>
 *   <li>{@link rest_tester.rest_tester.VarAccess#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getVarAccess()
 * @model
 * @generated
 */
public interface VarAccess extends Value {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getVarAccess_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.VarAccess#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link rest_tester.rest_tester.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectors</em>' containment reference list.
	 * @see rest_tester.rest_tester.Rest_testerPackage#getVarAccess_Selectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selector> getSelectors();

} // VarAccess
