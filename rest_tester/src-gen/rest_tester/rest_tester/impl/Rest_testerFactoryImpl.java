/**
 */
package rest_tester.rest_tester.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rest_tester.rest_tester.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rest_testerFactoryImpl extends EFactoryImpl implements Rest_testerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Rest_testerFactory init() {
		try {
			Rest_testerFactory theRest_testerFactory = (Rest_testerFactory) EPackage.Registry.INSTANCE
					.getEFactory(Rest_testerPackage.eNS_URI);
			if (theRest_testerFactory != null) {
				return theRest_testerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Rest_testerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rest_testerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Rest_testerPackage.PROGRAM:
			return createProgram();
		case Rest_testerPackage.ENV_DECLARATION:
			return createEnvDeclaration();
		case Rest_testerPackage.TEST_CASE:
			return createTestCase();
		case Rest_testerPackage.OPTION:
			return createOption();
		case Rest_testerPackage.REQUEST:
			return createRequest();
		case Rest_testerPackage.VAR_DECLARATION:
			return createVarDeclaration();
		case Rest_testerPackage.VAR_REASSIGNMENT:
			return createVarReassignment();
		case Rest_testerPackage.ASSERTION:
			return createAssertion();
		case Rest_testerPackage.BINARY_LOGICAL_EXPR:
			return createBinaryLogicalExpr();
		case Rest_testerPackage.NOT_EXPR:
			return createNotExpr();
		case Rest_testerPackage.COMPARISON_EXPR:
			return createComparisonExpr();
		case Rest_testerPackage.STRING_VALUE:
			return createStringValue();
		case Rest_testerPackage.NUMBER_VALUE:
			return createNumberValue();
		case Rest_testerPackage.BOOLEAN_VALUE:
			return createBooleanValue();
		case Rest_testerPackage.OBJECT_VALUE:
			return createObjectValue();
		case Rest_testerPackage.PAIR:
			return createPair();
		case Rest_testerPackage.ARRAY_VALUE:
			return createArrayValue();
		case Rest_testerPackage.PATH_VALUE:
			return createPathValue();
		case Rest_testerPackage.SELECTOR:
			return createSelector();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Rest_testerPackage.HTTP_METHOD:
			return createHttpMethodFromString(eDataType, initialValue);
		case Rest_testerPackage.COMPARISON_OP:
			return createComparisonOpFromString(eDataType, initialValue);
		case Rest_testerPackage.LOGICAL_OP:
			return createLogicalOpFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Rest_testerPackage.HTTP_METHOD:
			return convertHttpMethodToString(eDataType, instanceValue);
		case Rest_testerPackage.COMPARISON_OP:
			return convertComparisonOpToString(eDataType, instanceValue);
		case Rest_testerPackage.LOGICAL_OP:
			return convertLogicalOpToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvDeclaration createEnvDeclaration() {
		EnvDeclarationImpl envDeclaration = new EnvDeclarationImpl();
		return envDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarDeclaration createVarDeclaration() {
		VarDeclarationImpl varDeclaration = new VarDeclarationImpl();
		return varDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarReassignment createVarReassignment() {
		VarReassignmentImpl varReassignment = new VarReassignmentImpl();
		return varReassignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryLogicalExpr createBinaryLogicalExpr() {
		BinaryLogicalExprImpl binaryLogicalExpr = new BinaryLogicalExprImpl();
		return binaryLogicalExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotExpr createNotExpr() {
		NotExprImpl notExpr = new NotExprImpl();
		return notExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonExpr createComparisonExpr() {
		ComparisonExprImpl comparisonExpr = new ComparisonExprImpl();
		return comparisonExpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberValue createNumberValue() {
		NumberValueImpl numberValue = new NumberValueImpl();
		return numberValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectValue createObjectValue() {
		ObjectValueImpl objectValue = new ObjectValueImpl();
		return objectValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pair createPair() {
		PairImpl pair = new PairImpl();
		return pair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayValue createArrayValue() {
		ArrayValueImpl arrayValue = new ArrayValueImpl();
		return arrayValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PathValue createPathValue() {
		PathValueImpl pathValue = new PathValueImpl();
		return pathValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Selector createSelector() {
		SelectorImpl selector = new SelectorImpl();
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod createHttpMethodFromString(EDataType eDataType, String initialValue) {
		HttpMethod result = HttpMethod.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOp createComparisonOpFromString(EDataType eDataType, String initialValue) {
		ComparisonOp result = ComparisonOp.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOp createLogicalOpFromString(EDataType eDataType, String initialValue) {
		LogicalOp result = LogicalOp.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOpToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rest_testerPackage getRest_testerPackage() {
		return (Rest_testerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Rest_testerPackage getPackage() {
		return Rest_testerPackage.eINSTANCE;
	}

} //Rest_testerFactoryImpl
