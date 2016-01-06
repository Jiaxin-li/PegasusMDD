/**
 */
package RootElement.Task.impl;

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

import RootElement.Schedule.SchedulePackage;

import RootElement.Schedule.impl.SchedulePackageImpl;

import RootElement.Service.ServicePackage;

import RootElement.Service.impl.ServicePackageImpl;

import RootElement.Task.Task;
import RootElement.Task.TaskFactory;
import RootElement.Task.TaskManagement;
import RootElement.Task.TaskPackage;

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
public class TaskPackageImpl extends EPackageImpl implements TaskPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

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
	 * @see RootElement.Task.TaskPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskPackageImpl() {
		super(eNS_URI, TaskFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TaskPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskPackage init() {
		if (isInited) return (TaskPackage)EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI);

		// Obtain or create and register package
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TaskPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) : PaymentPackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		AccountPackageImpl theAccountPackage = (AccountPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) instanceof AccountPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI) : AccountPackage.eINSTANCE);
		RoomPackageImpl theRoomPackage = (RoomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) instanceof RoomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) : RoomPackage.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) : SchedulePackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		CheckIOPackageImpl theCheckIOPackage = (CheckIOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) instanceof CheckIOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) : CheckIOPackage.eINSTANCE);

		// Create package meta-data objects
		theTaskPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theBookingPackage.createPackageContents();
		theAccountPackage.createPackageContents();
		theRoomPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theServicePackage.createPackageContents();
		theCheckIOPackage.createPackageContents();

		// Initialize created meta-data
		theTaskPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();
		theAccountPackage.initializePackageContents();
		theRoomPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theCheckIOPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskPackage.eNS_URI, theTaskPackage);
		return theTaskPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskManagement() {
		return taskManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskManagement_Staff() {
		return (EReference)taskManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskManagement_TaskList() {
		return (EReference)taskManagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskManagement__AddTask__Task() {
		return taskManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskManagement__RemoveTask__int() {
		return taskManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__SetDescription() {
		return taskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTask__GetID() {
		return taskEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFactory getTaskFactory() {
		return (TaskFactory)getEFactoryInstance();
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
		taskManagementEClass = createEClass(TASK_MANAGEMENT);
		createEReference(taskManagementEClass, TASK_MANAGEMENT__STAFF);
		createEReference(taskManagementEClass, TASK_MANAGEMENT__TASK_LIST);
		createEOperation(taskManagementEClass, TASK_MANAGEMENT___ADD_TASK__TASK);
		createEOperation(taskManagementEClass, TASK_MANAGEMENT___REMOVE_TASK__INT);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEAttribute(taskEClass, TASK__ID);
		createEOperation(taskEClass, TASK___SET_DESCRIPTION);
		createEOperation(taskEClass, TASK___GET_ID);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(taskManagementEClass, TaskManagement.class, "TaskManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskManagement_Staff(), theAccountPackage.getStaffAccount(), null, "staff", null, 1, 1, TaskManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTaskManagement_TaskList(), this.getTask(), null, "taskList", null, 0, -1, TaskManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getTaskManagement__AddTask__Task(), null, "addTask", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTask(), "t", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getTaskManagement__RemoveTask__int(), ecorePackage.getEBoolean(), "removeTask", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "id", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Description(), theTypesPackage.getString(), "description", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTask_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTask__SetDescription(), null, "setDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTask__GetID(), ecorePackage.getEInt(), "getID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TaskPackageImpl
