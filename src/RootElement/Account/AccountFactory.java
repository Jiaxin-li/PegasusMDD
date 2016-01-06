/**
 */
package RootElement.Account;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.Account.AccountPackage
 * @generated
 */
public interface AccountFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountFactory eINSTANCE = RootElement.Account.impl.AccountFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Staff Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff Account</em>'.
	 * @generated
	 */
	StaffAccount createStaffAccount();

	/**
	 * Returns a new object of class '<em>Access Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control</em>'.
	 * @generated
	 */
	AccessControl createAccessControl();

	/**
	 * Returns a new object of class '<em>Staff Account Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff Account Management</em>'.
	 * @generated
	 */
	StaffAccountManagement createStaffAccountManagement();

	/**
	 * Returns a new object of class '<em>Guest Account Mangement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest Account Mangement</em>'.
	 * @generated
	 */
	GuestAccountMangement createGuestAccountMangement();

	/**
	 * Returns a new object of class '<em>Guest Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest Account</em>'.
	 * @generated
	 */
	GuestAccount createGuestAccount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AccountPackage getAccountPackage();

} //AccountFactory
