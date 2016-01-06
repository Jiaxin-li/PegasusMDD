/**
 */
package RootElement.Account.impl;

import RootElement.Account.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountFactoryImpl extends EFactoryImpl implements AccountFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountFactory init() {
		try {
			AccountFactory theAccountFactory = (AccountFactory)EPackage.Registry.INSTANCE.getEFactory(AccountPackage.eNS_URI);
			if (theAccountFactory != null) {
				return theAccountFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccountFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountFactoryImpl() {
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
			case AccountPackage.STAFF_ACCOUNT: return createStaffAccount();
			case AccountPackage.ACCESS_CONTROL: return createAccessControl();
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT: return createStaffAccountManagement();
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT: return createGuestAccountMangement();
			case AccountPackage.GUEST_ACCOUNT: return createGuestAccount();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAccount createStaffAccount() {
		StaffAccountImpl staffAccount = new StaffAccountImpl();
		return staffAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControl createAccessControl() {
		AccessControlImpl accessControl = new AccessControlImpl();
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAccountManagement createStaffAccountManagement() {
		StaffAccountManagementImpl staffAccountManagement = new StaffAccountManagementImpl();
		return staffAccountManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccountMangement createGuestAccountMangement() {
		GuestAccountMangementImpl guestAccountMangement = new GuestAccountMangementImpl();
		return guestAccountMangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccount createGuestAccount() {
		GuestAccountImpl guestAccount = new GuestAccountImpl();
		return guestAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountPackage getAccountPackage() {
		return (AccountPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccountPackage getPackage() {
		return AccountPackage.eINSTANCE;
	}

} //AccountFactoryImpl
