/**
 */
package rest_tester.rest_tester;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.ObjectValue#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getObjectValue()
 * @model
 * @generated
 */
public interface ObjectValue extends Value {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link rest_tester.rest_tester.Pair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see rest_tester.rest_tester.Rest_testerPackage#getObjectValue_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pair> getEntries();

} // ObjectValue
