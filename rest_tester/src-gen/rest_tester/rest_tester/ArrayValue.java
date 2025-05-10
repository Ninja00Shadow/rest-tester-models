/**
 */
package rest_tester.rest_tester;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.ArrayValue#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends Value {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link rest_tester.rest_tester.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see rest_tester.rest_tester.Rest_testerPackage#getArrayValue_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getElements();

} // ArrayValue
