/**
 */
package RootElement.Room.impl;

import RootElement.Room.RoomPackage;
import RootElement.Room.RoomType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Room.impl.RoomTypeImpl#getRoomTypeName <em>Room Type Name</em>}</li>
 *   <li>{@link RootElement.Room.impl.RoomTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link RootElement.Room.impl.RoomTypeImpl#getNumberOfBeds <em>Number Of Beds</em>}</li>
 *   <li>{@link RootElement.Room.impl.RoomTypeImpl#getRoomTypeID <em>Room Type ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomTypeImpl extends MinimalEObjectImpl.Container implements RoomType {
	/**
	 * The default value of the '{@link #getRoomTypeName() <em>Room Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomTypeName() <em>Room Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeName()
	 * @generated
	 * @ordered
	 */
	protected String roomTypeName = ROOM_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfBeds() <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBeds()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_BEDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfBeds() <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBeds()
	 * @generated
	 * @ordered
	 */
	protected int numberOfBeds = NUMBER_OF_BEDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomTypeID() <em>Room Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeID()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_TYPE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomTypeID() <em>Room Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomTypeID()
	 * @generated
	 * @ordered
	 */
	protected int roomTypeID = ROOM_TYPE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoomPackage.Literals.ROOM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomTypeName() {
		return roomTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeName(String newRoomTypeName) {
		String oldRoomTypeName = roomTypeName;
		roomTypeName = newRoomTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM_TYPE__ROOM_TYPE_NAME, oldRoomTypeName, roomTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfBeds(int newNumberOfBeds) {
		int oldNumberOfBeds = numberOfBeds;
		numberOfBeds = newNumberOfBeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM_TYPE__NUMBER_OF_BEDS, oldNumberOfBeds, numberOfBeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomTypeID() {
		return roomTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomTypeID(int newRoomTypeID) {
		int oldRoomTypeID = roomTypeID;
		roomTypeID = newRoomTypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoomPackage.ROOM_TYPE__ROOM_TYPE_ID, oldRoomTypeID, roomTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoomPackage.ROOM_TYPE__ROOM_TYPE_NAME:
				return getRoomTypeName();
			case RoomPackage.ROOM_TYPE__PRICE:
				return getPrice();
			case RoomPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				return getNumberOfBeds();
			case RoomPackage.ROOM_TYPE__ROOM_TYPE_ID:
				return getRoomTypeID();
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
			case RoomPackage.ROOM_TYPE__ROOM_TYPE_NAME:
				setRoomTypeName((String)newValue);
				return;
			case RoomPackage.ROOM_TYPE__PRICE:
				setPrice((Integer)newValue);
				return;
			case RoomPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				setNumberOfBeds((Integer)newValue);
				return;
			case RoomPackage.ROOM_TYPE__ROOM_TYPE_ID:
				setRoomTypeID((Integer)newValue);
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
			case RoomPackage.ROOM_TYPE__ROOM_TYPE_NAME:
				setRoomTypeName(ROOM_TYPE_NAME_EDEFAULT);
				return;
			case RoomPackage.ROOM_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case RoomPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				setNumberOfBeds(NUMBER_OF_BEDS_EDEFAULT);
				return;
			case RoomPackage.ROOM_TYPE__ROOM_TYPE_ID:
				setRoomTypeID(ROOM_TYPE_ID_EDEFAULT);
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
			case RoomPackage.ROOM_TYPE__ROOM_TYPE_NAME:
				return ROOM_TYPE_NAME_EDEFAULT == null ? roomTypeName != null : !ROOM_TYPE_NAME_EDEFAULT.equals(roomTypeName);
			case RoomPackage.ROOM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case RoomPackage.ROOM_TYPE__NUMBER_OF_BEDS:
				return numberOfBeds != NUMBER_OF_BEDS_EDEFAULT;
			case RoomPackage.ROOM_TYPE__ROOM_TYPE_ID:
				return roomTypeID != ROOM_TYPE_ID_EDEFAULT;
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
		result.append(" (roomTypeName: ");
		result.append(roomTypeName);
		result.append(", price: ");
		result.append(price);
		result.append(", numberOfBeds: ");
		result.append(numberOfBeds);
		result.append(", roomTypeID: ");
		result.append(roomTypeID);
		result.append(')');
		return result.toString();
	}

} //RoomTypeImpl
