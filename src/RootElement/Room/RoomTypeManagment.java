/**
 */
package RootElement.Room;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Managment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Room.RoomTypeManagment#getRoomtypes <em>Roomtypes</em>}</li>
 *   <li>{@link RootElement.Room.RoomTypeManagment#getRoomtype <em>Roomtype</em>}</li>
 * </ul>
 *
 * @see RootElement.Room.RoomPackage#getRoomTypeManagment()
 * @model
 * @generated
 */
public interface RoomTypeManagment extends IRoomType {
	/**
	 * Returns the value of the '<em><b>Roomtypes</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Room.RoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomtypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomtypes</em>' reference list.
	 * @see RootElement.Room.RoomPackage#getRoomTypeManagment_Roomtypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomType> getRoomtypes();

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
	 * @see RootElement.Room.RoomPackage#getRoomTypeManagment_Roomtype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomType getRoomtype();

	/**
	 * Sets the value of the '{@link RootElement.Room.RoomTypeManagment#getRoomtype <em>Roomtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomtype</em>' reference.
	 * @see #getRoomtype()
	 * @generated
	 */
	void setRoomtype(RoomType value);

} // RoomTypeManagment
