/**
 */
package RootElement.Account;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IGuest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Account.AccountPackage#getIGuest()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IGuest extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" guestIDRequired="true" guestIDOrdered="false"
	 * @generated
	 */
	GuestAccount getGuest(int guestID);

} // IGuest
