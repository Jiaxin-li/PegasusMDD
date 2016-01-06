/**
 */
package RootElement.Booking;

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
 * @see RootElement.Booking.BookingFactory
 * @model kind="package"
 * @generated
 */
public interface BookingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Booking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Booking.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Booking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingPackage eINSTANCE = RootElement.Booking.impl.BookingPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Booking.impl.CartImpl <em>Cart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Booking.impl.CartImpl
	 * @see RootElement.Booking.impl.BookingPackageImpl#getCart()
	 * @generated
	 */
	int CART = 0;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__BOOKINGS = 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Cart ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__CART_ID = 2;

	/**
	 * The number of structural features of the '<em>Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Generate Sum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART___GENERATE_SUM = 0;

	/**
	 * The operation id for the '<em>Notify Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART___NOTIFY_CUSTOMER = 1;

	/**
	 * The number of operations of the '<em>Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.Booking.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Booking.impl.BookingImpl
	 * @see RootElement.Booking.impl.BookingPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 1;

	/**
	 * The feature id for the '<em><b>Booking ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_ID = 0;

	/**
	 * The feature id for the '<em><b>Check In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECK_IN_DATE = 1;

	/**
	 * The feature id for the '<em><b>Check Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECK_OUT_DATE = 2;

	/**
	 * The feature id for the '<em><b>Room Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_TYPE_ID = 3;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IS_PAID = 4;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Booking.IBooking <em>IBooking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Booking.IBooking
	 * @see RootElement.Booking.impl.BookingPackageImpl#getIBooking()
	 * @generated
	 */
	int IBOOKING = 2;

	/**
	 * The number of structural features of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___ADD_BOOKING__INT_DATE_DATE_INT_INT = 0;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___EDIT_BOOKING__INT = 1;

	/**
	 * The operation id for the '<em>Delete Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___DELETE_BOOKING__INT = 2;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___GET_BOOKING__INT = 3;

	/**
	 * The operation id for the '<em>Validate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING___VALIDATE_BOOKING__INT = 4;

	/**
	 * The number of operations of the '<em>IBooking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link RootElement.Booking.impl.CartManagementImpl <em>Cart Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Booking.impl.CartManagementImpl
	 * @see RootElement.Booking.impl.BookingPackageImpl#getCartManagement()
	 * @generated
	 */
	int CART_MANAGEMENT = 3;

	/**
	 * The feature id for the '<em><b>Carts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT__CARTS = IBOOKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cart</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT__CART = IBOOKING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cart Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT_FEATURE_COUNT = IBOOKING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT___ADD_BOOKING__INT_DATE_DATE_INT_INT = IBOOKING___ADD_BOOKING__INT_DATE_DATE_INT_INT;

	/**
	 * The operation id for the '<em>Edit Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT___EDIT_BOOKING__INT = IBOOKING___EDIT_BOOKING__INT;

	/**
	 * The operation id for the '<em>Delete Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT___DELETE_BOOKING__INT = IBOOKING___DELETE_BOOKING__INT;

	/**
	 * The operation id for the '<em>Get Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT___GET_BOOKING__INT = IBOOKING___GET_BOOKING__INT;

	/**
	 * The operation id for the '<em>Validate Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT___VALIDATE_BOOKING__INT = IBOOKING___VALIDATE_BOOKING__INT;

	/**
	 * The operation id for the '<em>Add Cart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT___ADD_CART__CART = IBOOKING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete Cart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT___DELETE_CART__INT_BOOLEAN = IBOOKING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cart Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_MANAGEMENT_OPERATION_COUNT = IBOOKING_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link RootElement.Booking.Cart <em>Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart</em>'.
	 * @see RootElement.Booking.Cart
	 * @generated
	 */
	EClass getCart();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Booking.Cart#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookings</em>'.
	 * @see RootElement.Booking.Cart#getBookings()
	 * @see #getCart()
	 * @generated
	 */
	EReference getCart_Bookings();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Booking.Cart#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer</em>'.
	 * @see RootElement.Booking.Cart#getCustomer()
	 * @see #getCart()
	 * @generated
	 */
	EReference getCart_Customer();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking.Cart#getCartID <em>Cart ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cart ID</em>'.
	 * @see RootElement.Booking.Cart#getCartID()
	 * @see #getCart()
	 * @generated
	 */
	EAttribute getCart_CartID();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.Cart#generateSum() <em>Generate Sum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Sum</em>' operation.
	 * @see RootElement.Booking.Cart#generateSum()
	 * @generated
	 */
	EOperation getCart__GenerateSum();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.Cart#notifyCustomer() <em>Notify Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify Customer</em>' operation.
	 * @see RootElement.Booking.Cart#notifyCustomer()
	 * @generated
	 */
	EOperation getCart__NotifyCustomer();

	/**
	 * Returns the meta object for class '{@link RootElement.Booking.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see RootElement.Booking.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking.Booking#getBookingID <em>Booking ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking ID</em>'.
	 * @see RootElement.Booking.Booking#getBookingID()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingID();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking.Booking#getCheckInDate <em>Check In Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In Date</em>'.
	 * @see RootElement.Booking.Booking#getCheckInDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckInDate();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking.Booking#getCheckOutDate <em>Check Out Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out Date</em>'.
	 * @see RootElement.Booking.Booking#getCheckOutDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckOutDate();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking.Booking#getRoomTypeID <em>Room Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type ID</em>'.
	 * @see RootElement.Booking.Booking#getRoomTypeID()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_RoomTypeID();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Booking.Booking#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see RootElement.Booking.Booking#isPaid()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsPaid();

	/**
	 * Returns the meta object for class '{@link RootElement.Booking.IBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking</em>'.
	 * @see RootElement.Booking.IBooking
	 * @generated
	 */
	EClass getIBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.IBooking#addBooking(int, java.util.Date, java.util.Date, int, int) <em>Add Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booking</em>' operation.
	 * @see RootElement.Booking.IBooking#addBooking(int, java.util.Date, java.util.Date, int, int)
	 * @generated
	 */
	EOperation getIBooking__AddBooking__int_Date_Date_int_int();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.IBooking#editBooking(int) <em>Edit Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Booking</em>' operation.
	 * @see RootElement.Booking.IBooking#editBooking(int)
	 * @generated
	 */
	EOperation getIBooking__EditBooking__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.IBooking#deleteBooking(int) <em>Delete Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Booking</em>' operation.
	 * @see RootElement.Booking.IBooking#deleteBooking(int)
	 * @generated
	 */
	EOperation getIBooking__DeleteBooking__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.IBooking#getBooking(int) <em>Get Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking</em>' operation.
	 * @see RootElement.Booking.IBooking#getBooking(int)
	 * @generated
	 */
	EOperation getIBooking__GetBooking__int();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.IBooking#validateBooking(int) <em>Validate Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Booking</em>' operation.
	 * @see RootElement.Booking.IBooking#validateBooking(int)
	 * @generated
	 */
	EOperation getIBooking__ValidateBooking__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Booking.CartManagement <em>Cart Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart Management</em>'.
	 * @see RootElement.Booking.CartManagement
	 * @generated
	 */
	EClass getCartManagement();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Booking.CartManagement#getCarts <em>Carts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Carts</em>'.
	 * @see RootElement.Booking.CartManagement#getCarts()
	 * @see #getCartManagement()
	 * @generated
	 */
	EReference getCartManagement_Carts();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Booking.CartManagement#getCart <em>Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cart</em>'.
	 * @see RootElement.Booking.CartManagement#getCart()
	 * @see #getCartManagement()
	 * @generated
	 */
	EReference getCartManagement_Cart();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.CartManagement#addCart(RootElement.Booking.Cart) <em>Add Cart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Cart</em>' operation.
	 * @see RootElement.Booking.CartManagement#addCart(RootElement.Booking.Cart)
	 * @generated
	 */
	EOperation getCartManagement__AddCart__Cart();

	/**
	 * Returns the meta object for the '{@link RootElement.Booking.CartManagement#deleteCart(int, boolean) <em>Delete Cart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Cart</em>' operation.
	 * @see RootElement.Booking.CartManagement#deleteCart(int, boolean)
	 * @generated
	 */
	EOperation getCartManagement__DeleteCart__int_boolean();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BookingFactory getBookingFactory();

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
		 * The meta object literal for the '{@link RootElement.Booking.impl.CartImpl <em>Cart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Booking.impl.CartImpl
		 * @see RootElement.Booking.impl.BookingPackageImpl#getCart()
		 * @generated
		 */
		EClass CART = eINSTANCE.getCart();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART__BOOKINGS = eINSTANCE.getCart_Bookings();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART__CUSTOMER = eINSTANCE.getCart_Customer();

		/**
		 * The meta object literal for the '<em><b>Cart ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART__CART_ID = eINSTANCE.getCart_CartID();

		/**
		 * The meta object literal for the '<em><b>Generate Sum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CART___GENERATE_SUM = eINSTANCE.getCart__GenerateSum();

		/**
		 * The meta object literal for the '<em><b>Notify Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CART___NOTIFY_CUSTOMER = eINSTANCE.getCart__NotifyCustomer();

		/**
		 * The meta object literal for the '{@link RootElement.Booking.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Booking.impl.BookingImpl
		 * @see RootElement.Booking.impl.BookingPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booking ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_ID = eINSTANCE.getBooking_BookingID();

		/**
		 * The meta object literal for the '<em><b>Check In Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECK_IN_DATE = eINSTANCE.getBooking_CheckInDate();

		/**
		 * The meta object literal for the '<em><b>Check Out Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECK_OUT_DATE = eINSTANCE.getBooking_CheckOutDate();

		/**
		 * The meta object literal for the '<em><b>Room Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ROOM_TYPE_ID = eINSTANCE.getBooking_RoomTypeID();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__IS_PAID = eINSTANCE.getBooking_IsPaid();

		/**
		 * The meta object literal for the '{@link RootElement.Booking.IBooking <em>IBooking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Booking.IBooking
		 * @see RootElement.Booking.impl.BookingPackageImpl#getIBooking()
		 * @generated
		 */
		EClass IBOOKING = eINSTANCE.getIBooking();

		/**
		 * The meta object literal for the '<em><b>Add Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___ADD_BOOKING__INT_DATE_DATE_INT_INT = eINSTANCE.getIBooking__AddBooking__int_Date_Date_int_int();

		/**
		 * The meta object literal for the '<em><b>Edit Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___EDIT_BOOKING__INT = eINSTANCE.getIBooking__EditBooking__int();

		/**
		 * The meta object literal for the '<em><b>Delete Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___DELETE_BOOKING__INT = eINSTANCE.getIBooking__DeleteBooking__int();

		/**
		 * The meta object literal for the '<em><b>Get Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___GET_BOOKING__INT = eINSTANCE.getIBooking__GetBooking__int();

		/**
		 * The meta object literal for the '<em><b>Validate Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKING___VALIDATE_BOOKING__INT = eINSTANCE.getIBooking__ValidateBooking__int();

		/**
		 * The meta object literal for the '{@link RootElement.Booking.impl.CartManagementImpl <em>Cart Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Booking.impl.CartManagementImpl
		 * @see RootElement.Booking.impl.BookingPackageImpl#getCartManagement()
		 * @generated
		 */
		EClass CART_MANAGEMENT = eINSTANCE.getCartManagement();

		/**
		 * The meta object literal for the '<em><b>Carts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART_MANAGEMENT__CARTS = eINSTANCE.getCartManagement_Carts();

		/**
		 * The meta object literal for the '<em><b>Cart</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART_MANAGEMENT__CART = eINSTANCE.getCartManagement_Cart();

		/**
		 * The meta object literal for the '<em><b>Add Cart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CART_MANAGEMENT___ADD_CART__CART = eINSTANCE.getCartManagement__AddCart__Cart();

		/**
		 * The meta object literal for the '<em><b>Delete Cart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CART_MANAGEMENT___DELETE_CART__INT_BOOLEAN = eINSTANCE.getCartManagement__DeleteCart__int_boolean();

	}

} //BookingPackage
