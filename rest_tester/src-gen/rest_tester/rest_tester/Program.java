/**
 */
package rest_tester.rest_tester;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.Program#getEnvDeclarations <em>Env Declarations</em>}</li>
 *   <li>{@link rest_tester.rest_tester.Program#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 *
 * @see rest_tester.rest_tester.Rest_testerPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Env Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link rest_tester.rest_tester.EnvDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Declarations</em>' containment reference list.
	 * @see rest_tester.rest_tester.Rest_testerPackage#getProgram_EnvDeclarations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvDeclaration> getEnvDeclarations();

	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link rest_tester.rest_tester.TestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' containment reference list.
	 * @see rest_tester.rest_tester.Rest_testerPackage#getProgram_TestCases()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCase> getTestCases();

} // Program
