/**
 */
package RootElement.Service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Service.Service#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link RootElement.Service.Service#isConducted <em>Is Conducted</em>}</li>
 *   <li>{@link RootElement.Service.Service#getServicetype <em>Servicetype</em>}</li>
 *   <li>{@link RootElement.Service.Service#getServiceID <em>Service ID</em>}</li>
 * </ul>
 *
 * @see RootElement.Service.ServicePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type</em>' reference.
	 * @see #setServiceType(ServiceType)
	 * @see RootElement.Service.ServicePackage#getService_ServiceType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceType getServiceType();

	/**
	 * Sets the value of the '{@link RootElement.Service.Service#getServiceType <em>Service Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' reference.
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Is Conducted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Conducted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Conducted</em>' attribute.
	 * @see #setIsConducted(boolean)
	 * @see RootElement.Service.ServicePackage#getService_IsConducted()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isConducted();

	/**
	 * Sets the value of the '{@link RootElement.Service.Service#isConducted <em>Is Conducted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Conducted</em>' attribute.
	 * @see #isConducted()
	 * @generated
	 */
	void setIsConducted(boolean value);

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
	 * @see RootElement.Service.ServicePackage#getService_Servicetype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceType getServicetype();

	/**
	 * Sets the value of the '{@link RootElement.Service.Service#getServicetype <em>Servicetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicetype</em>' reference.
	 * @see #getServicetype()
	 * @generated
	 */
	void setServicetype(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service ID</em>' attribute.
	 * @see #setServiceID(int)
	 * @see RootElement.Service.ServicePackage#getService_ServiceID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getServiceID();

	/**
	 * Sets the value of the '{@link RootElement.Service.Service#getServiceID <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID</em>' attribute.
	 * @see #getServiceID()
	 * @generated
	 */
	void setServiceID(int value);

} // Service
