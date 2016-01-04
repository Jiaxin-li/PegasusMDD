/**
 */
package RootElement.Room;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Room.RoomType#getRoomTypeName <em>Room Type Name</em>}</li>
 *   <li>{@link RootElement.Room.RoomType#getPrice <em>Price</em>}</li>
 *   <li>{@link RootElement.Room.RoomType#getNumberOfBeds <em>Number Of Beds</em>}</li>
 * </ul>
 *
 * @see RootElement.Room.RoomPackage#getRoomType()
 * @model
 * @generated
 */
public interface RoomType extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type Name</em>' attribute.
	 * @see #setRoomTypeName(String)
	 * @see RootElement.Room.RoomPackage#getRoomType_RoomTypeName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRoomTypeName();

	/**
	 * Sets the value of the '{@link RootElement.Room.RoomType#getRoomTypeName <em>Room Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type Name</em>' attribute.
	 * @see #getRoomTypeName()
	 * @generated
	 */
	void setRoomTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see RootElement.Room.RoomPackage#getRoomType_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link RootElement.Room.RoomType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Beds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Beds</em>' attribute.
	 * @see #setNumberOfBeds(int)
	 * @see RootElement.Room.RoomPackage#getRoomType_NumberOfBeds()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfBeds();

	/**
	 * Sets the value of the '{@link RootElement.Room.RoomType#getNumberOfBeds <em>Number Of Beds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Beds</em>' attribute.
	 * @see #getNumberOfBeds()
	 * @generated
	 */
	void setNumberOfBeds(int value);

} // RoomType
