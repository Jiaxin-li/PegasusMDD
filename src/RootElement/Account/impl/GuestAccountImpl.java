/**
 */
package RootElement.Account.impl;

import RootElement.Account.AccountPackage;
import RootElement.Account.GuestAccount;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Account.impl.GuestAccountImpl#getPersonalNumber <em>Personal Number</em>}</li>
 *   <li>{@link RootElement.Account.impl.GuestAccountImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link RootElement.Account.impl.GuestAccountImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link RootElement.Account.impl.GuestAccountImpl#isVIP <em>VIP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuestAccountImpl extends UserAccountsImpl implements GuestAccount {
	/**
	 * The default value of the '{@link #getPersonalNumber() <em>Personal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PERSONAL_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPersonalNumber() <em>Personal Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalNumber()
	 * @generated
	 * @ordered
	 */
	protected int personalNumber = PERSONAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected int phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #isVIP() <em>VIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVIP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVIP() <em>VIP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVIP()
	 * @generated
	 * @ordered
	 */
	protected boolean vip = VIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountPackage.Literals.GUEST_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPersonalNumber() {
		return personalNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalNumber(int newPersonalNumber) {
		int oldPersonalNumber = personalNumber;
		personalNumber = newPersonalNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.GUEST_ACCOUNT__PERSONAL_NUMBER, oldPersonalNumber, personalNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(int newPhoneNumber) {
		int oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.GUEST_ACCOUNT__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.GUEST_ACCOUNT__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVIP() {
		return vip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVIP(boolean newVIP) {
		boolean oldVIP = vip;
		vip = newVIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.GUEST_ACCOUNT__VIP, oldVIP, vip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserInfo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountPackage.GUEST_ACCOUNT__PERSONAL_NUMBER:
				return getPersonalNumber();
			case AccountPackage.GUEST_ACCOUNT__PHONE_NUMBER:
				return getPhoneNumber();
			case AccountPackage.GUEST_ACCOUNT__EMAIL:
				return getEmail();
			case AccountPackage.GUEST_ACCOUNT__VIP:
				return isVIP();
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
			case AccountPackage.GUEST_ACCOUNT__PERSONAL_NUMBER:
				setPersonalNumber((Integer)newValue);
				return;
			case AccountPackage.GUEST_ACCOUNT__PHONE_NUMBER:
				setPhoneNumber((Integer)newValue);
				return;
			case AccountPackage.GUEST_ACCOUNT__EMAIL:
				setEmail((String)newValue);
				return;
			case AccountPackage.GUEST_ACCOUNT__VIP:
				setVIP((Boolean)newValue);
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
			case AccountPackage.GUEST_ACCOUNT__PERSONAL_NUMBER:
				setPersonalNumber(PERSONAL_NUMBER_EDEFAULT);
				return;
			case AccountPackage.GUEST_ACCOUNT__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case AccountPackage.GUEST_ACCOUNT__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case AccountPackage.GUEST_ACCOUNT__VIP:
				setVIP(VIP_EDEFAULT);
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
			case AccountPackage.GUEST_ACCOUNT__PERSONAL_NUMBER:
				return personalNumber != PERSONAL_NUMBER_EDEFAULT;
			case AccountPackage.GUEST_ACCOUNT__PHONE_NUMBER:
				return phoneNumber != PHONE_NUMBER_EDEFAULT;
			case AccountPackage.GUEST_ACCOUNT__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case AccountPackage.GUEST_ACCOUNT__VIP:
				return vip != VIP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AccountPackage.GUEST_ACCOUNT___GET_USER_INFO:
				return getUserInfo();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (personalNumber: ");
		result.append(personalNumber);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", email: ");
		result.append(email);
		result.append(", VIP: ");
		result.append(vip);
		result.append(')');
		return result.toString();
	}

} //GuestAccountImpl
