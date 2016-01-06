/**
 */
package RootElement.Room.impl;

import RootElement.Room.Room;
import RootElement.Room.RoomPackage;
import RootElement.Room.RoomType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Room.impl.RoomImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link RootElement.Room.impl.RoomImpl#isAvailable <em>Available</em>}</li>
 *   <li>{@link RootElement.Room.impl.RoomImpl#getFloorNumber <em>Floor Number</em>}</li>
 *   <li>{@link RootElement.Room.impl.RoomImpl#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link RootElement.Room.impl.RoomImpl#isGuestHasCheckedIn <em>Guest Has Checked In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
	/**
	 * The default value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected int roomNumber = ROOM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvailable() <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean available = AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloorNumber() <em>Floor Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloorNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int FLOOR_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFloorNumber() <em>Floor Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloorNumber()
	 * @generated
	 * @ordered
	 */
	protected int floorNumber = FLOOR_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected RoomType roomType;

	/**
	 * The default value of the '{@link #isGuestHasCheckedIn() <em>Guest Has Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuestHasCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GUEST_HAS_CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGuestHasCheckedIn() <em>Guest Has Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGuestHasCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean guestHasCheckedIn = GUEST_HAS_CHECKED_IN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoomPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNumber(int newRoomNumber) {
		int oldRoomNumber = roomNumber;
		roomNumber = newRoomNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM__ROOM_NUMBER, oldRoomNumber, roomNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailable(boolean newAvailable) {
		boolean oldAvailable = available;
		available = newAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM__AVAILABLE, oldAvailable, available));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFloorNumber() {
		return floorNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloorNumber(int newFloorNumber) {
		int oldFloorNumber = floorNumber;
		floorNumber = newFloorNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM__FLOOR_NUMBER, oldFloorNumber, floorNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType getRoomType() {
		if (roomType != null && roomType.eIsProxy()) {
			InternalEObject oldRoomType = (InternalEObject)roomType;
			roomType = (RoomType)eResolveProxy(oldRoomType);
			if (roomType != oldRoomType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoomPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
			}
		}
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType basicGetRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(RoomType newRoomType) {
		RoomType oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGuestHasCheckedIn() {
		return guestHasCheckedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestHasCheckedIn(boolean newGuestHasCheckedIn) {
		boolean oldGuestHasCheckedIn = guestHasCheckedIn;
		guestHasCheckedIn = newGuestHasCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM__GUEST_HAS_CHECKED_IN, oldGuestHasCheckedIn, guestHasCheckedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoomPackage.ROOM__ROOM_NUMBER:
				return getRoomNumber();
			case RoomPackage.ROOM__AVAILABLE:
				return isAvailable();
			case RoomPackage.ROOM__FLOOR_NUMBER:
				return getFloorNumber();
			case RoomPackage.ROOM__ROOM_TYPE:
				if (resolve) return getRoomType();
				return basicGetRoomType();
			case RoomPackage.ROOM__GUEST_HAS_CHECKED_IN:
				return isGuestHasCheckedIn();
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
			case RoomPackage.ROOM__ROOM_NUMBER:
				setRoomNumber((Integer)newValue);
				return;
			case RoomPackage.ROOM__AVAILABLE:
				setAvailable((Boolean)newValue);
				return;
			case RoomPackage.ROOM__FLOOR_NUMBER:
				setFloorNumber((Integer)newValue);
				return;
			case RoomPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)newValue);
				return;
			case RoomPackage.ROOM__GUEST_HAS_CHECKED_IN:
				setGuestHasCheckedIn((Boolean)newValue);
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
			case RoomPackage.ROOM__ROOM_NUMBER:
				setRoomNumber(ROOM_NUMBER_EDEFAULT);
				return;
			case RoomPackage.ROOM__AVAILABLE:
				setAvailable(AVAILABLE_EDEFAULT);
				return;
			case RoomPackage.ROOM__FLOOR_NUMBER:
				setFloorNumber(FLOOR_NUMBER_EDEFAULT);
				return;
			case RoomPackage.ROOM__ROOM_TYPE:
				setRoomType((RoomType)null);
				return;
			case RoomPackage.ROOM__GUEST_HAS_CHECKED_IN:
				setGuestHasCheckedIn(GUEST_HAS_CHECKED_IN_EDEFAULT);
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
			case RoomPackage.ROOM__ROOM_NUMBER:
				return roomNumber != ROOM_NUMBER_EDEFAULT;
			case RoomPackage.ROOM__AVAILABLE:
				return available != AVAILABLE_EDEFAULT;
			case RoomPackage.ROOM__FLOOR_NUMBER:
				return floorNumber != FLOOR_NUMBER_EDEFAULT;
			case RoomPackage.ROOM__ROOM_TYPE:
				return roomType != null;
			case RoomPackage.ROOM__GUEST_HAS_CHECKED_IN:
				return guestHasCheckedIn != GUEST_HAS_CHECKED_IN_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (roomNumber: ");
		result.append(roomNumber);
		result.append(", available: ");
		result.append(available);
		result.append(", floorNumber: ");
		result.append(floorNumber);
		result.append(", guestHasCheckedIn: ");
		result.append(guestHasCheckedIn);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
