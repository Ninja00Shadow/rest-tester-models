/**
 */
package rest_tester.rest_tester.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rest_tester.rest_tester.EnvDeclaration;
import rest_tester.rest_tester.Program;
import rest_tester.rest_tester.Rest_testerPackage;
import rest_tester.rest_tester.TestCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.impl.ProgramImpl#getEnvDeclarations <em>Env Declarations</em>}</li>
 *   <li>{@link rest_tester.rest_tester.impl.ProgramImpl#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link rest_tester.rest_tester.impl.ProgramImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getEnvDeclarations() <em>Env Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvDeclaration> envDeclarations;

	/**
	 * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testCases;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rest_testerPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvDeclaration> getEnvDeclarations() {
		if (envDeclarations == null) {
			envDeclarations = new EObjectContainmentEList<EnvDeclaration>(EnvDeclaration.class, this,
					Rest_testerPackage.PROGRAM__ENV_DECLARATIONS);
		}
		return envDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestCase> getTestCases() {
		if (testCases == null) {
			testCases = new EObjectContainmentEList<TestCase>(TestCase.class, this,
					Rest_testerPackage.PROGRAM__TEST_CASES);
		}
		return testCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rest_testerPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rest_testerPackage.PROGRAM__ENV_DECLARATIONS:
			return ((InternalEList<?>) getEnvDeclarations()).basicRemove(otherEnd, msgs);
		case Rest_testerPackage.PROGRAM__TEST_CASES:
			return ((InternalEList<?>) getTestCases()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Rest_testerPackage.PROGRAM__ENV_DECLARATIONS:
			return getEnvDeclarations();
		case Rest_testerPackage.PROGRAM__TEST_CASES:
			return getTestCases();
		case Rest_testerPackage.PROGRAM__NAME:
			return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Rest_testerPackage.PROGRAM__ENV_DECLARATIONS:
			getEnvDeclarations().clear();
			getEnvDeclarations().addAll((Collection<? extends EnvDeclaration>) newValue);
			return;
		case Rest_testerPackage.PROGRAM__TEST_CASES:
			getTestCases().clear();
			getTestCases().addAll((Collection<? extends TestCase>) newValue);
			return;
		case Rest_testerPackage.PROGRAM__NAME:
			setName((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Rest_testerPackage.PROGRAM__ENV_DECLARATIONS:
			getEnvDeclarations().clear();
			return;
		case Rest_testerPackage.PROGRAM__TEST_CASES:
			getTestCases().clear();
			return;
		case Rest_testerPackage.PROGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Rest_testerPackage.PROGRAM__ENV_DECLARATIONS:
			return envDeclarations != null && !envDeclarations.isEmpty();
		case Rest_testerPackage.PROGRAM__TEST_CASES:
			return testCases != null && !testCases.isEmpty();
		case Rest_testerPackage.PROGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
