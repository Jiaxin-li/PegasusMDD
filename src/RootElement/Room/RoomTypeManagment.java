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

} // RoomTypeManagment
