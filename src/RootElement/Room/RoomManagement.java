/**
 */
package RootElement.Room;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Room.RoomManagement#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see RootElement.Room.RoomPackage#getRoomManagement()
 * @model
 * @generated
 */
public interface RoomManagement extends IRoom {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Room.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' reference list.
	 * @see RootElement.Room.RoomPackage#getRoomManagement_Rooms()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Room> getRooms();

} // RoomManagement
