/**
 */
package RootElement.CheckIO;

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
 * @see RootElement.CheckIO.CheckIOFactory
 * @model kind="package"
 * @generated
 */
public interface CheckIOPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CheckIO";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/CheckIO.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.CheckIO";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CheckIOPackage eINSTANCE = RootElement.CheckIO.impl.CheckIOPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.CheckIO.impl.RoomBinderImpl <em>Room Binder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CheckIO.impl.RoomBinderImpl
	 * @see RootElement.CheckIO.impl.CheckIOPackageImpl#getRoomBinder()
	 * @generated
	 */
	int ROOM_BINDER = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER__ROOM = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER__SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER__GUESTS = 2;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER__BOOKING_ID = 3;

	/**
	 * The number of structural features of the '<em>Room Binder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Bind Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER___BIND_SERVICE__SERVICE = 0;

	/**
	 * The operation id for the '<em>Bind Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER___BIND_ROOM__ROOM = 1;

	/**
	 * The operation id for the '<em>Set Service Status</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER___SET_SERVICE_STATUS__INT_BOOLEAN = 2;

	/**
	 * The operation id for the '<em>Set Room Availability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER___SET_ROOM_AVAILABILITY__BOOLEAN = 3;

	/**
	 * The operation id for the '<em>Bind Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER___BIND_GUEST__GUESTACCOUNT = 4;

	/**
	 * The number of operations of the '<em>Room Binder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_BINDER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.CheckIO.impl.CheckIOImpl <em>Check IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CheckIO.impl.CheckIOImpl
	 * @see RootElement.CheckIO.impl.CheckIOPackageImpl#getCheckIO()
	 * @generated
	 */
	int CHECK_IO = 1;

	/**
	 * The feature id for the '<em><b>Roombinder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO__ROOMBINDER = 0;

	/**
	 * The feature id for the '<em><b>Staffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO__STAFFS = 1;

	/**
	 * The feature id for the '<em><b>Binded Rooms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO__BINDED_ROOMS = 2;

	/**
	 * The feature id for the '<em><b>Cart Management</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO__CART_MANAGEMENT = 3;

	/**
	 * The feature id for the '<em><b>Room Management</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO__ROOM_MANAGEMENT = 4;

	/**
	 * The feature id for the '<em><b>Guest Management</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO__GUEST_MANAGEMENT = 5;

	/**
	 * The number of structural features of the '<em>Check IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Pay Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO___PAY_ORDER__INT = 0;

	/**
	 * The operation id for the '<em>Generate Total</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO___GENERATE_TOTAL__INT = 1;

	/**
	 * The operation id for the '<em>Get Payment Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO___GET_PAYMENT_RESULT__INT = 2;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO___CHECK_OUT__INT = 3;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO___CHECK_IN__INT = 4;

	/**
	 * The number of operations of the '<em>Check IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_IO_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.CheckIO.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.CheckIO.impl.InvoiceImpl
	 * @see RootElement.CheckIO.impl.CheckIOPackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 2;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Print User Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE___PRINT_USER_DATA__STRING = 0;

	/**
	 * The number of operations of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link RootElement.CheckIO.RoomBinder <em>Room Binder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Binder</em>'.
	 * @see RootElement.CheckIO.RoomBinder
	 * @generated
	 */
	EClass getRoomBinder();

	/**
	 * Returns the meta object for the reference '{@link RootElement.CheckIO.RoomBinder#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see RootElement.CheckIO.RoomBinder#getRoom()
	 * @see #getRoomBinder()
	 * @generated
	 */
	EReference getRoomBinder_Room();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.CheckIO.RoomBinder#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see RootElement.CheckIO.RoomBinder#getServices()
	 * @see #getRoomBinder()
	 * @generated
	 */
	EReference getRoomBinder_Services();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.CheckIO.RoomBinder#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guests</em>'.
	 * @see RootElement.CheckIO.RoomBinder#getGuests()
	 * @see #getRoomBinder()
	 * @generated
	 */
	EReference getRoomBinder_Guests();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.CheckIO.RoomBinder#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see RootElement.CheckIO.RoomBinder#getBookingID()
	 * @see #getRoomBinder()
	 * @generated
	 */
	EAttribute getRoomBinder_BookingID();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.RoomBinder#bindService(RootElement.Service.Service) <em>Bind Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind Service</em>' operation.
	 * @see RootElement.CheckIO.RoomBinder#bindService(RootElement.Service.Service)
	 * @generated
	 */
	EOperation getRoomBinder__BindService__Service();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.RoomBinder#bindRoom(RootElement.Room.Room) <em>Bind Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind Room</em>' operation.
	 * @see RootElement.CheckIO.RoomBinder#bindRoom(RootElement.Room.Room)
	 * @generated
	 */
	EOperation getRoomBinder__BindRoom__Room();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.RoomBinder#SetServiceStatus(int, boolean) <em>Set Service Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Service Status</em>' operation.
	 * @see RootElement.CheckIO.RoomBinder#SetServiceStatus(int, boolean)
	 * @generated
	 */
	EOperation getRoomBinder__SetServiceStatus__int_boolean();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.RoomBinder#setRoomAvailability(boolean) <em>Set Room Availability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Room Availability</em>' operation.
	 * @see RootElement.CheckIO.RoomBinder#setRoomAvailability(boolean)
	 * @generated
	 */
	EOperation getRoomBinder__SetRoomAvailability__boolean();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.RoomBinder#bindGuest(RootElement.Account.GuestAccount) <em>Bind Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bind Guest</em>' operation.
	 * @see RootElement.CheckIO.RoomBinder#bindGuest(RootElement.Account.GuestAccount)
	 * @generated
	 */
	EOperation getRoomBinder__BindGuest__GuestAccount();

	/**
	 * Returns the meta object for class '{@link RootElement.CheckIO.CheckIO <em>Check IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check IO</em>'.
	 * @see RootElement.CheckIO.CheckIO
	 * @generated
	 */
	EClass getCheckIO();

	/**
	 * Returns the meta object for the reference '{@link RootElement.CheckIO.CheckIO#getRoombinder <em>Roombinder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roombinder</em>'.
	 * @see RootElement.CheckIO.CheckIO#getRoombinder()
	 * @see #getCheckIO()
	 * @generated
	 */
	EReference getCheckIO_Roombinder();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.CheckIO.CheckIO#getStaffs <em>Staffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staffs</em>'.
	 * @see RootElement.CheckIO.CheckIO#getStaffs()
	 * @see #getCheckIO()
	 * @generated
	 */
	EReference getCheckIO_Staffs();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.CheckIO.CheckIO#getBindedRooms <em>Binded Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binded Rooms</em>'.
	 * @see RootElement.CheckIO.CheckIO#getBindedRooms()
	 * @see #getCheckIO()
	 * @generated
	 */
	EReference getCheckIO_BindedRooms();

	/**
	 * Returns the meta object for the reference '{@link RootElement.CheckIO.CheckIO#getCartManagement <em>Cart Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cart Management</em>'.
	 * @see RootElement.CheckIO.CheckIO#getCartManagement()
	 * @see #getCheckIO()
	 * @generated
	 */
	EReference getCheckIO_CartManagement();

	/**
	 * Returns the meta object for the reference '{@link RootElement.CheckIO.CheckIO#getRoomManagement <em>Room Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Management</em>'.
	 * @see RootElement.CheckIO.CheckIO#getRoomManagement()
	 * @see #getCheckIO()
	 * @generated
	 */
	EReference getCheckIO_RoomManagement();

	/**
	 * Returns the meta object for the reference '{@link RootElement.CheckIO.CheckIO#getGuestManagement <em>Guest Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guest Management</em>'.
	 * @see RootElement.CheckIO.CheckIO#getGuestManagement()
	 * @see #getCheckIO()
	 * @generated
	 */
	EReference getCheckIO_GuestManagement();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.CheckIO#payOrder(int) <em>Pay Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Order</em>' operation.
	 * @see RootElement.CheckIO.CheckIO#payOrder(int)
	 * @generated
	 */
	EOperation getCheckIO__PayOrder__int();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.CheckIO#generateTotal(int) <em>Generate Total</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Total</em>' operation.
	 * @see RootElement.CheckIO.CheckIO#generateTotal(int)
	 * @generated
	 */
	EOperation getCheckIO__GenerateTotal__int();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.CheckIO#getPaymentResult(int) <em>Get Payment Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Payment Result</em>' operation.
	 * @see RootElement.CheckIO.CheckIO#getPaymentResult(int)
	 * @generated
	 */
	EOperation getCheckIO__GetPaymentResult__int();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.CheckIO#CheckOut(int) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see RootElement.CheckIO.CheckIO#CheckOut(int)
	 * @generated
	 */
	EOperation getCheckIO__CheckOut__int();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.CheckIO#CheckIn(int) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see RootElement.CheckIO.CheckIO#CheckIn(int)
	 * @generated
	 */
	EOperation getCheckIO__CheckIn__int();

	/**
	 * Returns the meta object for class '{@link RootElement.CheckIO.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see RootElement.CheckIO.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the '{@link RootElement.CheckIO.Invoice#printUserData(java.lang.String) <em>Print User Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print User Data</em>' operation.
	 * @see RootElement.CheckIO.Invoice#printUserData(java.lang.String)
	 * @generated
	 */
	EOperation getInvoice__PrintUserData__String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CheckIOFactory getCheckIOFactory();

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
		 * The meta object literal for the '{@link RootElement.CheckIO.impl.RoomBinderImpl <em>Room Binder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.CheckIO.impl.RoomBinderImpl
		 * @see RootElement.CheckIO.impl.CheckIOPackageImpl#getRoomBinder()
		 * @generated
		 */
		EClass ROOM_BINDER = eINSTANCE.getRoomBinder();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BINDER__ROOM = eINSTANCE.getRoomBinder_Room();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BINDER__SERVICES = eINSTANCE.getRoomBinder_Services();

		/**
		 * The meta object literal for the '<em><b>Guests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_BINDER__GUESTS = eINSTANCE.getRoomBinder_Guests();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_BINDER__BOOKING_ID = eINSTANCE.getRoomBinder_BookingID();

		/**
		 * The meta object literal for the '<em><b>Bind Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BINDER___BIND_SERVICE__SERVICE = eINSTANCE.getRoomBinder__BindService__Service();

		/**
		 * The meta object literal for the '<em><b>Bind Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BINDER___BIND_ROOM__ROOM = eINSTANCE.getRoomBinder__BindRoom__Room();

		/**
		 * The meta object literal for the '<em><b>Set Service Status</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BINDER___SET_SERVICE_STATUS__INT_BOOLEAN = eINSTANCE.getRoomBinder__SetServiceStatus__int_boolean();

		/**
		 * The meta object literal for the '<em><b>Set Room Availability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BINDER___SET_ROOM_AVAILABILITY__BOOLEAN = eINSTANCE.getRoomBinder__SetRoomAvailability__boolean();

		/**
		 * The meta object literal for the '<em><b>Bind Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_BINDER___BIND_GUEST__GUESTACCOUNT = eINSTANCE.getRoomBinder__BindGuest__GuestAccount();

		/**
		 * The meta object literal for the '{@link RootElement.CheckIO.impl.CheckIOImpl <em>Check IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.CheckIO.impl.CheckIOImpl
		 * @see RootElement.CheckIO.impl.CheckIOPackageImpl#getCheckIO()
		 * @generated
		 */
		EClass CHECK_IO = eINSTANCE.getCheckIO();

		/**
		 * The meta object literal for the '<em><b>Roombinder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IO__ROOMBINDER = eINSTANCE.getCheckIO_Roombinder();

		/**
		 * The meta object literal for the '<em><b>Staffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IO__STAFFS = eINSTANCE.getCheckIO_Staffs();

		/**
		 * The meta object literal for the '<em><b>Binded Rooms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IO__BINDED_ROOMS = eINSTANCE.getCheckIO_BindedRooms();

		/**
		 * The meta object literal for the '<em><b>Cart Management</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IO__CART_MANAGEMENT = eINSTANCE.getCheckIO_CartManagement();

		/**
		 * The meta object literal for the '<em><b>Room Management</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IO__ROOM_MANAGEMENT = eINSTANCE.getCheckIO_RoomManagement();

		/**
		 * The meta object literal for the '<em><b>Guest Management</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_IO__GUEST_MANAGEMENT = eINSTANCE.getCheckIO_GuestManagement();

		/**
		 * The meta object literal for the '<em><b>Pay Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHECK_IO___PAY_ORDER__INT = eINSTANCE.getCheckIO__PayOrder__int();

		/**
		 * The meta object literal for the '<em><b>Generate Total</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHECK_IO___GENERATE_TOTAL__INT = eINSTANCE.getCheckIO__GenerateTotal__int();

		/**
		 * The meta object literal for the '<em><b>Get Payment Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHECK_IO___GET_PAYMENT_RESULT__INT = eINSTANCE.getCheckIO__GetPaymentResult__int();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHECK_IO___CHECK_OUT__INT = eINSTANCE.getCheckIO__CheckOut__int();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHECK_IO___CHECK_IN__INT = eINSTANCE.getCheckIO__CheckIn__int();

		/**
		 * The meta object literal for the '{@link RootElement.CheckIO.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.CheckIO.impl.InvoiceImpl
		 * @see RootElement.CheckIO.impl.CheckIOPackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Print User Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVOICE___PRINT_USER_DATA__STRING = eINSTANCE.getInvoice__PrintUserData__String();

	}

} //CheckIOPackage
