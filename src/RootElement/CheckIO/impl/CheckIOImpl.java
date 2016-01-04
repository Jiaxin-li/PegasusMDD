/**
 */
package RootElement.CheckIO.impl;

import RootElement.Account.GuestAccount;
import RootElement.Account.StaffAccount;

import RootElement.CheckIO.CheckIO;
import RootElement.CheckIO.CheckIOPackage;
import RootElement.CheckIO.RoomBinder;

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
 * An implementation of the model object '<em><b>Check IO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getRoombinder <em>Roombinder</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getStaffs <em>Staffs</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.CheckIOImpl#getBindedRooms <em>Binded Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckIOImpl extends MinimalEObjectImpl.Container implements CheckIO {
	/**
	 * The cached value of the '{@link #getRoombinder() <em>Roombinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoombinder()
	 * @generated
	 * @ordered
	 */
	protected RoomBinder roombinder;

	/**
	 * The cached value of the '{@link #getStaffs() <em>Staffs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffs()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffAccount> staffs;

	/**
	 * The cached value of the '{@link #getBindedRooms() <em>Binded Rooms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindedRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomBinder> bindedRooms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CheckIOPackage.Literals.CHECK_IO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBinder getRoombinder() {
		if (roombinder != null && roombinder.eIsProxy()) {
			InternalEObject oldRoombinder = (InternalEObject)roombinder;
			roombinder = (RoomBinder)eResolveProxy(oldRoombinder);
			if (roombinder != oldRoombinder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CheckIOPackage.CHECK_IO__ROOMBINDER, oldRoombinder, roombinder));
			}
		}
		return roombinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBinder basicGetRoombinder() {
		return roombinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoombinder(RoomBinder newRoombinder) {
		RoomBinder oldRoombinder = roombinder;
		roombinder = newRoombinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckIOPackage.CHECK_IO__ROOMBINDER, oldRoombinder, roombinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffAccount> getStaffs() {
		if (staffs == null) {
			staffs = new EObjectResolvingEList<StaffAccount>(StaffAccount.class, this, CheckIOPackage.CHECK_IO__STAFFS);
		}
		return staffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomBinder> getBindedRooms() {
		if (bindedRooms == null) {
			bindedRooms = new EObjectResolvingEList<RoomBinder>(RoomBinder.class, this, CheckIOPackage.CHECK_IO__BINDED_ROOMS);
		}
		return bindedRooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean payOrder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int generateTotal(int bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentResult(int response) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CheckOut(GuestAccount customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CheckIn(GuestAccount customer) {
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
			case CheckIOPackage.CHECK_IO__ROOMBINDER:
				if (resolve) return getRoombinder();
				return basicGetRoombinder();
			case CheckIOPackage.CHECK_IO__STAFFS:
				return getStaffs();
			case CheckIOPackage.CHECK_IO__BINDED_ROOMS:
				return getBindedRooms();
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
			case CheckIOPackage.CHECK_IO__ROOMBINDER:
				setRoombinder((RoomBinder)newValue);
				return;
			case CheckIOPackage.CHECK_IO__STAFFS:
				getStaffs().clear();
				getStaffs().addAll((Collection<? extends StaffAccount>)newValue);
				return;
			case CheckIOPackage.CHECK_IO__BINDED_ROOMS:
				getBindedRooms().clear();
				getBindedRooms().addAll((Collection<? extends RoomBinder>)newValue);
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
			case CheckIOPackage.CHECK_IO__ROOMBINDER:
				setRoombinder((RoomBinder)null);
				return;
			case CheckIOPackage.CHECK_IO__STAFFS:
				getStaffs().clear();
				return;
			case CheckIOPackage.CHECK_IO__BINDED_ROOMS:
				getBindedRooms().clear();
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
			case CheckIOPackage.CHECK_IO__ROOMBINDER:
				return roombinder != null;
			case CheckIOPackage.CHECK_IO__STAFFS:
				return staffs != null && !staffs.isEmpty();
			case CheckIOPackage.CHECK_IO__BINDED_ROOMS:
				return bindedRooms != null && !bindedRooms.isEmpty();
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
			case CheckIOPackage.CHECK_IO___PAY_ORDER:
				return payOrder();
			case CheckIOPackage.CHECK_IO___GENERATE_TOTAL__INT:
				return generateTotal((Integer)arguments.get(0));
			case CheckIOPackage.CHECK_IO___GET_PAYMENT_RESULT__INT:
				return getPaymentResult((Integer)arguments.get(0));
			case CheckIOPackage.CHECK_IO___CHECK_OUT__GUESTACCOUNT:
				return CheckOut((GuestAccount)arguments.get(0));
			case CheckIOPackage.CHECK_IO___CHECK_IN__GUESTACCOUNT:
				return CheckIn((GuestAccount)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CheckIOImpl
