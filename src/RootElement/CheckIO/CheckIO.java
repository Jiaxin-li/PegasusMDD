/**
 */
package RootElement.CheckIO;

import RootElement.Account.GuestAccountMangement;
import RootElement.Account.StaffAccount;

import RootElement.Booking.CartManagement;

import RootElement.Room.RoomManagement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.CheckIO.CheckIO#getRoombinder <em>Roombinder</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#getStaffs <em>Staffs</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#getBindedRooms <em>Binded Rooms</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#getCartManagement <em>Cart Management</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#getRoomManagement <em>Room Management</em>}</li>
 *   <li>{@link RootElement.CheckIO.CheckIO#getGuestManagement <em>Guest Management</em>}</li>
 * </ul>
 *
 * @see RootElement.CheckIO.CheckIOPackage#getCheckIO()
 * @model
 * @generated
 */
public interface CheckIO extends EObject {
	/**
	 * Returns the value of the '<em><b>Roombinder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roombinder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roombinder</em>' reference.
	 * @see #setRoombinder(RoomBinder)
	 * @see RootElement.CheckIO.CheckIOPackage#getCheckIO_Roombinder()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomBinder getRoombinder();

	/**
	 * Sets the value of the '{@link RootElement.CheckIO.CheckIO#getRoombinder <em>Roombinder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roombinder</em>' reference.
	 * @see #getRoombinder()
	 * @generated
	 */
	void setRoombinder(RoomBinder value);

	/**
	 * Returns the value of the '<em><b>Staffs</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Account.StaffAccount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staffs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staffs</em>' reference list.
	 * @see RootElement.CheckIO.CheckIOPackage#getCheckIO_Staffs()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StaffAccount> getStaffs();

	/**
	 * Returns the value of the '<em><b>Binded Rooms</b></em>' reference list.
	 * The list contents are of type {@link RootElement.CheckIO.RoomBinder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binded Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binded Rooms</em>' reference list.
	 * @see RootElement.CheckIO.CheckIOPackage#getCheckIO_BindedRooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomBinder> getBindedRooms();

	/**
	 * Returns the value of the '<em><b>Cart Management</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cart Management</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart Management</em>' reference.
	 * @see #setCartManagement(CartManagement)
	 * @see RootElement.CheckIO.CheckIOPackage#getCheckIO_CartManagement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CartManagement getCartManagement();

	/**
	 * Sets the value of the '{@link RootElement.CheckIO.CheckIO#getCartManagement <em>Cart Management</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart Management</em>' reference.
	 * @see #getCartManagement()
	 * @generated
	 */
	void setCartManagement(CartManagement value);

	/**
	 * Returns the value of the '<em><b>Room Management</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Management</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Management</em>' reference.
	 * @see #setRoomManagement(RoomManagement)
	 * @see RootElement.CheckIO.CheckIOPackage#getCheckIO_RoomManagement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomManagement getRoomManagement();

	/**
	 * Sets the value of the '{@link RootElement.CheckIO.CheckIO#getRoomManagement <em>Room Management</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Management</em>' reference.
	 * @see #getRoomManagement()
	 * @generated
	 */
	void setRoomManagement(RoomManagement value);

	/**
	 * Returns the value of the '<em><b>Guest Management</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Management</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Management</em>' reference.
	 * @see #setGuestManagement(GuestAccountMangement)
	 * @see RootElement.CheckIO.CheckIOPackage#getCheckIO_GuestManagement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	GuestAccountMangement getGuestManagement();

	/**
	 * Sets the value of the '{@link RootElement.CheckIO.CheckIO#getGuestManagement <em>Guest Management</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Management</em>' reference.
	 * @see #getGuestManagement()
	 * @generated
	 */
	void setGuestManagement(GuestAccountMangement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" amountRequired="true" amountOrdered="false"
	 * @generated
	 */
	boolean payOrder(int amount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	int generateTotal(int bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" responseRequired="true" responseOrdered="false"
	 * @generated
	 */
	String getPaymentResult(int response);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIdRequired="true" bookingIdOrdered="false"
	 * @generated
	 */
	boolean CheckOut(int bookingId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	boolean CheckIn(int bookingID);

} // CheckIO
