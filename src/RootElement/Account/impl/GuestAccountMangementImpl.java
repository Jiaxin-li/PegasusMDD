/**
 */
package RootElement.Account.impl;

import RootElement.Account.AccountPackage;
import RootElement.Account.GuestAccount;
import RootElement.Account.GuestAccountMangement;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest Account Mangement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Account.impl.GuestAccountMangementImpl#getGuestAccounts <em>Guest Accounts</em>}</li>
 *   <li>{@link RootElement.Account.impl.GuestAccountMangementImpl#getGuestaccount <em>Guestaccount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuestAccountMangementImpl extends MinimalEObjectImpl.Container implements GuestAccountMangement {
	/**
	 * The cached value of the '{@link #getGuestAccounts() <em>Guest Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<GuestAccount> guestAccounts;

	/**
	 * The cached value of the '{@link #getGuestaccount() <em>Guestaccount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestaccount()
	 * @generated
	 * @ordered
	 */
	protected GuestAccount guestaccount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestAccountMangementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountPackage.Literals.GUEST_ACCOUNT_MANGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuestAccount> getGuestAccounts() {
		if (guestAccounts == null) {
			guestAccounts = new EObjectResolvingEList<GuestAccount>(GuestAccount.class, this, AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUEST_ACCOUNTS);
		}
		return guestAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccount getGuestaccount() {
		if (guestaccount != null && guestaccount.eIsProxy()) {
			InternalEObject oldGuestaccount = (InternalEObject)guestaccount;
			guestaccount = (GuestAccount)eResolveProxy(oldGuestaccount);
			if (guestaccount != oldGuestaccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT, oldGuestaccount, guestaccount));
			}
		}
		return guestaccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccount basicGetGuestaccount() {
		return guestaccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestaccount(GuestAccount newGuestaccount) {
		GuestAccount oldGuestaccount = guestaccount;
		guestaccount = newGuestaccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT, oldGuestaccount, guestaccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAccount getGuest(int guestID) {
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
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUEST_ACCOUNTS:
				return getGuestAccounts();
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT:
				if (resolve) return getGuestaccount();
				return basicGetGuestaccount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUEST_ACCOUNTS:
				getGuestAccounts().clear();
				getGuestAccounts().addAll((Collection<? extends GuestAccount>)newValue);
				return;
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT:
				setGuestaccount((GuestAccount)newValue);
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
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUEST_ACCOUNTS:
				getGuestAccounts().clear();
				return;
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT:
				setGuestaccount((GuestAccount)null);
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
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUEST_ACCOUNTS:
				return guestAccounts != null && !guestAccounts.isEmpty();
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT:
				return guestaccount != null;
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
			case AccountPackage.GUEST_ACCOUNT_MANGEMENT___GET_GUEST__INT:
				return getGuest((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GuestAccountMangementImpl
