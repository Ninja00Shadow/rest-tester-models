/**
 */
package rest_tester.rest_tester.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rest_tester.rest_tester.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rest_tester.rest_tester.Rest_testerPackage
 * @generated
 */
public class Rest_testerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Rest_testerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rest_testerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Rest_testerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rest_testerSwitch<Adapter> modelSwitch = new Rest_testerSwitch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseEnvDeclaration(EnvDeclaration object) {
			return createEnvDeclarationAdapter();
		}

		@Override
		public Adapter caseTestCase(TestCase object) {
			return createTestCaseAdapter();
		}

		@Override
		public Adapter caseOption(Option object) {
			return createOptionAdapter();
		}

		@Override
		public Adapter caseStatement(Statement object) {
			return createStatementAdapter();
		}

		@Override
		public Adapter caseRequest(Request object) {
			return createRequestAdapter();
		}

		@Override
		public Adapter caseVarDeclaration(VarDeclaration object) {
			return createVarDeclarationAdapter();
		}

		@Override
		public Adapter caseVarReassignment(VarReassignment object) {
			return createVarReassignmentAdapter();
		}

		@Override
		public Adapter caseAssertion(Assertion object) {
			return createAssertionAdapter();
		}

		@Override
		public Adapter caseBoolExpr(BoolExpr object) {
			return createBoolExprAdapter();
		}

		@Override
		public Adapter caseBinaryLogicalExpr(BinaryLogicalExpr object) {
			return createBinaryLogicalExprAdapter();
		}

		@Override
		public Adapter caseNotExpr(NotExpr object) {
			return createNotExprAdapter();
		}

		@Override
		public Adapter caseComparisonExpr(ComparisonExpr object) {
			return createComparisonExprAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseStringValue(StringValue object) {
			return createStringValueAdapter();
		}

		@Override
		public Adapter caseNumberValue(NumberValue object) {
			return createNumberValueAdapter();
		}

		@Override
		public Adapter caseBooleanValue(BooleanValue object) {
			return createBooleanValueAdapter();
		}

		@Override
		public Adapter caseObjectValue(ObjectValue object) {
			return createObjectValueAdapter();
		}

		@Override
		public Adapter casePair(Pair object) {
			return createPairAdapter();
		}

		@Override
		public Adapter caseArrayValue(ArrayValue object) {
			return createArrayValueAdapter();
		}

		@Override
		public Adapter caseVarAccess(VarAccess object) {
			return createVarAccessAdapter();
		}

		@Override
		public Adapter caseSelector(Selector object) {
			return createSelectorAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.EnvDeclaration <em>Env Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.EnvDeclaration
	 * @generated
	 */
	public Adapter createEnvDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.Request
	 * @generated
	 */
	public Adapter createRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.VarDeclaration <em>Var Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.VarDeclaration
	 * @generated
	 */
	public Adapter createVarDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.VarReassignment <em>Var Reassignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.VarReassignment
	 * @generated
	 */
	public Adapter createVarReassignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.Assertion
	 * @generated
	 */
	public Adapter createAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.BoolExpr <em>Bool Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.BoolExpr
	 * @generated
	 */
	public Adapter createBoolExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.BinaryLogicalExpr <em>Binary Logical Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.BinaryLogicalExpr
	 * @generated
	 */
	public Adapter createBinaryLogicalExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.NotExpr <em>Not Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.NotExpr
	 * @generated
	 */
	public Adapter createNotExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.ComparisonExpr <em>Comparison Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.ComparisonExpr
	 * @generated
	 */
	public Adapter createComparisonExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.NumberValue <em>Number Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.NumberValue
	 * @generated
	 */
	public Adapter createNumberValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.ObjectValue <em>Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.ObjectValue
	 * @generated
	 */
	public Adapter createObjectValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.Pair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.Pair
	 * @generated
	 */
	public Adapter createPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.ArrayValue <em>Array Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.ArrayValue
	 * @generated
	 */
	public Adapter createArrayValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.VarAccess <em>Var Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.VarAccess
	 * @generated
	 */
	public Adapter createVarAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rest_tester.rest_tester.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rest_tester.rest_tester.Selector
	 * @generated
	 */
	public Adapter createSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Rest_testerAdapterFactory
