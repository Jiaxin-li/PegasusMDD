/**
 */
package RootElement.Room;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Room.RoomPackage#getIRoomType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRoomType extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" RoomTypeNameRequired="true" RoomTypeNameOrdered="false" priceRequired="true" priceOrdered="false" nrOfBedsRequired="true" nrOfBedsOrdered="false"
	 * @generated
	 */
	boolean addRoomType(String RoomTypeName, int price, int nrOfBeds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	boolean editRoomType(int roomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" RoomTypeIDRequired="true" RoomTypeIDOrdered="false"
	 * @generated
	 */
	boolean validateRoomType(int RoomTypeID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomTypeIDRequired="true" roomTypeIDOrdered="false"
	 * @generated
	 */
	boolean deleteRoomType(int roomTypeID);

} // IRoomType
