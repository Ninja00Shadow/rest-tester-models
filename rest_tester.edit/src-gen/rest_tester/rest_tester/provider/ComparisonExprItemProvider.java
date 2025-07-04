/**
 */
package rest_tester.rest_tester.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rest_tester.rest_tester.ComparisonExpr;
import rest_tester.rest_tester.ComparisonOp;
import rest_tester.rest_tester.Rest_testerFactory;
import rest_tester.rest_tester.Rest_testerPackage;

/**
 * This is the item provider adapter for a {@link rest_tester.rest_tester.ComparisonExpr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComparisonExprItemProvider extends BoolExprItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonExprItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComparisonExpr_op_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComparisonExpr_op_feature",
								"_UI_ComparisonExpr_type"),
						Rest_testerPackage.Literals.COMPARISON_EXPR__OP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Rest_testerPackage.Literals.COMPARISON_EXPR__LEFT);
			childrenFeatures.add(Rest_testerPackage.Literals.COMPARISON_EXPR__RIGHT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ComparisonExpr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComparisonExpr"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ComparisonOp labelValue = ((ComparisonExpr) object).getOp();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_ComparisonExpr_type")
				: getString("_UI_ComparisonExpr_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ComparisonExpr.class)) {
		case Rest_testerPackage.COMPARISON_EXPR__OP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case Rest_testerPackage.COMPARISON_EXPR__LEFT:
		case Rest_testerPackage.COMPARISON_EXPR__RIGHT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__LEFT,
				Rest_testerFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__LEFT,
				Rest_testerFactory.eINSTANCE.createNumberValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__LEFT,
				Rest_testerFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__LEFT,
				Rest_testerFactory.eINSTANCE.createObjectValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__LEFT,
				Rest_testerFactory.eINSTANCE.createArrayValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__LEFT,
				Rest_testerFactory.eINSTANCE.createVarAccess()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__RIGHT,
				Rest_testerFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__RIGHT,
				Rest_testerFactory.eINSTANCE.createNumberValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__RIGHT,
				Rest_testerFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__RIGHT,
				Rest_testerFactory.eINSTANCE.createObjectValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__RIGHT,
				Rest_testerFactory.eINSTANCE.createArrayValue()));

		newChildDescriptors.add(createChildParameter(Rest_testerPackage.Literals.COMPARISON_EXPR__RIGHT,
				Rest_testerFactory.eINSTANCE.createVarAccess()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == Rest_testerPackage.Literals.COMPARISON_EXPR__LEFT
				|| childFeature == Rest_testerPackage.Literals.COMPARISON_EXPR__RIGHT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
