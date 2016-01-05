/**
 */
package RootElement.Service;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Service.ServiceManagement#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see RootElement.Service.ServicePackage#getServiceManagement()
 * @model
 * @generated
 */
public interface ServiceManagement extends IService {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Service.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see RootElement.Service.ServicePackage#getServiceManagement_Services()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Service> getServices();

} // ServiceManagement
