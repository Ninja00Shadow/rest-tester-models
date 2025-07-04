/**
 */
package rest_tester.rest_tester.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import rest_tester.rest_tester.util.Rest_testerAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Rest_testerItemProviderAdapterFactory extends Rest_testerAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rest_testerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.EnvDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvDeclarationItemProvider envDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.EnvDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvDeclarationAdapter() {
		if (envDeclarationItemProvider == null) {
			envDeclarationItemProvider = new EnvDeclarationItemProvider(this);
		}

		return envDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.TestCase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseItemProvider testCaseItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.TestCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTestCaseAdapter() {
		if (testCaseItemProvider == null) {
			testCaseItemProvider = new TestCaseItemProvider(this);
		}

		return testCaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.Option} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionItemProvider optionItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionAdapter() {
		if (optionItemProvider == null) {
			optionItemProvider = new OptionItemProvider(this);
		}

		return optionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.Request} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestItemProvider requestItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.Request}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequestAdapter() {
		if (requestItemProvider == null) {
			requestItemProvider = new RequestItemProvider(this);
		}

		return requestItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.VarDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarDeclarationItemProvider varDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.VarDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVarDeclarationAdapter() {
		if (varDeclarationItemProvider == null) {
			varDeclarationItemProvider = new VarDeclarationItemProvider(this);
		}

		return varDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.VarReassignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarReassignmentItemProvider varReassignmentItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.VarReassignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVarReassignmentAdapter() {
		if (varReassignmentItemProvider == null) {
			varReassignmentItemProvider = new VarReassignmentItemProvider(this);
		}

		return varReassignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.Assertion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertionItemProvider assertionItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.Assertion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertionAdapter() {
		if (assertionItemProvider == null) {
			assertionItemProvider = new AssertionItemProvider(this);
		}

		return assertionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.BinaryLogicalExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryLogicalExprItemProvider binaryLogicalExprItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.BinaryLogicalExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryLogicalExprAdapter() {
		if (binaryLogicalExprItemProvider == null) {
			binaryLogicalExprItemProvider = new BinaryLogicalExprItemProvider(this);
		}

		return binaryLogicalExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.NotExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotExprItemProvider notExprItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.NotExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotExprAdapter() {
		if (notExprItemProvider == null) {
			notExprItemProvider = new NotExprItemProvider(this);
		}

		return notExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.ComparisonExpr} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonExprItemProvider comparisonExprItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.ComparisonExpr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparisonExprAdapter() {
		if (comparisonExprItemProvider == null) {
			comparisonExprItemProvider = new ComparisonExprItemProvider(this);
		}

		return comparisonExprItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.StringValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringValueItemProvider stringValueItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.StringValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringValueAdapter() {
		if (stringValueItemProvider == null) {
			stringValueItemProvider = new StringValueItemProvider(this);
		}

		return stringValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.NumberValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberValueItemProvider numberValueItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.NumberValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberValueAdapter() {
		if (numberValueItemProvider == null) {
			numberValueItemProvider = new NumberValueItemProvider(this);
		}

		return numberValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.BooleanValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanValueItemProvider booleanValueItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.BooleanValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanValueAdapter() {
		if (booleanValueItemProvider == null) {
			booleanValueItemProvider = new BooleanValueItemProvider(this);
		}

		return booleanValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.ObjectValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectValueItemProvider objectValueItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.ObjectValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectValueAdapter() {
		if (objectValueItemProvider == null) {
			objectValueItemProvider = new ObjectValueItemProvider(this);
		}

		return objectValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.Pair} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PairItemProvider pairItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.Pair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPairAdapter() {
		if (pairItemProvider == null) {
			pairItemProvider = new PairItemProvider(this);
		}

		return pairItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.ArrayValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayValueItemProvider arrayValueItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.ArrayValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArrayValueAdapter() {
		if (arrayValueItemProvider == null) {
			arrayValueItemProvider = new ArrayValueItemProvider(this);
		}

		return arrayValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.VarAccess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarAccessItemProvider varAccessItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.VarAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVarAccessAdapter() {
		if (varAccessItemProvider == null) {
			varAccessItemProvider = new VarAccessItemProvider(this);
		}

		return varAccessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link rest_tester.rest_tester.Selector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectorItemProvider selectorItemProvider;

	/**
	 * This creates an adapter for a {@link rest_tester.rest_tester.Selector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectorAdapter() {
		if (selectorItemProvider == null) {
			selectorItemProvider = new SelectorItemProvider(this);
		}

		return selectorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (programItemProvider != null)
			programItemProvider.dispose();
		if (envDeclarationItemProvider != null)
			envDeclarationItemProvider.dispose();
		if (testCaseItemProvider != null)
			testCaseItemProvider.dispose();
		if (optionItemProvider != null)
			optionItemProvider.dispose();
		if (requestItemProvider != null)
			requestItemProvider.dispose();
		if (varDeclarationItemProvider != null)
			varDeclarationItemProvider.dispose();
		if (varReassignmentItemProvider != null)
			varReassignmentItemProvider.dispose();
		if (assertionItemProvider != null)
			assertionItemProvider.dispose();
		if (binaryLogicalExprItemProvider != null)
			binaryLogicalExprItemProvider.dispose();
		if (notExprItemProvider != null)
			notExprItemProvider.dispose();
		if (comparisonExprItemProvider != null)
			comparisonExprItemProvider.dispose();
		if (stringValueItemProvider != null)
			stringValueItemProvider.dispose();
		if (numberValueItemProvider != null)
			numberValueItemProvider.dispose();
		if (booleanValueItemProvider != null)
			booleanValueItemProvider.dispose();
		if (objectValueItemProvider != null)
			objectValueItemProvider.dispose();
		if (pairItemProvider != null)
			pairItemProvider.dispose();
		if (arrayValueItemProvider != null)
			arrayValueItemProvider.dispose();
		if (varAccessItemProvider != null)
			varAccessItemProvider.dispose();
		if (selectorItemProvider != null)
			selectorItemProvider.dispose();
	}

}
