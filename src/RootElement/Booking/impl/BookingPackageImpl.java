/**
 */
package RootElement.Booking.impl;

import RootElement.Account.AccountPackage;

import RootElement.Account.impl.AccountPackageImpl;

import RootElement.Booking.Booking;
import RootElement.Booking.BookingFactory;
import RootElement.Booking.BookingPackage;
import RootElement.Booking.Cart;
import RootElement.Booking.CartManagement;
import RootElement.Booking.IBooking;

import RootElement.CheckIO.CheckIOPackage;

import RootElement.CheckIO.impl.CheckIOPackageImpl;

import RootElement.Payment.PaymentPackage;

import RootElement.Payment.impl.PaymentPackageImpl;

import RootElement.Room.RoomPackage;

import RootElement.Room.impl.RoomPackageImpl;

import RootElement.Schedule.SchedulePackage;

import RootElement.Schedule.impl.SchedulePackageImpl;

import RootElement.Service.ServicePackage;

import RootElement.Service.impl.ServicePackageImpl;

import RootElement.Task.TaskPackage;

import RootElement.Task.impl.TaskPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingPackageImpl extends EPackageImpl implements BookingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartManagementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RootElement.Booking.BookingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BookingPackageImpl() {
		super(eNS_URI, BookingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BookingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BookingPackage init() {
		if (isInited) return (BookingPackage)EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI);

		// Obtain or create and register package
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BookingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) : PaymentPackage.eINSTANCE);
		AccountPackageImpl theAccountPackage = (AccountPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) instanceof AccountPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) : AccountPackage.eINSTANCE);
		RoomPackageImpl theRoomPackage = (RoomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) instanceof RoomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) : RoomPackage.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) : SchedulePackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		CheckIOPackageImpl theCheckIOPackage = (CheckIOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) instanceof CheckIOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) : CheckIOPackage.eINSTANCE);

		// Create package meta-data objects
		theBookingPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theAccountPackage.createPackageContents();
		theRoomPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theServicePackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theCheckIOPackage.createPackageContents();

		// Initialize created meta-data
		theBookingPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theAccountPackage.initializePackageContents();
		theRoomPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theCheckIOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBookingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BookingPackage.eNS_URI, theBookingPackage);
		return theBookingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCart() {
		return cartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCart_Bookings() {
		return (EReference)cartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCart_Customer() {
		return (EReference)cartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCart_CartID() {
		return (EAttribute)cartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCart__GenerateSum() {
		return cartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCart__NotifyCustomer() {
		return cartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingID() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckInDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckOutDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_RoomTypeID() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_IsPaid() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBooking() {
		return iBookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__AddBooking__int_Date_Date_int() {
		return iBookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__EditBooking__int_int_Date_Date_int() {
		return iBookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__DeleteBooking__int() {
		return iBookingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__GetBooking__int() {
		return iBookingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBooking__ValidateBooking__int() {
		return iBookingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartManagement() {
		return cartManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartManagement_Carts() {
		return (EReference)cartManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartManagement_RoomTypeManagement() {
		return (EReference)cartManagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartManagement_RoomSchedule() {
		return (EReference)cartManagementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartManagement_CurrentCart() {
		return (EReference)cartManagementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartManagement__AddCart__Cart() {
		return cartManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartManagement__DeleteCart__int() {
		return cartManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingFactory getBookingFactory() {
		return (BookingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cartEClass = createEClass(CART);
		createEReference(cartEClass, CART__BOOKINGS);
		createEReference(cartEClass, CART__CUSTOMER);
		createEAttribute(cartEClass, CART__CART_ID);
		createEOperation(cartEClass, CART___GENERATE_SUM);
		createEOperation(cartEClass, CART___NOTIFY_CUSTOMER);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__BOOKING_ID);
		createEAttribute(bookingEClass, BOOKING__CHECK_IN_DATE);
		createEAttribute(bookingEClass, BOOKING__CHECK_OUT_DATE);
		createEAttribute(bookingEClass, BOOKING__ROOM_TYPE_ID);
		createEAttribute(bookingEClass, BOOKING__IS_PAID);

		iBookingEClass = createEClass(IBOOKING);
		createEOperation(iBookingEClass, IBOOKING___ADD_BOOKING__INT_DATE_DATE_INT);
		createEOperation(iBookingEClass, IBOOKING___EDIT_BOOKING__INT_INT_DATE_DATE_INT);
		createEOperation(iBookingEClass, IBOOKING___DELETE_BOOKING__INT);
		createEOperation(iBookingEClass, IBOOKING___GET_BOOKING__INT);
		createEOperation(iBookingEClass, IBOOKING___VALIDATE_BOOKING__INT);

		cartManagementEClass = createEClass(CART_MANAGEMENT);
		createEReference(cartManagementEClass, CART_MANAGEMENT__CARTS);
		createEReference(cartManagementEClass, CART_MANAGEMENT__ROOM_TYPE_MANAGEMENT);
		createEReference(cartManagementEClass, CART_MANAGEMENT__ROOM_SCHEDULE);
		createEReference(cartManagementEClass, CART_MANAGEMENT__CURRENT_CART);
		createEOperation(cartManagementEClass, CART_MANAGEMENT___ADD_CART__CART);
		createEOperation(cartManagementEClass, CART_MANAGEMENT___DELETE_CART__INT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AccountPackage theAccountPackage = (AccountPackage)EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI);
		RoomPackage theRoomPackage = (RoomPackage)EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI);
		SchedulePackage theSchedulePackage = (SchedulePackage)EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cartManagementEClass.getESuperTypes().add(this.getIBooking());

		// Initialize classes, features, and operations; add parameters
		initEClass(cartEClass, Cart.class, "Cart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCart_Bookings(), this.getBooking(), null, "bookings", null, 0, -1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCart_Customer(), theAccountPackage.getGuestAccount(), null, "customer", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCart_CartID(), ecorePackage.getEInt(), "CartID", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCart__GenerateSum(), null, "generateSum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCart__NotifyCustomer(), null, "notifyCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookingID(), ecorePackage.getEInt(), "bookingID", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckInDate(), ecorePackage.getEDate(), "checkInDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckOutDate(), ecorePackage.getEDate(), "checkOutDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_RoomTypeID(), ecorePackage.getEInt(), "RoomTypeID", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_IsPaid(), ecorePackage.getEBoolean(), "isPaid", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingEClass, IBooking.class, "IBooking", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIBooking__AddBooking__int_Date_Date_int(), ecorePackage.getEBoolean(), "addBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__EditBooking__int_int_Date_Date_int(), ecorePackage.getEBoolean(), "editBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfRooms", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__DeleteBooking__int(), ecorePackage.getEBoolean(), "deleteBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__GetBooking__int(), this.getBooking(), "getBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBooking__ValidateBooking__int(), ecorePackage.getEBoolean(), "validateBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "BookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(cartManagementEClass, CartManagement.class, "CartManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartManagement_Carts(), this.getCart(), null, "carts", null, 0, -1, CartManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCartManagement_RoomTypeManagement(), theRoomPackage.getRoomTypeManagment(), null, "roomTypeManagement", null, 1, 1, CartManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCartManagement_RoomSchedule(), theSchedulePackage.getRoomSchedule(), null, "roomSchedule", null, 1, 1, CartManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCartManagement_CurrentCart(), this.getCart(), null, "currentCart", null, 1, 1, CartManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCartManagement__AddCart__Cart(), ecorePackage.getEBoolean(), "addCart", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getCart(), "cart", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCartManagement__DeleteCart__int(), ecorePackage.getEBoolean(), "deleteCart", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "CartID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (getCart__NotifyCustomer(), 
		   source, 
		   new String[] {
			 "originalName", "notifyCustomer "
		   });
	}

} //BookingPackageImpl
