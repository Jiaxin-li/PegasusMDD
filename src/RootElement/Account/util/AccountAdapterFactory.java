/**
 */
package RootElement.Account.util;

import RootElement.Account.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.Account.AccountPackage
 * @generated
 */
public class AccountAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccountPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AccountPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountSwitch<Adapter> modelSwitch =
		new AccountSwitch<Adapter>() {
			@Override
			public Adapter caseUserAccounts(UserAccounts object) {
				return createUserAccountsAdapter();
			}
			@Override
			public Adapter caseStaffAccount(StaffAccount object) {
				return createStaffAccountAdapter();
			}
			@Override
			public Adapter caseAccessControl(AccessControl object) {
				return createAccessControlAdapter();
			}
			@Override
			public Adapter caseIGuest(IGuest object) {
				return createIGuestAdapter();
			}
			@Override
			public Adapter caseIStaff(IStaff object) {
				return createIStaffAdapter();
			}
			@Override
			public Adapter caseStaffAccountManagement(StaffAccountManagement object) {
				return createStaffAccountManagementAdapter();
			}
			@Override
			public Adapter caseGuestAccountMangement(GuestAccountMangement object) {
				return createGuestAccountMangementAdapter();
			}
			@Override
			public Adapter caseGuestAccount(GuestAccount object) {
				return createGuestAccountAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Account.UserAccounts <em>User Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Account.UserAccounts
	 * @generated
	 */
	public Adapter createUserAccountsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Account.StaffAccount <em>Staff Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Account.StaffAccount
	 * @generated
	 */
	public Adapter createStaffAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Account.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Account.AccessControl
	 * @generated
	 */
	public Adapter createAccessControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Account.IGuest <em>IGuest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Account.IGuest
	 * @generated
	 */
	public Adapter createIGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Account.IStaff <em>IStaff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Account.IStaff
	 * @generated
	 */
	public Adapter createIStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Account.StaffAccountManagement <em>Staff Account Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Account.StaffAccountManagement
	 * @generated
	 */
	public Adapter createStaffAccountManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Account.GuestAccountMangement <em>Guest Account Mangement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Account.GuestAccountMangement
	 * @generated
	 */
	public Adapter createGuestAccountMangementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Account.GuestAccount <em>Guest Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Account.GuestAccount
	 * @generated
	 */
	public Adapter createGuestAccountAdapter() {
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

} //AccountAdapterFactory
