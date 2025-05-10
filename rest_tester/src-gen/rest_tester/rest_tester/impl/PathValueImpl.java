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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rest_tester.rest_tester.PathValue;
import rest_tester.rest_tester.Rest_testerPackage;
import rest_tester.rest_tester.Selector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.impl.PathValueImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link rest_tester.rest_tester.impl.PathValueImpl#getSelectors <em>Selectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathValueImpl extends ValueImpl implements PathValue {
	/**
	 * The default value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected String root = ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectors() <em>Selectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Selector> selectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rest_testerPackage.Literals.PATH_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoot(String newRoot) {
		String oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rest_testerPackage.PATH_VALUE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Selector> getSelectors() {
		if (selectors == null) {
			selectors = new EObjectContainmentEList<Selector>(Selector.class, this,
					Rest_testerPackage.PATH_VALUE__SELECTORS);
		}
		return selectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rest_testerPackage.PATH_VALUE__SELECTORS:
			return ((InternalEList<?>) getSelectors()).basicRemove(otherEnd, msgs);
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
		case Rest_testerPackage.PATH_VALUE__ROOT:
			return getRoot();
		case Rest_testerPackage.PATH_VALUE__SELECTORS:
			return getSelectors();
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
		case Rest_testerPackage.PATH_VALUE__ROOT:
			setRoot((String) newValue);
			return;
		case Rest_testerPackage.PATH_VALUE__SELECTORS:
			getSelectors().clear();
			getSelectors().addAll((Collection<? extends Selector>) newValue);
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
		case Rest_testerPackage.PATH_VALUE__ROOT:
			setRoot(ROOT_EDEFAULT);
			return;
		case Rest_testerPackage.PATH_VALUE__SELECTORS:
			getSelectors().clear();
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
		case Rest_testerPackage.PATH_VALUE__ROOT:
			return ROOT_EDEFAULT == null ? root != null : !ROOT_EDEFAULT.equals(root);
		case Rest_testerPackage.PATH_VALUE__SELECTORS:
			return selectors != null && !selectors.isEmpty();
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
		result.append(" (root: ");
		result.append(root);
		result.append(')');
		return result.toString();
	}

} //PathValueImpl
