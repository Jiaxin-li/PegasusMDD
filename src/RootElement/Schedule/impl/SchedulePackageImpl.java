/**
 */
package RootElement.Schedule.impl;

import RootElement.Account.AccountPackage;

import RootElement.Account.impl.AccountPackageImpl;

import RootElement.Booking.BookingPackage;

import RootElement.Booking.impl.BookingPackageImpl;

import RootElement.CheckIO.CheckIOPackage;

import RootElement.CheckIO.impl.CheckIOPackageImpl;

import RootElement.Payment.PaymentPackage;

import RootElement.Payment.impl.PaymentPackageImpl;

import RootElement.Room.RoomPackage;

import RootElement.Room.impl.RoomPackageImpl;

import RootElement.Schedule.AvailablityMap;
import RootElement.Schedule.ISchedule;
import RootElement.Schedule.RoomSchedule;
import RootElement.Schedule.ScheduleFactory;
import RootElement.Schedule.SchedulePackage;

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
public class SchedulePackageImpl extends EPackageImpl implements SchedulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availablityMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iScheduleEClass = null;

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
	 * @see RootElement.Schedule.SchedulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchedulePackageImpl() {
		super(eNS_URI, ScheduleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchedulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchedulePackage init() {
		if (isInited) return (SchedulePackage)EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI);

		// Obtain or create and register package
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SchedulePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) : PaymentPackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		AccountPackageImpl theAccountPackage = (AccountPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) instanceof AccountPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) : AccountPackage.eINSTANCE);
		RoomPackageImpl theRoomPackage = (RoomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) instanceof RoomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) : RoomPackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		CheckIOPackageImpl theCheckIOPackage = (CheckIOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) instanceof CheckIOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) : CheckIOPackage.eINSTANCE);

		// Create package meta-data objects
		theSchedulePackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theBookingPackage.createPackageContents();
		theAccountPackage.createPackageContents();
		theRoomPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theCheckIOPackage.createPackageContents();

		// Initialize created meta-data
		theSchedulePackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();
		theAccountPackage.initializePackageContents();
		theRoomPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theCheckIOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSchedulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchedulePackage.eNS_URI, theSchedulePackage);
		return theSchedulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailablityMap() {
		return availablityMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvailablityMap_RoomType() {
		return (EReference)availablityMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailablityMap_Available() {
		return (EAttribute)availablityMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailablityMap_Date() {
		return (EAttribute)availablityMapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomSchedule() {
		return roomScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomSchedule_Schedule() {
		return (EReference)roomScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISchedule() {
		return iScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getISchedule__CheckAvailable__int_Date_Date() {
		return iScheduleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getISchedule__UpdateAvailable__int_Date_Date_int() {
		return iScheduleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleFactory getScheduleFactory() {
		return (ScheduleFactory)getEFactoryInstance();
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
		availablityMapEClass = createEClass(AVAILABLITY_MAP);
		createEReference(availablityMapEClass, AVAILABLITY_MAP__ROOM_TYPE);
		createEAttribute(availablityMapEClass, AVAILABLITY_MAP__AVAILABLE);
		createEAttribute(availablityMapEClass, AVAILABLITY_MAP__DATE);

		roomScheduleEClass = createEClass(ROOM_SCHEDULE);
		createEReference(roomScheduleEClass, ROOM_SCHEDULE__SCHEDULE);

		iScheduleEClass = createEClass(ISCHEDULE);
		createEOperation(iScheduleEClass, ISCHEDULE___CHECK_AVAILABLE__INT_DATE_DATE);
		createEOperation(iScheduleEClass, ISCHEDULE___UPDATE_AVAILABLE__INT_DATE_DATE_INT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roomScheduleEClass.getESuperTypes().add(this.getISchedule());

		// Initialize classes, features, and operations; add parameters
		initEClass(availablityMapEClass, AvailablityMap.class, "AvailablityMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailablityMap_RoomType(), theRoomPackage.getRoomType(), null, "roomType", null, 1, 1, AvailablityMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAvailablityMap_Available(), ecorePackage.getEInt(), "available", null, 1, 1, AvailablityMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAvailablityMap_Date(), ecorePackage.getEDate(), "Date", null, 1, 1, AvailablityMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomScheduleEClass, RoomSchedule.class, "RoomSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomSchedule_Schedule(), this.getAvailablityMap(), null, "schedule", null, 0, -1, RoomSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iScheduleEClass, ISchedule.class, "ISchedule", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getISchedule__CheckAvailable__int_Date_Date(), ecorePackage.getEInt(), "checkAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getISchedule__UpdateAvailable__int_Date_Date_int(), ecorePackage.getEBoolean(), "updateAvailable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomTypeID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nrOfRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SchedulePackageImpl
