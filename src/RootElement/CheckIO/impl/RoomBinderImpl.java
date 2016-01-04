/**
 */
package RootElement.CheckIO.impl;

import RootElement.Account.GuestAccount;

import RootElement.CheckIO.CheckIOPackage;
import RootElement.CheckIO.RoomBinder;

import RootElement.Room.Room;

import RootElement.Service.Service;

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
 * An implementation of the model object '<em><b>Room Binder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.CheckIO.impl.RoomBinderImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.RoomBinderImpl#getServices <em>Services</em>}</li>
 *   <li>{@link RootElement.CheckIO.impl.RoomBinderImpl#getGuests <em>Guests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomBinderImpl extends MinimalEObjectImpl.Container implements RoomBinder {
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<GuestAccount> guests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBinderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CheckIOPackage.Literals.ROOM_BINDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CheckIOPackage.ROOM_BINDER__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckIOPackage.ROOM_BINDER__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<Service>(Service.class, this, CheckIOPackage.ROOM_BINDER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuestAccount> getGuests() {
		if (guests == null) {
			guests = new EObjectResolvingEList<GuestAccount>(GuestAccount.class, this, CheckIOPackage.ROOM_BINDER__GUESTS);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(int serviceTypeID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean bindRoom(Room room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SetServiceStatus(int serviceID, boolean status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomAvailability() {
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
			case CheckIOPackage.ROOM_BINDER__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case CheckIOPackage.ROOM_BINDER__SERVICES:
				return getServices();
			case CheckIOPackage.ROOM_BINDER__GUESTS:
				return getGuests();
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
			case CheckIOPackage.ROOM_BINDER__ROOM:
				setRoom((Room)newValue);
				return;
			case CheckIOPackage.ROOM_BINDER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case CheckIOPackage.ROOM_BINDER__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection<? extends GuestAccount>)newValue);
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
			case CheckIOPackage.ROOM_BINDER__ROOM:
				setRoom((Room)null);
				return;
			case CheckIOPackage.ROOM_BINDER__SERVICES:
				getServices().clear();
				return;
			case CheckIOPackage.ROOM_BINDER__GUESTS:
				getGuests().clear();
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
			case CheckIOPackage.ROOM_BINDER__ROOM:
				return room != null;
			case CheckIOPackage.ROOM_BINDER__SERVICES:
				return services != null && !services.isEmpty();
			case CheckIOPackage.ROOM_BINDER__GUESTS:
				return guests != null && !guests.isEmpty();
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
			case CheckIOPackage.ROOM_BINDER___ADD_SERVICE__INT:
				addService((Integer)arguments.get(0));
				return null;
			case CheckIOPackage.ROOM_BINDER___BIND_ROOM__ROOM:
				return bindRoom((Room)arguments.get(0));
			case CheckIOPackage.ROOM_BINDER___SET_SERVICE_STATUS__INT_BOOLEAN:
				SetServiceStatus((Integer)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case CheckIOPackage.ROOM_BINDER___SET_ROOM_AVAILABILITY:
				setRoomAvailability();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomBinderImpl
