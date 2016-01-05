/**
 */
package RootElement.Room;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RootElement.Room.RoomFactory
 * @model kind="package"
 * @generated
 */
public interface RoomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Room";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Room.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Room";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoomPackage eINSTANCE = RootElement.Room.impl.RoomPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Room.impl.RoomTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Room.impl.RoomTypeImpl
	 * @see RootElement.Room.impl.RoomPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Room Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOM_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Number Of Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__NUMBER_OF_BEDS = 2;

	/**
	 * The feature id for the '<em><b>Room Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__ROOM_TYPE_ID = 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Room.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Room.impl.RoomImpl
	 * @see RootElement.Room.impl.RoomPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Room Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__AVAILABLE = 1;

	/**
	 * The feature id for the '<em><b>Floor Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__FLOOR_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Guest Has Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__GUEST_HAS_CHECKED_IN = 4;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOMTYPE = 5;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Room.IRoom <em>IRoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Room.IRoom
	 * @see RootElement.Room.impl.RoomPackageImpl#getIRoom()
	 * @generated
	 */
	int IROOM = 2;

	/**
	 * The number of structural features of the '<em>IRoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Availiable Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_AVAILIABLE_ROOM__INT = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___ADD_ROOM = 1;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM___GET_ROOM__INT = 2;

	/**
	 * The number of operations of the '<em>IRoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.Room.IRoomType <em>IRoom Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Room.IRoomType
	 * @see RootElement.Room.impl.RoomPackageImpl#getIRoomType()
	 * @generated
	 */
	int IROOM_TYPE = 3;

	/**
	 * The number of structural features of the '<em>IRoom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___ADD_ROOM_TYPE__STRING_INT_INT = 0;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___EDIT_ROOM_TYPE__INT = 1;

	/**
	 * The operation id for the '<em>Validate Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___VALIDATE_ROOM_TYPE__INT = 2;

	/**
	 * The operation id for the '<em>Delete Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE___DELETE_ROOM_TYPE__INT = 3;

	/**
	 * The number of operations of the '<em>IRoom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_TYPE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link RootElement.Room.impl.RoomManagementImpl <em>Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Room.impl.RoomManagementImpl
	 * @see RootElement.Room.impl.RoomPackageImpl#getRoomManagement()
	 * @generated
	 */
	int ROOM_MANAGEMENT = 4;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT__ROOMS = IROOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_FEATURE_COUNT = IROOM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Availiable Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT___GET_AVAILIABLE_ROOM__INT = IROOM___GET_AVAILIABLE_ROOM__INT;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT___ADD_ROOM = IROOM___ADD_ROOM;

	/**
	 * The operation id for the '<em>Get Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT___GET_ROOM__INT = IROOM___GET_ROOM__INT;

	/**
	 * The number of operations of the '<em>Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGEMENT_OPERATION_COUNT = IROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.Room.impl.RoomTypeManagmentImpl <em>Type Managment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Room.impl.RoomTypeManagmentImpl
	 * @see RootElement.Room.impl.RoomPackageImpl#getRoomTypeManagment()
	 * @generated
	 */
	int ROOM_TYPE_MANAGMENT = 5;

	/**
	 * The feature id for the '<em><b>Roomtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGMENT__ROOMTYPES = IROOM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roomtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGMENT__ROOMTYPE = IROOM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Managment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGMENT_FEATURE_COUNT = IROOM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGMENT___ADD_ROOM_TYPE__STRING_INT_INT = IROOM_TYPE___ADD_ROOM_TYPE__STRING_INT_INT;

	/**
	 * The operation id for the '<em>Edit Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGMENT___EDIT_ROOM_TYPE__INT = IROOM_TYPE___EDIT_ROOM_TYPE__INT;

	/**
	 * The operation id for the '<em>Validate Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGMENT___VALIDATE_ROOM_TYPE__INT = IROOM_TYPE___VALIDATE_ROOM_TYPE__INT;

	/**
	 * The operation id for the '<em>Delete Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGMENT___DELETE_ROOM_TYPE__INT = IROOM_TYPE___DELETE_ROOM_TYPE__INT;

	/**
	 * The number of operations of the '<em>Type Managment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_MANAGMENT_OPERATION_COUNT = IROOM_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link RootElement.Room.RoomType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see RootElement.Room.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room.RoomType#getRoomTypeName <em>Room Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type Name</em>'.
	 * @see RootElement.Room.RoomType#getRoomTypeName()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_RoomTypeName();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room.RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see RootElement.Room.RoomType#getPrice()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Price();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room.RoomType#getNumberOfBeds <em>Number Of Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Beds</em>'.
	 * @see RootElement.Room.RoomType#getNumberOfBeds()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_NumberOfBeds();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room.RoomType#getRoomTypeID <em>Room Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type ID</em>'.
	 * @see RootElement.Room.RoomType#getRoomTypeID()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_RoomTypeID();

	/**
	 * Returns the meta object for class '{@link RootElement.Room.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see RootElement.Room.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room.Room#getRoomNumber <em>Room Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Number</em>'.
	 * @see RootElement.Room.Room#getRoomNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNumber();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room.Room#isAvailable <em>Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available</em>'.
	 * @see RootElement.Room.Room#isAvailable()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Available();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room.Room#getFloorNumber <em>Floor Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor Number</em>'.
	 * @see RootElement.Room.Room#getFloorNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_FloorNumber();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Room.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Type</em>'.
	 * @see RootElement.Room.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Room.Room#isGuestHasCheckedIn <em>Guest Has Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guest Has Checked In</em>'.
	 * @see RootElement.Room.Room#isGuestHasCheckedIn()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_GuestHasCheckedIn();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Room.Room#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see RootElement.Room.Room#getRoomtype()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Roomtype();

	/**
	 * Returns the meta object for class '{@link RootElement.Room.IRoom <em>IRoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom</em>'.
	 * @see RootElement.Room.IRoom
	 * @generated
	 */
	EClass getIRoom();

	/**
	 * Returns the meta object for the '{@link RootElement.Room.IRoom#getAvailiableRoom(int) <em>Get Availiable Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Availiable Room</em>' operation.
	 * @see RootElement.Room.IRoom#getAvailiableRoom(int)
	 * @generated
	 */
	EOperation getIRoom__GetAvailiableRoom__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Room.IRoom#addRoom() <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see RootElement.Room.IRoom#addRoom()
	 * @generated
	 */
	EOperation getIRoom__AddRoom();

	/**
	 * Returns the meta object for the '{@link RootElement.Room.IRoom#getRoom(int) <em>Get Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room</em>' operation.
	 * @see RootElement.Room.IRoom#getRoom(int)
	 * @generated
	 */
	EOperation getIRoom__GetRoom__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Room.IRoomType <em>IRoom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Type</em>'.
	 * @see RootElement.Room.IRoomType
	 * @generated
	 */
	EClass getIRoomType();

	/**
	 * Returns the meta object for the '{@link RootElement.Room.IRoomType#addRoomType(java.lang.String, int, int) <em>Add Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Type</em>' operation.
	 * @see RootElement.Room.IRoomType#addRoomType(java.lang.String, int, int)
	 * @generated
	 */
	EOperation getIRoomType__AddRoomType__String_int_int();

	/**
	 * Returns the meta object for the '{@link RootElement.Room.IRoomType#editRoomType(int) <em>Edit Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room Type</em>' operation.
	 * @see RootElement.Room.IRoomType#editRoomType(int)
	 * @generated
	 */
	EOperation getIRoomType__EditRoomType__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Room.IRoomType#validateRoomType(int) <em>Validate Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Room Type</em>' operation.
	 * @see RootElement.Room.IRoomType#validateRoomType(int)
	 * @generated
	 */
	EOperation getIRoomType__ValidateRoomType__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Room.IRoomType#deleteRoomType(int) <em>Delete Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Room Type</em>' operation.
	 * @see RootElement.Room.IRoomType#deleteRoomType(int)
	 * @generated
	 */
	EOperation getIRoomType__DeleteRoomType__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Room.RoomManagement <em>Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management</em>'.
	 * @see RootElement.Room.RoomManagement
	 * @generated
	 */
	EClass getRoomManagement();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Room.RoomManagement#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rooms</em>'.
	 * @see RootElement.Room.RoomManagement#getRooms()
	 * @see #getRoomManagement()
	 * @generated
	 */
	EReference getRoomManagement_Rooms();

	/**
	 * Returns the meta object for class '{@link RootElement.Room.RoomTypeManagment <em>Type Managment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Managment</em>'.
	 * @see RootElement.Room.RoomTypeManagment
	 * @generated
	 */
	EClass getRoomTypeManagment();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Room.RoomTypeManagment#getRoomtypes <em>Roomtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roomtypes</em>'.
	 * @see RootElement.Room.RoomTypeManagment#getRoomtypes()
	 * @see #getRoomTypeManagment()
	 * @generated
	 */
	EReference getRoomTypeManagment_Roomtypes();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Room.RoomTypeManagment#getRoomtype <em>Roomtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomtype</em>'.
	 * @see RootElement.Room.RoomTypeManagment#getRoomtype()
	 * @see #getRoomTypeManagment()
	 * @generated
	 */
	EReference getRoomTypeManagment_Roomtype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoomFactory getRoomFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RootElement.Room.impl.RoomTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Room.impl.RoomTypeImpl
		 * @see RootElement.Room.impl.RoomPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Room Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__ROOM_TYPE_NAME = eINSTANCE.getRoomType_RoomTypeName();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE = eINSTANCE.getRoomType_Price();

		/**
		 * The meta object literal for the '<em><b>Number Of Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__NUMBER_OF_BEDS = eINSTANCE.getRoomType_NumberOfBeds();

		/**
		 * The meta object literal for the '<em><b>Room Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__ROOM_TYPE_ID = eINSTANCE.getRoomType_RoomTypeID();

		/**
		 * The meta object literal for the '{@link RootElement.Room.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Room.impl.RoomImpl
		 * @see RootElement.Room.impl.RoomPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NUMBER = eINSTANCE.getRoom_RoomNumber();

		/**
		 * The meta object literal for the '<em><b>Available</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__AVAILABLE = eINSTANCE.getRoom_Available();

		/**
		 * The meta object literal for the '<em><b>Floor Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__FLOOR_NUMBER = eINSTANCE.getRoom_FloorNumber();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Guest Has Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__GUEST_HAS_CHECKED_IN = eINSTANCE.getRoom_GuestHasCheckedIn();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ROOMTYPE = eINSTANCE.getRoom_Roomtype();

		/**
		 * The meta object literal for the '{@link RootElement.Room.IRoom <em>IRoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Room.IRoom
		 * @see RootElement.Room.impl.RoomPackageImpl#getIRoom()
		 * @generated
		 */
		EClass IROOM = eINSTANCE.getIRoom();

		/**
		 * The meta object literal for the '<em><b>Get Availiable Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_AVAILIABLE_ROOM__INT = eINSTANCE.getIRoom__GetAvailiableRoom__int();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___ADD_ROOM = eINSTANCE.getIRoom__AddRoom();

		/**
		 * The meta object literal for the '<em><b>Get Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM___GET_ROOM__INT = eINSTANCE.getIRoom__GetRoom__int();

		/**
		 * The meta object literal for the '{@link RootElement.Room.IRoomType <em>IRoom Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Room.IRoomType
		 * @see RootElement.Room.impl.RoomPackageImpl#getIRoomType()
		 * @generated
		 */
		EClass IROOM_TYPE = eINSTANCE.getIRoomType();

		/**
		 * The meta object literal for the '<em><b>Add Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___ADD_ROOM_TYPE__STRING_INT_INT = eINSTANCE.getIRoomType__AddRoomType__String_int_int();

		/**
		 * The meta object literal for the '<em><b>Edit Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___EDIT_ROOM_TYPE__INT = eINSTANCE.getIRoomType__EditRoomType__int();

		/**
		 * The meta object literal for the '<em><b>Validate Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___VALIDATE_ROOM_TYPE__INT = eINSTANCE.getIRoomType__ValidateRoomType__int();

		/**
		 * The meta object literal for the '<em><b>Delete Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IROOM_TYPE___DELETE_ROOM_TYPE__INT = eINSTANCE.getIRoomType__DeleteRoomType__int();

		/**
		 * The meta object literal for the '{@link RootElement.Room.impl.RoomManagementImpl <em>Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Room.impl.RoomManagementImpl
		 * @see RootElement.Room.impl.RoomPackageImpl#getRoomManagement()
		 * @generated
		 */
		EClass ROOM_MANAGEMENT = eINSTANCE.getRoomManagement();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGEMENT__ROOMS = eINSTANCE.getRoomManagement_Rooms();

		/**
		 * The meta object literal for the '{@link RootElement.Room.impl.RoomTypeManagmentImpl <em>Type Managment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Room.impl.RoomTypeManagmentImpl
		 * @see RootElement.Room.impl.RoomPackageImpl#getRoomTypeManagment()
		 * @generated
		 */
		EClass ROOM_TYPE_MANAGMENT = eINSTANCE.getRoomTypeManagment();

		/**
		 * The meta object literal for the '<em><b>Roomtypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE_MANAGMENT__ROOMTYPES = eINSTANCE.getRoomTypeManagment_Roomtypes();

		/**
		 * The meta object literal for the '<em><b>Roomtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_TYPE_MANAGMENT__ROOMTYPE = eINSTANCE.getRoomTypeManagment_Roomtype();

	}

} //RoomPackage
