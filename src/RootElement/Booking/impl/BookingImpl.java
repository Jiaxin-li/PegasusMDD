/**
 */
package RootElement.Booking.impl;

import RootElement.Booking.Booking;
import RootElement.Booking.BookingPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Booking.impl.BookingImpl#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link RootElement.Booking.impl.BookingImpl#getCheckInDate <em>Check In Date</em>}</li>
 *   <li>{@link RootElement.Booking.impl.BookingImpl#getCheckOutDate <em>Check Out Date</em>}</li>
 *   <li>{@link RootElement.Booking.impl.BookingImpl#getRoomTypeID <em>Room Type ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The default value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingID() <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingID()
	 * @generated
	 * @ordered
	 */
	protected int bookingID = BOOKING_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckInDate() <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECK_IN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckInDate() <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected Date checkInDate = CHECK_IN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckOutDate() <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHECK_OUT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckOutDate() <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckOutDate()
	 * @generated
	 * @ordered
	 */
	protected Date checkOutDate = CHECK_OUT_DATE_EDEFAULT;

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
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingID() {
		return bookingID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingID(int newBookingID) {
		int oldBookingID = bookingID;
		bookingID = newBookingID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__BOOKING_ID, oldBookingID, bookingID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckInDate() {
		return checkInDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInDate(Date newCheckInDate) {
		Date oldCheckInDate = checkInDate;
		checkInDate = newCheckInDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__CHECK_IN_DATE, oldCheckInDate, checkInDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCheckOutDate() {
		return checkOutDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOutDate(Date newCheckOutDate) {
		Date oldCheckOutDate = checkOutDate;
		checkOutDate = newCheckOutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__CHECK_OUT_DATE, oldCheckOutDate, checkOutDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BookingPackage.BOOKING__ROOM_TYPE_ID, oldRoomTypeID, roomTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingPackage.BOOKING__BOOKING_ID:
				return getBookingID();
			case BookingPackage.BOOKING__CHECK_IN_DATE:
				return getCheckInDate();
			case BookingPackage.BOOKING__CHECK_OUT_DATE:
				return getCheckOutDate();
			case BookingPackage.BOOKING__ROOM_TYPE_ID:
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
			case BookingPackage.BOOKING__BOOKING_ID:
				setBookingID((Integer)newValue);
				return;
			case BookingPackage.BOOKING__CHECK_IN_DATE:
				setCheckInDate((Date)newValue);
				return;
			case BookingPackage.BOOKING__CHECK_OUT_DATE:
				setCheckOutDate((Date)newValue);
				return;
			case BookingPackage.BOOKING__ROOM_TYPE_ID:
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
			case BookingPackage.BOOKING__BOOKING_ID:
				setBookingID(BOOKING_ID_EDEFAULT);
				return;
			case BookingPackage.BOOKING__CHECK_IN_DATE:
				setCheckInDate(CHECK_IN_DATE_EDEFAULT);
				return;
			case BookingPackage.BOOKING__CHECK_OUT_DATE:
				setCheckOutDate(CHECK_OUT_DATE_EDEFAULT);
				return;
			case BookingPackage.BOOKING__ROOM_TYPE_ID:
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
			case BookingPackage.BOOKING__BOOKING_ID:
				return bookingID != BOOKING_ID_EDEFAULT;
			case BookingPackage.BOOKING__CHECK_IN_DATE:
				return CHECK_IN_DATE_EDEFAULT == null ? checkInDate != null : !CHECK_IN_DATE_EDEFAULT.equals(checkInDate);
			case BookingPackage.BOOKING__CHECK_OUT_DATE:
				return CHECK_OUT_DATE_EDEFAULT == null ? checkOutDate != null : !CHECK_OUT_DATE_EDEFAULT.equals(checkOutDate);
			case BookingPackage.BOOKING__ROOM_TYPE_ID:
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
		result.append(" (bookingID: ");
		result.append(bookingID);
		result.append(", checkInDate: ");
		result.append(checkInDate);
		result.append(", checkOutDate: ");
		result.append(checkOutDate);
		result.append(", RoomTypeID: ");
		result.append(roomTypeID);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
