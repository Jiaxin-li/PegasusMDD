/**
 */
package RootElement.CheckIO.impl;

import RootElement.Account.AccountPackage;

import RootElement.Account.impl.AccountPackageImpl;

import RootElement.Booking.BookingPackage;

import RootElement.Booking.impl.BookingPackageImpl;

import RootElement.CheckIO.CheckIO;
import RootElement.CheckIO.CheckIOFactory;
import RootElement.CheckIO.CheckIOPackage;
import RootElement.CheckIO.Invoice;
import RootElement.CheckIO.RoomBinder;

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
import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckIOPackageImpl extends EPackageImpl implements CheckIOPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomBinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkIOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceEClass = null;

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
	 * @see RootElement.CheckIO.CheckIOPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CheckIOPackageImpl() {
		super(eNS_URI, CheckIOFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CheckIOPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CheckIOPackage init() {
		if (isInited) return (CheckIOPackage)EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI);

		// Obtain or create and register package
		CheckIOPackageImpl theCheckIOPackage = (CheckIOPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CheckIOPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CheckIOPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) : PaymentPackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		AccountPackageImpl theAccountPackage = (AccountPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) instanceof AccountPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) : AccountPackage.eINSTANCE);
		RoomPackageImpl theRoomPackage = (RoomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) instanceof RoomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) : RoomPackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) : SchedulePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theCheckIOPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theBookingPackage.createPackageContents();
		theAccountPackage.createPackageContents();
		theRoomPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theCheckIOPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();
		theAccountPackage.initializePackageContents();
		theRoomPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCheckIOPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CheckIOPackage.eNS_URI, theCheckIOPackage);
		return theCheckIOPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomBinder() {
		return roomBinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBinder_Room() {
		return (EReference)roomBinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBinder_Services() {
		return (EReference)roomBinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBinder_Guests() {
		return (EReference)roomBinderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomBinder_BookingID() {
		return (EAttribute)roomBinderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBinder__BindService__Service() {
		return roomBinderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBinder__BindRoom__Room() {
		return roomBinderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBinder__SetServiceStatus__int_boolean() {
		return roomBinderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBinder__SetRoomAvailability__boolean() {
		return roomBinderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomBinder__BindGuest__GuestAccount() {
		return roomBinderEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckIO() {
		return checkIOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckIO_Roombinder() {
		return (EReference)checkIOEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckIO_Staffs() {
		return (EReference)checkIOEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckIO_BindedRooms() {
		return (EReference)checkIOEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckIO_CartManagement() {
		return (EReference)checkIOEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckIO_RoomManagement() {
		return (EReference)checkIOEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckIO_GuestManagement() {
		return (EReference)checkIOEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCheckIO__PayOrder__int() {
		return checkIOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCheckIO__GenerateTotal__int() {
		return checkIOEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCheckIO__GetPaymentResult__int() {
		return checkIOEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCheckIO__CheckOut__int() {
		return checkIOEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCheckIO__CheckIn__int() {
		return checkIOEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoice() {
		return invoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInvoice__PrintUserData__String() {
		return invoiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckIOFactory getCheckIOFactory() {
		return (CheckIOFactory)getEFactoryInstance();
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
		roomBinderEClass = createEClass(ROOM_BINDER);
		createEReference(roomBinderEClass, ROOM_BINDER__ROOM);
		createEReference(roomBinderEClass, ROOM_BINDER__SERVICES);
		createEReference(roomBinderEClass, ROOM_BINDER__GUESTS);
		createEAttribute(roomBinderEClass, ROOM_BINDER__BOOKING_ID);
		createEOperation(roomBinderEClass, ROOM_BINDER___BIND_SERVICE__SERVICE);
		createEOperation(roomBinderEClass, ROOM_BINDER___BIND_ROOM__ROOM);
		createEOperation(roomBinderEClass, ROOM_BINDER___SET_SERVICE_STATUS__INT_BOOLEAN);
		createEOperation(roomBinderEClass, ROOM_BINDER___SET_ROOM_AVAILABILITY__BOOLEAN);
		createEOperation(roomBinderEClass, ROOM_BINDER___BIND_GUEST__GUESTACCOUNT);

		checkIOEClass = createEClass(CHECK_IO);
		createEReference(checkIOEClass, CHECK_IO__ROOMBINDER);
		createEReference(checkIOEClass, CHECK_IO__STAFFS);
		createEReference(checkIOEClass, CHECK_IO__BINDED_ROOMS);
		createEReference(checkIOEClass, CHECK_IO__CART_MANAGEMENT);
		createEReference(checkIOEClass, CHECK_IO__ROOM_MANAGEMENT);
		createEReference(checkIOEClass, CHECK_IO__GUEST_MANAGEMENT);
		createEOperation(checkIOEClass, CHECK_IO___PAY_ORDER__INT);
		createEOperation(checkIOEClass, CHECK_IO___GENERATE_TOTAL__INT);
		createEOperation(checkIOEClass, CHECK_IO___GET_PAYMENT_RESULT__INT);
		createEOperation(checkIOEClass, CHECK_IO___CHECK_OUT__INT);
		createEOperation(checkIOEClass, CHECK_IO___CHECK_IN__INT);

		invoiceEClass = createEClass(INVOICE);
		createEOperation(invoiceEClass, INVOICE___PRINT_USER_DATA__STRING);
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
		RoomPackage theRoomPackage = (RoomPackage)EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		AccountPackage theAccountPackage = (AccountPackage)EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI);
		BookingPackage theBookingPackage = (BookingPackage)EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(roomBinderEClass, RoomBinder.class, "RoomBinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomBinder_Room(), theRoomPackage.getRoom(), null, "room", null, 1, 1, RoomBinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBinder_Services(), theServicePackage.getService(), null, "services", null, 0, -1, RoomBinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomBinder_Guests(), theAccountPackage.getGuestAccount(), null, "guests", null, 0, -1, RoomBinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomBinder_BookingID(), ecorePackage.getEInt(), "bookingID", null, 1, 1, RoomBinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getRoomBinder__BindService__Service(), null, "bindService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theServicePackage.getService(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBinder__BindRoom__Room(), ecorePackage.getEBoolean(), "bindRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theRoomPackage.getRoom(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBinder__SetServiceStatus__int_boolean(), null, "SetServiceStatus", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "serviceID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBinder__SetRoomAvailability__boolean(), null, "setRoomAvailability", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "availiability", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomBinder__BindGuest__GuestAccount(), null, "bindGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theAccountPackage.getGuestAccount(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(checkIOEClass, CheckIO.class, "CheckIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckIO_Roombinder(), this.getRoomBinder(), null, "roombinder", null, 1, 1, CheckIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckIO_Staffs(), theAccountPackage.getStaffAccount(), null, "Staffs", null, 0, -1, CheckIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckIO_BindedRooms(), this.getRoomBinder(), null, "BindedRooms", null, 0, -1, CheckIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckIO_CartManagement(), theBookingPackage.getCartManagement(), null, "cartManagement", null, 1, 1, CheckIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckIO_RoomManagement(), theRoomPackage.getRoomManagement(), null, "roomManagement", null, 1, 1, CheckIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCheckIO_GuestManagement(), theAccountPackage.getGuestAccountMangement(), null, "guestManagement", null, 1, 1, CheckIO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCheckIO__PayOrder__int(), ecorePackage.getEBoolean(), "payOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCheckIO__GenerateTotal__int(), ecorePackage.getEInt(), "generateTotal", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCheckIO__GetPaymentResult__int(), theTypesPackage.getString(), "getPaymentResult", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "response", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCheckIO__CheckOut__int(), ecorePackage.getEBoolean(), "CheckOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCheckIO__CheckIn__int(), ecorePackage.getEBoolean(), "CheckIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "bookingID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(invoiceEClass, Invoice.class, "Invoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getInvoice__PrintUserData__String(), null, "printUserData", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "data", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CheckIOPackageImpl
