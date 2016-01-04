/**
 */
package RootElement.Service;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Service.ServiceType#getPrice <em>Price</em>}</li>
 *   <li>{@link RootElement.Service.ServiceType#getServiceTypeName <em>Service Type Name</em>}</li>
 *   <li>{@link RootElement.Service.ServiceType#getServiceTypeID <em>Service Type ID</em>}</li>
 * </ul>
 *
 * @see RootElement.Service.ServicePackage#getServiceType()
 * @model
 * @generated
 */
public interface ServiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see RootElement.Service.ServicePackage#getServiceType_Price()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link RootElement.Service.ServiceType#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Service Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type Name</em>' attribute.
	 * @see #setServiceTypeName(String)
	 * @see RootElement.Service.ServicePackage#getServiceType_ServiceTypeName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServiceTypeName();

	/**
	 * Sets the value of the '{@link RootElement.Service.ServiceType#getServiceTypeName <em>Service Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type Name</em>' attribute.
	 * @see #getServiceTypeName()
	 * @generated
	 */
	void setServiceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Service Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Type ID</em>' attribute.
	 * @see #setServiceTypeID(int)
	 * @see RootElement.Service.ServicePackage#getServiceType_ServiceTypeID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getServiceTypeID();

	/**
	 * Sets the value of the '{@link RootElement.Service.ServiceType#getServiceTypeID <em>Service Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type ID</em>' attribute.
	 * @see #getServiceTypeID()
	 * @generated
	 */
	void setServiceTypeID(int value);

} // ServiceType
