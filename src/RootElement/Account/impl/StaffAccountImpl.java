/**
 */
package RootElement.Account.impl;

import RootElement.Account.AccessControl;
import RootElement.Account.AccountPackage;
import RootElement.Account.StaffAccount;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Account.impl.StaffAccountImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link RootElement.Account.impl.StaffAccountImpl#getSessionToken <em>Session Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffAccountImpl extends UserAccountsImpl implements StaffAccount {
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionToken() <em>Session Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionToken()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionToken() <em>Session Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionToken()
	 * @generated
	 * @ordered
	 */
	protected String sessionToken = SESSION_TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountPackage.Literals.STAFF_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.STAFF_ACCOUNT__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSessionToken() {
		return sessionToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionToken(String newSessionToken) {
		String oldSessionToken = sessionToken;
		sessionToken = newSessionToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.STAFF_ACCOUNT__SESSION_TOKEN, oldSessionToken, sessionToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String login(AccessControl access) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void handleBooking() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void handleGuestInfo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void assignRoom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void manageTasks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void handleCheckIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void handleCheckOut() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logOut() {
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
			case AccountPackage.STAFF_ACCOUNT__PASSWORD:
				return getPassword();
			case AccountPackage.STAFF_ACCOUNT__SESSION_TOKEN:
				return getSessionToken();
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
			case AccountPackage.STAFF_ACCOUNT__PASSWORD:
				setPassword((String)newValue);
				return;
			case AccountPackage.STAFF_ACCOUNT__SESSION_TOKEN:
				setSessionToken((String)newValue);
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
			case AccountPackage.STAFF_ACCOUNT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case AccountPackage.STAFF_ACCOUNT__SESSION_TOKEN:
				setSessionToken(SESSION_TOKEN_EDEFAULT);
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
			case AccountPackage.STAFF_ACCOUNT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case AccountPackage.STAFF_ACCOUNT__SESSION_TOKEN:
				return SESSION_TOKEN_EDEFAULT == null ? sessionToken != null : !SESSION_TOKEN_EDEFAULT.equals(sessionToken);
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
			case AccountPackage.STAFF_ACCOUNT___LOGIN__ACCESSCONTROL:
				return login((AccessControl)arguments.get(0));
			case AccountPackage.STAFF_ACCOUNT___HANDLE_BOOKING:
				handleBooking();
				return null;
			case AccountPackage.STAFF_ACCOUNT___HANDLE_GUEST_INFO:
				handleGuestInfo();
				return null;
			case AccountPackage.STAFF_ACCOUNT___ASSIGN_ROOM:
				assignRoom();
				return null;
			case AccountPackage.STAFF_ACCOUNT___MANAGE_TASKS:
				manageTasks();
				return null;
			case AccountPackage.STAFF_ACCOUNT___HANDLE_CHECK_IN:
				handleCheckIn();
				return null;
			case AccountPackage.STAFF_ACCOUNT___HANDLE_CHECK_OUT:
				handleCheckOut();
				return null;
			case AccountPackage.STAFF_ACCOUNT___LOG_OUT:
				logOut();
				return null;
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
		result.append(" (password: ");
		result.append(password);
		result.append(", sessionToken: ");
		result.append(sessionToken);
		result.append(')');
		return result.toString();
	}

} //StaffAccountImpl
