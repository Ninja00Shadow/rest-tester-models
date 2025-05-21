/**
 */
package rest_tester.rest_tester.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rest_tester.rest_tester.ArrayValue;
import rest_tester.rest_tester.Assertion;
import rest_tester.rest_tester.BinaryLogicalExpr;
import rest_tester.rest_tester.BoolExpr;
import rest_tester.rest_tester.BooleanValue;
import rest_tester.rest_tester.ComparisonExpr;
import rest_tester.rest_tester.ComparisonOp;
import rest_tester.rest_tester.EnvDeclaration;
import rest_tester.rest_tester.HttpMethod;
import rest_tester.rest_tester.LogicalOp;
import rest_tester.rest_tester.NotExpr;
import rest_tester.rest_tester.NumberValue;
import rest_tester.rest_tester.ObjectValue;
import rest_tester.rest_tester.Option;
import rest_tester.rest_tester.Pair;
import rest_tester.rest_tester.Program;
import rest_tester.rest_tester.Request;
import rest_tester.rest_tester.Rest_testerFactory;
import rest_tester.rest_tester.Rest_testerPackage;
import rest_tester.rest_tester.Selector;
import rest_tester.rest_tester.Statement;
import rest_tester.rest_tester.StringValue;
import rest_tester.rest_tester.TestCase;
import rest_tester.rest_tester.Value;
import rest_tester.rest_tester.VarAccess;
import rest_tester.rest_tester.VarDeclaration;
import rest_tester.rest_tester.VarReassignment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rest_testerPackageImpl extends EPackageImpl implements Rest_testerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varReassignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryLogicalExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonExprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOpEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOpEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rest_tester.rest_tester.Rest_testerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Rest_testerPackageImpl() {
		super(eNS_URI, Rest_testerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Rest_testerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Rest_testerPackage init() {
		if (isInited)
			return (Rest_testerPackage) EPackage.Registry.INSTANCE.getEPackage(Rest_testerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRest_testerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Rest_testerPackageImpl theRest_testerPackage = registeredRest_testerPackage instanceof Rest_testerPackageImpl
				? (Rest_testerPackageImpl) registeredRest_testerPackage
				: new Rest_testerPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRest_testerPackage.createPackageContents();

		// Initialize created meta-data
		theRest_testerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRest_testerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Rest_testerPackage.eNS_URI, theRest_testerPackage);
		return theRest_testerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_EnvDeclarations() {
		return (EReference) programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgram_TestCases() {
		return (EReference) programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvDeclaration() {
		return envDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvDeclaration_Name() {
		return (EAttribute) envDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvDeclaration_Value() {
		return (EReference) envDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestCase_Name() {
		return (EAttribute) testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestCase_Options() {
		return (EReference) testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestCase_Statements() {
		return (EReference) testCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOption_Key() {
		return (EAttribute) optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOption_Value() {
		return (EReference) optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequest_Method() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequest_Endpoint() {
		return (EAttribute) requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequest_Config() {
		return (EReference) requestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarDeclaration() {
		return varDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarDeclaration_Name() {
		return (EAttribute) varDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarDeclaration_Value() {
		return (EReference) varDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarReassignment() {
		return varReassignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarReassignment_Name() {
		return (EAttribute) varReassignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarReassignment_Value() {
		return (EReference) varReassignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertion_Expr() {
		return (EReference) assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolExpr() {
		return boolExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryLogicalExpr() {
		return binaryLogicalExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryLogicalExpr_Left() {
		return (EReference) binaryLogicalExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryLogicalExpr_Op() {
		return (EAttribute) binaryLogicalExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryLogicalExpr_Right() {
		return (EReference) binaryLogicalExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotExpr() {
		return notExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotExpr_Expr() {
		return (EReference) notExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparisonExpr() {
		return comparisonExprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparisonExpr_Left() {
		return (EReference) comparisonExprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonExpr_Op() {
		return (EAttribute) comparisonExprEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparisonExpr_Right() {
		return (EReference) comparisonExprEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringValue_Literal() {
		return (EAttribute) stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberValue() {
		return numberValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberValue_Literal() {
		return (EAttribute) numberValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanValue_Literal() {
		return (EAttribute) booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectValue() {
		return objectValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectValue_Entries() {
		return (EReference) objectValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPair() {
		return pairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPair_Key() {
		return (EAttribute) pairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPair_Value() {
		return (EReference) pairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayValue_Elements() {
		return (EReference) arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVarAccess() {
		return varAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVarAccess_Name() {
		return (EAttribute) varAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVarAccess_Selectors() {
		return (EReference) varAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelector() {
		return selectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelector_PropertyName() {
		return (EAttribute) selectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelector_Index() {
		return (EAttribute) selectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHttpMethod() {
		return httpMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComparisonOp() {
		return comparisonOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLogicalOp() {
		return logicalOpEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rest_testerFactory getRest_testerFactory() {
		return (Rest_testerFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		programEClass = createEClass(PROGRAM);
		createEReference(programEClass, PROGRAM__ENV_DECLARATIONS);
		createEReference(programEClass, PROGRAM__TEST_CASES);

		envDeclarationEClass = createEClass(ENV_DECLARATION);
		createEAttribute(envDeclarationEClass, ENV_DECLARATION__NAME);
		createEReference(envDeclarationEClass, ENV_DECLARATION__VALUE);

		testCaseEClass = createEClass(TEST_CASE);
		createEAttribute(testCaseEClass, TEST_CASE__NAME);
		createEReference(testCaseEClass, TEST_CASE__OPTIONS);
		createEReference(testCaseEClass, TEST_CASE__STATEMENTS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__KEY);
		createEReference(optionEClass, OPTION__VALUE);

		statementEClass = createEClass(STATEMENT);

		requestEClass = createEClass(REQUEST);
		createEAttribute(requestEClass, REQUEST__METHOD);
		createEAttribute(requestEClass, REQUEST__ENDPOINT);
		createEReference(requestEClass, REQUEST__CONFIG);

		varDeclarationEClass = createEClass(VAR_DECLARATION);
		createEAttribute(varDeclarationEClass, VAR_DECLARATION__NAME);
		createEReference(varDeclarationEClass, VAR_DECLARATION__VALUE);

		varReassignmentEClass = createEClass(VAR_REASSIGNMENT);
		createEAttribute(varReassignmentEClass, VAR_REASSIGNMENT__NAME);
		createEReference(varReassignmentEClass, VAR_REASSIGNMENT__VALUE);

		assertionEClass = createEClass(ASSERTION);
		createEReference(assertionEClass, ASSERTION__EXPR);

		boolExprEClass = createEClass(BOOL_EXPR);

		binaryLogicalExprEClass = createEClass(BINARY_LOGICAL_EXPR);
		createEReference(binaryLogicalExprEClass, BINARY_LOGICAL_EXPR__LEFT);
		createEAttribute(binaryLogicalExprEClass, BINARY_LOGICAL_EXPR__OP);
		createEReference(binaryLogicalExprEClass, BINARY_LOGICAL_EXPR__RIGHT);

		notExprEClass = createEClass(NOT_EXPR);
		createEReference(notExprEClass, NOT_EXPR__EXPR);

		comparisonExprEClass = createEClass(COMPARISON_EXPR);
		createEReference(comparisonExprEClass, COMPARISON_EXPR__LEFT);
		createEAttribute(comparisonExprEClass, COMPARISON_EXPR__OP);
		createEReference(comparisonExprEClass, COMPARISON_EXPR__RIGHT);

		valueEClass = createEClass(VALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__LITERAL);

		numberValueEClass = createEClass(NUMBER_VALUE);
		createEAttribute(numberValueEClass, NUMBER_VALUE__LITERAL);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__LITERAL);

		objectValueEClass = createEClass(OBJECT_VALUE);
		createEReference(objectValueEClass, OBJECT_VALUE__ENTRIES);

		pairEClass = createEClass(PAIR);
		createEAttribute(pairEClass, PAIR__KEY);
		createEReference(pairEClass, PAIR__VALUE);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__ELEMENTS);

		varAccessEClass = createEClass(VAR_ACCESS);
		createEAttribute(varAccessEClass, VAR_ACCESS__NAME);
		createEReference(varAccessEClass, VAR_ACCESS__SELECTORS);

		selectorEClass = createEClass(SELECTOR);
		createEAttribute(selectorEClass, SELECTOR__PROPERTY_NAME);
		createEAttribute(selectorEClass, SELECTOR__INDEX);

		// Create enums
		httpMethodEEnum = createEEnum(HTTP_METHOD);
		comparisonOpEEnum = createEEnum(COMPARISON_OP);
		logicalOpEEnum = createEEnum(LOGICAL_OP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requestEClass.getESuperTypes().add(this.getStatement());
		varDeclarationEClass.getESuperTypes().add(this.getStatement());
		varReassignmentEClass.getESuperTypes().add(this.getStatement());
		assertionEClass.getESuperTypes().add(this.getStatement());
		binaryLogicalExprEClass.getESuperTypes().add(this.getBoolExpr());
		notExprEClass.getESuperTypes().add(this.getBoolExpr());
		comparisonExprEClass.getESuperTypes().add(this.getBoolExpr());
		stringValueEClass.getESuperTypes().add(this.getValue());
		numberValueEClass.getESuperTypes().add(this.getValue());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		objectValueEClass.getESuperTypes().add(this.getValue());
		arrayValueEClass.getESuperTypes().add(this.getValue());
		varAccessEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgram_EnvDeclarations(), this.getEnvDeclaration(), null, "envDeclarations", null, 0, -1,
				Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgram_TestCases(), this.getTestCase(), null, "testCases", null, 0, -1, Program.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envDeclarationEClass, EnvDeclaration.class, "EnvDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1, EnvDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvDeclaration_Value(), this.getValue(), null, "value", null, 1, 1, EnvDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestCase_Name(), ecorePackage.getEString(), "name", null, 1, 1, TestCase.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Options(), this.getOption(), null, "options", null, 0, -1, TestCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Statements(), this.getStatement(), null, "statements", null, 0, -1, TestCase.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Key(), ecorePackage.getEString(), "key", null, 1, 1, Option.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Value(), this.getValue(), null, "value", null, 1, 1, Option.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequest_Method(), this.getHttpMethod(), "method", null, 1, 1, Request.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequest_Endpoint(), ecorePackage.getEString(), "endpoint", null, 1, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequest_Config(), this.getObjectValue(), null, "config", null, 0, 1, Request.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varDeclarationEClass, VarDeclaration.class, "VarDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarDeclaration_Name(), ecorePackage.getEString(), "name", null, 1, 1, VarDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarDeclaration_Value(), this.getValue(), null, "value", null, 1, 1, VarDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varReassignmentEClass, VarReassignment.class, "VarReassignment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarReassignment_Name(), ecorePackage.getEString(), "name", null, 1, 1, VarReassignment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarReassignment_Value(), this.getValue(), null, "value", null, 1, 1, VarReassignment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertion_Expr(), this.getBoolExpr(), null, "expr", null, 1, 1, Assertion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolExprEClass, BoolExpr.class, "BoolExpr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryLogicalExprEClass, BinaryLogicalExpr.class, "BinaryLogicalExpr", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryLogicalExpr_Left(), this.getBoolExpr(), null, "left", null, 1, 1,
				BinaryLogicalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryLogicalExpr_Op(), this.getLogicalOp(), "op", null, 1, 1, BinaryLogicalExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryLogicalExpr_Right(), this.getBoolExpr(), null, "right", null, 1, 1,
				BinaryLogicalExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notExprEClass, NotExpr.class, "NotExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotExpr_Expr(), this.getBoolExpr(), null, "expr", null, 1, 1, NotExpr.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(comparisonExprEClass, ComparisonExpr.class, "ComparisonExpr", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparisonExpr_Left(), this.getValue(), null, "left", null, 1, 1, ComparisonExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonExpr_Op(), this.getComparisonOp(), "op", null, 1, 1, ComparisonExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonExpr_Right(), this.getValue(), null, "right", null, 1, 1, ComparisonExpr.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, StringValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberValueEClass, NumberValue.class, "NumberValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValue_Literal(), ecorePackage.getEDouble(), "literal", null, 1, 1, NumberValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Literal(), ecorePackage.getEBoolean(), "literal", "true", 1, 1,
				BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(objectValueEClass, ObjectValue.class, "ObjectValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectValue_Entries(), this.getPair(), null, "entries", null, 0, -1, ObjectValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pairEClass, Pair.class, "Pair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPair_Key(), ecorePackage.getEString(), "key", null, 1, 1, Pair.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPair_Value(), this.getValue(), null, "value", null, 1, 1, Pair.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Elements(), this.getValue(), null, "elements", null, 0, -1, ArrayValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varAccessEClass, VarAccess.class, "VarAccess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarAccess_Name(), ecorePackage.getEString(), "name", null, 1, 1, VarAccess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarAccess_Selectors(), this.getSelector(), null, "selectors", null, 0, -1, VarAccess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectorEClass, Selector.class, "Selector", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelector_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1,
				Selector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelector_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Selector.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
		addEEnumLiteral(httpMethodEEnum, HttpMethod.GET);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.POST);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.PUT);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.DELETE);
		addEEnumLiteral(httpMethodEEnum, HttpMethod.HEAD);

		initEEnum(comparisonOpEEnum, ComparisonOp.class, "ComparisonOp");
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.EQ);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.NEQ);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.LT);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.GT);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.LTE);
		addEEnumLiteral(comparisonOpEEnum, ComparisonOp.GTE);

		initEEnum(logicalOpEEnum, LogicalOp.class, "LogicalOp");
		addEEnumLiteral(logicalOpEEnum, LogicalOp.AND);
		addEEnumLiteral(logicalOpEEnum, LogicalOp.OR);

		// Create resource
		createResource(eNS_URI);
	}

} //Rest_testerPackageImpl
