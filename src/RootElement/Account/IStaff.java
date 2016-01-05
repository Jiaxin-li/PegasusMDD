/**
 */
package RootElement.Account;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStaff</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Account.AccountPackage#getIStaff()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IStaff extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" StaffIDRequired="true" StaffIDOrdered="false"
	 * @generated
	 */
	StaffAccount getStaff(int StaffID);

} // IStaff
