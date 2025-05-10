/**
 */
package rest_tester.rest_tester.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rest_tester.rest_tester.BinaryLogicalExpr;
import rest_tester.rest_tester.BoolExpr;
import rest_tester.rest_tester.LogicalOp;
import rest_tester.rest_tester.Rest_testerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Logical Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rest_tester.rest_tester.impl.BinaryLogicalExprImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link rest_tester.rest_tester.impl.BinaryLogicalExprImpl#getOp <em>Op</em>}</li>
 *   <li>{@link rest_tester.rest_tester.impl.BinaryLogicalExprImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryLogicalExprImpl extends BoolExprImpl implements BinaryLogicalExpr {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected BoolExpr left;

	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOp OP_EDEFAULT = LogicalOp.AND;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected LogicalOp op = OP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected BoolExpr right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryLogicalExprImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Rest_testerPackage.Literals.BINARY_LOGICAL_EXPR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolExpr getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(BoolExpr newLeft, NotificationChain msgs) {
		BoolExpr oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT, oldLeft, newLeft);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeft(BoolExpr newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject) left).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT, newLeft,
					newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOp getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOp(LogicalOp newOp) {
		LogicalOp oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rest_testerPackage.BINARY_LOGICAL_EXPR__OP, oldOp,
					op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoolExpr getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(BoolExpr newRight, NotificationChain msgs) {
		BoolExpr oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT, oldRight, newRight);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRight(BoolExpr newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject) right).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT,
					newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT:
			return basicSetLeft(null, msgs);
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT:
			return basicSetRight(null, msgs);
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
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT:
			return getLeft();
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__OP:
			return getOp();
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT:
			return getRight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT:
			setLeft((BoolExpr) newValue);
			return;
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__OP:
			setOp((LogicalOp) newValue);
			return;
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT:
			setRight((BoolExpr) newValue);
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
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT:
			setLeft((BoolExpr) null);
			return;
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__OP:
			setOp(OP_EDEFAULT);
			return;
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT:
			setRight((BoolExpr) null);
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
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__LEFT:
			return left != null;
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__OP:
			return op != OP_EDEFAULT;
		case Rest_testerPackage.BINARY_LOGICAL_EXPR__RIGHT:
			return right != null;
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
		result.append(" (op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //BinaryLogicalExprImpl
