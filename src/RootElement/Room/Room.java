/**
 */
package RootElement.Room;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Room.Room#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link RootElement.Room.Room#isAvailable <em>Available</em>}</li>
 *   <li>{@link RootElement.Room.Room#getFloorNumber <em>Floor Number</em>}</li>
 *   <li>{@link RootElement.Room.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link RootElement.Room.Room#isGuestHasCheckedIn <em>Guest Has Checked In</em>}</li>
 *   <li>{@link RootElement.Room.Room#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @see RootElement.Room.RoomPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute.
	 * @see #setRoomNumber(int)
	 * @see RootElement.Room.RoomPackage#getRoom_RoomNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getRoomNumber();

	/**
	 * Sets the value of the '{@link RootElement.Room.Room#getRoomNumber <em>Room Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Number</em>' attribute.
	 * @see #getRoomNumber()
	 * @generated
	 */
	void setRoomNumber(int value);

	/**
	 * Returns the value of the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available</em>' attribute.
	 * @see #setAvailable(boolean)
	 * @see RootElement.Room.RoomPackage#getRoom_Available()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAvailable();

	/**
	 * Sets the value of the '{@link RootElement.Room.Room#isAvailable <em>Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available</em>' attribute.
	 * @see #isAvailable()
	 * @generated
	 */
	void setAvailable(boolean value);

	/**
	 * Returns the value of the '<em><b>Floor Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floor Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor Number</em>' attribute.
	 * @see #setFloorNumber(int)
	 * @see RootElement.Room.RoomPackage#getRoom_FloorNumber()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getFloorNumber();

	/**
	 * Sets the value of the '{@link RootElement.Room.Room#getFloorNumber <em>Floor Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor Number</em>' attribute.
	 * @see #getFloorNumber()
	 * @generated
	 */
	void setFloorNumber(int value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' reference.
	 * @see #setRoomType(RoomType)
	 * @see RootElement.Room.RoomPackage#getRoom_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link RootElement.Room.Room#getRoomType <em>Room Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' reference.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Guest Has Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest Has Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest Has Checked In</em>' attribute.
	 * @see #setGuestHasCheckedIn(boolean)
	 * @see RootElement.Room.RoomPackage#getRoom_GuestHasCheckedIn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isGuestHasCheckedIn();

	/**
	 * Sets the value of the '{@link RootElement.Room.Room#isGuestHasCheckedIn <em>Guest Has Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest Has Checked In</em>' attribute.
	 * @see #isGuestHasCheckedIn()
	 * @generated
	 */
	void setGuestHasCheckedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtype</em>' reference.
	 * @see #setRoomtype(RoomType)
	 * @see RootElement.Room.RoomPackage#getRoom_Roomtype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link RootElement.Room.Room#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType value);

} // Room
