/**
 */
package RootElement.Room;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Room.RoomPackage#getIRoom()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoom extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" RoomTypeIDRequired="true" RoomTypeIDOrdered="false"
	 * @generated
	 */
	Room getAvailiableRoom(int RoomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	boolean addRoom(Room room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNrRequired="true" roomNrOrdered="false"
	 * @generated
	 */
	Room getRoom(int roomNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	int getRoomNr(int roomTypeID);

} // IRoom
