/**
 */
package RootElement.Booking;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Booking.Booking#getBookingID <em>Booking ID</em>}</li>
 *   <li>{@link RootElement.Booking.Booking#getCheckInDate <em>Check In Date</em>}</li>
 *   <li>{@link RootElement.Booking.Booking#getCheckOutDate <em>Check Out Date</em>}</li>
 *   <li>{@link RootElement.Booking.Booking#getRoomTypeID <em>Room Type ID</em>}</li>
 * </ul>
 *
 * @see RootElement.Booking.BookingPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking ID</em>' attribute.
	 * @see #setBookingID(int)
	 * @see RootElement.Booking.BookingPackage#getBooking_BookingID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBookingID();

	/**
	 * Sets the value of the '{@link RootElement.Booking.Booking#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(int value);

	/**
	 * Returns the value of the '<em><b>Check In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check In Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check In Date</em>' attribute.
	 * @see #setCheckInDate(Date)
	 * @see RootElement.Booking.BookingPackage#getBooking_CheckInDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckInDate();

	/**
	 * Sets the value of the '{@link RootElement.Booking.Booking#getCheckInDate <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In Date</em>' attribute.
	 * @see #getCheckInDate()
	 * @generated
	 */
	void setCheckInDate(Date value);

	/**
	 * Returns the value of the '<em><b>Check Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Out Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Out Date</em>' attribute.
	 * @see #setCheckOutDate(Date)
	 * @see RootElement.Booking.BookingPackage#getBooking_CheckOutDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getCheckOutDate();

	/**
	 * Sets the value of the '{@link RootElement.Booking.Booking#getCheckOutDate <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out Date</em>' attribute.
	 * @see #getCheckOutDate()
	 * @generated
	 */
	void setCheckOutDate(Date value);

	/**
	 * Returns the value of the '<em><b>Room Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type ID</em>' attribute.
	 * @see #setRoomTypeID(int)
	 * @see RootElement.Booking.BookingPackage#getBooking_RoomTypeID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomTypeID();

	/**
	 * Sets the value of the '{@link RootElement.Booking.Booking#getRoomTypeID <em>Room Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type ID</em>' attribute.
	 * @see #getRoomTypeID()
	 * @generated
	 */
	void setRoomTypeID(int value);

} // Booking
