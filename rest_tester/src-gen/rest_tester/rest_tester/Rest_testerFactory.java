/**
 */
package rest_tester.rest_tester;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rest_tester.rest_tester.Rest_testerPackage
 * @generated
 */
public interface Rest_testerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rest_testerFactory eINSTANCE = rest_tester.rest_tester.impl.Rest_testerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Env Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Env Declaration</em>'.
	 * @generated
	 */
	EnvDeclaration createEnvDeclaration();

	/**
	 * Returns a new object of class '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Case</em>'.
	 * @generated
	 */
	TestCase createTestCase();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Request</em>'.
	 * @generated
	 */
	Request createRequest();

	/**
	 * Returns a new object of class '<em>Var Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Declaration</em>'.
	 * @generated
	 */
	VarDeclaration createVarDeclaration();

	/**
	 * Returns a new object of class '<em>Var Reassignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Reassignment</em>'.
	 * @generated
	 */
	VarReassignment createVarReassignment();

	/**
	 * Returns a new object of class '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion</em>'.
	 * @generated
	 */
	Assertion createAssertion();

	/**
	 * Returns a new object of class '<em>Binary Logical Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Logical Expr</em>'.
	 * @generated
	 */
	BinaryLogicalExpr createBinaryLogicalExpr();

	/**
	 * Returns a new object of class '<em>Not Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Expr</em>'.
	 * @generated
	 */
	NotExpr createNotExpr();

	/**
	 * Returns a new object of class '<em>Comparison Expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Expr</em>'.
	 * @generated
	 */
	ComparisonExpr createComparisonExpr();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Number Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Value</em>'.
	 * @generated
	 */
	NumberValue createNumberValue();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Value</em>'.
	 * @generated
	 */
	ObjectValue createObjectValue();

	/**
	 * Returns a new object of class '<em>Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pair</em>'.
	 * @generated
	 */
	Pair createPair();

	/**
	 * Returns a new object of class '<em>Array Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Value</em>'.
	 * @generated
	 */
	ArrayValue createArrayValue();

	/**
	 * Returns a new object of class '<em>Var Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Access</em>'.
	 * @generated
	 */
	VarAccess createVarAccess();

	/**
	 * Returns a new object of class '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selector</em>'.
	 * @generated
	 */
	Selector createSelector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Rest_testerPackage getRest_testerPackage();

} //Rest_testerFactory
