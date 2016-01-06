/**
 */
package RootElement.Account.impl;

import RootElement.Account.AccessControl;
import RootElement.Account.AccountFactory;
import RootElement.Account.AccountPackage;
import RootElement.Account.GuestAccount;
import RootElement.Account.GuestAccountMangement;
import RootElement.Account.IGuest;
import RootElement.Account.IStaff;
import RootElement.Account.StaffAccount;
import RootElement.Account.StaffAccountManagement;
import RootElement.Account.UserAccounts;

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
public class AccountPackageImpl extends EPackageImpl implements AccountPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAccountsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iGuestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStaffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffAccountManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestAccountMangementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestAccountEClass = null;

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
	 * @see RootElement.Account.AccountPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccountPackageImpl() {
		super(eNS_URI, AccountFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AccountPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccountPackage init() {
		if (isInited) return (AccountPackage)EPackage.Registry.INSTANCE.getEPackage(AccountPackage.eNS_URI);

		// Obtain or create and register package
		AccountPackageImpl theAccountPackage = (AccountPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AccountPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AccountPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PaymentPackageImpl thePaymentPackage = (PaymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) instanceof PaymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaymentPackage.eNS_URI) : PaymentPackage.eINSTANCE);
		BookingPackageImpl theBookingPackage = (BookingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) instanceof BookingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingPackage.eNS_URI) : BookingPackage.eINSTANCE);
		RoomPackageImpl theRoomPackage = (RoomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) instanceof RoomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RoomPackage.eNS_URI) : RoomPackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		TaskPackageImpl theTaskPackage = (TaskPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) instanceof TaskPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskPackage.eNS_URI) : TaskPackage.eINSTANCE);
		CheckIOPackageImpl theCheckIOPackage = (CheckIOPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) instanceof CheckIOPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CheckIOPackage.eNS_URI) : CheckIOPackage.eINSTANCE);
		SchedulePackageImpl theSchedulePackage = (SchedulePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) instanceof SchedulePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SchedulePackage.eNS_URI) : SchedulePackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theAccountPackage.createPackageContents();
		thePaymentPackage.createPackageContents();
		theBookingPackage.createPackageContents();
		theRoomPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theTaskPackage.createPackageContents();
		theCheckIOPackage.createPackageContents();
		theSchedulePackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theAccountPackage.initializePackageContents();
		thePaymentPackage.initializePackageContents();
		theBookingPackage.initializePackageContents();
		theRoomPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theTaskPackage.initializePackageContents();
		theCheckIOPackage.initializePackageContents();
		theSchedulePackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccountPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccountPackage.eNS_URI, theAccountPackage);
		return theAccountPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserAccounts() {
		return userAccountsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAccounts_Name() {
		return (EAttribute)userAccountsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAccounts_ID() {
		return (EAttribute)userAccountsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserAccounts__AddAccount() {
		return userAccountsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserAccounts__DeleteAccount() {
		return userAccountsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserAccounts__ModifiedAccount() {
		return userAccountsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffAccount() {
		return staffAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffAccount_Password() {
		return (EAttribute)staffAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffAccount_SessionToken() {
		return (EAttribute)staffAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAccount__Login__AccessControl() {
		return staffAccountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAccount__HandleBooking() {
		return staffAccountEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAccount__HandleGuestInfo() {
		return staffAccountEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAccount__AssignRoom() {
		return staffAccountEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAccount__ManageTasks() {
		return staffAccountEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAccount__HandleCheckIn() {
		return staffAccountEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAccount__HandleCheckOut() {
		return staffAccountEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffAccount__LogOut() {
		return staffAccountEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControl() {
		return accessControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessControl__Authenticate__String_String() {
		return accessControlEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessControl__Authorize__int() {
		return accessControlEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIGuest() {
		return iGuestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuest__GetGuest__int() {
		return iGuestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStaff() {
		return iStaffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetStaff__int() {
		return iStaffEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffAccountManagement() {
		return staffAccountManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffAccountManagement_StaffAccounts() {
		return (EReference)staffAccountManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffAccountManagement_Staffaccount() {
		return (EReference)staffAccountManagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestAccountMangement() {
		return guestAccountMangementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuestAccountMangement_GuestAccounts() {
		return (EReference)guestAccountMangementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuestAccountMangement_Guestaccount() {
		return (EReference)guestAccountMangementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestAccount() {
		return guestAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestAccount_PersonalNumber() {
		return (EAttribute)guestAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestAccount_PhoneNumber() {
		return (EAttribute)guestAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestAccount_Email() {
		return (EAttribute)guestAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuestAccount_VIP() {
		return (EAttribute)guestAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestAccount__GetUserInfo() {
		return guestAccountEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountFactory getAccountFactory() {
		return (AccountFactory)getEFactoryInstance();
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
		userAccountsEClass = createEClass(USER_ACCOUNTS);
		createEAttribute(userAccountsEClass, USER_ACCOUNTS__NAME);
		createEAttribute(userAccountsEClass, USER_ACCOUNTS__ID);
		createEOperation(userAccountsEClass, USER_ACCOUNTS___ADD_ACCOUNT);
		createEOperation(userAccountsEClass, USER_ACCOUNTS___DELETE_ACCOUNT);
		createEOperation(userAccountsEClass, USER_ACCOUNTS___MODIFIED_ACCOUNT);

		staffAccountEClass = createEClass(STAFF_ACCOUNT);
		createEAttribute(staffAccountEClass, STAFF_ACCOUNT__PASSWORD);
		createEAttribute(staffAccountEClass, STAFF_ACCOUNT__SESSION_TOKEN);
		createEOperation(staffAccountEClass, STAFF_ACCOUNT___LOGIN__ACCESSCONTROL);
		createEOperation(staffAccountEClass, STAFF_ACCOUNT___HANDLE_BOOKING);
		createEOperation(staffAccountEClass, STAFF_ACCOUNT___HANDLE_GUEST_INFO);
		createEOperation(staffAccountEClass, STAFF_ACCOUNT___ASSIGN_ROOM);
		createEOperation(staffAccountEClass, STAFF_ACCOUNT___MANAGE_TASKS);
		createEOperation(staffAccountEClass, STAFF_ACCOUNT___HANDLE_CHECK_IN);
		createEOperation(staffAccountEClass, STAFF_ACCOUNT___HANDLE_CHECK_OUT);
		createEOperation(staffAccountEClass, STAFF_ACCOUNT___LOG_OUT);

		accessControlEClass = createEClass(ACCESS_CONTROL);
		createEOperation(accessControlEClass, ACCESS_CONTROL___AUTHENTICATE__STRING_STRING);
		createEOperation(accessControlEClass, ACCESS_CONTROL___AUTHORIZE__INT);

		iGuestEClass = createEClass(IGUEST);
		createEOperation(iGuestEClass, IGUEST___GET_GUEST__INT);

		iStaffEClass = createEClass(ISTAFF);
		createEOperation(iStaffEClass, ISTAFF___GET_STAFF__INT);

		staffAccountManagementEClass = createEClass(STAFF_ACCOUNT_MANAGEMENT);
		createEReference(staffAccountManagementEClass, STAFF_ACCOUNT_MANAGEMENT__STAFF_ACCOUNTS);
		createEReference(staffAccountManagementEClass, STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT);

		guestAccountMangementEClass = createEClass(GUEST_ACCOUNT_MANGEMENT);
		createEReference(guestAccountMangementEClass, GUEST_ACCOUNT_MANGEMENT__GUEST_ACCOUNTS);
		createEReference(guestAccountMangementEClass, GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT);

		guestAccountEClass = createEClass(GUEST_ACCOUNT);
		createEAttribute(guestAccountEClass, GUEST_ACCOUNT__PERSONAL_NUMBER);
		createEAttribute(guestAccountEClass, GUEST_ACCOUNT__PHONE_NUMBER);
		createEAttribute(guestAccountEClass, GUEST_ACCOUNT__EMAIL);
		createEAttribute(guestAccountEClass, GUEST_ACCOUNT__VIP);
		createEOperation(guestAccountEClass, GUEST_ACCOUNT___GET_USER_INFO);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		staffAccountEClass.getESuperTypes().add(this.getUserAccounts());
		staffAccountManagementEClass.getESuperTypes().add(this.getIStaff());
		guestAccountMangementEClass.getESuperTypes().add(this.getIGuest());
		guestAccountEClass.getESuperTypes().add(this.getUserAccounts());

		// Initialize classes, features, and operations; add parameters
		initEClass(userAccountsEClass, UserAccounts.class, "UserAccounts", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserAccounts_Name(), theTypesPackage.getString(), "name", null, 1, 1, UserAccounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUserAccounts_ID(), ecorePackage.getEInt(), "ID", null, 1, 1, UserAccounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUserAccounts__AddAccount(), null, "addAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUserAccounts__DeleteAccount(), null, "deleteAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUserAccounts__ModifiedAccount(), null, "modifiedAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffAccountEClass, StaffAccount.class, "StaffAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffAccount_Password(), theTypesPackage.getString(), "password", null, 1, 1, StaffAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffAccount_SessionToken(), theTypesPackage.getString(), "sessionToken", null, 1, 1, StaffAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getStaffAccount__Login__AccessControl(), theTypesPackage.getString(), "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAccessControl(), "access", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffAccount__HandleBooking(), null, "handleBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffAccount__HandleGuestInfo(), null, "handleGuestInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffAccount__AssignRoom(), null, "assignRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffAccount__ManageTasks(), null, "manageTasks", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffAccount__HandleCheckIn(), null, "handleCheckIn", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffAccount__HandleCheckOut(), null, "handleCheckOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffAccount__LogOut(), null, "logOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(accessControlEClass, AccessControl.class, "AccessControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAccessControl__Authenticate__String_String(), ecorePackage.getEBoolean(), "authenticate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "username", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "pswd", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAccessControl__Authorize__int(), theTypesPackage.getString(), "authorize", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "userID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iGuestEClass, IGuest.class, "IGuest", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIGuest__GetGuest__int(), this.getGuestAccount(), "getGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "guestID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iStaffEClass, IStaff.class, "IStaff", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIStaff__GetStaff__int(), this.getStaffAccount(), "getStaff", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "StaffID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffAccountManagementEClass, StaffAccountManagement.class, "StaffAccountManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffAccountManagement_StaffAccounts(), this.getStaffAccount(), null, "staffAccounts", null, 0, -1, StaffAccountManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaffAccountManagement_Staffaccount(), this.getStaffAccount(), null, "staffaccount", null, 1, 1, StaffAccountManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestAccountMangementEClass, GuestAccountMangement.class, "GuestAccountMangement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuestAccountMangement_GuestAccounts(), this.getGuestAccount(), null, "guestAccounts", null, 0, -1, GuestAccountMangement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGuestAccountMangement_Guestaccount(), this.getGuestAccount(), null, "guestaccount", null, 1, 1, GuestAccountMangement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestAccountEClass, GuestAccount.class, "GuestAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuestAccount_PersonalNumber(), ecorePackage.getEInt(), "personalNumber", null, 1, 1, GuestAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuestAccount_PhoneNumber(), ecorePackage.getEInt(), "phoneNumber", null, 1, 1, GuestAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuestAccount_Email(), theTypesPackage.getString(), "email", null, 1, 1, GuestAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuestAccount_VIP(), ecorePackage.getEBoolean(), "VIP", null, 1, 1, GuestAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getGuestAccount__GetUserInfo(), theTypesPackage.getString(), "getUserInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AccountPackageImpl
