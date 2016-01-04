/**
 */
package RootElement.Account;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see RootElement.Account.AccountPackage#getAccessControl()
 * @model
 * @generated
 */
public interface AccessControl extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" pswdDataType="org.eclipse.uml2.types.String" pswdRequired="true" pswdOrdered="false"
	 * @generated
	 */
	boolean authenticate(String username, String pswd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" userIDRequired="true" userIDOrdered="false"
	 * @generated
	 */
	String authorize(int userID);

} // AccessControl
