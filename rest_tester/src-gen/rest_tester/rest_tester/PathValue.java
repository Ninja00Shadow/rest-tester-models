/**
 */
package rest_tester.rest_tester;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.PathValue#getRoot <em>Root</em>}</li>
 *   <li>{@link rest_tester.rest_tester.PathValue#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getPathValue()
 * @model
 * @generated
 */
public interface PathValue extends Value {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see #setRoot(String)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getPathValue_Root()
	 * @model
	 * @generated
	 */
	String getRoot();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.PathValue#getRoot <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' attribute.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(String value);

	/**
	 * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
	 * The list contents are of type {@link rest_tester.rest_tester.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectors</em>' containment reference list.
	 * @see rest_tester.rest_tester.Rest_testerPackage#getPathValue_Selectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Selector> getSelectors();

} // PathValue
