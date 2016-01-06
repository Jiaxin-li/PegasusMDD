/**
 */
package RootElement.Account.impl;

import RootElement.Account.AccountPackage;
import RootElement.Account.StaffAccount;
import RootElement.Account.StaffAccountManagement;

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
 * An implementation of the model object '<em><b>Staff Account Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Account.impl.StaffAccountManagementImpl#getStaffAccounts <em>Staff Accounts</em>}</li>
 *   <li>{@link RootElement.Account.impl.StaffAccountManagementImpl#getStaffaccount <em>Staffaccount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffAccountManagementImpl extends MinimalEObjectImpl.Container implements StaffAccountManagement {
	/**
	 * The cached value of the '{@link #getStaffAccounts() <em>Staff Accounts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffAccount> staffAccounts;

	/**
	 * The cached value of the '{@link #getStaffaccount() <em>Staffaccount</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffaccount()
	 * @generated
	 * @ordered
	 */
	protected StaffAccount staffaccount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffAccountManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountPackage.Literals.STAFF_ACCOUNT_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffAccount> getStaffAccounts() {
		if (staffAccounts == null) {
			staffAccounts = new EObjectResolvingEList<StaffAccount>(StaffAccount.class, this, AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFF_ACCOUNTS);
		}
		return staffAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAccount getStaffaccount() {
		if (staffaccount != null && staffaccount.eIsProxy()) {
			InternalEObject oldStaffaccount = (InternalEObject)staffaccount;
			staffaccount = (StaffAccount)eResolveProxy(oldStaffaccount);
			if (staffaccount != oldStaffaccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT, oldStaffaccount, staffaccount));
			}
		}
		return staffaccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAccount basicGetStaffaccount() {
		return staffaccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffaccount(StaffAccount newStaffaccount) {
		StaffAccount oldStaffaccount = staffaccount;
		staffaccount = newStaffaccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT, oldStaffaccount, staffaccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public StaffAccount getStaff(int StaffID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<StaffAccount> gl = getStaffAccounts();
		for (StaffAccount g : gl){
			if (g.getID() == StaffID){
				return g;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFF_ACCOUNTS:
				return getStaffAccounts();
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT:
				if (resolve) return getStaffaccount();
				return basicGetStaffaccount();
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
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFF_ACCOUNTS:
				getStaffAccounts().clear();
				getStaffAccounts().addAll((Collection<? extends StaffAccount>)newValue);
				return;
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT:
				setStaffaccount((StaffAccount)newValue);
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
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFF_ACCOUNTS:
				getStaffAccounts().clear();
				return;
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT:
				setStaffaccount((StaffAccount)null);
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
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFF_ACCOUNTS:
				return staffAccounts != null && !staffAccounts.isEmpty();
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT:
				return staffaccount != null;
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
			case AccountPackage.STAFF_ACCOUNT_MANAGEMENT___GET_STAFF__INT:
				return getStaff((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffAccountManagementImpl
