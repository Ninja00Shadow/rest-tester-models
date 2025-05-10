/**
 */
package rest_tester.rest_tester;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.EnvDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link rest_tester.rest_tester.EnvDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getEnvDeclaration()
 * @model
 * @generated
 */
public interface EnvDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getEnvDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.EnvDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see rest_tester.rest_tester.Rest_testerPackage#getEnvDeclaration_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link rest_tester.rest_tester.EnvDeclaration#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

} // EnvDeclaration
