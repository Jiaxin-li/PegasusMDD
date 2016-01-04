/**
 */
package RootElement.Service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Managment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Service.ServiceTypeManagment#getServiceTypes <em>Service Types</em>}</li>
 *   <li>{@link RootElement.Service.ServiceTypeManagment#getServicetype <em>Servicetype</em>}</li>
 * </ul>
 *
 * @see RootElement.Service.ServicePackage#getServiceTypeManagment()
 * @model
 * @generated
 */
public interface ServiceTypeManagment extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Types</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Service.ServiceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Types</em>' reference list.
	 * @see RootElement.Service.ServicePackage#getServiceTypeManagment_ServiceTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ServiceType> getServiceTypes();

	/**
	 * Returns the value of the '<em><b>Servicetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicetype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicetype</em>' reference.
	 * @see #setServicetype(ServiceType)
	 * @see RootElement.Service.ServicePackage#getServiceTypeManagment_Servicetype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceType getServicetype();

	/**
	 * Sets the value of the '{@link RootElement.Service.ServiceTypeManagment#getServicetype <em>Servicetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicetype</em>' reference.
	 * @see #getServicetype()
	 * @generated
	 */
	void setServicetype(ServiceType value);

} // ServiceTypeManagment
