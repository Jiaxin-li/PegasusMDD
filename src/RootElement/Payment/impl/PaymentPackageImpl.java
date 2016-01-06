/**
 */
package RootElement.Payment.impl;

import RootElement.Account.AccountPackage;

import RootElement.Account.impl.AccountPackageImpl;

import RootElement.Booking.BookingPackage;

import RootElement.Booking.impl.BookingPackageImpl;

import RootElement.CheckIO.CheckIOPackage;

import RootElement.CheckIO.impl.CheckIOPackageImpl;

import RootElement.Payment.IPayment;
import RootElement.Payment.PaymentFactory;
import RootElement.Payment.PaymentPackage;

import RootElement.Room.RoomPackage;

import RootElement.Room.impl.RoomPackageImpl;

import RootElement.Schedule.SchedulePackage;

import RootElement.Schedule.impl.SchedulePackageImpl;

import RootElement.Service.ServicePackage;

import RootElement.Service.impl.ServicePackageImpl;

import RootElement.Task.TaskPackage;

import RootElement.Task.impl.TaskPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaymentPackageImpl extends EPackageImpl implements PaymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPaymentEClass = null;

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
	 * @see RootElement.Payment.PaymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaymentPackageImpl() {
		super(eNS_URI, PaymentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PaymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PaymentPackage init() {
		if (isInited) return (PaymentPackage)EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI);

		// Obtain or create and register package
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PaymentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		AccountPackageImpl theAccountPackage = (AccountPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) instanceof AccountPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) : AccountPackage.eINSTANCE);
		RoomPackageImpl theRoomPackage = (RoomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) instanceof RoomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) : RoomPackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		CheckIOPackageImpl theCheckIOPackage = (CheckIOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) instanceof CheckIOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) : CheckIOPackage.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) : SchedulePackage.eINSTANCE);

		// Create package meta-data objects
		thePaymentPackage.createPackageContents();
		theBookingPackage.createPackageContents();
		theAccountPackage.createPackageContents();
		theRoomPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theCheckIOPackage.createPackageContents();
		theSchedulePackage.createPackageContents();

		// Initialize created meta-data
		thePaymentPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();
		theAccountPackage.initializePackageContents();
		theRoomPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theCheckIOPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePaymentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaymentPackage.eNS_URI, thePaymentPackage);
		return thePaymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPayment() {
		return iPaymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPayment__InitiatePayment__int() {
		return iPaymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPayment__CommencePayment() {
		return iPaymentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentFactory getPaymentFactory() {
		return (PaymentFactory)getEFactoryInstance();
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
		iPaymentEClass = createEClass(IPAYMENT);
		createEOperation(iPaymentEClass, IPAYMENT___INITIATE_PAYMENT__INT);
		createEOperation(iPaymentEClass, IPAYMENT___COMMENCE_PAYMENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(iPaymentEClass, IPayment.class, "IPayment", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIPayment__InitiatePayment__int(), ecorePackage.getEBoolean(), "initiatePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "amount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIPayment__CommencePayment(), null, "commencePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PaymentPackageImpl
