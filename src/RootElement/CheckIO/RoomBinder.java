/**
 */
package RootElement.CheckIO;

import RootElement.Account.GuestAccount;

import RootElement.Room.Room;

import RootElement.Service.Service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Binder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.CheckIO.RoomBinder#getRoom <em>Room</em>}</li>
 *   <li>{@link RootElement.CheckIO.RoomBinder#getServices <em>Services</em>}</li>
 *   <li>{@link RootElement.CheckIO.RoomBinder#getGuests <em>Guests</em>}</li>
 *   <li>{@link RootElement.CheckIO.RoomBinder#getBookingID <em>Booking ID</em>}</li>
 * </ul>
 *
 * @see RootElement.CheckIO.CheckIOPackage#getRoomBinder()
 * @model
 * @generated
 */
public interface RoomBinder extends EObject {
	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see RootElement.CheckIO.CheckIOPackage#getRoomBinder_Room()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link RootElement.CheckIO.RoomBinder#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see RootElement.CheckIO.CheckIOPackage#getRoomBinder_Services()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Account.GuestAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @see RootElement.CheckIO.CheckIOPackage#getRoomBinder_Guests()
	 * @model ordered="false"
	 * @generated
	 */
	EList<GuestAccount> getGuests();

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
	 * @see RootElement.CheckIO.CheckIOPackage#getRoomBinder_BookingID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getBookingID();

	/**
	 * Sets the value of the '{@link RootElement.CheckIO.RoomBinder#getBookingID <em>Booking ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking ID</em>' attribute.
	 * @see #getBookingID()
	 * @generated
	 */
	void setBookingID(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	void bindService(Service service);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean bindRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceIDRequired="true" serviceIDOrdered="false" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void SetServiceStatus(int serviceID, boolean status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model availiabilityRequired="true" availiabilityOrdered="false"
	 * @generated
	 */
	void setRoomAvailability(boolean availiability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void bindGuest(GuestAccount guest);

} // RoomBinder
