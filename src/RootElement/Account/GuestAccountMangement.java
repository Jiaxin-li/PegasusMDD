/**
 */
package RootElement.Account;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest Account Mangement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Account.GuestAccountMangement#getGuestAccounts <em>Guest Accounts</em>}</li>
 *   <li>{@link RootElement.Account.GuestAccountMangement#getGuestaccount <em>Guestaccount</em>}</li>
 * </ul>
 *
 * @see RootElement.Account.AccountPackage#getGuestAccountMangement()
 * @model
 * @generated
 */
public interface GuestAccountMangement extends IGuest {
	/**
	 * Returns the value of the '<em><b>Guest Accounts</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Account.GuestAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Accounts</em>' reference list.
	 * @see RootElement.Account.AccountPackage#getGuestAccountMangement_GuestAccounts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<GuestAccount> getGuestAccounts();

	/**
	 * Returns the value of the '<em><b>Guestaccount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guestaccount</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guestaccount</em>' reference.
	 * @see #setGuestaccount(GuestAccount)
	 * @see RootElement.Account.AccountPackage#getGuestAccountMangement_Guestaccount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GuestAccount getGuestaccount();

	/**
	 * Sets the value of the '{@link RootElement.Account.GuestAccountMangement#getGuestaccount <em>Guestaccount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guestaccount</em>' reference.
	 * @see #getGuestaccount()
	 * @generated
	 */
	void setGuestaccount(GuestAccount value);

} // GuestAccountMangement
