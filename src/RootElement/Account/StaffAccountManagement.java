/**
 */
package RootElement.Account;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Account Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Account.StaffAccountManagement#getStaffAccounts <em>Staff Accounts</em>}</li>
 *   <li>{@link RootElement.Account.StaffAccountManagement#getStaffaccount <em>Staffaccount</em>}</li>
 * </ul>
 *
 * @see RootElement.Account.AccountPackage#getStaffAccountManagement()
 * @model
 * @generated
 */
public interface StaffAccountManagement extends IStaff {
	/**
	 * Returns the value of the '<em><b>Staff Accounts</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Account.StaffAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staff Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Accounts</em>' reference list.
	 * @see RootElement.Account.AccountPackage#getStaffAccountManagement_StaffAccounts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StaffAccount> getStaffAccounts();

	/**
	 * Returns the value of the '<em><b>Staffaccount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staffaccount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staffaccount</em>' reference.
	 * @see #setStaffaccount(StaffAccount)
	 * @see RootElement.Account.AccountPackage#getStaffAccountManagement_Staffaccount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffAccount getStaffaccount();

	/**
	 * Sets the value of the '{@link RootElement.Account.StaffAccountManagement#getStaffaccount <em>Staffaccount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staffaccount</em>' reference.
	 * @see #getStaffaccount()
	 * @generated
	 */
	void setStaffaccount(StaffAccount value);

} // StaffAccountManagement
