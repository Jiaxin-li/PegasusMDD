/**
 */
package RootElement.Account.util;

import RootElement.Account.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see RootElement.Account.AccountPackage
 * @generated
 */
public class AccountSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AccountPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountSwitch() {
		if (modelPackage == null) {
			modelPackage = AccountPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AccountPackage.USER_ACCOUNTS: {
				UserAccounts userAccounts = (UserAccounts)theEObject;
				T result = caseUserAccounts(userAccounts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountPackage.STAFF_ACCOUNT: {
				StaffAccount staffAccount = (StaffAccount)theEObject;
				T result = caseStaffAccount(staffAccount);
				if (result == null) result = caseUserAccounts(staffAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountPackage.ACCESS_CONTROL: {
				AccessControl accessControl = (AccessControl)theEObject;
				T result = caseAccessControl(accessControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountPackage.IGUEST: {
				IGuest iGuest = (IGuest)theEObject;
				T result = caseIGuest(iGuest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountPackage.ISTAFF: {
				IStaff iStaff = (IStaff)theEObject;
				T result = caseIStaff(iStaff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT: {
				StaffAccountManagement staffAccountManagement = (StaffAccountManagement)theEObject;
				T result = caseStaffAccountManagement(staffAccountManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT: {
				GuestAccountMangement guestAccountMangement = (GuestAccountMangement)theEObject;
				T result = caseGuestAccountMangement(guestAccountMangement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AccountPackage.GUEST_ACCOUNT: {
				GuestAccount guestAccount = (GuestAccount)theEObject;
				T result = caseGuestAccount(guestAccount);
				if (result == null) result = caseUserAccounts(guestAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Accounts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Accounts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserAccounts(UserAccounts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffAccount(StaffAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControl(AccessControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGuest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGuest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGuest(IGuest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStaff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStaff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStaff(IStaff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff Account Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff Account Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffAccountManagement(StaffAccountManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Account Mangement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Account Mangement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestAccountMangement(GuestAccountMangement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestAccount(GuestAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AccountSwitch
