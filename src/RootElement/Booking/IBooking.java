/**
 */
package RootElement.Booking;

import RootElement.Account.GuestAccount;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBooking</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Booking.BookingPackage#getIBooking()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBooking extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerRequired="true" customerOrdered="false" roomTypeIDRequired="true" roomTypeIDOrdered="false" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateRequired="true" checkOutDateOrdered="false" cartIDRequired="true" cartIDOrdered="false" nrOfRoomsRequired="true" nrOfRoomsOrdered="false"
	 * @generated
	 */
	boolean addBooking(GuestAccount customer, int roomTypeID, Date checkInDate, Date checkOutDate, int cartID, int nrOfRooms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean editBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean deleteBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	Booking getBooking(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" BookingIDRequired="true" BookingIDOrdered="false"
	 * @generated
	 */
	boolean validateBooking(int BookingID);

} // IBooking
