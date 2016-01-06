/**
 */
package RootElement.Account;

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
 * @see RootElement.Account.AccountFactory
 * @model kind="package"
 * @generated
 */
public interface AccountPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Account";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Account.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Account";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountPackage eINSTANCE = RootElement.Account.impl.AccountPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Account.impl.UserAccountsImpl <em>User Accounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.impl.UserAccountsImpl
	 * @see RootElement.Account.impl.AccountPackageImpl#getUserAccounts()
	 * @generated
	 */
	int USER_ACCOUNTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNTS__NAME = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNTS__ID = 1;

	/**
	 * The number of structural features of the '<em>User Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNTS_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNTS___ADD_ACCOUNT = 0;

	/**
	 * The operation id for the '<em>Delete Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNTS___DELETE_ACCOUNT = 1;

	/**
	 * The operation id for the '<em>Modified Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNTS___MODIFIED_ACCOUNT = 2;

	/**
	 * The number of operations of the '<em>User Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_ACCOUNTS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link RootElement.Account.impl.StaffAccountImpl <em>Staff Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.impl.StaffAccountImpl
	 * @see RootElement.Account.impl.AccountPackageImpl#getStaffAccount()
	 * @generated
	 */
	int STAFF_ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT__NAME = USER_ACCOUNTS__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT__ID = USER_ACCOUNTS__ID;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT__PASSWORD = USER_ACCOUNTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Session Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT__SESSION_TOKEN = USER_ACCOUNTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Staff Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT_FEATURE_COUNT = USER_ACCOUNTS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___ADD_ACCOUNT = USER_ACCOUNTS___ADD_ACCOUNT;

	/**
	 * The operation id for the '<em>Delete Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___DELETE_ACCOUNT = USER_ACCOUNTS___DELETE_ACCOUNT;

	/**
	 * The operation id for the '<em>Modified Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___MODIFIED_ACCOUNT = USER_ACCOUNTS___MODIFIED_ACCOUNT;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___LOGIN__ACCESSCONTROL = USER_ACCOUNTS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Handle Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___HANDLE_BOOKING = USER_ACCOUNTS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Handle Guest Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___HANDLE_GUEST_INFO = USER_ACCOUNTS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Assign Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___ASSIGN_ROOM = USER_ACCOUNTS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Manage Tasks</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___MANAGE_TASKS = USER_ACCOUNTS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Handle Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___HANDLE_CHECK_IN = USER_ACCOUNTS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Handle Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___HANDLE_CHECK_OUT = USER_ACCOUNTS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT___LOG_OUT = USER_ACCOUNTS_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Staff Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT_OPERATION_COUNT = USER_ACCOUNTS_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link RootElement.Account.impl.AccessControlImpl <em>Access Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.impl.AccessControlImpl
	 * @see RootElement.Account.impl.AccountPackageImpl#getAccessControl()
	 * @generated
	 */
	int ACCESS_CONTROL = 2;

	/**
	 * The number of structural features of the '<em>Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL___AUTHENTICATE__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL___AUTHORIZE__INT = 1;

	/**
	 * The number of operations of the '<em>Access Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.Account.IGuest <em>IGuest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.IGuest
	 * @see RootElement.Account.impl.AccountPackageImpl#getIGuest()
	 * @generated
	 */
	int IGUEST = 3;

	/**
	 * The number of structural features of the '<em>IGuest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST___GET_GUEST__INT = 0;

	/**
	 * The number of operations of the '<em>IGuest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Account.IStaff <em>IStaff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.IStaff
	 * @see RootElement.Account.impl.AccountPackageImpl#getIStaff()
	 * @generated
	 */
	int ISTAFF = 4;

	/**
	 * The number of structural features of the '<em>IStaff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_STAFF__INT = 0;

	/**
	 * The number of operations of the '<em>IStaff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Account.impl.StaffAccountManagementImpl <em>Staff Account Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.impl.StaffAccountManagementImpl
	 * @see RootElement.Account.impl.AccountPackageImpl#getStaffAccountManagement()
	 * @generated
	 */
	int STAFF_ACCOUNT_MANAGEMENT = 5;

	/**
	 * The feature id for the '<em><b>Staff Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT_MANAGEMENT__STAFF_ACCOUNTS = ISTAFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Staffaccount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT = ISTAFF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Staff Account Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT_MANAGEMENT_FEATURE_COUNT = ISTAFF_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT_MANAGEMENT___GET_STAFF__INT = ISTAFF___GET_STAFF__INT;

	/**
	 * The number of operations of the '<em>Staff Account Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_ACCOUNT_MANAGEMENT_OPERATION_COUNT = ISTAFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.Account.impl.GuestAccountMangementImpl <em>Guest Account Mangement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.impl.GuestAccountMangementImpl
	 * @see RootElement.Account.impl.AccountPackageImpl#getGuestAccountMangement()
	 * @generated
	 */
	int GUEST_ACCOUNT_MANGEMENT = 6;

	/**
	 * The feature id for the '<em><b>Guest Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT_MANGEMENT__GUEST_ACCOUNTS = IGUEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guestaccount</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT = IGUEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Guest Account Mangement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT_MANGEMENT_FEATURE_COUNT = IGUEST_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT_MANGEMENT___GET_GUEST__INT = IGUEST___GET_GUEST__INT;

	/**
	 * The number of operations of the '<em>Guest Account Mangement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT_MANGEMENT_OPERATION_COUNT = IGUEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RootElement.Account.impl.GuestAccountImpl <em>Guest Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Account.impl.GuestAccountImpl
	 * @see RootElement.Account.impl.AccountPackageImpl#getGuestAccount()
	 * @generated
	 */
	int GUEST_ACCOUNT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT__NAME = USER_ACCOUNTS__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT__ID = USER_ACCOUNTS__ID;

	/**
	 * The feature id for the '<em><b>Personal Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT__PERSONAL_NUMBER = USER_ACCOUNTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT__PHONE_NUMBER = USER_ACCOUNTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT__EMAIL = USER_ACCOUNTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>VIP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT__VIP = USER_ACCOUNTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Guest Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT_FEATURE_COUNT = USER_ACCOUNTS_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT___ADD_ACCOUNT = USER_ACCOUNTS___ADD_ACCOUNT;

	/**
	 * The operation id for the '<em>Delete Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT___DELETE_ACCOUNT = USER_ACCOUNTS___DELETE_ACCOUNT;

	/**
	 * The operation id for the '<em>Modified Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT___MODIFIED_ACCOUNT = USER_ACCOUNTS___MODIFIED_ACCOUNT;

	/**
	 * The operation id for the '<em>Get User Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT___GET_USER_INFO = USER_ACCOUNTS_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Guest Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_ACCOUNT_OPERATION_COUNT = USER_ACCOUNTS_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link RootElement.Account.UserAccounts <em>User Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Accounts</em>'.
	 * @see RootElement.Account.UserAccounts
	 * @generated
	 */
	EClass getUserAccounts();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Account.UserAccounts#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RootElement.Account.UserAccounts#getName()
	 * @see #getUserAccounts()
	 * @generated
	 */
	EAttribute getUserAccounts_Name();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Account.UserAccounts#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see RootElement.Account.UserAccounts#getID()
	 * @see #getUserAccounts()
	 * @generated
	 */
	EAttribute getUserAccounts_ID();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.UserAccounts#addAccount() <em>Add Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Account</em>' operation.
	 * @see RootElement.Account.UserAccounts#addAccount()
	 * @generated
	 */
	EOperation getUserAccounts__AddAccount();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.UserAccounts#deleteAccount() <em>Delete Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Account</em>' operation.
	 * @see RootElement.Account.UserAccounts#deleteAccount()
	 * @generated
	 */
	EOperation getUserAccounts__DeleteAccount();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.UserAccounts#modifiedAccount() <em>Modified Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Modified Account</em>' operation.
	 * @see RootElement.Account.UserAccounts#modifiedAccount()
	 * @generated
	 */
	EOperation getUserAccounts__ModifiedAccount();

	/**
	 * Returns the meta object for class '{@link RootElement.Account.StaffAccount <em>Staff Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Account</em>'.
	 * @see RootElement.Account.StaffAccount
	 * @generated
	 */
	EClass getStaffAccount();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Account.StaffAccount#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see RootElement.Account.StaffAccount#getPassword()
	 * @see #getStaffAccount()
	 * @generated
	 */
	EAttribute getStaffAccount_Password();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Account.StaffAccount#getSessionToken <em>Session Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Token</em>'.
	 * @see RootElement.Account.StaffAccount#getSessionToken()
	 * @see #getStaffAccount()
	 * @generated
	 */
	EAttribute getStaffAccount_SessionToken();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.StaffAccount#login(RootElement.Account.AccessControl) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see RootElement.Account.StaffAccount#login(RootElement.Account.AccessControl)
	 * @generated
	 */
	EOperation getStaffAccount__Login__AccessControl();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.StaffAccount#handleBooking() <em>Handle Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Booking</em>' operation.
	 * @see RootElement.Account.StaffAccount#handleBooking()
	 * @generated
	 */
	EOperation getStaffAccount__HandleBooking();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.StaffAccount#handleGuestInfo() <em>Handle Guest Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Guest Info</em>' operation.
	 * @see RootElement.Account.StaffAccount#handleGuestInfo()
	 * @generated
	 */
	EOperation getStaffAccount__HandleGuestInfo();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.StaffAccount#assignRoom() <em>Assign Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assign Room</em>' operation.
	 * @see RootElement.Account.StaffAccount#assignRoom()
	 * @generated
	 */
	EOperation getStaffAccount__AssignRoom();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.StaffAccount#manageTasks() <em>Manage Tasks</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Manage Tasks</em>' operation.
	 * @see RootElement.Account.StaffAccount#manageTasks()
	 * @generated
	 */
	EOperation getStaffAccount__ManageTasks();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.StaffAccount#handleCheckIn() <em>Handle Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Check In</em>' operation.
	 * @see RootElement.Account.StaffAccount#handleCheckIn()
	 * @generated
	 */
	EOperation getStaffAccount__HandleCheckIn();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.StaffAccount#handleCheckOut() <em>Handle Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Handle Check Out</em>' operation.
	 * @see RootElement.Account.StaffAccount#handleCheckOut()
	 * @generated
	 */
	EOperation getStaffAccount__HandleCheckOut();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.StaffAccount#logOut() <em>Log Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Out</em>' operation.
	 * @see RootElement.Account.StaffAccount#logOut()
	 * @generated
	 */
	EOperation getStaffAccount__LogOut();

	/**
	 * Returns the meta object for class '{@link RootElement.Account.AccessControl <em>Access Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control</em>'.
	 * @see RootElement.Account.AccessControl
	 * @generated
	 */
	EClass getAccessControl();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.AccessControl#authenticate(java.lang.String, java.lang.String) <em>Authenticate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authenticate</em>' operation.
	 * @see RootElement.Account.AccessControl#authenticate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAccessControl__Authenticate__String_String();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.AccessControl#authorize(int) <em>Authorize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authorize</em>' operation.
	 * @see RootElement.Account.AccessControl#authorize(int)
	 * @generated
	 */
	EOperation getAccessControl__Authorize__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Account.IGuest <em>IGuest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGuest</em>'.
	 * @see RootElement.Account.IGuest
	 * @generated
	 */
	EClass getIGuest();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.IGuest#getGuest(int) <em>Get Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest</em>' operation.
	 * @see RootElement.Account.IGuest#getGuest(int)
	 * @generated
	 */
	EOperation getIGuest__GetGuest__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Account.IStaff <em>IStaff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStaff</em>'.
	 * @see RootElement.Account.IStaff
	 * @generated
	 */
	EClass getIStaff();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.IStaff#getStaff(int) <em>Get Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff</em>' operation.
	 * @see RootElement.Account.IStaff#getStaff(int)
	 * @generated
	 */
	EOperation getIStaff__GetStaff__int();

	/**
	 * Returns the meta object for class '{@link RootElement.Account.StaffAccountManagement <em>Staff Account Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Account Management</em>'.
	 * @see RootElement.Account.StaffAccountManagement
	 * @generated
	 */
	EClass getStaffAccountManagement();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Account.StaffAccountManagement#getStaffAccounts <em>Staff Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff Accounts</em>'.
	 * @see RootElement.Account.StaffAccountManagement#getStaffAccounts()
	 * @see #getStaffAccountManagement()
	 * @generated
	 */
	EReference getStaffAccountManagement_StaffAccounts();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Account.StaffAccountManagement#getStaffaccount <em>Staffaccount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Staffaccount</em>'.
	 * @see RootElement.Account.StaffAccountManagement#getStaffaccount()
	 * @see #getStaffAccountManagement()
	 * @generated
	 */
	EReference getStaffAccountManagement_Staffaccount();

	/**
	 * Returns the meta object for class '{@link RootElement.Account.GuestAccountMangement <em>Guest Account Mangement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Account Mangement</em>'.
	 * @see RootElement.Account.GuestAccountMangement
	 * @generated
	 */
	EClass getGuestAccountMangement();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Account.GuestAccountMangement#getGuestAccounts <em>Guest Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest Accounts</em>'.
	 * @see RootElement.Account.GuestAccountMangement#getGuestAccounts()
	 * @see #getGuestAccountMangement()
	 * @generated
	 */
	EReference getGuestAccountMangement_GuestAccounts();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Account.GuestAccountMangement#getGuestaccount <em>Guestaccount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guestaccount</em>'.
	 * @see RootElement.Account.GuestAccountMangement#getGuestaccount()
	 * @see #getGuestAccountMangement()
	 * @generated
	 */
	EReference getGuestAccountMangement_Guestaccount();

	/**
	 * Returns the meta object for class '{@link RootElement.Account.GuestAccount <em>Guest Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Account</em>'.
	 * @see RootElement.Account.GuestAccount
	 * @generated
	 */
	EClass getGuestAccount();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Account.GuestAccount#getPersonalNumber <em>Personal Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Number</em>'.
	 * @see RootElement.Account.GuestAccount#getPersonalNumber()
	 * @see #getGuestAccount()
	 * @generated
	 */
	EAttribute getGuestAccount_PersonalNumber();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Account.GuestAccount#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see RootElement.Account.GuestAccount#getPhoneNumber()
	 * @see #getGuestAccount()
	 * @generated
	 */
	EAttribute getGuestAccount_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Account.GuestAccount#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see RootElement.Account.GuestAccount#getEmail()
	 * @see #getGuestAccount()
	 * @generated
	 */
	EAttribute getGuestAccount_Email();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Account.GuestAccount#isVIP <em>VIP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VIP</em>'.
	 * @see RootElement.Account.GuestAccount#isVIP()
	 * @see #getGuestAccount()
	 * @generated
	 */
	EAttribute getGuestAccount_VIP();

	/**
	 * Returns the meta object for the '{@link RootElement.Account.GuestAccount#getUserInfo() <em>Get User Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get User Info</em>' operation.
	 * @see RootElement.Account.GuestAccount#getUserInfo()
	 * @generated
	 */
	EOperation getGuestAccount__GetUserInfo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccountFactory getAccountFactory();

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
		 * The meta object literal for the '{@link RootElement.Account.impl.UserAccountsImpl <em>User Accounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Account.impl.UserAccountsImpl
		 * @see RootElement.Account.impl.AccountPackageImpl#getUserAccounts()
		 * @generated
		 */
		EClass USER_ACCOUNTS = eINSTANCE.getUserAccounts();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ACCOUNTS__NAME = eINSTANCE.getUserAccounts_Name();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_ACCOUNTS__ID = eINSTANCE.getUserAccounts_ID();

		/**
		 * The meta object literal for the '<em><b>Add Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_ACCOUNTS___ADD_ACCOUNT = eINSTANCE.getUserAccounts__AddAccount();

		/**
		 * The meta object literal for the '<em><b>Delete Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_ACCOUNTS___DELETE_ACCOUNT = eINSTANCE.getUserAccounts__DeleteAccount();

		/**
		 * The meta object literal for the '<em><b>Modified Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_ACCOUNTS___MODIFIED_ACCOUNT = eINSTANCE.getUserAccounts__ModifiedAccount();

		/**
		 * The meta object literal for the '{@link RootElement.Account.impl.StaffAccountImpl <em>Staff Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Account.impl.StaffAccountImpl
		 * @see RootElement.Account.impl.AccountPackageImpl#getStaffAccount()
		 * @generated
		 */
		EClass STAFF_ACCOUNT = eINSTANCE.getStaffAccount();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ACCOUNT__PASSWORD = eINSTANCE.getStaffAccount_Password();

		/**
		 * The meta object literal for the '<em><b>Session Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_ACCOUNT__SESSION_TOKEN = eINSTANCE.getStaffAccount_SessionToken();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ACCOUNT___LOGIN__ACCESSCONTROL = eINSTANCE.getStaffAccount__Login__AccessControl();

		/**
		 * The meta object literal for the '<em><b>Handle Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ACCOUNT___HANDLE_BOOKING = eINSTANCE.getStaffAccount__HandleBooking();

		/**
		 * The meta object literal for the '<em><b>Handle Guest Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ACCOUNT___HANDLE_GUEST_INFO = eINSTANCE.getStaffAccount__HandleGuestInfo();

		/**
		 * The meta object literal for the '<em><b>Assign Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ACCOUNT___ASSIGN_ROOM = eINSTANCE.getStaffAccount__AssignRoom();

		/**
		 * The meta object literal for the '<em><b>Manage Tasks</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ACCOUNT___MANAGE_TASKS = eINSTANCE.getStaffAccount__ManageTasks();

		/**
		 * The meta object literal for the '<em><b>Handle Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ACCOUNT___HANDLE_CHECK_IN = eINSTANCE.getStaffAccount__HandleCheckIn();

		/**
		 * The meta object literal for the '<em><b>Handle Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ACCOUNT___HANDLE_CHECK_OUT = eINSTANCE.getStaffAccount__HandleCheckOut();

		/**
		 * The meta object literal for the '<em><b>Log Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_ACCOUNT___LOG_OUT = eINSTANCE.getStaffAccount__LogOut();

		/**
		 * The meta object literal for the '{@link RootElement.Account.impl.AccessControlImpl <em>Access Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Account.impl.AccessControlImpl
		 * @see RootElement.Account.impl.AccountPackageImpl#getAccessControl()
		 * @generated
		 */
		EClass ACCESS_CONTROL = eINSTANCE.getAccessControl();

		/**
		 * The meta object literal for the '<em><b>Authenticate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESS_CONTROL___AUTHENTICATE__STRING_STRING = eINSTANCE.getAccessControl__Authenticate__String_String();

		/**
		 * The meta object literal for the '<em><b>Authorize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCESS_CONTROL___AUTHORIZE__INT = eINSTANCE.getAccessControl__Authorize__int();

		/**
		 * The meta object literal for the '{@link RootElement.Account.IGuest <em>IGuest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Account.IGuest
		 * @see RootElement.Account.impl.AccountPackageImpl#getIGuest()
		 * @generated
		 */
		EClass IGUEST = eINSTANCE.getIGuest();

		/**
		 * The meta object literal for the '<em><b>Get Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUEST___GET_GUEST__INT = eINSTANCE.getIGuest__GetGuest__int();

		/**
		 * The meta object literal for the '{@link RootElement.Account.IStaff <em>IStaff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Account.IStaff
		 * @see RootElement.Account.impl.AccountPackageImpl#getIStaff()
		 * @generated
		 */
		EClass ISTAFF = eINSTANCE.getIStaff();

		/**
		 * The meta object literal for the '<em><b>Get Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_STAFF__INT = eINSTANCE.getIStaff__GetStaff__int();

		/**
		 * The meta object literal for the '{@link RootElement.Account.impl.StaffAccountManagementImpl <em>Staff Account Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Account.impl.StaffAccountManagementImpl
		 * @see RootElement.Account.impl.AccountPackageImpl#getStaffAccountManagement()
		 * @generated
		 */
		EClass STAFF_ACCOUNT_MANAGEMENT = eINSTANCE.getStaffAccountManagement();

		/**
		 * The meta object literal for the '<em><b>Staff Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_ACCOUNT_MANAGEMENT__STAFF_ACCOUNTS = eINSTANCE.getStaffAccountManagement_StaffAccounts();

		/**
		 * The meta object literal for the '<em><b>Staffaccount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_ACCOUNT_MANAGEMENT__STAFFACCOUNT = eINSTANCE.getStaffAccountManagement_Staffaccount();

		/**
		 * The meta object literal for the '{@link RootElement.Account.impl.GuestAccountMangementImpl <em>Guest Account Mangement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Account.impl.GuestAccountMangementImpl
		 * @see RootElement.Account.impl.AccountPackageImpl#getGuestAccountMangement()
		 * @generated
		 */
		EClass GUEST_ACCOUNT_MANGEMENT = eINSTANCE.getGuestAccountMangement();

		/**
		 * The meta object literal for the '<em><b>Guest Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUEST_ACCOUNT_MANGEMENT__GUEST_ACCOUNTS = eINSTANCE.getGuestAccountMangement_GuestAccounts();

		/**
		 * The meta object literal for the '<em><b>Guestaccount</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUEST_ACCOUNT_MANGEMENT__GUESTACCOUNT = eINSTANCE.getGuestAccountMangement_Guestaccount();

		/**
		 * The meta object literal for the '{@link RootElement.Account.impl.GuestAccountImpl <em>Guest Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Account.impl.GuestAccountImpl
		 * @see RootElement.Account.impl.AccountPackageImpl#getGuestAccount()
		 * @generated
		 */
		EClass GUEST_ACCOUNT = eINSTANCE.getGuestAccount();

		/**
		 * The meta object literal for the '<em><b>Personal Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_ACCOUNT__PERSONAL_NUMBER = eINSTANCE.getGuestAccount_PersonalNumber();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_ACCOUNT__PHONE_NUMBER = eINSTANCE.getGuestAccount_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_ACCOUNT__EMAIL = eINSTANCE.getGuestAccount_Email();

		/**
		 * The meta object literal for the '<em><b>VIP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST_ACCOUNT__VIP = eINSTANCE.getGuestAccount_VIP();

		/**
		 * The meta object literal for the '<em><b>Get User Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_ACCOUNT___GET_USER_INFO = eINSTANCE.getGuestAccount__GetUserInfo();

	}

} //AccountPackage
