/**
 */
package RootElement.Account;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Account.GuestAccount#getPersonalNumber <em>Personal Number</em>}</li>
 *   <li>{@link RootElement.Account.GuestAccount#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link RootElement.Account.GuestAccount#getEmail <em>Email</em>}</li>
 *   <li>{@link RootElement.Account.GuestAccount#isVIP <em>VIP</em>}</li>
 * </ul>
 *
 * @see RootElement.Account.AccountPackage#getGuestAccount()
 * @model
 * @generated
 */
public interface GuestAccount extends UserAccounts {
	/**
	 * Returns the value of the '<em><b>Personal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personal Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personal Number</em>' attribute.
	 * @see #setPersonalNumber(int)
	 * @see RootElement.Account.AccountPackage#getGuestAccount_PersonalNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPersonalNumber();

	/**
	 * Sets the value of the '{@link RootElement.Account.GuestAccount#getPersonalNumber <em>Personal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Number</em>' attribute.
	 * @see #getPersonalNumber()
	 * @generated
	 */
	void setPersonalNumber(int value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(int)
	 * @see RootElement.Account.AccountPackage#getGuestAccount_PhoneNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPhoneNumber();

	/**
	 * Sets the value of the '{@link RootElement.Account.GuestAccount#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see RootElement.Account.AccountPackage#getGuestAccount_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link RootElement.Account.GuestAccount#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>VIP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VIP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VIP</em>' attribute.
	 * @see #setVIP(boolean)
	 * @see RootElement.Account.AccountPackage#getGuestAccount_VIP()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isVIP();

	/**
	 * Sets the value of the '{@link RootElement.Account.GuestAccount#isVIP <em>VIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VIP</em>' attribute.
	 * @see #isVIP()
	 * @generated
	 */
	void setVIP(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserInfo();

} // GuestAccount
