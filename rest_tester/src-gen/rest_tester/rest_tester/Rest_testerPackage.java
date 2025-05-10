/**
 */
package rest_tester.rest_tester;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rest_tester.rest_tester.Rest_testerFactory
 * @model kind="package"
 * @generated
 */
public interface Rest_testerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rest_tester";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rest_tester";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rest_tester";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Rest_testerPackage eINSTANCE = rest_tester.rest_tester.impl.Rest_testerPackageImpl.init();

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.ProgramImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Env Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__ENV_DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TEST_CASES = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.EnvDeclarationImpl <em>Env Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.EnvDeclarationImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getEnvDeclaration()
	 * @generated
	 */
	int ENV_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_DECLARATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_DECLARATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Env Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Env Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.TestCaseImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__STATEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.OptionImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.StatementImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 4;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.RequestImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 5;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__METHOD = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ENDPOINT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__CONFIG = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.VarDeclarationImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getVarDeclaration()
	 * @generated
	 */
	int VAR_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.VarReassignmentImpl <em>Var Reassignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.VarReassignmentImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getVarReassignment()
	 * @generated
	 */
	int VAR_REASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REASSIGNMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REASSIGNMENT__VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Var Reassignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Var Reassignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_REASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.AssertionImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 8;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.BoolExprImpl <em>Bool Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.BoolExprImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getBoolExpr()
	 * @generated
	 */
	int BOOL_EXPR = 9;

	/**
	 * The number of structural features of the '<em>Bool Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXPR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bool Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.BinaryLogicalExprImpl <em>Binary Logical Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.BinaryLogicalExprImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getBinaryLogicalExpr()
	 * @generated
	 */
	int BINARY_LOGICAL_EXPR = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPR__LEFT = BOOL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPR__OP = BOOL_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPR__RIGHT = BOOL_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Logical Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPR_FEATURE_COUNT = BOOL_EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Logical Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPR_OPERATION_COUNT = BOOL_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.NotExprImpl <em>Not Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.NotExprImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getNotExpr()
	 * @generated
	 */
	int NOT_EXPR = 11;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPR__EXPR = BOOL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPR_FEATURE_COUNT = BOOL_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPR_OPERATION_COUNT = BOOL_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.ComparisonExprImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getComparisonExpr()
	 * @generated
	 */
	int COMPARISON_EXPR = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__LEFT = BOOL_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__OP = BOOL_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR__RIGHT = BOOL_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR_FEATURE_COUNT = BOOL_EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparison Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_EXPR_OPERATION_COUNT = BOOL_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.ValueImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 13;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.StringValueImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__LITERAL = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.NumberValueImpl <em>Number Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.NumberValueImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getNumberValue()
	 * @generated
	 */
	int NUMBER_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE__LITERAL = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Number Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.BooleanValueImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__LITERAL = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.ObjectValueImpl <em>Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.ObjectValueImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getObjectValue()
	 * @generated
	 */
	int OBJECT_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE__ENTRIES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.PairImpl <em>Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.PairImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getPair()
	 * @generated
	 */
	int PAIR = 18;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.ArrayValueImpl <em>Array Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.ArrayValueImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getArrayValue()
	 * @generated
	 */
	int ARRAY_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE__ELEMENTS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.PathValueImpl <em>Path Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.PathValueImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getPathValue()
	 * @generated
	 */
	int PATH_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VALUE__ROOT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VALUE__SELECTORS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Path Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.impl.SelectorImpl <em>Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.impl.SelectorImpl
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getSelector()
	 * @generated
	 */
	int SELECTOR = 21;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR__INDEX = 1;

	/**
	 * The number of structural features of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.HttpMethod
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 22;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.ComparisonOp <em>Comparison Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.ComparisonOp
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getComparisonOp()
	 * @generated
	 */
	int COMPARISON_OP = 23;

	/**
	 * The meta object id for the '{@link rest_tester.rest_tester.LogicalOp <em>Logical Op</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rest_tester.rest_tester.LogicalOp
	 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getLogicalOp()
	 * @generated
	 */
	int LOGICAL_OP = 24;

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see rest_tester.rest_tester.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link rest_tester.rest_tester.Program#getEnvDeclarations <em>Env Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Declarations</em>'.
	 * @see rest_tester.rest_tester.Program#getEnvDeclarations()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_EnvDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link rest_tester.rest_tester.Program#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Cases</em>'.
	 * @see rest_tester.rest_tester.Program#getTestCases()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_TestCases();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.EnvDeclaration <em>Env Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Declaration</em>'.
	 * @see rest_tester.rest_tester.EnvDeclaration
	 * @generated
	 */
	EClass getEnvDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.EnvDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rest_tester.rest_tester.EnvDeclaration#getName()
	 * @see #getEnvDeclaration()
	 * @generated
	 */
	EAttribute getEnvDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.EnvDeclaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rest_tester.rest_tester.EnvDeclaration#getValue()
	 * @see #getEnvDeclaration()
	 * @generated
	 */
	EReference getEnvDeclaration_Value();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see rest_tester.rest_tester.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.TestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rest_tester.rest_tester.TestCase#getName()
	 * @see #getTestCase()
	 * @generated
	 */
	EAttribute getTestCase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rest_tester.rest_tester.TestCase#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see rest_tester.rest_tester.TestCase#getOptions()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Options();

	/**
	 * Returns the meta object for the containment reference list '{@link rest_tester.rest_tester.TestCase#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see rest_tester.rest_tester.TestCase#getStatements()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Statements();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see rest_tester.rest_tester.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.Option#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see rest_tester.rest_tester.Option#getKey()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Key();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rest_tester.rest_tester.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Value();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see rest_tester.rest_tester.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see rest_tester.rest_tester.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.Request#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see rest_tester.rest_tester.Request#getMethod()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Method();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.Request#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint</em>'.
	 * @see rest_tester.rest_tester.Request#getEndpoint()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Endpoint();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.Request#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see rest_tester.rest_tester.Request#getConfig()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_Config();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.VarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Declaration</em>'.
	 * @see rest_tester.rest_tester.VarDeclaration
	 * @generated
	 */
	EClass getVarDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.VarDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rest_tester.rest_tester.VarDeclaration#getName()
	 * @see #getVarDeclaration()
	 * @generated
	 */
	EAttribute getVarDeclaration_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.VarDeclaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rest_tester.rest_tester.VarDeclaration#getValue()
	 * @see #getVarDeclaration()
	 * @generated
	 */
	EReference getVarDeclaration_Value();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.VarReassignment <em>Var Reassignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Reassignment</em>'.
	 * @see rest_tester.rest_tester.VarReassignment
	 * @generated
	 */
	EClass getVarReassignment();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.VarReassignment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rest_tester.rest_tester.VarReassignment#getName()
	 * @see #getVarReassignment()
	 * @generated
	 */
	EAttribute getVarReassignment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.VarReassignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rest_tester.rest_tester.VarReassignment#getValue()
	 * @see #getVarReassignment()
	 * @generated
	 */
	EReference getVarReassignment_Value();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see rest_tester.rest_tester.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.Assertion#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see rest_tester.rest_tester.Assertion#getExpr()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Expr();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.BoolExpr <em>Bool Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Expr</em>'.
	 * @see rest_tester.rest_tester.BoolExpr
	 * @generated
	 */
	EClass getBoolExpr();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.BinaryLogicalExpr <em>Binary Logical Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Logical Expr</em>'.
	 * @see rest_tester.rest_tester.BinaryLogicalExpr
	 * @generated
	 */
	EClass getBinaryLogicalExpr();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.BinaryLogicalExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see rest_tester.rest_tester.BinaryLogicalExpr#getLeft()
	 * @see #getBinaryLogicalExpr()
	 * @generated
	 */
	EReference getBinaryLogicalExpr_Left();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.BinaryLogicalExpr#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see rest_tester.rest_tester.BinaryLogicalExpr#getOp()
	 * @see #getBinaryLogicalExpr()
	 * @generated
	 */
	EAttribute getBinaryLogicalExpr_Op();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.BinaryLogicalExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see rest_tester.rest_tester.BinaryLogicalExpr#getRight()
	 * @see #getBinaryLogicalExpr()
	 * @generated
	 */
	EReference getBinaryLogicalExpr_Right();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.NotExpr <em>Not Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expr</em>'.
	 * @see rest_tester.rest_tester.NotExpr
	 * @generated
	 */
	EClass getNotExpr();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.NotExpr#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see rest_tester.rest_tester.NotExpr#getExpr()
	 * @see #getNotExpr()
	 * @generated
	 */
	EReference getNotExpr_Expr();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.ComparisonExpr <em>Comparison Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Expr</em>'.
	 * @see rest_tester.rest_tester.ComparisonExpr
	 * @generated
	 */
	EClass getComparisonExpr();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.ComparisonExpr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see rest_tester.rest_tester.ComparisonExpr#getLeft()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EReference getComparisonExpr_Left();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.ComparisonExpr#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see rest_tester.rest_tester.ComparisonExpr#getOp()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EAttribute getComparisonExpr_Op();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.ComparisonExpr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see rest_tester.rest_tester.ComparisonExpr#getRight()
	 * @see #getComparisonExpr()
	 * @generated
	 */
	EReference getComparisonExpr_Right();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see rest_tester.rest_tester.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see rest_tester.rest_tester.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.StringValue#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see rest_tester.rest_tester.StringValue#getLiteral()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Literal();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Value</em>'.
	 * @see rest_tester.rest_tester.NumberValue
	 * @generated
	 */
	EClass getNumberValue();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.NumberValue#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see rest_tester.rest_tester.NumberValue#getLiteral()
	 * @see #getNumberValue()
	 * @generated
	 */
	EAttribute getNumberValue_Literal();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see rest_tester.rest_tester.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.BooleanValue#isLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see rest_tester.rest_tester.BooleanValue#isLiteral()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Literal();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.ObjectValue <em>Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Value</em>'.
	 * @see rest_tester.rest_tester.ObjectValue
	 * @generated
	 */
	EClass getObjectValue();

	/**
	 * Returns the meta object for the containment reference list '{@link rest_tester.rest_tester.ObjectValue#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see rest_tester.rest_tester.ObjectValue#getEntries()
	 * @see #getObjectValue()
	 * @generated
	 */
	EReference getObjectValue_Entries();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair</em>'.
	 * @see rest_tester.rest_tester.Pair
	 * @generated
	 */
	EClass getPair();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.Pair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see rest_tester.rest_tester.Pair#getKey()
	 * @see #getPair()
	 * @generated
	 */
	EAttribute getPair_Key();

	/**
	 * Returns the meta object for the containment reference '{@link rest_tester.rest_tester.Pair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see rest_tester.rest_tester.Pair#getValue()
	 * @see #getPair()
	 * @generated
	 */
	EReference getPair_Value();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Value</em>'.
	 * @see rest_tester.rest_tester.ArrayValue
	 * @generated
	 */
	EClass getArrayValue();

	/**
	 * Returns the meta object for the containment reference list '{@link rest_tester.rest_tester.ArrayValue#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see rest_tester.rest_tester.ArrayValue#getElements()
	 * @see #getArrayValue()
	 * @generated
	 */
	EReference getArrayValue_Elements();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.PathValue <em>Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Value</em>'.
	 * @see rest_tester.rest_tester.PathValue
	 * @generated
	 */
	EClass getPathValue();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.PathValue#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see rest_tester.rest_tester.PathValue#getRoot()
	 * @see #getPathValue()
	 * @generated
	 */
	EAttribute getPathValue_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link rest_tester.rest_tester.PathValue#getSelectors <em>Selectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selectors</em>'.
	 * @see rest_tester.rest_tester.PathValue#getSelectors()
	 * @see #getPathValue()
	 * @generated
	 */
	EReference getPathValue_Selectors();

	/**
	 * Returns the meta object for class '{@link rest_tester.rest_tester.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selector</em>'.
	 * @see rest_tester.rest_tester.Selector
	 * @generated
	 */
	EClass getSelector();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.Selector#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see rest_tester.rest_tester.Selector#getPropertyName()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link rest_tester.rest_tester.Selector#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see rest_tester.rest_tester.Selector#getIndex()
	 * @see #getSelector()
	 * @generated
	 */
	EAttribute getSelector_Index();

	/**
	 * Returns the meta object for enum '{@link rest_tester.rest_tester.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see rest_tester.rest_tester.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the meta object for enum '{@link rest_tester.rest_tester.ComparisonOp <em>Comparison Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Op</em>'.
	 * @see rest_tester.rest_tester.ComparisonOp
	 * @generated
	 */
	EEnum getComparisonOp();

	/**
	 * Returns the meta object for enum '{@link rest_tester.rest_tester.LogicalOp <em>Logical Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Op</em>'.
	 * @see rest_tester.rest_tester.LogicalOp
	 * @generated
	 */
	EEnum getLogicalOp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Rest_testerFactory getRest_testerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.ProgramImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Env Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__ENV_DECLARATIONS = eINSTANCE.getProgram_EnvDeclarations();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TEST_CASES = eINSTANCE.getProgram_TestCases();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.EnvDeclarationImpl <em>Env Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.EnvDeclarationImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getEnvDeclaration()
		 * @generated
		 */
		EClass ENV_DECLARATION = eINSTANCE.getEnvDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_DECLARATION__NAME = eINSTANCE.getEnvDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_DECLARATION__VALUE = eINSTANCE.getEnvDeclaration_Value();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.TestCaseImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CASE__NAME = eINSTANCE.getTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__OPTIONS = eINSTANCE.getTestCase_Options();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__STATEMENTS = eINSTANCE.getTestCase_Statements();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.OptionImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__KEY = eINSTANCE.getOption_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.StatementImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.RequestImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__METHOD = eINSTANCE.getRequest_Method();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ENDPOINT = eINSTANCE.getRequest_Endpoint();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__CONFIG = eINSTANCE.getRequest_Config();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.VarDeclarationImpl <em>Var Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.VarDeclarationImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getVarDeclaration()
		 * @generated
		 */
		EClass VAR_DECLARATION = eINSTANCE.getVarDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_DECLARATION__NAME = eINSTANCE.getVarDeclaration_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_DECLARATION__VALUE = eINSTANCE.getVarDeclaration_Value();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.VarReassignmentImpl <em>Var Reassignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.VarReassignmentImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getVarReassignment()
		 * @generated
		 */
		EClass VAR_REASSIGNMENT = eINSTANCE.getVarReassignment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_REASSIGNMENT__NAME = eINSTANCE.getVarReassignment_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_REASSIGNMENT__VALUE = eINSTANCE.getVarReassignment_Value();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.AssertionImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__EXPR = eINSTANCE.getAssertion_Expr();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.BoolExprImpl <em>Bool Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.BoolExprImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getBoolExpr()
		 * @generated
		 */
		EClass BOOL_EXPR = eINSTANCE.getBoolExpr();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.BinaryLogicalExprImpl <em>Binary Logical Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.BinaryLogicalExprImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getBinaryLogicalExpr()
		 * @generated
		 */
		EClass BINARY_LOGICAL_EXPR = eINSTANCE.getBinaryLogicalExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGICAL_EXPR__LEFT = eINSTANCE.getBinaryLogicalExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_LOGICAL_EXPR__OP = eINSTANCE.getBinaryLogicalExpr_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGICAL_EXPR__RIGHT = eINSTANCE.getBinaryLogicalExpr_Right();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.NotExprImpl <em>Not Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.NotExprImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getNotExpr()
		 * @generated
		 */
		EClass NOT_EXPR = eINSTANCE.getNotExpr();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPR__EXPR = eINSTANCE.getNotExpr_Expr();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.ComparisonExprImpl <em>Comparison Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.ComparisonExprImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getComparisonExpr()
		 * @generated
		 */
		EClass COMPARISON_EXPR = eINSTANCE.getComparisonExpr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_EXPR__LEFT = eINSTANCE.getComparisonExpr_Left();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_EXPR__OP = eINSTANCE.getComparisonExpr_Op();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_EXPR__RIGHT = eINSTANCE.getComparisonExpr_Right();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.ValueImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.StringValueImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__LITERAL = eINSTANCE.getStringValue_Literal();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.NumberValueImpl <em>Number Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.NumberValueImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getNumberValue()
		 * @generated
		 */
		EClass NUMBER_VALUE = eINSTANCE.getNumberValue();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_VALUE__LITERAL = eINSTANCE.getNumberValue_Literal();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.BooleanValueImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__LITERAL = eINSTANCE.getBooleanValue_Literal();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.ObjectValueImpl <em>Object Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.ObjectValueImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getObjectValue()
		 * @generated
		 */
		EClass OBJECT_VALUE = eINSTANCE.getObjectValue();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_VALUE__ENTRIES = eINSTANCE.getObjectValue_Entries();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.PairImpl <em>Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.PairImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getPair()
		 * @generated
		 */
		EClass PAIR = eINSTANCE.getPair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAIR__KEY = eINSTANCE.getPair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAIR__VALUE = eINSTANCE.getPair_Value();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.ArrayValueImpl <em>Array Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.ArrayValueImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getArrayValue()
		 * @generated
		 */
		EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY_VALUE__ELEMENTS = eINSTANCE.getArrayValue_Elements();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.PathValueImpl <em>Path Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.PathValueImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getPathValue()
		 * @generated
		 */
		EClass PATH_VALUE = eINSTANCE.getPathValue();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_VALUE__ROOT = eINSTANCE.getPathValue_Root();

		/**
		 * The meta object literal for the '<em><b>Selectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_VALUE__SELECTORS = eINSTANCE.getPathValue_Selectors();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.impl.SelectorImpl <em>Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.impl.SelectorImpl
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getSelector()
		 * @generated
		 */
		EClass SELECTOR = eINSTANCE.getSelector();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR__PROPERTY_NAME = eINSTANCE.getSelector_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTOR__INDEX = eINSTANCE.getSelector_Index();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.HttpMethod
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.ComparisonOp <em>Comparison Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.ComparisonOp
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getComparisonOp()
		 * @generated
		 */
		EEnum COMPARISON_OP = eINSTANCE.getComparisonOp();

		/**
		 * The meta object literal for the '{@link rest_tester.rest_tester.LogicalOp <em>Logical Op</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rest_tester.rest_tester.LogicalOp
		 * @see rest_tester.rest_tester.impl.Rest_testerPackageImpl#getLogicalOp()
		 * @generated
		 */
		EEnum LOGICAL_OP = eINSTANCE.getLogicalOp();

	}

} //Rest_testerPackage
